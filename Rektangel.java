package NadjibAInl6;

public class Rektangel {

    private double a = 5.2;// bas
    private double b;// höjd
    private double area; // Instansvariabel (eftersom att vi inte använder "static")
    private double Omkrets;

    public Rektangel() {

	// this.a = a; // höjd
	// this.b = b; // bas
    }

    public double area() { // Instansmetod (eftersom att vi inte använder "static")
	   return area = 38.48; // (bas*höjd)

	// this.Area(); // StackOverflowException, för att det blir för många/"djupa"
	// anrop
    }

    public double Omkrets() { // Instansmetod (eftersom att vi inte använder "static")

	    return Omkrets = a * 2 + b * 2;
    }

    public static void main(String[] args) {
	Rektangel rektangel = new Rektangel();
	rektangel.area(); // Anrop rill instansmetod
	System.out.println("AREAN är: " + rektangel.area); // Åtkomst till instansvariabel
	// Rektangel.Area() eller Rektangel.area, om vi hade använt "static" (det vill
	// säga skapat klassmetoder eller klassvariabler)

	rektangel.Omkrets();
	System.out.println("OMKRETSEN är :" + rektangel.Omkrets);
    }
}
