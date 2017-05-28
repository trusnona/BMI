/*(Body Mass Index : BMI)*/
package app6;

import java.util.Scanner;

public class App6 {

    public static void main(String[] args) {
      data a;
        a = new data();
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("BMI Program");
        System.out.println('\n');
        System.out.print("Height = ");
        a.height = scanner.nextDouble();
        
        System.out.print("Weight = ");
        a.weight = scanner.nextDouble();
        
        a.result =  a.weight/((Math.pow(a.height / 100.0, 2)));

        System.out.println("Your Result = " + a.result + " Kg/m^2");
        
        if(a.result < 18.50){
            System.out.println("Your thin");
        }
        else if (a.result < 22.90 ){
            System.out.println("Your fit");
        }
        else if (a.result < 24.90 ){
            System.out.println("Your fat");
        }
        else if (a.result < 29.90 ){
            System.out.println("Your very fat");
        }
        else if (a.result > 30 ){
            System.out.println("Your Denger");
        }
 
        
    }
}
class data{
    double height;
    double weight;
    double result;
       
}