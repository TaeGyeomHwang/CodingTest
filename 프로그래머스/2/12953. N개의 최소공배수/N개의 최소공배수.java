class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = getLCM(lcm, arr[i]);
        }
        return lcm;
    }

    public static int getLCM(int num1, int num2) {
        return (num1 * num2) / getGCD(num1, num2);
    }

    public static int getGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}