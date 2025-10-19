package www;

public class github {
        public static void main(String[] args) {
            printMultiplicationTable();
        }

        /**
         * 打印99乘法表
         */
        public static void printMultiplicationTable() {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + "×" + i + "=" + (i * j) + "\t");
                }
                System.out.println();
            }
        }
    }



