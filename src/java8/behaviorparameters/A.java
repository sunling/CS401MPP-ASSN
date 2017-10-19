package java8.behaviorparameters;

public class A <T>{
	
	public static <T> void  a (T as,int a){
		System.out.println(as +"This is Method reference with one method static method");
	}
	
	public static<T> void b(String as){
		System.out.println(as +"Hello world this is b");
	}

}
