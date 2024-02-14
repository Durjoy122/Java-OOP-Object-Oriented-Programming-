public class Triangle {
	public int a, b, c;

    Triangle() {
    }

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculate() {
        return a * b * c;
    }
}