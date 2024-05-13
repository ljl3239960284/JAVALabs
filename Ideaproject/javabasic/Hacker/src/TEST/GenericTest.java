package TEST;

class SuperClass {
    private int n; // 私有整数变量n

    SuperClass(){ // 默认构造函数
        System.out.println("TEST.SuperClass()");
    }

    SuperClass(int n) { // 参数化构造函数
        System.out.println("TEST.SuperClass(int n)");
        this.n = n; // 将参数n赋给实例变量this.n
    }
}

class SubClass extends SuperClass { // SubClass继承自SuperClass
    private int n; // 私有整数变量n

    SubClass(){ // 默认构造函数
        System.out.println("TEST.SubClass");
    }

    public SubClass(int n){ // 参数化构造函数
        super(300); // 调用父类的参数化构造函数，并传入参数300
        System.out.println("TEST.SubClass(int n):"+n); // 打印参数n的值
        this.n = n; // 将参数n赋给实例变量this.n
    }
}

class SubClass2 extends SuperClass { // SubClass2继承自SuperClass
    private int n; // 私有整数变量n

    SubClass2(){ // 默认构造函数
        super(300); // 调用父类的参数化构造函数，并传入参数300
        System.out.println("TEST.SubClass2");
    }

    public SubClass2(int n){ // 参数化构造函数
        System.out.println("TEST.SubClass2(int n):"+n); // 打印参数n的值
        this.n = n; // 将参数n赋给实例变量this.n
    }
}

public class GenericTest { // 入口类test
    public static void main (String args[]){ // 主方法
        System.out.println("------TEST.SubClass 类继承------");
        SubClass sc1 = new SubClass(); // 创建SubClass的实例sc1，调用默认构造函数
        SubClass sc2 = new SubClass(100); // 创建SubClass的实例sc2，调用参数化构造函数
        System.out.println("------TEST.SubClass2 类继承------");
        SubClass2 sc3 = new SubClass2(); // 创建SubClass2的实例sc3，调用默认构造函数
        SubClass2 sc4 = new SubClass2(200); // 创建SubClass2的实例sc4，调用参数化构造函数
    }
    /*
    构造器
    子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。
    如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。
    如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。
     */
}
