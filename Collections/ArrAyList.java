package Collections;

import java.util.ArrayList;

public class ArrAyList {
//    Write a program to add elements to an ArrayList and print them.
public static void main(String[] args) {
    ArrayList <String> list = new ArrayList<>();
    list.add("india");
    list.add("japan");
    list.add("nepal");
    list.add(1,"Russia");
    list.remove("nepal");
//    if an element exists in an ArrayList.
    if(list.contains("Russia")){
        System.out.println("Found");
    }
//        insert an element at a specific index in an ArrayList

    for(String s : list){
        System.out.println(s);

    }

}

}
