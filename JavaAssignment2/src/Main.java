
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;

        do {

            System.out.println("Enter" + "\n" + "1   likes" + "\n"
                    + "2 largest possible number" + "\n" + "3 finding number Show odd number of times" + "\n" + "5 to exit");
            i = scanner.nextInt();

            switch (i) {
                case 1: {


                    System.out.println("Enter number of people who likes");
                    int n = scanner.nextInt();
                    String[] like = new String[10];

                    for(int j=0;j<n;j++)
                    {
                        like[j] = scanner.next();
                    }
                    LikeNo ln = new LikeNo();
                    String s = ln.likeNo(like,n);
                    System.out.println(s);
                }

                case 2: {
                    System.out.println("Enter total number of digits ");
                    int k = scanner.nextInt();
                    System.out.println("Enter number ");
                    int n = scanner.nextInt();
                    LargestNo l = new LargestNo();
                    int num = l.largestNo(n,k);
                    System.out.println("Largest possible number is "+ num);
                    break;
                }

                case 3: {

                    int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
                    int n = arr.length;
                    OddOccur od = new OddOccur();
                    int odd = od.oddOccur(arr, n);
                    System.out.println("Number appear odd times " + odd);
                    break;
                }


                default: {

                    break;
                }

            }

        } while (i != 5);
        scanner.close();
    }

}