package NewMPP_ASSN.Lab3.prob1.prob3;

public class Cylinder {

	private Circle circle;
	private double height;
	
	public Cylinder(Circle circle, double height){
		this.circle = circle;
		this.height = height;
	}
	
	public double computeArea(){
		return circle.computeArea()*height;
	}
}
