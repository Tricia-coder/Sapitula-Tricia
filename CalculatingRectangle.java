package calculatingRectangle;

public class CalculatingRectangle {
	    public static void main(String[] args) {
	        // Given values
	        double length = 18.0; // meters
	        double width = 6.0; // meters

	        // Calculations
	        double area = length * width;
	        double perimeter = 2 * (length + width);

	        // Output
	        System.out.println("Length: " + length + " meters");
	        System.out.println("Width: " + width + " meters");
	        System.out.println("Area: " + area + " square meters");
	        System.out.println("Perimeter: " + perimeter + " meters");
	    }
	}
