
public class index {
    public static void main(String[] args) {

      for (int j = 1; j<=5; j++) {
       System.out.print("* ");
     }
     System.out.println();
     for (int j = 1; j<=2; j++) {
        System.out.println("*");
      }
      for (int j = 1; j<=5; j++) {
        System.out.print("* ");
      }
      for (int j = 1; j<=5-j; j++) {
        System.out.print("");
      }
      for (int j = 1; j<=1; j++) {
        System.out.print("*");
      }

      for (int j = 1; j<=5-j; j++) {
        System.out.println("");
      }
      for (int j = 1; j<=1; j++) {
        System.out.print("*");
      }
        

    }
}
