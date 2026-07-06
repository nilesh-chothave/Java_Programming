/*
    3. Write a program to check whether a number is divisible by 5 and 11 or not.
*/

class Logic
{
   void CheckDivisible(int num)
   {
        if((num % 5 == 0) && (num % 11 == 0))
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
   } 
}

class AS19_Q3_CheckDivisibleBy5And11OrNot
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CheckDivisible(55);
    }   
}