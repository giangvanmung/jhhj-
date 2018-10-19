/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btt4;

/**
 *
 * @author 84122
 */

import java.util.Scanner;
public class BTT4 {

    
    // tim gia tri lon nhat cua hai so nguyen
    public static int Max(int a, int b){
        if(a>b)
            return a;
        else 
            return b;
    }
    //tim gia tri nho nhat cua 1 mang
    public static int arrayMin(int[] array){
        int min = array[0];
        for(int i = 1;i < array.length; i++){
            if(min > array[i])
                min = array[i];
        }
        return min;
    }
    // chuong trinh tinh chi so BMI
    public static String tinhBMI(double weight, double height){
        double BMI;
        BMI = weight / (height*height);
        if(BMI < 18.5)
            return "Thieu can";
        else if(BMI >= 18.5 && BMI <= 24.99)
            return "Binh thuong";
        else if(BMI >= 23&& BMI <= 24.99)
            return "Thua can";
        else if(BMI >= 25){
            return "Beo phi";
        }
        else return null;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //int a,b;
//        a = input.nextInt();
//        b = input.nextInt();
//        System.out.println(Max(a,b));
//        
//        int array[] = new int[100];
//        for(int i = 0; i < 10; i++){
//            System.out.println("Nhao vao phan tu thu: "+ (i+1));
//            array[i] = input.nextInt();
//        }
//        System.out.println(arrayMin(array));
        double a;
        double b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(tinhBMI(a,b));
    }
    
}
