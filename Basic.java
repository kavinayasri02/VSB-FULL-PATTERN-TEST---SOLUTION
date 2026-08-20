import java.util.Scanner;
public class Basic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter age :");
        int age= sc.nextInt();
        System.out.println("age= "+ age);

        System.out.print("enter name :");
        String name= sc.nextLine();
        System.out.println("name= "+ name);

        System.out.print("enter college name :");
        String cname= sc.nextLine();
        System.out.println("College name= "+ cname);

        System.out.print("enter cgpa = ");
        double cgpa=sc.nextDouble();
        System.out.println("cgpa : " + cgpa);

        System.out.print("float no =");
        float number =sc.nextFloat();
        System.out.println("floating no= " + number);

        


    }
}