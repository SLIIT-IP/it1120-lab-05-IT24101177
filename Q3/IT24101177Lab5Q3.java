import java.util.Scanner;
 public class IT24101177Lab5Q3{

    public static void main(String[]args){

   Scanner input=new Scanner(System.in);

   final int PerDay=48000;
   int StartDate;
   int EndDate;
   int NoOfDateReserved;
   double NoDiscount;
   double Discount10;
   double Discount20;

System.out.println("Room Charge Per Day:Rs. 48000.0/=");

 System.out.print("Enter Start Date(1-31):");
 StartDate=input.nextInt();

 System.out.print("Enter End Date(1-31):");
 EndDate=input.nextInt(); 

NoOfDateReserved=EndDate-StartDate;

 if(StartDate>EndDate)
{ System.out.print("Error:Start Date must be less than end date");
 System.exit(1);}

else if(StartDate<1 ||StartDate>31 || EndDate<1 ||EndDate>31 )
{System.out.print("Error:Days must be between 1 and 31");
 System.exit(1);}

else
{System.out.println("Number of Days reserved:"+NoOfDateReserved);}

NoDiscount=NoOfDateReserved*PerDay;
Discount10=NoOfDateReserved*PerDay*90/100;
Discount20=NoOfDateReserved*PerDay*80/100;


if(NoOfDateReserved<5 && NoOfDateReserved>2 )
{System.out.println("Total Amount To Be paid:rs. "+Discount10);}

else if(NoOfDateReserved>4)
{System.out.println("Total Amount To Be paid:rs. "+Discount20);}

else
{System.out.println("Total Amount To Be paid:rs. "+NoDiscount);}

  }
}






 