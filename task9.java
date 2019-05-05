public class task9 {
    public static void main(String[] args) {
        int N;

        if (N >= 1 && N < 20) {
            System.out.println(N * 2);
        }
        if (N < 100 && N % 20 == 0) {
            System.out.println(30 * N / 20);
        } else if (N >= 41 && N < 100) {
            System.out.println(N % 20 * 2 + 30 * Math.round(N / 20));
        }
        if (N > 100 && N <= 1000 && N % 100 == 0) {
            System.out.println(100 * N / 100);

        } else {
            System.out.println(N % 100 % 20 * 2 +30*Math.round((N-100)/20)+ 100);
        }
    }
}


