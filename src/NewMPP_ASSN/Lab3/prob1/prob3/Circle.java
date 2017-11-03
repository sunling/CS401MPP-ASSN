package NewMPP_ASSN.Lab3.prob1.prob3;

public class Circle {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double computeArea(){
		return Math.PI*2*radius;
	}

}
