import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        student1.printInfo();

        Student student2 = new Student("2025001", "홍길동", "재학", "2025-06-23", "010-1234-5678");
        student2.addCourse("자바");
        student2.printInfo();
        
    }

}