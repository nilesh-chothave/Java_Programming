/*
    1. Write a program to calculate the product of digits of a number.
*/

class Logic
{
    void productOfDigits(int num)
    {
        int iDigit = 0, iMul = 1;

        while(num != 0)
        {
           iDigit = num % 10;
           iMul = iMul * iDigit;
           num = num / 10;
        }

        System.out.println(iMul);
    }
}

class AS21_Q1_productOfDigits
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);  
    }
}