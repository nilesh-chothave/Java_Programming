/*
    4. Write a program to find the sum of even and odd digits separately in a number.
*/

class Logic
{
    void SumEvenOddDigits(int num)
    {
        int iDigit = 0, iEven = 0, iOdd = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit % 2 == 0)
            {
                iEven = iEven + iDigit;
            }
            else
            {
                iOdd = iOdd + iDigit;
            }
            num = num / 10;
        }
        System.out.println("Summation of even number : "+iEven);
        System.out.println("Summation of odd number : "+iOdd);
        
    }
}

class AS18_Q4_SumOfEvenOdd 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.SumEvenOddDigits(123456);
    }    
}
