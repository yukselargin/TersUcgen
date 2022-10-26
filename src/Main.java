import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");
        n = input.nextInt();

        for (int i = 0; i <= n-1; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for( int j = 0;j < 2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}