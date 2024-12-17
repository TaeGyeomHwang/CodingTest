import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
// 키패드 좌표 설정
        Map<Integer, int[]> keypad = new HashMap<>();
        keypad.put(1, new int[]{0, 0}); keypad.put(2, new int[]{0, 1}); keypad.put(3, new int[]{0, 2});
        keypad.put(4, new int[]{1, 0}); keypad.put(5, new int[]{1, 1}); keypad.put(6, new int[]{1, 2});
        keypad.put(7, new int[]{2, 0}); keypad.put(8, new int[]{2, 1}); keypad.put(9, new int[]{2, 2});
        keypad.put(-1, new int[]{3, 0}); keypad.put(0, new int[]{3, 1}); keypad.put(-2, new int[]{3, 2});

        // 시작 위치 설정 (왼손은 -1(*), 오른손은 -2(#))
        int[] leftPos = keypad.get(-1);
        int[] rightPos = keypad.get(-2);

        StringBuilder result = new StringBuilder();

        for (int number : numbers) {
            int[] targetPos = keypad.get(number);

            // 왼쪽 숫자면 왼손 사용
            if (number == 1 || number == 4 || number == 7) {
                result.append("L");
                leftPos = targetPos;
            }
            // 오른쪽 숫자면 오른손 사용
            else if (number == 3 || number == 6 || number == 9) {
                result.append("R");
                rightPos = targetPos;
            }
            // 가운데 숫자는 거리 계산
            else {
                int leftDistance = Math.abs(leftPos[0] - targetPos[0]) + Math.abs(leftPos[1] - targetPos[1]);
                int rightDistance = Math.abs(rightPos[0] - targetPos[0]) + Math.abs(rightPos[1] - targetPos[1]);

                if (leftDistance < rightDistance) {
                    result.append("L");
                    leftPos = targetPos;
                } else if (rightDistance < leftDistance) {
                    result.append("R");
                    rightPos = targetPos;
                } else { // 거리가 같을 때
                    if (hand.equals("right")) {
                        result.append("R");
                        rightPos = targetPos;
                    } else {
                        result.append("L");
                        leftPos = targetPos;
                    }
                }
            }
        }

        return result.toString();
    }
}