package LocalRepo;

public class VariableArgs {
    static int add(int n, int... x) {
        int sum = 0;
        for (int value : x) {
            sum += value;
        }
        return sum;
    }

    public static void main(String args[]) {
        int a = 10, b = 2, c = 8, d = 9;
        System.out.println(add(4, a, b, c, d));
    }
}
