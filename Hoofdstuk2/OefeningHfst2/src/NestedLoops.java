public class NestedLoops {
    public static void main(String[] args) {
        NestedLoops run = new NestedLoops();
        run.run();
    }
    public void run(){
      //nestedLoop1();
      //nestedLoop2();
      //nestedLoop3();
        mario();
    }
    public void nestedLoop1(){
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <=5; j++) {
                System.out.print('@');
            }
            System.out.println();
        }
    }
    public void nestedLoop2(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=3;j++){
                for(int k=1;k<=4;k++){
                    System.out.print('*');
                }
                System.out.println();
            }System.out.println();
        }
        /**
         * ****
         * ****
         * ****
         */

    }
    public void nestedLoop3(){
        for(int i=1; i<=5; i++) {
            for (int j = 1; j<=i; j++)
                System.out.printf("%d.%d ", i, j);
            System.out.println();
        }
    }
    public void mario(){
        //a
       for (int i = 1; i <= 3; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print('*');
           }
           System.out.println();
       }
        System.out.println();
       //c
       for (int i = 1; i <= 3; i++) {
           for (int j = 3; j >= i; j--) {
               System.out.print('*');
           }
           System.out.println();
       }
        System.out.println();
         //d

        //***
        // **
        //  *
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(' ');
            }
            for (int j = 3; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        // *
        // **
        //***
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j >= i+1; j--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
