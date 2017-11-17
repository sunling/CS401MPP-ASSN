package NewMPP_ASSN.excirces.prob2.exam.partA;



//The lambda:   () -> Math.random()
public class PartA {
	//provide a functional interface type for the lambda
	
	MyFunctional<Double> functionalInterface = ()->Math.random();
	//provide a method reference and the type of method reference
	//TYPE: 
	MyFunctional<Double> methodReference = Math::random;
	
	
	// provide an inner class that behaves the same way as the labmda
	class MyClass implements MyFunctional<Double> {

		@Override
		public Double accept() {
			// TODO Auto-generated method stub
			return Math.random();
		} }

	
	
	public void evaluator() {
		//implement the lambda, the method reference, and the inner class operation
		System.out.println(functionalInterface.accept());
		System.out.println(methodReference.accept());
		System.out.println(new MyClass().accept());
	}
	
	public static void main(String[] args) {
		PartA pa = new PartA();
		pa.evaluator();
	}
}
