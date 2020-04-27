// Test.java

package chp8.homework.question6;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayListStudent arrayListStudent = new ArrayListStudent();
        ComparatorScore cs = new ComparatorScore();
        Collections.sort(arrayListStudent.getArrayListStudent(), cs);
        arrayListStudent.showArrayListStudent();
        Student stu = new Student("001", 95);
        int index = Collections.binarySearch(arrayListStudent.getArrayListStudent(), stu, cs);
        System.out.println("Score of " + stu.getId() + " is higher than " + index + " students.");
    }
}