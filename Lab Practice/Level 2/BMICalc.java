import java.util.Scanner;
class BMICalc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter number of people: ");
        num = sc.nextInt();
        double[] height = new double[num];
        double[] weight = new double[num];
        double[] bmi = new double[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter height(m) and weight(kg) for person"+(i+1)+": ");
            height[i] = sc.nextDouble();
            weight[i] = sc.nextDouble();
            bmi[i] = (weight[i]/(height[i]*height[i]));
        }
        for(int i=0;i<num;i++)
        {
            System.out.println("Showing info for person "+(i+1)+":-");
            System.out.println("Height: "+height[i]);
            System.out.println("Weight: "+weight[i]);
            System.out.println("BMI: "+bmi[i]);
            if(bmi[i]<=18.4)
            {
                System.out.println("Weight Status: Underweight");
            }
            else if(bmi[i]>=18.5&&bmi[i]<=24.9)
            {
                System.out.println("Weight Status: Normal");
            }
            else if(bmi[i]>=25.0&&bmi[i]<=39.9)
            {
                System.out.println("Weight Status: Overweight");
            }
            else if(bmi[i]>=40.0)
            {
                System.out.println("Weight Status: Obese");
            }
        }
    }
}
