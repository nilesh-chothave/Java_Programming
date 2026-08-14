/*
    2. Write java program to accept file name from user and check whether
    that file is regular file or not..
*/

import java.io.*;
import java.util.*;

class AS46_Q2_FileTypeCheck
{
   public static void main(String[] args) throws Exception
   {
        Scanner sobj = new Scanner(System.in);
        String fName = null;
        File fobj = null;

        System.out.println("Enter the file name : ");
        fName = sobj.nextLine();

        fobj = new File(fName);

        if(fobj.exists() && fobj.isFile())
        {
            System.out.println("file is regular");
        }
        else
        {
            System.out.println("File not reagular");
        }
        sobj.close();
   }
}