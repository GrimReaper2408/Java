import java.util.Scanner;
public class StudentGrades2D
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        for (int i = 0; i < numStudents; i++) 
        {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++)
            {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                marks[i][j] = scanner.nextInt();
                while (marks[i][j] < 0) 
                {
                    System.out.print("Marks cannot be negative. Please enter positive values for " + subject + ": ");
                    marks[i][j] = scanner.nextInt();
                }
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }
        System.out.println("\nResults:");
        for (int i = 0; i < numStudents; i++) 
        {
            System.out.printf("Student %d: Physics: %d, Chemistry: %d, Maths: %d, Percentage: %.2f%%, Grade: %c%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
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