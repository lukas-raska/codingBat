package recursion1.triangle;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

//        System.out.println(triangle(0));
//        System.out.println(triangle(1));
//        System.out.println(triangle(2));

        IntStream.rangeClosed(0,10).map(Main::triangle).forEach(System.out::println);
    }

    //    We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row
    //    has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in
    //    such  a triangle with the given number of rows.
    //
    //    triangle(0) → 0
    //    triangle(1) → 1
    //    triangle(2) → 3
    private static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }

        return rows + triangle(rows - 1);
    }
}
