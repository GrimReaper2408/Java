import java.util.Scanner;
public class StudentGrades 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        for (int i = 0; i < numStudents; i++) 
        {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            physicsMarks[i] = scanner.nextInt();
            while (physicsMarks[i] < 0)
            {
                System.out.print("Marks cannot be negative. Please enter positive values for Physics: ");
                physicsMarks[i] = scanner.nextInt();
            }
            System.out.print("Chemistry: ");
            chemistryMarks[i] = scanner.nextInt();
            while (chemistryMarks[i] < 0) 
            {
                System.out.print("Marks cannot be negative. Please enter positive values for Chemistry: ");
                chemistryMarks[i] = scanner.nextInt();
            }
            System.out.print("Maths: ");
            mathsMarks[i] = scanner.nextInt();
            while (mathsMarks[i] < 0) 
            {
                System.out.print("Marks cannot be negative. Please enter positive values for Maths: ");
                mathsMarks[i] = scanner.nextInt();
            }
            int total = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = total / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }
        System.out.println("\nResults:");
        for (int i = 0; i < numStudents; i++) 
        {
            System.out.printf("Student %d: Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %c%n",
                    (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }
        scanner.close();
    }
    public static char calculateGrade(double percentage)
    {
        if (percentage >= 90) 
        {
            return 'A';
        } 
        else if (percentage >= 80) 
        {
            return 'B';
        } 
        else if (percentage >= 70)
        {
            return 'C';
        } 
        else if (percentage >= 60) 
        {
            return 'D';
        } 
        else 
        {
            return 'F';
        }
    }
}