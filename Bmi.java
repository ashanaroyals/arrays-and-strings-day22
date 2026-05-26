import java.util.Scanner;
class Bmi
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double height=sc.nextInt();
double weight=sc.nextInt();
double bmi=weight/(height*height);
if (bmi<=18.5)
System.out.println("underweight");
else if(bmi>=18.5&&bmi<=24.9)
System.out.println("normal weight");
else if(bmi>=25&&bmi<=29.9)
System.out.println("over weight");
else
System.out.println("obese");
}
}
