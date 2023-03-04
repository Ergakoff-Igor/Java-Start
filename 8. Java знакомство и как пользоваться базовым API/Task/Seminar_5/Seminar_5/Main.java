package Seminar_5;

import java.util.*;

class Main {
    public static void main(String[] args) {

//        TreeSet<String> ts = new TreeSet<>();
//
//        ts.add("Z");
//        ts.add("B");
//        ts.add("G");
//        ts.add("A");
//
//        System.out.println(ts);



//        TreeSet<Employee> ts = new TreeSet();
//        ts.add(new Employee(20));
//        ts.add(new Employee(30));
//        ts.add(new Employee(10));
//        ts.add(new Employee(40));
//        System.out.println(ts);

//        Map<String, HashSet<String>> dict = new HashMap<>();
//
//
//
//
//
//        TreeSet<Employee> ts = new TreeSet(new MyComp());
//        ts.add(new Employee(20, 20));
//        ts.add(new Employee(30, 25));
//        ts.add(new Employee(10, 30));
//        ts.add(new Employee(40, 35));
//        System.out.println(ts);

        // 1
        //Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3] leetcode
//        System.out.println(restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3}));

        // 2
//        arrangeCoins(10);

        // 3
        //reverseList();


//        РЈС‡РёС‚С‹РІР°СЏ РјР°СЃСЃРёРІ С†РµР»С‹С… С‡РёСЃРµР» nums Рё С†РµР»РѕС‡РёСЃР»РµРЅРЅРѕРµ С†РµР»РµРІРѕРµ Р·РЅР°С‡РµРЅРёРµ, РІРµСЂРЅРёС‚Рµ РёРЅРґРµРєСЃС‹ РґРІСѓС… С‡РёСЃРµР» С‚Р°РєРёРј РѕР±СЂР°Р·РѕРј, С‡С‚РѕР±С‹ РѕРЅРё РІ СЃСѓРјРјРµ СЃРѕСЃС‚Р°РІР»СЏР»Рё target.
//        Р’С‹ РјРѕР¶РµС‚Рµ РїСЂРµРґРїРѕР»РѕР¶РёС‚СЊ, С‡С‚Рѕ РєР°Р¶РґС‹Р№ РІС…РѕРґРЅРѕР№ СЃРёРіРЅР°Р» Р±СѓРґРµС‚ РёРјРµС‚СЊ СЂРѕРІРЅРѕ РѕРґРЅРѕ СЂРµС€РµРЅРёРµ, Рё РІС‹ РЅРµ РјРѕР¶РµС‚Рµ РёСЃРїРѕР»СЊР·РѕРІР°С‚СЊ РѕРґРёРЅ Рё С‚РѕС‚ Р¶Рµ СЌР»РµРјРµРЅС‚ РґРІР°Р¶РґС‹
//        Р’С‹ РјРѕР¶РµС‚Рµ РІРµСЂРЅСѓС‚СЊ РѕС‚РІРµС‚ РІ Р»СЋР±РѕРј РїРѕСЂСЏРґРєРµ.
        // twoSum

//        System.out.println(Arrays.toString(twoSum(new int[]{8,2,4,5,6,7,9}, 11)));

//        РЈС‡РёС‚С‹РІР°СЏ РЅРµРїСѓСЃС‚РѕР№ РјР°СЃСЃРёРІ С†РµР»С‹С… С‡РёСЃРµР» nums, РєР°Р¶РґС‹Р№ СЌР»РµРјРµРЅС‚ РїРѕСЏРІР»СЏРµС‚СЃСЏ РґРІР°Р¶РґС‹, Р·Р° РёСЃРєР»СЋС‡РµРЅРёРµРј РѕРґРЅРѕРіРѕ. РќР°Р№РґРё СЌС‚РѕРіРѕ РµРґРёРЅСЃС‚РІРµРЅРЅРѕРіРѕ.
//        Р’С‹ РґРѕР»Р¶РЅС‹ СЂРµР°Р»РёР·РѕРІР°С‚СЊ СЂРµС€РµРЅРёРµ СЃ Р»РёРЅРµР№РЅРѕР№ СЃР»РѕР¶РЅРѕСЃС‚СЊСЋ РІС‹РїРѕР»РЅРµРЅРёСЏ Рё РёСЃРїРѕР»СЊР·РѕРІР°С‚СЊ С‚РѕР»СЊРєРѕ РїРѕСЃС‚РѕСЏРЅРЅРѕРµ РґРѕРїРѕР»РЅРёС‚РµР»СЊРЅРѕРµ РїСЂРѕСЃС‚СЂР°РЅСЃС‚РІРѕ.+
        // {8,2,8,5,2,5,3}
        // singleNumber


        singleNumber(new int[]{8,2,8,5,2,5,3});

    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            char tmp = s.charAt(i);
            sb.setCharAt(indices[i], tmp);
        }

        return sb.toString();
    }

    public static int arrangeCoins(int n) {

        int count = calcCoins(0, n, 1);

        return count;
    }

    static int calcCoins(int coins, int n, int les) {
        if (les > n) {
            return coins;
        }
        n -= les;
        coins++;
        les++;

        return calcCoins(coins, n, les);
    }



    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        Stack listNodeStack = new Stack<>();

        addStack(head, listNodeStack);
        popStack(head, listNodeStack);

        return head;
    }

    public static void addStack(ListNode node, Stack listNodeStack) {
        if (node == null) {
            return;
        }

        listNodeStack.push(node.val);
        addStack(node.next, listNodeStack);
    }

    public static void popStack(ListNode node, Stack listNodeStack) {
        if (node == null) {
            return;
        }

        Integer tmp = (Integer) listNodeStack.pop();
        node.val = tmp;
        popStack(node.next, listNodeStack);
    }





    public static int[] twoSum(int[] numbers, int target) {

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

    }

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

class MyComp implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary() > o2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}


class Item {
    UUID id;

    UUID parentId;

    int value;

    List<Item> child;
}

//class MyComp implements Comparator<Employee> {
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return o1.getSalary() - o2.getSalary();
//    }
//}





class Employee {
    private int salary;
    private int age;

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(int salary, int age) {
        this.salary = salary;
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.valueOf(salary);
    }

    @Override
    public int hashCode() {
        return salary;
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}