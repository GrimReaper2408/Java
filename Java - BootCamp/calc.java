import java.util.Scanner;
class calc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float sp,cp,profit,loss,prof_perc,loss_perc; 
        System.out.println("Enter cost price and selling price: ");
        cp = sc.nextFloat();
        sp = sc.nextFloat();
        profit = sp-cp;
        loss = cp-sp;
        prof_perc = (profit/cp)*100;
        System.out.println("The profit is "+profit+" and profit percentage is "+prof_perc);
    }
}