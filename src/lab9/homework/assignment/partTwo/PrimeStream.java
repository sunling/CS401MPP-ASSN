package lab9.homework.assignment.partTwo;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeStream {


    Stream<BigInteger> primes() {
        return Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE))
                .filter(e -> isPrime(e));
    }

    static boolean isPrime(BigInteger a) {
        for (int i = 2; i < a.longValue(); i++) {
            if (a.longValue() % i == 0) return false;
        }
        return true;
    }

    void nPrimes(int n){
        primes().limit(n).forEach(System.out::println);
    }

    void numSquare(int n){
        IntStream intStream = IntStream.iterate(0,e->e+1).map(e->e*e).limit(n);
        intStream.forEach(System.out::println);
    }

    Stream<String> streamSection(Stream<String> stream, int m, int n){
        return  stream.skip(m).limit(n);
    }

//    public Set<String> union(List<Set<String>> sets){
//        //Set<String> setsOfString = sets.stream().reduce(s->s).
//    }



}
