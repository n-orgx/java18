package NadjibAInl6;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

	Cirkel cr = new Cirkel();
	cr.Cdiameter();
	System.out.println(" CIRKELNS DAIMETER :" + cr.Cdiameter);

	Rektangel rg = new Rektangel();
	rg.area();
	System.out.println(" REKTANGEL AREAN   :" + rg.area());

	Kvadrat kv = new Kvadrat();
	kv.area();
	NumberFormat r = NumberFormat.getInstance();
	r.setMaximumFractionDigits(4);

	String x = r.format(kv.area);

	System.out.println(" KVADRATEN AREA    :" + x);
    }
}
/// now i understand java...merci beaucoup
// Un constructeur =>>> une method ==>>> 
