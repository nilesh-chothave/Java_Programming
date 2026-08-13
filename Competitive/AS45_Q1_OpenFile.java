/*
    1.Write java program to accept file name from user and open that file.
*/

import java.io.*;
import java.util.*;

class AS45_Q1_OpenFile
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        String fName = null;

        System.out.println("Enter the file name : ");
        fName = sobj.nextLine();

        fobj = new File(fName);
        if(fobj.exists())
        {
            System.out.println("File opended sucessfully");
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}