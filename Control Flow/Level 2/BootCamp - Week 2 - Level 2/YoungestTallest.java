import java.util.Scanner;
class YoungestTallest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int heightAmar,heightAkbar,heightAnthony,ageAmar,ageAkbar,ageAnthony;
        System.out.println("Enter the height and ages of amar,akbar and anthony in order: ");
        heightAmar = sc.nextInt();
        heightAkbar = sc.nextInt();
        heightAnthony = sc.nextInt();
        ageAmar = sc.nextInt();
        ageAkbar = sc.nextInt();
        ageAnthony = sc.nextInt();
        int smallest,tallest;
        smallest = Math.min(Math.min(ageAmar,ageAkbar),ageAnthony);
        tallest = Math.max(Math.max(heightAmar,heightAkbar),heightAnthony);
        System.out.println("Youngest is "+smallest+" years old.");
        System.out.println("Tallest is "+tallest+" cm tall.");
    }
}