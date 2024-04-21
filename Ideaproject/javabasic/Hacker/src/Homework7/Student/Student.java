package Homework7.Student;

public class Student implements Comparable<Student> {
    private int stuId;
    private String name;
    private int score;

    // 无参构造方法
    public Student() {
        // 初始化成员变量
        stuId = 0;
        name = "";
        score = 0;
    }

    // 带参构造方法
    public Student(int stuId, String name, int score) {
        this.stuId = stuId;
        this.name = name;
        this.score = score;
    }

    // Getter 和 Setter 方法省略...

    // 实现 Comparable 接口中的 compareTo 方法，按照学生的 stuId 进行排序
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.stuId, o.stuId);
    }

    // 重写 toString 方法，以便在控制台上打印学生信息
    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
