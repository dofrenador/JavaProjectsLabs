package Labs;

public class Lab10 {

    public static void main(String[] args)
    {

        recursivePrinter(3);
        reversePrint("Alphabet");
        System.out.println();
        System.out.println(factorial(8));

    }
    public static void recursivePrinter(int levels)
    {

        if (levels == 0)
        {
            return;
        }

        System.out.println("Going down! " + levels);
        recursivePrinter(levels - 1);

        System.out.println("Counting up! " + levels);

    }
    public static void reversePrint(String str)
    {

        if (str.length() == 0)
        {

            return;
        }

        System.out.print(str.substring(str.length() - 1,str.length()));
        reversePrint(str.substring(0,str.length() - 1));

    }

    public static int factorial(int num)
    {

        int answer;

        if (num == 1)
        {
            return 1;
        }

        answer = factorial(num - 1) * num;
        return answer;
    }
}