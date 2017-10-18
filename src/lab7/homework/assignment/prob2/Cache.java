package lab7.homework.assignment.prob2;

public interface Cache {
	//shouldn't be static
	default public long timeout() {
		//seconds
		return 1;
	}
}
