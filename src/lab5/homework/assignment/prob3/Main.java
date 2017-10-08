package lab5.homework.assignment.prob3;

public class Main {
	
	public static void main(String [] args){
		Shape [] shapes = {new Traingle(2,3), new Circle(2), new Rectangle(1,2)};
		double sum = 0;
		for(Shape shape: shapes){
			sum += shape.compute(); 
		}
		System.out.println(sum);
	}

}
