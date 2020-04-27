// ComparatorScore.java

package chp8.homework.question6;

import java.util.*;

public class ComparatorScore implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        if (obj1 instanceof Student && obj2 instanceof Student) {
            return ((Student) obj1).getScore() - ((Student) obj2).getScore();
        } else {
            return 0;
        }
    }
}