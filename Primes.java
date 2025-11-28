public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean[] prime = new boolean[n];
        for(int i = 2; i < prime.length; i++){
            prime[i] = true;
        }
        for (int p = 2; p <= Math.sqrt(n); p++ ){
            if(prime[p] == true){
                for(int multiple = p * 2; multiple < prime.length; multiple = multiple + p){
                    prime[multiple] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < prime.length; i++){
            if (prime[i] == true){
                System.out.println(i);
                count++;
            }
                 
        }
        int percentage =  (int) ((count * 100) / n);
        System.out.println("There are " + count +" primes between 2 and " + n + " (" + percentage + "% are primes)");

}
}