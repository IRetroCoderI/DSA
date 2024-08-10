public class Fib {

    public static void fibbonaci_forLoop(int n){
        int prev1 = 0;
        int prev2 = 1;
        
        if (n <= 0) {
            System.out.println("Error");
        } else if (n == 1){
            System.out.print(prev1);
        } else if (n==2){
            System.out.print(prev1 + ", " + prev2);
        } else {
            System.out.print(prev1 + ", ");
            System.out.print(prev2 + ", ");
            n-=2;
            for (int i = 0; i<n; i++) {
                int next = prev1 + prev2;
                prev1 = prev2;
                prev2 = next;
                System.out.print(next);
                if (i < n - 1){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void fibbonaci_rec(int n){
        if (n <= 0) {
            System.out.println("error");
        } else {
            for (int i = 0; i<n; i++){
                System.out.print(handler(i));
                
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static int handler(int n){
        if (n==0) {
            return 0;
        } else if (n==1) {return 1;}
          else {
            return handler(n-1) + handler(n-2);
          }
    }

    public static int fibbonaci_num(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibbonaci_num(n-1) + fibbonaci_num(n-2);
        }
    }


}
