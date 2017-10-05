package lab3.homework.assignment.problemthree;

public class Circle {
	private double radius = 1.0;
	private String color = "Red";
	
	public Circle(){};
	
	public Circle( double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return 2 * Math.PI * this.getRadius();
	}
	
	public String toString(){
		return"[radius = "+ radius+", color = " +color+"]";
	}
}
