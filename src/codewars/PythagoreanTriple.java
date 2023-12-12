package codewars;

public class PythagoreanTriple {

    static int[] p1={3,4,5};
    public int pythagoreanTriple(int[] triple){
        return Math.pow(triple[0],2) + Math.pow(triple[1],2) == Math.pow(triple[2],2)? 1 : 0;
    }

}
