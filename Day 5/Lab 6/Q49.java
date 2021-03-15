package Day5FunFriday;
import java.util.Scanner;

public class Q49 {
	// Three instance variables – length, width and height (each of type double)
    private double length, width, height;
    // One instance variables – input (type Scanner) initialized to System.in
    private Scanner input = new Scanner(System.in);

    // Default constructor (no-arg) – initialize all three instance variables to 1
    public Q49() {
        this.length = this.width = this.height = 1;
    }

    // Initial constructor – initialize all three instance variables
    public Q49(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Copy constructor – copy Box
    public Q49(Q49 b) {
        this(b.length, b.width, b.height);
    }

    // inputWidth, inputLength, and inputHeight methods that set the instance
    // variables based on user input have not parameters and do not return a value.
    public void inputWidth() {
        this.width = input.nextDouble();
    }

    public void inputLength() {
        this.length = input.nextDouble();
    }

    public void inputHeight() {
        this.height = input.nextDouble();
    }

    // a displayDimensions method that displays the length X Width X height
    // (separated by “X”) and does not return a value.
    public void displayDimensions() {
        System.out.printf("%.2fX%.2fX%.2f%n", length, width, height);
    }

    // a calcVolume method that has no parameters and calculates the volume of the
    // box
    public double calcVolume() {
        return length * width * height;
    }
}
