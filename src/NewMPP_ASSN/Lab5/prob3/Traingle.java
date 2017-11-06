package NewMPP_ASSN.Lab5.prob3;

public final class Traingle implements Shape {

	
	private final double base;
	private final double height;
	
	public Traingle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public double getBase(){
		return base;
	}
	
	public double getHeight(){
		return height;
	}
	
	@Override
	public double compute() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

}
