/*
    3. Write java program to accept directory name from user and create that
    directory.
*/

import java.io.*;
import java.util.*;

class AS46_Q3_Directory
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String file = null;

        System.out.println("Enter the Directory name : ");
        file = sobj.nextLine();

        File fobj = new File(file);

        if(fobj.mkdir() && fobj.exists())
        {
            System.out.println("Directory created successfully");
        }
        else
        {
            System.out.println("Directory could not be created successfully");
        }
        sobj.close();
    }   
}