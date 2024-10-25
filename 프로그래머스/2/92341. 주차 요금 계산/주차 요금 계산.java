import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parkingTime = new HashMap<>(); // To track cumulative parking time for each car
        Map<String, Integer> inTime = new HashMap<>();      // To track entry time for each car

        // Process each record
        for (String record : records) {
            String[] parts = record.split(" ");
            String time = parts[0];
            String carNumber = parts[1];
            String action = parts[2];

            if (action.equals("IN")) {
                // If the car is entering, store the time in minutes
                inTime.put(carNumber, timeToMinutes(time));
            } else if (action.equals("OUT")) {
                // If the car is exiting, calculate the parking duration and add to cumulative time
                int enterTime = inTime.remove(carNumber);
                int exitTime = timeToMinutes(time);
                parkingTime.put(carNumber, parkingTime.getOrDefault(carNumber, 0) + (exitTime - enterTime));
            }
        }

        // For cars still in the parking lot at the end of the day (23:59)
        for (String carNumber : inTime.keySet()) {
            int enterTime = inTime.get(carNumber);
            int exitTime = timeToMinutes("23:59");
            parkingTime.put(carNumber, parkingTime.getOrDefault(carNumber, 0) + (exitTime - enterTime));
        }

        // Calculate parking fees for each car
        List<String> carNumbers = new ArrayList<>(parkingTime.keySet());
        Collections.sort(carNumbers);  // Sort car numbers in ascending order
        
        int[] result = new int[carNumbers.size()];
        for (int i = 0; i < carNumbers.size(); i++) {
            String carNumber = carNumbers.get(i);
            int totalTime = parkingTime.get(carNumber);
            result[i] = calculateFee(totalTime, fees);
        }

        return result;
    }
    
        // Helper function to convert "HH:MM" time format to minutes.
    private static int timeToMinutes(String time) {
        String[] split = time.split(":");
        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);
        return hours * 60 + minutes;
    }
    
    // Helper function to calculate the fee based on the parking time and fees structure
    private static int calculateFee(int totalTime, int[] fees) {
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        if (totalTime <= basicTime) {
            return basicFee;
        } else {
            int extraTime = totalTime - basicTime;
            int extraUnits = (int) Math.ceil((double) extraTime / unitTime);
            return basicFee + extraUnits * unitFee;
        }
    }
}