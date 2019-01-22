public class TestDriver {
    public static void main(String[] args) {
        System.out.println(MyMath.findSmallest(2,3,4));
        //Expected 2

        System.out.println(MyMath.findSmallest(12,3,4));
        //Expected: 3

        System.out.println(MyMath.findSmallest(12,13,4));
        //Expected: 4

        System.out.println(MyMath.findSmallest(2,2,4));
        //Expected: 2

        System.out.println("-----");

        System.out.println(MyMath.myPow(2,4));
        //Expected: 16

        System.out.println(MyMath.myPow(3,2));
        //Expected: 9

        System.out.println(MyMath.myPow(2,1));
        //Expected: 2

        System.out.println(MyMath.myPow(2,0));
        //Expected: 1

        System.out.println("-----");

        System.out.println(MyMath.sum(4));
        //Expected: 10

        System.out.println(MyMath.sum(1));
        //Expected: 1

        System.out.println("-----");

        System.out.println(MyMath.factorial(10));
        //Expected: 3,628,800

        System.out.println(MyMath.factorial(0));

        System.out.println("-----");

        System.out.println(MyMath.isPrime(13));
        //Expected: true

        System.out.println(MyMath.isPrime(4));
        //Expected: false;
    }
}
