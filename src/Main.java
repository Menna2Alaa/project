import java.util.Scanner;
public class Main {
    static String s1 = "Dangerous Zone";
    static String s2 = "Safe Zone";
    static String s = "Special Zone";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of numbers");
        int j = in.nextInt();
        System.out.println("Enter numbers");
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < j; i++) {
            int x = in.nextInt();
            if (i == 0) {
                largest = x;
                smallest = x;
            }
            if (x > largest) {
                largest = x;
            } else if (x < smallest) {
                smallest = x;
            }
        }
        int difference = 0;
        difference = largest - smallest;
        System.out.println("The Difference is :" + difference);
        boolean h = special(largest, smallest, difference, j);
        if (h == true) {
            System.out.println(s);
        }
        boolean b = method(difference, largest);
        if (b == true) {
            System.out.println(s1);
        } else {
            System.out.print(s2);
        }
    }

    public static boolean method(int difference, int largest) {
        if (difference < (largest / 2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean special(int largest, int smallest, int difference, int value) {
        if (difference == 0)
        {
            for (int i = 0; i < value; i++)
            {
                if (largest - i == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < value; i++)
            {
                if (i-largest==0)
                {
                    count1++;
                    return true;
                }
                else if (i-smallest==0)
                {
                    count2++;
                    return true;
                }
            }
            if ((count1 == (value - 1) && count2 == 1) || (count1 == 1 && count2 ==(value-1)))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}