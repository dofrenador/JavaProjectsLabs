package Labs;

public class Lab5 {
    public static void main(String[] args)
    {
        System.out.println(hexString(args[0]));
    }

    public static long hexString(String hexInput)
    {
        hexInput = hexInput.toUpperCase(); //make every letter uppercase

        if(hexInput.contains("0X"))
        {
            hexInput = hexInput.substring(2); // Enable user to input 0x
        }
        else
        {
            hexInput.equals(hexInput);
        }

        int i = 0;
        long temp = 0;
        long hexSum = 0;
        int power = hexInput.length() - 1;
        while (i < hexInput.length())
        {
            temp = hexChar(hexInput.charAt(i));
            i++;
            temp = (long) Math.pow(16, power) * temp;
            power --;
            hexSum +=temp;

        }
        return hexSum;




    }

    public static short hexChar(char X)
    {
        //Getting the values from ASCII table
        short newnum = 0;

        if(X == 'A')
        {
            newnum = 10;
        }
        else if(X == 'B')
        {
            newnum = 11;
        }
        else if(X == 'C')
        {
            newnum = 12;
        }
        else if(X == 'D')
        {
            newnum = 13;
        }
        else if(X == 'E')
        {
            newnum = 14;
        }
        else if(X == 'F')
        {
            newnum = 15;
        }
        else
        {
            newnum = (short)(X - '0');
        }
        return newnum;

    }
}
