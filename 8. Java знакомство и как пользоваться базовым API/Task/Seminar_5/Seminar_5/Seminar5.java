package Seminar_5;
/**
 * Seminar5
 */
public class Seminar5 {

    public static void main(String[] args) {
       // Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
       // совместить и упорядочить 

       public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            char tmp = s.charAt(i);
            sb.setCharAt(indices[i], tmp);
        }

        return sb.toString();
    }

    // Вариант 2:
    String s = "codeleet";
    int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
    StringBuilder result = new StringBuilder();
    for (int index : indices) {
        result.append(s.charAt(index));
    }
    System.out.println(result);
    

    // указать индексы элементов массива, сумма которых равна заданному числу:
    HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){

            Integer diff = (Integer)(target - numbers[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff), i};
                return toReturn;
            }

            hash.put(numbers[i], i);

        }

        return null;

    // Найти элемент который не повторяется в массиве:
    public static int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i:nums){
            if(set.add(i)==false)
                set.remove(i);
        }
        int a[]= new int [set.size()];
        int c=0;
        for(int b:set){
            a[c]=b;
            c++;
        }
        return a;

    }

    

    }
}