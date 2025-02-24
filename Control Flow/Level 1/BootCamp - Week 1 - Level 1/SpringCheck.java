import java.util.Scanner;
class SpringCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int date; String month;
        System.out.println("Enter month: ");
        month = sc.nextLine();
        if(month.equals("April"))
        {
            System.out.println("Spring Season");
            System.exit(0);
        }
        else if(month.equals("May"))
        {
            System.out.println("Spring Season");
            System.exit(0);
        }
        System.out.println("Enter date:");
        date = sc.nextInt();
        if(month.equals("March"))
        {
            if(date>=20)
            {
                System.out.println("Spring Season");
            }
            else
            {
                System.out.println("Not Spring Season");
            }
        }
        else if(month.equals("June"))
        {
            if(date<=20)
            {
                System.out.println("Spring Season");
            }
            else
            {
                System.out.println("Not Spring Season");
            }
        }
        else
        {
            System.out.println("Not Spring Season");
        }
    }
}