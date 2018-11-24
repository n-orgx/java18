package NadjibAInl6;

import java.text.NumberFormat;

public class Kvadrat {

    static double b;
    double area;

    public Kvadrat() {

	// this.b= 5.2;
    }

    // public void calculateArea() {

    // area = b * b;}

    public double area() {
	return area = b * b;
    }

    public static void main(String[] args) {

	NumberFormat r = NumberFormat.getInstance();

	// Kvadrat kv= new Kvadrat(b, 5.2); // BEHÖVES INT NÅGON PARAMETER
	// Kvadrat.Area();
	r.setMaximumFractionDigits(4);
	// String x = r.format(area);

	Kvadrat kv = new Kvadrat();
	kv.area();

	System.out.println("THE AREAN AV KVADRATEN :" + kv.area());
    }
}
// voila un code sur git 
