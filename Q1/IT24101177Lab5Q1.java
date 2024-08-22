import java.util.Scanner;

   public class IT24101177Lab5Q1{

  public static void main(String[]args){

 Scanner input=new Scanner(System.in);

int no1;
int no2;
int no3;
int max ;
int min ;

System.out.print("Enter the first integer:");
no1=input.nextInt();

System.out.print("Enter the second integer:");
no2=input.nextInt();

System.out.print("Enter the third integer:");
no3=input.nextInt();

System.out.println("User Entered numbers are:"+no1+" "+no2+" "+no3);

max=no1;//asign no1 as maximum value

if(no2>max)
{max=no2;} 

if(no3>max)
{max=no3;}

min=no1;//asign no1 as minimum value

if(no2<min)
{min=no2;}

if(no3<min)
{min=no3;}
 //print maximum and minimum value
System.out.println("The largest number is:"+max);

System.out.print("The smallest number is:"+min);

 }
}



  
