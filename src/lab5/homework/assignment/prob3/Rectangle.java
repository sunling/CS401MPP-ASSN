package lab5.homework.assignment.prob3;

public final class Rectangle implements Shape {
	 private final double width;
	 private final double height;
	
	public Rectangle(double width, double height){
		this.width  = width;
		this.height = height;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}

	@Override
	public double compute() {
		// TODO Auto-generated method stub
		return width*height;
	}

}
