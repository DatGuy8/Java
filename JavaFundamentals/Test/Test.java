import java.util.ArrayList;

public class Test {
    
    public static void main(String[] args){

        ArrayList<Integer> myList = new ArrayList<Integer>();



        myList.add(10);
        myList.add(11);
        myList.add(51);

        System.out.println(myList);

        Integer num = myList.get(0);

        System.out.println(num);
        System.out.println(myList);

        myList.set(0, 100);

        System.out.println(myList);


        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("hello");
        things.add(new ArrayList<Integer>());
        things.add(12.4);
        System.out.println(things);
        System.out.println(things.remove(12.4));
        System.out.println(things);

    }



}
