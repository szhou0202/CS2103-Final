public class Polynomial {
	// TODO: add whatever instance variables you need

	// You may assume that c is never null, and that c.length > 0
	public Polynomial (double[] c) {
		// TODO: implement me
	}

	private static int max (int x, int y) {
		return x > y ? x : y;
	}

	public Polynomial add (Polynomial other) {
		return null;  // TODO: implement me
	}

	public Polynomial multiply (Polynomial other) {
		return null;  // TODO: implement me
	}

	public int getDegree () {
		return 0;  // TODO: implement me
	}

	public double getCoefficient (int i) {
		return 0;  // TODO: implement me
	}

	public String toString () {
		return null;  // TODO: implement me
	}

	public static void main (String[] args) {
		System.out.println(new Polynomial(new double[] { 1, 2, 3 }).add(new Polynomial(new double[] { 0, 4, 5, 6 })));
		System.out.println(new Polynomial(new double[] { -1, 1 }).multiply(new Polynomial(new double[] { 1, 1 })));

		final Polynomial p1 = new Polynomial(new double[] { 3.2, 0, 1, 0, -1 });
		final Polynomial p2 = new Polynomial(new double[] { 2 });
		final Polynomial p1TimesP2 = p1.multiply(p2);
		final Polynomial p1PlusP2 = p1.add(p2);
		System.out.println(p1TimesP2);  // Should be: "6.4+2.0*x^2-2.0*x^4"
		System.out.println(p1PlusP2);  // Should be: "5.2+1.0*x^2-1.0*x^4"
		System.out.println(p1PlusP2.getDegree());  // Should be: 4
		System.out.println(p1PlusP2.getCoefficient(4));  // Should be: -1.0
	}
}
