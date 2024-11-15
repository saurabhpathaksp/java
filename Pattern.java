public class Pattern {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        for (int i = 1; i < m + 1; i++) {
        for (int j = 1; j < n + 1; j++) {
        if (i + j > n) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }

        

    }
    
}
