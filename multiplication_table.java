import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to get table");
        int e = sc.nextInt();
        int d = 10;
        for (int z = 0; z <= d; z++) {
            System.out.printf("%d X %d = %d\n", e, z, e * z);
        }

    }
}
