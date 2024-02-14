public class Square extends Triangle{
	public int d;

    Square() {
    }
    Square(int a, int b) {
        super(a, b, 0);
        this.d = b; 
    }
    // Override the calculate method
    public int calculate() {
        return a * d;
    }
}