package sample;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prob3 
{
    
    public static int Ways(int sum,int one,int two,int five,int ten,int last)
    {
        if(last==1 && sum<=one) return 1;
        
        if(last==4)
        {
            int ways  = 0;
            ways += Ways(sum,one,two,five,0,3);
            
            while(sum-10>=0 && ten>0)
            {
                ways += Ways(sum-10,one,two,five,0,3);
                ten = ten-1;
                sum = sum-10;
            }
            
            return ways;
        }
        
        if(last==3)
        {
            int ways  = 0;
            ways += Ways(sum,one,two,0,0,2);
            
            while(sum-5>=0 && five>0)
            {
                ways += Ways(sum-5,one,two,0,0,2);
                sum = sum-5;
                five = five-1;
            }
            
            return ways;
        }
        
        if(last==2)
        {
            int ways  = 0;
            ways += Ways(sum,one,0,0,0,1);
            
            while(sum-2>=0 && two>0)
            {
                ways += Ways(sum-2,one,0,0,0,1);
                sum = sum-2;
                two = two-1;
            }
            
            return ways;
        }
        
        return 0;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        
        for(int i=0;i<cases;i++)
        {
            int sum = s.nextInt();
            System.out.println(Ways(sum,s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),4));
        }
            //System.out.println(Ways(15,2,3,1,1,4));
    }
}
