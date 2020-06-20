package Labs;

public class Lab6 {
    public static void main(String[] args)
    {
        int[][] fillRightArray = new int[5][8];
        fillRight(fillRightArray, 2);
        printArray(fillRightArray);
        System.out.println();

        int[][] fillDownArray = new int[5][8];
        fillDown(fillDownArray, -2);
        printArray(fillDownArray);
        System.out.println();

        System.out.println(getRowSum(fillRightArray, 0));
        System.out.println(getColSum(fillDownArray, 0));


    }

    public static void printArray(int[][] aliArray)
    {
        int rows = aliArray.length;
        int cols = aliArray[0].length;
        int i;
        int j;

        for (i = 0; i < rows; ++i) {
            for (j = 0; j < cols; ++j) {
                System.out.format("%-10d", aliArray[i][j]);
            }
            System.out.println();
        }
    }


    public static int getColSum(int[][] aliArray, int index1) //index1 is index of columns
    {
        int lengthOfCols = aliArray.length;
        int sumTotal = 0;
        int i;


            if(index1 < 0 || index1 >= aliArray.length)
            {
                return -1;
            }

            for(i= 0; i < lengthOfCols; ++i)
            {
                sumTotal = sumTotal + aliArray[i][index1];
            }
            return sumTotal;
    }

    public static int getRowSum(int[][] aliArray, int index2) //index2 is index of rows
    {
        int lengthOfRows = aliArray[0].length;
        int sumTotal = 0;
        int i;


            if(index2 < 0 || index2 >= lengthOfRows)
            {
                return -1;
            }

                for(i = 0; i < lengthOfRows; ++i)
                {
                sumTotal += aliArray[index2][i];
                }

            return sumTotal;
    }

    public static void fillDown(int[][] aliArray, int step)
    {
        int lenghtOfRows = aliArray.length;
        int lenghtOfCols = aliArray[0].length;
        int i;
        int j;
        int passer = 0;
        passer = step;

            for(i = 0; i < lenghtOfCols; ++i)
            {
            for(j = 0; j < lenghtOfRows; ++j)
            {
                aliArray[j][i] = passer;
                passer = passer + step;
            }
            }
    }

    public static void fillRight(int [][] aliArray, int step)
    {
        int lengthOfRows = aliArray.length;
        int lengthOfCols = aliArray[0].length;
        int passer = 0;
        int i;
        int j;
        passer = step;
            for(i = 0; i < lengthOfRows; ++i)
            {
                for(j = 0; j < lengthOfCols; ++j)
                {
                    aliArray[i][j] = passer;
                    passer = passer + step;
                }
            }
    }
}
