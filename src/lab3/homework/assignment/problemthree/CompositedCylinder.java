package lab3.homework.assignment.problemthree;

public class CompositedCylinder {
	private double height = 1.0;
	private Circle circle;
	
	public CompositedCylinder(Circle circle){
		this.circle = circle;
	}
	
	public CompositedCylinder(Circle circle, double height){
		this.circle = circle;
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getVolume(){
		return circle.getArea() * height;
	}
	
}
