import java.util.Scanner;
class TravelComputation 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the distance of Chennai to Vellore and Vellore to Bangalore: ");
       String name = "Eric";
       String fromCity = "Chennai", viaCity = "Velore", toCity = "Bangalore";
       double distanceFromToVia = sc.nextDouble();
       double distanceViaToFinalCity = sc.nextDouble();
       System.out.println("Enter the time of travel of Chennai to Vellore and Vellore to Bangalore: ");
       int timeFromToVia = sc.nextInt();
       int timeViaToFinalCity = sc.nextInt();
       double totalDistance = distanceFromToVia + distanceViaToFinalCity;
       int totalTime = timeFromToVia + timeViaToFinalCity;
       System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
   }
}
