import java.util.Scanner;

public class inputdemo{
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your name ?");
        String name = scanner.nextLine();
        System.out.println("What is your age");
        int age = scanner.nextInt();
        System.out.println("hello " + age);

        System.out.println("hello " + name);
        

    }
}

sysout