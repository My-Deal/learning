package javapractice.collections;

import java.sql.Struct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapTest {
    public static void main(String[] args) {
        coreMethodTest();
    }


    public static void utilityMethodTest() {
        Map<String, Integer> map = new HashMap<>();
        Function<String, Integer> function = (String s) -> {
            return 1;
        };
        BiFunction<String, Integer, Integer> biFunction = (String s, Integer i) -> {
            if (i != null && i > 0) {
                return ++i;
            }
            return i;
        };
        map.computeIfAbsent("abc", (String s) -> {
            return 1;
        });
        map.computeIfPresent("abc", (String s, Integer i) -> {
            if (i != null && i > 0) {
                return ++i;
            }
            return i;
        });
        System.out.println(map.get("abc"));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.getKey();
        }
    }


    public static void coreMethodTest() {
        Map<Student, Student> map = new HashMap<>();
        Student st1 = new Student(1, "virendra", 100, 'A');
        map.put(st1, st1);
        Student st2 = new Student(2, "Diksha", 100, 'A');
        map.put(st2, st2);
    }
}

class Student {

    int rollNo;

    String name;

    int marks;

    char grade;

    public Student(int rollNo, String name, int marks, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
        this.marks = marks;
    }

}


