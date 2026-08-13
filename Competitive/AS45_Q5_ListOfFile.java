/*
    5. Write java program to accept directory name from user and display all
    names of files from that directory.
*/

import java.io.*;
import java.util.*;

class AS45_Q5_ListOfFile
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String fName = null;
        File fobj = null;
        FileInputStream fiobj = null;
        
        System.out.println("Enter the directory : ");
        fName = sobj.nextLine();

        fobj = new File(fName);

        if(fobj.exists() && (fobj.isDirectory()))
        {
            File fArr[] = fobj.listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println(fArr[i].getName());
            }
        }

    }
}