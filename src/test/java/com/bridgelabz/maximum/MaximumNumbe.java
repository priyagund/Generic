package com.bridgelabz.maximum;

import java.util.Scanner;

public class MaximumNumbe <E>
{
    Integer maximumNumber;
    public Integer checkNumber(Integer a,Integer b,Integer c)
    {
        if (a>b && a>c){
            maximumNumber=a;
        }
        else if(b>a && b>c){
            maximumNumber=b;
        }
        else
        {
            maximumNumber=c;
        }
       return maximumNumber;
    }



}

