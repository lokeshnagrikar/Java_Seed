package programm5;

import java.util.Scanner;

public class OrangeFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of oranges plucked:");
        int numOranges = sc.nextInt();
        int orangesForOwner = numOranges * 40/ 100;
        int orangesForWorkers = numOranges - orangesForOwner;
        int orangesForEachWorker = orangesForWorkers / 4;
        int orangesForJuice = orangesForWorkers - orangesForEachWorker * 4;
        System.out.println("Total oranges for the owner: " + orangesForOwner);
        System.out.println("Total oranges for each worker: " + orangesForEachWorker);
        System.out.println("Balance of oranges to make juice: " + orangesForJuice);
    }
}
