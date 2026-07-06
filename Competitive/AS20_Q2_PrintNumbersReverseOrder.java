/*
    2. Write a program to print numbers from N down to 1 in reverse order.

    Output :10
            9
            8
            7
            6
            5
            4
            3
            2
            1
*/

import java.util.*;

class Logic
{
    void PrintReverse(int n)
    {
        int iCnt = 0;

        for(iCnt = n; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class AS20_Q2_PrintNumbersReverseOrder
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.PrintReverse(10);
    }
}