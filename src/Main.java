import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        //Scanner sc = new Scanner(System.in);

        Student student1 = new Student("tapha",30,3.2);
        student1.study();
        Student student2 = new Student("Diara",26,2.9);
        student2.study();
        Student student3 = new Student("Gabriel",25,1.9);
        student3.study();

        System.out.print(student1.name+" ");
        System.out.print(student1.age+" ");
        System.out.print(student1.gpa+" ");
        System.out.print(student1.isEnrolled+" ");
        System.out.println();
        System.out.print(student2.name+" ");
        System.out.print(student2.age+" ");
        System.out.print(student2.gpa+" ");
        System.out.print(student2.isEnrolled+" ");
        System.out.println();
        System.out.print(student3.name+" ");
        System.out.print(student3.age+" ");
        System.out.print(student3.gpa+" ");
        System.out.print(student3.isEnrolled+" ");
        System.out.println();





        //sc.close();



    }
}
