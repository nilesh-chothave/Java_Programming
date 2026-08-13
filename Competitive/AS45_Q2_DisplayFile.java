/*
    2. Write java program to accept file name from user and open that file and
    display the contents on screen.
*/

import java.io.*;
import java.util.*;

class AS45_Q2_DisplayFile
{
    public static void main(String[] args) throws IOException
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        FileInputStream fiobj = null;
        String fName = null;
        int iRet = 0;

        System.out.println("Enter the file name : ");
        fName = sobj.nextLine();

        fobj = new File(fName);

        byte Buffer[] = new byte[50];

        if(fobj.exists())
        {
            fiobj = new FileInputStream(fobj);
            System.out.println("File is exists");

            String str = null;
            
            while((iRet = fiobj.read(Buffer)) != -1)
            {
                 str = new String(Buffer,0,iRet);
                System.out.println(str);
                str = null;
            }
            fiobj.close();
            sobj.close();
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}