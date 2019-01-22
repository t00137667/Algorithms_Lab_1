public class MyMath {
    public static int findSmallest(int x, int y, int z){
        int smallest = x;
        if (y < smallest){
            smallest = y;
        }
        if (z < smallest){
            smallest = z;
        }
        return smallest;
    }
    public static double myPow(double a, int b){
        double result = 1;
        for (int i = 0; i < b; i++){
            result = result*a;
            //System.out.println(result);
        }
        return result;
    }
    public static int sum(int x){

        int sum = x;
        for(int i = 1; i < x; i++){
            sum += i;
        }
        return sum;
    }
    public static long factorial(int n){
        long expo = 1;
        for (int i = 1; i <= n; i++){
            expo = expo * i;
        }
        return expo;
    }
    public static boolean isPrime(int n){
        double nDouble = n;
        double nRoot = Math.sqrt(nDouble);
        boolean factorFound = false;
        int i = 2;
        while (!factorFound && i <= nRoot)
        {
           if (n%i == 0){
               factorFound = true;
           }
           i++;
        }
        return !factorFound;
    }
}
