import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int sum = 0;
        int numsum = 0;
        int m = 0;
        int q =6;
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("pringing a number baclward");


        for (int j = 10; j > 0; j--) {
            {
                System.out.println(j);
            }

            System.out.println("Printing odd numbers for n <= 20");
            for (int n = 1; n <= 20; n++) {
                if (n % 2 != 0) {
                    System.out.println(n);
                }
            }
            System.out.println("Printing even number for n <=0:");
            for (int n = 1; n <= 20; n++) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
            {
                System.out.println("Printing 1-10 sum");
                for (m = 0; m <= 10; m++)
                    sum += m++;
                System.out.println(sum);


            }
            System.out.println("Printing  equal ****** below" );
            for (int t = 6; t>=1; t--) {
                for (int p=1; p <=6; p++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Printing  revers ****** belwo");
            {
                for (int t = 1; t<=6; t++) {
                    for (int p = t; p >=0; p--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();

                for (int t = 1; t<=6; t++) {
                    for (int p = t; p>=t; p--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println();
                {
                    System.out.println("Enter a number: ");
                    m = key.nextInt();
                }

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            for (int k = 0; k <= 10; k++) {
                System.out.println("Enter a number: ");
                k = key.nextInt();
                System.out.println("Enter another number or quit: ");
                k = key.nextInt();
                numsum += k;
                System.out.println("Sum total is:");
                System.out.println(numsum);}


            }

                }

            }


        }






