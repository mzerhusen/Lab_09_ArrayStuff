import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ArrayStuff
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int dataPoints [];
        dataPoints = new int [100];
        int arraySum = 0;
        int arrayAverage = 0;
        int userSearch = 0;
        int searchCount = 0;
        int arrayMin = 0;
        int arrayMax = 0;
        boolean searchFound = false;

        //Create array
        for(int x = 0; x < dataPoints.length; x++)
            {
            dataPoints[x] = random.nextInt(100) +1;
            }

        //Print array
        for(int x = 0; x < dataPoints.length; x++)
            {
                System.out.printf("%3d | ",dataPoints[x]);
                if((x + 1) % 20 == 0)
                {
                System.out.print("\n");
                }

            }

        //Get sum of array.
        for(int x = 0; x < dataPoints.length; x++)
        {
            arraySum += dataPoints[x];
        }
        System.out.println("The sum of the numbers in the array is " + arraySum);


        //Get average
        arrayAverage = arraySum / dataPoints.length;
        System.out.println("The average of the numbers in the array is " + arrayAverage);

        //Get average using method
        System.out.println("The average of dataPoints is " + getAverage(dataPoints));

        //Get max and min
        arrayMin = dataPoints[0];
        arrayMax = dataPoints[0];

        for(int x = 0; x < dataPoints.length; x++)
        {
            if(arrayMin > dataPoints[x])
            {
                arrayMin = dataPoints[x];
            }
            if(arrayMax < dataPoints[x])
            {
                arrayMax = dataPoints[x];
            }
        }
        System.out.println("The lowest number in the array is " + arrayMin);
        System.out.println("The highest number in the array is " + arrayMax);


        //Spacing
        System.out.print("\n\n");


        userSearch = SafeInput.getRangedInt(input,"Please enter the number you want to search for", 1, 100);
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(userSearch == dataPoints[x])
            {
                System.out.println(userSearch + " was found in the array at index " + x);
                searchCount++;
            }
        }
        if(searchCount > 1)
        {
            System.out.println(userSearch + " was found " + searchCount + " times in the array.");
        }
        else if(searchCount == 1)
        {
            System.out.println(userSearch + " was found " + searchCount + " time in the array.");
        }
        else
        {
            System.out.println(userSearch + " was not found in the array.");
        }
        System.out.println("\n\n");
        userSearch = SafeInput.getRangedInt(input,"Please enter the number you want to search for", 1, 100);
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(userSearch == dataPoints[x])
            {
                System.out.println("The first instance of " + userSearch + " was found in the array at index " + x);
                searchFound = true;
                break;
            }
        }
        if(!searchFound)
        {
            System.out.println(userSearch + " was not found in the array.");
        }
    }

    private static double getAverage(int values[])
    {
        int arraySum = 0;
        int arrayAverage = 0;
        for(int x = 0; x < values.length; x++)
        {
            arraySum += values[x];
        }
        arrayAverage = arraySum / values.length;
        return arrayAverage;
    }
}