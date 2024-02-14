public class Rectangle extends Triangle{
	public int d;

    Rectangle() {
    }

    Rectangle(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }

    // Override the calculate method
    public int calculate() {
        return super.calculate() * d;
    }
}