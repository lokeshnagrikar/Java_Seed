package ClassWork_volume;

public class MainVolume {

	public static void main(String[] args) {
		
		calciVol cv = new calciVol();
		
		double voc = cv.VolumeCalci(43, 54);
		
	int vcub =	cv.VolumeCalci(34, 32, 2);
	System.out.println("Volume of cylinder : "+voc);
	System.out.println("Volume of Cuboid: "+vcub);
	}
}
