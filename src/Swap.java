import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int x= sc.nextInt();
      int y= sc.nextInt();
        System.out.println("Before swapping"+ x + y);
        int z=x;
        x=y;
        y=z;
        System.out.println("After swapping"+x +y);
    }
}
