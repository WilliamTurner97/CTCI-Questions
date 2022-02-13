import java.lang.Integer;

public class SortedMerge {

    public static void main(String[] args) {
        Integer[] test = sortAB(new Integer[] {Integer.valueOf(1), null}, new Integer[] {Integer.valueOf(2)});
        for(Integer x : test) {
            System.out.println(x.toString());
        }
    }

    public static Integer[] sortAB(Integer[] A, Integer[] B){
        int k = A.length-1;
        int i = A.length-1;
        int j = B.length-1;

        while(A[i] == null) {
            i--;
        }

        while(i != -1 && j != -1) {
            if(i == -1 || B[j].intValue() > A[i].intValue()) {
                A[k] = B[j];
                j--;
            }
            else {
                A[k] = A[i];
                i--;
            }
            k--;
        }
        return A;
    }
}
