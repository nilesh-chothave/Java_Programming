/*
    3. Write java program to accept file name from user and open that file in
    write mode and write some data at the end of file.
*/

import java.io.*;
import java.util.*;

class AS45_Q3_WriteDataEndOfFile
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        FileOutputStream foobj = null;
        String fName = null;
        byte Buffer[] = new byte[50];
        String str = "Jay Ganesh...";

        System.out.println("Enter the file name : ");
        fName = sobj.nextLine();

        fobj = new File(fName);
        foobj = new FileOutputStream(fobj,true);
        Buffer = str.getBytes();
        if(fobj.exists())
        {
            foobj.write(Buffer);
            System.out.println("Data write into the file name : ");
        }
    }
}