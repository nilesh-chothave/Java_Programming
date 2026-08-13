/*
    4. Write java program to accept file name from user and create new file of
    that name if it is not existing.
*/

import java.io.*;
import java.util.*;

class AS45_Q4_CreateNewFile 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;

        String fName = null;

        System.out.println("Enter the file name : ");
        fName = sobj.nextLine();

        fobj = new File(fName);

        fobj.createNewFile();

        System.out.println("File gets created successfully : "+fobj);
    }
}