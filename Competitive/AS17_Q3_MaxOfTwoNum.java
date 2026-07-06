/*
    3. Write a program to find the maximum of two numbers.
*/

class Logic
{
    void FindMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a+" Number is greater then "+b);
        }
        else
        {
            System.out.println(b+" Number is less then "+a);
        }
    }
}

class AS17_Q3_MaxOfTwoNum
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.FindMax(15, 20);   
    }
}