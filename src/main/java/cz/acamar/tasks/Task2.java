package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        //Since i have sorted input array i will use two pointers to compare squares of negative and positive numbers

        // checking boundary cases
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int start = 0;
        int end = input.length-1;
        int[] result = new int[input.length];
        int resultPointer = result.length-1;

        while (start <= end) {
            if (input[start] * input[start] >= input[end] * input[end]) {
                result[resultPointer] = input[start] * input[start];
                start++;
                resultPointer --;
            } else {
                result[resultPointer] = input[end]*input[end];
                end--;
                resultPointer --;
            }
        }
        return result;

    }
}
