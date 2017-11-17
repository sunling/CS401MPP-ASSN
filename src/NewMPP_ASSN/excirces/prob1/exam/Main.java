package NewMPP_ASSN.excirces.prob1.exam;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

	
	//Query A (for Problem 1A) given a member's checkout record, determine whether some
	//bookcopy in the record is overdue (a bookcopy is overdue if it is not available
	//and its due date is before now.
	public static boolean someBookOverdue(CheckoutRecord record) {
          return record.getCheckoutEntries().stream()
        		  .filter(e->(!e.getCopy().isAvailable() || e.getDueDate().compareTo(LocalDate.now()) < 0))
        		  .findAny().isPresent(); //implement
	
	}
	
	//Query B (for Problem 1B) Given a BookCopy copy and a LibraryMember mem,
	//return true if mem has ever checked out this copy
	//
	public static boolean everCheckedOutBy(LibraryMember mem, BookCopy copy) {
		return mem.getRecord().getCheckoutEntries().stream()
				.filter(e->e.getCopy().equals(copy)).findAny().isPresent(); //implement
          
	}
	
	//Query C (for Problem 1C) given a list of all library members, return a list, in
	//reverse sorted order (by first name), of the
	//full names of those library members who have never checked out a book
	public static List<String> nonActiveMembers(List<LibraryMember> list) {
		return list.stream().filter(e->e.getRecord().getCheckoutEntries().size()>0)
				.sorted(Comparator.comparing(LibraryMember::getFirstName).reversed()).map(e->e.getFirstName()+e.getLastName())
				.collect(toList());
	}
	
	
	

}
