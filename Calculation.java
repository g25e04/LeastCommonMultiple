
public class Calculation {

	private int num1;
	private int num2; 
	
	public Calculation() {
		// TODO Auto-generated constructor stub
	}

	public Calculation(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);
	}
	
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int lcm() {
		int temp = 1;

		for (int i = 2; i <= getNum1() || i <= getNum2(); i++) {
            if (getNum1() % i == 0 && getNum2() % i == 0) {
                temp = i;
            }
        }
		return getNum1() * getNum2() / temp;
	}
	public String toString() {
	return	"The least common multiple for " + num1 + 
		" and " + num2 + " is " + lcm();
	}
}