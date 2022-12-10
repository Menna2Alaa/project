import java.util.Scanner;
public class Main {
    String s1 = "Dangerous Zone";
    String s2 = "Safe Zone";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of numbers");
        int j = in.nextInt();
        System.out.println("Enter numbers");
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < j; i++)
        {
            int x = in.nextInt();
            if (x > largest)
            {
                largest = x;
            }
            else if (x < smallest)
            {
                smallest = x;
            }
        }
        int difference = largest - smallest;
        System.out.print("The Difference is :" + difference);
        boolean b=method(difference,largest);
        if(b==true)
        {
            System.out.print("s1 :");
        }
        else
        {
            System.out.print("s2 :");
        }
    }

    public static boolean method(int difference , int largest)
    {
        if (difference < (largest / 2))
        {
          return true;
        }
        else
        {
         return false;
        }
    }
}
