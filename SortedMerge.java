import java.lang.Integer;

public class SortedMerge {

    public static void main(String[] args) {
        Integer[] test = sortAB(new Integer[] {1, null}, new Integer[] {2});
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

        while(j != -1) {
            if(B[j] > A[i]) {
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
