/*
    5. Write a program to check whether a number is positive, negative, or zero.
*/

class Logic
{
    void CheckSign(int num)
    {
        if(num < 0)
        {
            System.out.println("Number is negative");
        }
        else if(num > 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("It is zero");
        }
    }
}

class AS18_Q5_CheckSign
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckSign(0);
    }    
}