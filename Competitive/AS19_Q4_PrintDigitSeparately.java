/*
    4. Write a program to print each digit of a number separately.
*/

class Logic
{
    void PrintDigitSeparately(int num)
    {
        int iDigit = 0;
        while (num != 0)
        {
           iDigit = num % 10;
           System.out.println(iDigit);
           num = num / 10;
        }
    }
}

class AS19_Q4_PrintDigitSeparately 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.PrintDigitSeparately(9876);
    }
}
