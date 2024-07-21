import java.util.*;
public class Student
{
    int eng,hn,mts;
    String name;
    double total,avg;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        name=sc.nextLine();
        System.out.print("Enter marks of eng:");
        eng=sc.nextInt();
        System.out.print("Enter marks of hindi:");
        hn=sc.nextInt();
        System.out.print("Enter marks of maths:");
        mts=sc.nextInt();
    }
    public void cal()
    {
        total=eng+hn+mts;
        avg=total/3;
    }
    
    public void display()
    {
        System.out.println("Name\tmarks\tTotal\taverage");
        System.out.println(name+"\t"+eng+"\t"+mts+"\t"+hn+"\t"+total+"\t"+avg );
    }

    public static void main(String args[])
    {
       Student ob=new Student();
       ob.input();
       ob.cal();
       ob.display();
    }
}