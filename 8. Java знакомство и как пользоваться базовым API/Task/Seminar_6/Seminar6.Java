public class Seminar6 {
    public static void main(String[] args) {
        

        // Задание 1.
        // Найти максимальный элемент, имеющий отрицательного жвойника:
        public static int findMaxK(int[] nums) {
            Arrays.sort(nums);
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0 ; i < nums.length ; i++){
                set.add(nums[i]);
            }
            for(int i = nums.length-1; i>=0 ; i--){//Checking the largest numbers from the last index as the array is sorted
                if(set.contains(-nums[i])){
                    return nums[i];
                }
            }
            return -1;
        }


        // Задание 2.
        // Найти разницу 2-х массивов, либо вернуть "-1":

        // Вариант 1:
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        
        a.retainAll(b);


        // Вариант 2:
        public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for (int num : nums1) {
                set1.add(num);
            }
            for (int num : nums2) {
                set2.add(num);
                set1.remove(num);
            }
    
            for (int num : nums1) {
                set2.remove(num);
            }
    
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(set1));
            ans.add(new ArrayList<>(set2));
            return ans;
        }


        
    }
}