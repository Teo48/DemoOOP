package test;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> mySet = new LinkedHashSet<>();
        mySet.add(1);
        mySet.add(10);
        mySet.add(100);
        System.out.println(mySet);
    }
}


