package Programme10;

public class Testmain {

	public static class TestMain {
	    public static void main(String[] args) {
	        VolumeCalculator calculator = new VolumeCalculator();

	        double cylinderVolume = calculator.calculateVolume(5.0, 10.0);
	        System.out.println("Volume of cylinder: " + cylinderVolume);

	        double cuboidVolume = calculator.calculateVolume(5, 3, 2);
	        System.out.println("Volume of cuboid: " + cuboidVolume);
	    }
	}
}
