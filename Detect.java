
public class Detect {
	
	private int num1;
	private int num2;
	
	public Detect() {
		// TODO Auto-generated constructor stub
	}
	public Detect(int num1, int num2) {
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
	
	public boolean Detection() {
		boolean status;
		if(getNum1() <= 1 && getNum2() <=1) {
			status = false;
			return status;
		}
		else {
			status = true;
			return status;
		}	
	}
	
	public String toString() {
		if(Detection()==false)
			return "The number must be greater or equal to 1,please input again.";
		else
			return "Input correct.";
	}
}
