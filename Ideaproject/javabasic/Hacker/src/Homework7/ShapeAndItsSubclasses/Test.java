package Homework7.ShapeAndItsSubclasses;

public class Test
{
    public static void main(String args[])
    {
        Shape vec[] = {new Circle(3), new Rectangle(4,5), new Circle(4), new Circle(8)};
        for(int index = 0; index < vec.length; index ++)
        {
            System.out.println(vec[index]);
        }
    }
}
