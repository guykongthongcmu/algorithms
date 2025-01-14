public class testing {
    public static int main(int x, int n) { 
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(main(3, 6));
    }
}
