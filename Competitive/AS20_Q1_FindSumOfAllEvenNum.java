/*
    1. Write a program to find the sum of all even numbers up to N.
*/

import java.util.*;

class Logic
{
    void SumEvenNumbers(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum+iCnt;
            }
        }
        System.out.println(iSum);
    }
}

class AS20_Q1_FindSumOfAllEvenNum 
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.SumEvenNumbers(10);
    }
}