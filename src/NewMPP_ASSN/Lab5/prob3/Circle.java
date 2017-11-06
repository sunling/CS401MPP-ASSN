package NewMPP_ASSN.Lab5.prob3;

public final class Circle implements Shape {

	private final double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	
	@Override
	public double compute() {
		// TODO Auto-generated method stub
		return 2 * radius * Math.PI;
	}

}
