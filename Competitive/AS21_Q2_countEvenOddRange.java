/*
    2. Write a program to count how many even and odd numbers are present between 1 and N.
*/

class Logic
{
    void countEvenOddRange(int num)
    {
        int iCnt = 0, iEven = 0, iOdd = 0;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }

        System.out.println("Total number of even : "+iEven);

        System.out.println("Total number of Odd is : "+iOdd);
    }
}

public class AS21_Q2_countEvenOddRange 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(11);
    }   
}

/*
    1   2    3  4   5   6   7   8   9   10

    Even :  2   4   6   8   10
    Odd :   1   3   5   7   9   11
*/