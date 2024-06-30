package progamm4;

public class TollBooth {
    private int totalCars;
    private double totalMoney;

    
    public TollBooth() {
        totalCars = 0;
        totalMoney = 0.0;
    }

  
    public void payingCar() {
        totalCars++;
        totalMoney += 0.50; 
    }

    
    public void noPayCar() {
        totalCars++;
    }

    // Method to display the two totals
    public void display() {
        System.out.println("Total Cars: " + totalCars + ", Total Money: " + totalMoney + " Rs.");
    }

    public static void main(String[] args) {
        TollBooth booth = new TollBooth();

        booth.payingCar();
        booth.payingCar();
        booth.noPayCar();
        booth.payingCar();
 booth.payingCar();
        booth.display();
    }
}