package NewMPP_ASSN.MMPSTANDARD.prob2;

import java.util.*;

public class Admin {
	/**
	 * Returns the average gpa for all students in the studentList
     */
	public static double computeAverageGpa(List<Student> studentList) {
		//implement
		return studentList.stream().mapToDouble(e->e.computeGpa()).average().getAsDouble();
	}
}
