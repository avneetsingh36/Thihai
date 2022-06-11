import java.util.Scanner;


public class ThihaiCalc {


    public static void main(String [] args){

        Scanner taal = new Scanner(System.in);
        Scanner cycles = new Scanner(System.in);
        System.out.println("\n\n\nThis Program can give you a thihai for any taal.");


    

        System.out.print("\n\nWhat is the number of beats in the Taal: ");

        int taalInput = taal.nextInt();


        System.out.print("How many cycles do you want your thihai to be: ");

        int numCycles = cycles.nextInt();

        int beats = numCycles * taalInput;

        int part = closestDivByThree(beats);
        System.out.println();
        System.out.println();

        double division = ((beats + 1.00) - part)/2.00;

        double pala = part/3.00;

        if(division == 0.0 || division == 0.5)
        {System.out.println("Create a Thihai with each pala being " + pala + " beats and a division of " + division + " beats when 'Dha' is the last beat of each pala.\n\n\n");}
        else{

            division = 0;
            pala = pala + 0.5;
            System.out.println("Create a Thihai with each pala being " + pala + " beats and a division of " + division + " beats when 'Dha' is the last half beat of each pala.\n\n\n");

        }

    }


   public static int closestDivByThree(int taal){

       for(int i = taal + 1; i > 0; i--){

            if(i % 1.5 == 0){
                return i;
            }
            else{
                continue;
            }

       }

       return 100;

   }

   


	

}