/*
    2. Write a program to check whether a number is a palindrome or not.
*/

class Logic 
{
    void CheckPalindrome(int num)
    {
        int iRev = 0, iDigit = 0, iOrg = num;
        while(num != 0)
        {
            iDigit = num % 10;
            iRev = (iRev * 10) + iDigit;
            num = num / 10;
        }
        System.out.println(iOrg+" "+iRev);
        if(iOrg == iRev)
        {
            System.out.println("Number is palindrom : "+iRev);
        }
        else
        {
            System.out.println("NUmber is not palindrom");
        }
    }

}

class AS17_Q2_PalindromNumber {
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);
    }
}
