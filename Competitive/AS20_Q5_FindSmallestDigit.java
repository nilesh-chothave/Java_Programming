class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0, iMin = num % 10;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            num = num / 10;
        }

        System.out.println(iMin);
    }
}

class AS20_Q5_FindSmallestDigit 
{
    public static void main(String[] args)
    {
       Logic obj = new Logic();
       obj.findSmallestDigit(25874); 
    }
}
