package dsapractice.recursion;

public class TilingProblem {
    private static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        //Horizontal ways
        int hWays = tilingProblem(n-2);

        //Vertical Ways
        int vWays = tilingProblem(n-1);

        return hWays + vWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(1));
    }
}
