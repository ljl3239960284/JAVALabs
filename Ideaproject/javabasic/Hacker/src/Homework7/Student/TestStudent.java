package Homework7.Student;
import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(2,"张三",90),
                new Student(3,"王老五",100),
                new Student(1,"李四",87),
                new Student(4,"小明",99)
        };

        Arrays.sort(students);
        for (Student student:students
        ) {
            System.out.println(student.toString());
        }
    }
}
