import java.util.Scanner;

   public class IT24101177Lab5Q2{

  public static void main(String[]args){

 Scanner input=new Scanner(System.in);
int num;

System.out.print("Enter the number of new members introduced:");
num=input.nextInt();

 switch(num)
{

case 0  :System.out.print("Prize is a : Prize");
         break;
case 1  :System.out.print("Prize is a : Pen");
         break;
case 2  :System.out.print("Prize is a : Umbrella");
         break;
case 3  :System.out.print("Prize is a : Bag");
         break;
case 4  :System.out.print("Prize is a : Travelling Chair");
         break;

default  :             //number>=5 
           if(num>4)  
         {System.out.print("Prize is a : Headphone");}

           else // no respond to minus numbers 
         {System.out.print("input must be a number 0 or greater");}
   
   }
 }
}