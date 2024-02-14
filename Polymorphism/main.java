public class main {
	public static void main(String[] args) {
		Triangle T = new Triangle(1, 2, 3);
        Rectangle R = new Rectangle(1, 2, 3, 4);
        Square S = new Square(4, 2);

        System.out.println("Triangle " + T.calculate());
        System.out.println("Rectangle " + R.calculate());
        System.out.println("Square " + S.calculate());
	}
}