public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        
        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    prime[multiple] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.println(i);
                count++;
            }
        }

        int percentage = (int)((count * 100.0) / n);
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + percentage + "% are primes)");
    }
}
