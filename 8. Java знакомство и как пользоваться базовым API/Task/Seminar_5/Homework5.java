import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Homework5
 * Учитывая два целочисленных массива nums1 и nums2, верните максимальную длину
 * подмассива, который появляется в обоих массивах.
 * Example 1:
 * Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
 * Output: 3
 * Explanation: Повторяющийся подмассив с максимальной длиной равен [3,2,1].
 * 
 * Example 2:
 * Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
 * Output: 5
 * Explanation: Повторяющийся подмассив с максимальной длиной равен [0,0,0,0,0].
 */
public class Homework5 {

    public static void main(String[] args) {
        inputArray();
    }
    /*
    * Метод ввода массивов
    */
    public static void inputArray(){
        int[] nums1 = {1, 3, 2, 1, 7};
        int[] nums2 = {3, 2, 1, 4, 7};
        findEqualsSubarray(nums1, nums2);

    }

    /*
     * метод поиска и вывода подмассива и его длины
     */
    public static void findEqualsSubarray(int[] array1, int[] array2) {
        int MIN_LENGTH_SUBARRAY = 2;
        List<Integer> result = new ArrayList<>();
        int counter = 0;

        for (int startIndex = 0; startIndex <= array1.length; startIndex++) {
            for (int endIndex = startIndex + 1; endIndex <= array1.length; endIndex++) {
                int[] tempSubarray = Arrays.copyOfRange(array1, startIndex, endIndex);
                if (tempSubarray.length >= MIN_LENGTH_SUBARRAY && counter < tempSubarray.length && isContains(tempSubarray, array2)) {
                    result.clear();
                    for (int item : tempSubarray) result.add(item);
                    counter = tempSubarray.length;
                }
            }
        }

        if (result.size() < MIN_LENGTH_SUBARRAY) {
            System.out.println("Совпадающих подмассивов нет ");
        } else {

            System.out.printf("Повторяющийся подмассив %s с максимальной длинной %d ", result.toString(), counter);
        }
    }

    private static boolean isContains(int[] array1, int[] array2) {
        for (int startIndex = 0; startIndex <= array2.length; startIndex++) {
            for (int endIndex = startIndex + 1; endIndex <= array2.length; endIndex++) {
                int[] tmp = Arrays.copyOfRange(array2, startIndex, endIndex);
                if (array1.length == tmp.length && Arrays.equals(array1, tmp)) {
                    return true;
                }
            }
        }
        return false;
    }
}


