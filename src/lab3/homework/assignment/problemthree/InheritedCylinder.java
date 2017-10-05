package lab3.homework.assignment.problemthree;

public class InheritedCylinder extends Circle{
	private double height = 1.0;
	
	public InheritedCylinder(){
		
	}
	
	public InheritedCylinder(double radius){
		super(radius);
	}
	
	public InheritedCylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getVolume(){
		return super.getRadius() * height;
	}
}
