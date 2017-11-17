package NewMPP_ASSN.excirces.prob2.exam.partC;

@FunctionalInterface
public interface MyBiFunction<T,U,R> {
    R accept(T a, U b);
}
