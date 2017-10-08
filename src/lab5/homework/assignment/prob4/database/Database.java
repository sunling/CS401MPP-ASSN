package lab5.homework.assignment.prob4.database;

import java.util.HashMap;


public class Database {
	public static HashMap<String, DataRecord> h = new HashMap<>();
	static {
		h.put("1", new DataRecord("Bob", "A"));
		h.put("2", new DataRecord("Alan", "B"));
		h.put("3", new DataRecord("Dave", "A"));
		h.put("4", new DataRecord("Perry", "C"));
	}
}
