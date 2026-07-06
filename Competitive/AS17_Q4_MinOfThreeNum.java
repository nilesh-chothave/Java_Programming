/*
    4. Write a program to find the minimum of three numbers.
*/

class Logic
{
    void FindMin(int a, int b, int c)
    {
        if(a > b && b < c)
        {
            System.out.println("Minimum number is "+b);
        }
        else if(b > a && a < c)
        {
            System.out.println("Minimum number is "+a);
        }
        else
        {
            System.out.println("Minimum number is "+c);

        }
    }
}

class AS17_Q4_MinOfThreeNum 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.FindMin(3, 2, 7);     
    }
}
