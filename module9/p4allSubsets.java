package module9;

import java.util.ArrayList;
import java.util.List;


public class p4allSubsets {
    public static List<List<Integer>> generateSubsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(result, new ArrayList<>(), nums, 0);
            return result;
        }

        private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
            result.add(new ArrayList<>(tempList));
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                backtrack(result, tempList, nums, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3};
            List<List<Integer>> subsets = generateSubsets(numbers);
            System.out.println("Subsets of {1, 2, 3}:");
            for (List<Integer> subset : subsets) {
                System.out.println(subset);
            }
        }
    }

