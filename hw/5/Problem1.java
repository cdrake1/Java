public class Problem1 {
    public static void main(String[] args) {
        System.out.println(xMethod((double)5));
      }
    
      public static int xMethod(int n) {
        System.out.println("int");
        return n;
      }
    
      public static long xMethod(long n) {
        System.out.println("long");
        return n;
      }
    }