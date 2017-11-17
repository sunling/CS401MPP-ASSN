package NewMPP_ASSN.excirces.prob1.exam;


import lab8.homework.assignment.prob4.TriFunction;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class LambdaLibrary {
    //Query A (for Problem 1A) given a member's checkout record, determine whether some
    //bookcopy in the record is overdue (a bookcopy is overdue if it is not available
    //and its due date is before now.

    public static final Function<CheckoutRecord, Boolean> existence = list -> list.getCheckoutEntries().stream()
            .filter(e -> (!e.getCopy().isAvailable() || e.getDueDate().compareTo(LocalDate.now()) < 0))
            .findAny().isPresent();


    //Query B (for Problem 1B) Given a BookCopy copy and a LibraryMember mem,
    //return true if mem has ever checked out this copy
    //

    public static final BiFunction<LibraryMember, BookCopy, Boolean> memberCheckout = (lm, bk) -> lm.getRecord().getCheckoutEntries().stream()
            .filter(e -> e.getCopy().equals(bk)).findAny().isPresent();


    //Query C (for Problem 1C) given a list of all library members, return a list, in
    //reverse sorted order (by first name), of the
    //full names (first name + <space> + last name) of those library members
    //who have never checked out a book

    public static final Function<List<LibraryMember>, List<String>> listMembers = list -> list.stream().filter(e -> (e.getRecord().getCheckoutEntries().size() == 0))
            .sorted(Comparator.comparing(LibraryMember::getFirstName).reversed())
            .map(e -> e.getFirstName() + " " + e.getLastName()).collect(toList());

}
