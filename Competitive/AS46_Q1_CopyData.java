/*
    1. Write java program to accept two file names from user and open first
    file and create new file (Second name) and copy the data from first file into
    newly created file.
*/

import java.io.*;
import java.util.*;

class AS46_Q1_CopyData
{
    public static void main(String[] args) throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        String fName = null;
        String str = null;

        int iRet = 0;

        System.out.println("Enter the first file name : ");
        fName = sobj.nextLine();

        fobj = new File(fName);

        if(fobj.exists())
        {
            System.out.println("File is exists");

            System.out.println("Create the new file : ");
            str = sobj.nextLine();

            fiobj = new FileInputStream(fobj);

            File ffobj = new File(str);

            ffobj.createNewFile();

            foobj = new FileOutputStream(ffobj);

            while((iRet = fiobj.read()) != -1)
            {
                foobj.write(iRet);
            }
            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no such file");
        }
        sobj.close();
    }
}