package com.Recursion;
import java.util.*;

public class mainMethod {
    public static void main(String[] args) {
        Main list = new Main();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(44);
        list.display();
        /*System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();

         */
        list.insertRec(88,1);
        list.display();
    }
}
