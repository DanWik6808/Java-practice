import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.println("Enter your Gender (M/F): ");
       char gender = sc.next().charAt(0);
       System.out.println("Are you a live in hostal: ");
       boolean hostal = sc.nextBoolean();
        System.out.println("---- Danish Details----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Gender: " + gender);
        System.out.println("Hostal: " + hostal);

    }
}
