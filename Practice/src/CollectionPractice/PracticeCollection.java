package CollectionPractice;

import java.net.FileNameMap;
import java.util.*;

public class PracticeCollection {
    static ArrayList<Integer> value=new ArrayList<>();
    static Set<Integer> value1=new HashSet<>();//Set only works with unique elements
    static Set<Integer> value2=new TreeSet<>();
    static Set<String> value3=new TreeSet<>();//Will sort elements

    public static void main(String[] args) {
        value.add(5);
        value.add(7);
        value.add(6);
        value.add(1);
        System.out.println("These will print from normal Collections");
        Collections.sort(value);

        for(int i:value){
            System.out.println(i);
        }



        value1.add(8);
        value1.add(6);
        value1.add(5);
        value1.add(7);
        value1.add(6);
        System.out.println("These will print from hashset");
        for (int i:value1){
            System.out.println(i);
        }

        value2.add(8);
        value2.add(6);
        value2.add(5);
        value2.add(7);
        value2.add(6);
        System.out.println("These will print from Treeset");
        for (int i:value2){
            System.out.println(i);
        }
        try{
            System.out.println("Inside try scope");
        }
        finally {
            System.out.println("Finally without catch");
        }

        System.out.println("These will print from Treeset but using for Each loop");
        value2.forEach(System.out::println);

        value3.add("Hi");
        value3.add("Cat");
        value3.add("Bat");
        value3.add("Apple");
        value3.add("And");
        value3.add("And");
        value3.add(" ");
        System.out.println("Print from Tree set");
        value3.forEach(System.out::println);

    }

}
