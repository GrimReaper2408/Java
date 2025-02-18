import java.util.Scanner;
class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float num1,num2;
        System.out.println("Enter two numbers: ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        System.out.println("The addition, subtraction, multiplication, and division value of "+num1+" and "+num2+" is "+(num1+num2)+", "+(num1-num2)+", "+(num1*num2)+", "+(num1/num2));
    }
}