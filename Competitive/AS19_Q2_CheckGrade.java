/*
    2. Write a program to display the grade of a student based on marks.
*/

class Logic
{
    void DisplayGrade(int marks)
    {
        if(marks < 0)
        {
            System.out.println("Enter positive marks");
            return;
        }

        if(marks > 100)
        {
            System.out.println("Please enter valid marks");
            return;
        }

        if(marks >= 80 && marks < 100)
        {
            System.out.println("Grade is A");
        }
        else if(marks >= 60 && marks < 80)
        {
            System.out.println("Grade is B");
        }
        else if(marks >= 35 && marks < 60)
        {
            System.out.println("Grade id C");
        }
        else
        {
            System.out.println("your falied");
        }
    }
}

class AS19_Q2_CheckGrade
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.DisplayGrade(60);  
    }
}