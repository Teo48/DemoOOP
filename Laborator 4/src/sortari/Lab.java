package sortari;

import java.util.ArrayList;
import java.util.Collections;

class Student {
    int varsta;
    Student (int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Student{" +
                "varsta=" + varsta +
                '}';
    }
}
public class Lab {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(10));
        students.add(new Student(30));
        students.add(new Student(15));
        students.add(new Student(12));

//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.varsta - o1.varsta;
//            }
//        });

        Collections.sort(students, (a, b) -> b.varsta - a.varsta);
        for (Student st : students) {
            System.out.println(st);
        }
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Sheep");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(1);
        arr.add(12);

        /*
        * if (b - a > 0) {
        *   return b;
        * }
        * >= 0 => b
        * < 0 => a
        * */
        Collections.sort(arr, (a, b) ->  b - a);


        for (int i : arr) {
            System.out.println(i);
        }
//        for (int i : arr) {
//            System.out.println(i);
//        }
//        animals.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//
//        for (String s : animals) {
//            System.out.println(s);
//        }
    }
}
