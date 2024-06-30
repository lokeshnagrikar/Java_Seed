package Programme10;

public class VolumeCalculator {
    public double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public double calculateVolume(int length, int breadth, int height) {
        return length * breadth * height;
    }
}