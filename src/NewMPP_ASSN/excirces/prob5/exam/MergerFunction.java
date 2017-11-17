package NewMPP_ASSN.excirces.prob5.exam;

@FunctionalInterface
public interface MergerFunction<T extends Comparable<T>,U extends Comparable<U>,R> {
    R function(T a, U b);
}
