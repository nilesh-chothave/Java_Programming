/*
    1. Write a program to check whether a given year is a leap year or not.
*/

class Logic
{
    void CheckLeepYear(int year)
    {
        if((year % 400 != 0) || (year % 4 == 0 && year % 100 == 0) )
        {
            System.out.println("Leep year ");
        }
        else
        {
            System.out.println("Not leep year");
        }
    }
}

class AS19_Q1_LeepYear 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckLeepYear(2024);  
    }
}
