package CharSorter;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CharSorter {
    public static String bubbleSort(String str)
    {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
        {
            arr[i] = str.charAt(i);
        }
        return bubbleSort(arr);
    }

    private static String bubbleSort(char[] s)
    {
        String temp = "";
        bubbleSort(s, s.length - 1);
        for (int i = 0; i < s.length; i++)
            temp = temp + s[i];
        return temp;
    }

    private static void bubbleSort(char[] s, int end)
    {
        if (end > 0)
        {
            for (int i = 0; i < end; i++)
            {
                if (s[i] > s[i + 1])
                {
// switch
                    char temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
// i = 0;
                }
            }
// for(char c: s)
// System.out.print(c);
// System.out.println();
            bubbleSort(s, end - 1);
        }

    }

    public static int[] alphabeticalSort(String str)
    {
// The goal of this method is to sort all of the characters
// in alphabetical order.
        int[] freq = new int[str.length()];
        int f = 0;
        str = bubbleSort(str);
        for (int i = 0; i < str.length();)
        {
            int j = i + 1;
            freq[f]++;
            while (true)
            {
                if (j == str.length())
                    break;
                if (str.charAt(j) == str.charAt(i))
                {
                    freq[f]++;
                    j++;
                } else
                    break;
            }
            i = j;
            f++;
        }
        return freq;
    }

    private static String reducedString(String str)
    {
        String temp = "";
        for (int i = 0; i < str.length(); i++)
        {
            temp = temp + str.charAt(i);
            int j = i + 1;
            while (true)
            {
                if (j >= str.length())
                    break;
                if (str.charAt(i) == str.charAt(j))
                {
                    j++;
                } else
                    break;
            }
            i = j - 1;
        }

        return temp;
    }

    public static int[] charTypes(String s)
    {
// The goal of this method is to sort the data into four categories:
// Textual characters, Numeric characters, WhiteSpace characters,
// and Symbolic characters

// a[0] -> text
// a[1] -> numerical
// a[2] -> whitespace
// a[3] -> symbols
        int[] a = { 0, 0, 0, 0 };

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'))
                a[0]++;
            else if ('0' <= c && c <= '9')
                a[1]++;
            else if (c == ' ')
                a[2]++;
            else
                a[3]++;
        }
        return a;
    }

    public static char[][] frequencySort(String str)
    {
// The goal of this method is to sort all of the characters
// from highest frequency to lowest.
        String reducedStr = reducedString(str);
        int[] freq = alphabeticalSort(str);
        char[] chArr = new char[reducedStr.length()];
        char[][] result = new char[2][chArr.length];

        for (int i = 0; i < reducedStr.length(); i++)
            chArr[i] = reducedStr.charAt(i);

// Bubble sort algorithm
        for (int i = 0; i < chArr.length; i++)
        {
            for (int j = 1; j < (chArr.length - i); j++)
            {

                if (freq[j - 1] < freq[j])
                {
                    int temp = freq[j - 1];
                    freq[j - 1] = freq[j];
                    freq[j] = temp;

                    char c = chArr[j - 1];
                    chArr[j - 1] = chArr[j];
                    chArr[j] = c;
                }

            }
        }

        for (int i = 0; i < result[0].length; i++)
        {
            result[0][i] = (char) (freq[i] + '0');
            result[1][i] = chArr[i];
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        String str;
        String reducedStr;

        System.out.println("Welcome to Character Sorter Program ");
        System.out.println("Please input a string to be sorted ");
        str = scan.nextLine();
        str = bubbleSort(str);
        reducedStr = reducedString(str);
        do // creating a loop
        {
            try
            {
                System.out.println("Please select the option you would like to see\n");
                System.out.println("1. Display character frequencies alphabetically ");
                System.out.println("2. Display sorted frequencies");
                System.out.println("3. Show types of character frequencies");
                System.out.println("4. Exit");
                input = scan.nextInt();

                if (input == 1) // if the user inputs 1
                {
                    int[] f = alphabeticalSort(str);
                    for (int i = 0; i < f.length; i++)
                    {
                        if (f[i] != 0)
                        {
                            System.out.println(reducedStr.charAt(i) + " freq: " + f[i]);
                        }
                    }
                }

                else if (input == 2) // if the user inputs 2
                {
                    System.out.println("The sorted by frequency characters are:\n");
                    char[][] result = frequencySort(str);
                    for (int i = 0; i < result[0].length; i++)
                    {
                        System.out.println(result[1][i] + " freq: " + (result[0][i] - '0'));
                    }

                }

                else if (input == 3) //if the user inputs 3
                {
                    int[] types = charTypes(str);
                    System.out.println("Textual Character count: " + types[0]);
                    System.out.println("Numerical Character count: " + types[1]);
                    System.out.println("WhiteSpace Character count: " + types[2]);
                    System.out.println("Symbol Character count: " + types[3]);
                }
                else if(input == 4) // if the user inputs 4
                {
                    System.out.println("Character Sorter Exited Successfully");
                    return; //exit the program
                }

                else // for any other inputs
                    System.out.println("Error, bad input, please enter a number 1-4");
                System.out.println();


            }

            catch (InputMismatchException e) // catch the invalid inputs, valid inputs are: 1, 2, 3, 4
            {
                System.out.println("Error, bad input, please enter a number 1-4");
                input = 0;
                scan.nextLine();
                System.out.println();
            }

        } while (input != 4);
        {
            System.out.println("Character Sorter Exited Successfully");
            scan.close();
        }
    }


}
