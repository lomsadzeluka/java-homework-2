import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1) Project 1
        Project1.A aClass = new Project1.A();
        System.out.println("\n1) Enter two numbers: ");
        int a1 = Integer.parseInt(input.nextLine());
        int b1 = Integer.parseInt(input.nextLine());
        aClass.setAB(a1, b1);
        System.out.println(aClass.getProduct());

        Project1.B bClass = new Project1.B();
        System.out.println("\n2) Enter three numbers: ");
        int a2 = Integer.parseInt(input.nextLine());
        int b2 = Integer.parseInt(input.nextLine());
        int c1 = Integer.parseInt(input.nextLine());
        bClass.setABC(a2, b2, c1);
        System.out.println(bClass.getMin());

        Project1.C cClass = new Project1.C();
        System.out.println("\n3) Enter three numbers: ");
        int a3 = Integer.parseInt(input.nextLine());
        int b3 = Integer.parseInt(input.nextLine());
        int c2 = Integer.parseInt(input.nextLine());
        bClass.setABC(a3, b3, c2);
        System.out.println(cClass.getABProduct());

        // 2) Project 3
        Project3.A aClass2 = new Project3.A();

    }
}
