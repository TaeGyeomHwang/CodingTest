import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int currentWeight = 0;

        for (int truck : truck_weights) {
            while (true) {
                if (bridge.isEmpty()) {
                    // If the bridge is empty, the truck can start crossing.
                    bridge.add(truck);
                    currentWeight += truck;
                    time++;
                    break;
                } else if (bridge.size() == bridge_length) {
                    // Remove the first truck that has finished crossing.
                    currentWeight -= bridge.poll();
                } else {
                    // Check if the current truck can be added to the bridge.
                    if (currentWeight + truck <= weight) {
                        bridge.add(truck);
                        currentWeight += truck;
                        time++;
                        break;
                    } else {
                        // Add a placeholder to simulate the passing of time.
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }

        // Add the remaining bridge length to account for the last truck exiting the bridge.
        return time + bridge_length;
    }
}