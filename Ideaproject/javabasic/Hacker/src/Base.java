 // file name saved as Base.java

public class Base {
    public static void main(String[] args) {
        Base b = new Derived(); // 创建 Derived 类的实例，并赋值给 Base 类型的引用
        b.methodOne(); // 调用 methodOne 方法
    }

    public void methodOne() {
        System.out.print("A"); // 打印 "A"
        methodTwo(); // 调用 methodTwo 方法
    }

    public void methodTwo() {
        System.out.print("B"); // 打印 "B"
    }
}

class Derived extends Base { // Derived 类继承自 Base 类
    public void methodOne() {
        super.methodOne(); // 调用父类 Base 的 methodOne 方法
        System.out.print("C"); // 打印 "C"
    }

    public void methodTwo() {
        super.methodTwo(); // 调用父类 Base 的 methodTwo 方法
        System.out.print("D"); // 打印 "D"
    }
}