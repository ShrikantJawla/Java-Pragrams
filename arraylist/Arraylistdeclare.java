package arraylist;

import java.util.ArrayList;

public class Arraylistdeclare {
    public static void main(String[] args) {
//        First we will create an arraylist.
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

//        Now I will add elements in ArrayList
        numbers.add(23);
        numbers.add(230);
        names.add("hello");
        names.add("how");
        doubles.add(6.23);
        System.out.println(numbers);
        System.out.println(names);
        System.out.println(doubles);

//        Now add something with index
        names.add(2, "Change");
        numbers.add(1, 45565);
        System.out.println(names);
        System.out.println(numbers);

//        get() method for getting a value on any index
        System.out.println(numbers.get(2));
        System.out.println(names.get(2));

//        set() method is for changing any element in ArrayList
        names.set(2, "noooooooo");
        System.out.println(names);

//        remove() method is used to remove any element for ArrayList.
        names.remove(2);
        System.out.println(names);
        names.remove("hello");
        System.out.println(names);

//        clear() method is used to remove all elements of any ArrayList
        names.clear();
        System.out.println(names);


//        size() method is used to get size
        System.out.println(names.size());
        System.out.println(numbers.size());
        System.out.println(doubles.size());



    }
}
