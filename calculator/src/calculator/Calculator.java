/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author HP
 */
public class Calculator {

    public static int add(int num1 , int num2)
    {
        return num1+num2;
    }
    
    public static int sub (int num1 , int num2)
    {
        return num1 - num2;
    }
    
    public static int mul(int num1,int num2)
    {
        return num1 * num2;
    }
    
    public static int div(int num1,int num2)
    {
        if(num2 == 0)
        {
            throw new IllegalArgumentException("num canot be divided by 0");
        }
        return num1 / num2;
    }
    
}
