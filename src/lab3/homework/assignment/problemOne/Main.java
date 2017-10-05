/**
 * 
 */
package lab3.homework.assignment.problemOne;

/**
 * @author farruhhabibullaev
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p2 = new Person("Joe");
		Person p3  = new Person("SAM");
		PersonWithJob pw1 = new PersonWithJob(p2, 30000);
		PersonWithJob pw2 = new PersonWithJob(p3, 30000);
		
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + pw1.equals(pw2));

	}

}
