import java.util.Scanner;

class BMICalc2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter number of people: ");
        num = sc.nextInt();
        double[][] personData = new double[num][3]; 
        String[] weightStatus = new String[num];
        for (int i = 0; i < num; i++) 
        {
            System.out.println("Enter height(m) and weight(kg) for person " + (i + 1) + ": ");
            double height = sc.nextDouble();
            double weight = sc.nextDouble();
            while (height <= 0 || weight <= 0) 
            {
                System.out.println("Height and weight must be positive values. Please re-enter:");
                height = sc.nextDouble();
                weight = sc.nextDouble();
            }
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height); 
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else if (personData[i][2] >= 40.0) {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < num; i++)
        {
            System.out.println("Showing info for person " + (i + 1) + ":-");
            System.out.println("Height: " + personData[i][0]);
            System.out.println("Weight: " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
        }
    }
}