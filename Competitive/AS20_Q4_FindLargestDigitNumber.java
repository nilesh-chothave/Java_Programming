class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit = 0, iMax = 0;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            num = num / 10;
        }
        System.out.println(iMax);
    }
}

public class AS20_Q4_FindLargestDigitNumber 
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.FindLargestDigit(83429);
    }
}