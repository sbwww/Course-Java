// ArrayListStudent.java

package chp8.homework.question6;

import java.util.*;

public class ArrayListStudent {
    private List<Student> arrayListStudent;

    public ArrayListStudent() {
        arrayListStudent = new ArrayList<Student>();
        Student[] stu = new Student[3];
        stu[0] = new Student("001", 95);
        stu[1] = new Student("002", 85);
        stu[2] = new Student("003", 90);
        for (int i = 0; i < stu.length; ++i) {
            arrayListStudent.add(stu[i]);
        }
    }

    public ArrayListStudent(List<Student> arrayListStudent) {
        this.arrayListStudent = arrayListStudent;
    }

    public void setArrayListStudent(List<Student> arrayListStudent) {
        this.arrayListStudent = arrayListStudent;
    }

    public List<Student> getArrayListStudent() {
        return this.arrayListStudent;
    }

    public void showArrayListStudent() {
        // for (int i = 0; i < arrayListStudent.size(); ++i) {
        // System.out.println(arrayListStudent.get(i).getId() + ": " +
        // arrayListStudent.get(i).getScore());
        // }
        Iterator<Student> iter = arrayListStudent.iterator();
        while (iter.hasNext()) {
            Student s = iter.next();
            System.out.println(s.getId() + ": " + s.getScore());
        }
    }
}