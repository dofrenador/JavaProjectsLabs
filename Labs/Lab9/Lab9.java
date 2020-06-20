package Labs.Lab9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try
        {

            in = new FileInputStream("Labs/Lab9/input.txt");
            out = new FileOutputStream("Labs/Lab9/output.txt");
            PrintWriter writer = new PrintWriter(out);
            Scanner input = new Scanner(in);

            while (input.hasNext())
            {

                String ascii = input.next();

                String writeThisString = new String(ascii);
                Character convertedByte = (char)Integer.parseInt(writeThisString, 2);
                out.write(convertedByte);
                writer.flush();

            }

        }
        catch (IOException e)
        {

            System.out.println("Caught IOException: " + e.getMessage());

        }

        finally
        {

            if (in != null)
            {
                in.close();
            }

            if (out != null)
            {
                out.close();
            }
        }
    }
}