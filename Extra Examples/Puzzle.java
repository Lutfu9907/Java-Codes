import WordPosition.WordPosition;

import static javax.swing.text.html.HTML.Attribute.N;

public class Puzzle<row, column> {

    private int grid;
    public int word_list;
    private Object column;
    private Object row;

    public <word_list> void Table(word_list) {

        this.word_list = word_list;
        this.grid = grid;

    }

    public Puzzle(Puzzle P, Object column) {
        this.column = column;
        System.out.println("copy constructor called");

        this.grid = grid;
        this.word_list = P.word_list;
    }

    public String toString() {

        String st = "letter";
        Object row;
        Object column;
        return st;
    }

    public static boolean main(String[] args) {
        String PuzzleSolution;
        ( int grid[][];
        int word_list, int row, int col;){
            if (row == N - 1 && col == N)
                return true;
        }
        if (N == col) {
            row++;
            col = 0;
        }

        if (grid[row][col] > 0)
            return PuzzleSolution(grid, word_list, row, col + 1);

        for (int letter = 1; letter <= N; letter++) {

        }

        boolean findsolution;
        if (findsolution(grid, row, col, word_list)) {
            char letter = 29;
            grid[row][col] = letter;
        }

        if (findsolution(grid, row, col + 1, word_list))
            return true;
    }

    private static boolean PuzzleSolution(int[][] grid, int word_list, int row, int i) {
        return true;
    }

    private static boolean findsolution(int[][] grid, int row, int col, int word_list) {
        return false;
    }

    enum Direction {

    }

    Object right;
    Object left;
    Object to;
    Object bottom;
    Object top;
    Object bottomright;
    Object topleft;
    Object topright;
    Object bottomleft;
    public class enum

    {
        left -to - right, right - to - left, bottom - to - top, top - to - bottom, topleft - to - bottomright, bottomright - to - topleft, topright - bottomleft, bottomleft - to - topright;
    }

    public void WordPosition; {

        this.right=right;
        this.left=left;
        this.topleft=topleft;
        this.topright=topright;
        this.bottomright=bottomright;
        this.bottomleft=bottomleft;

    }

   public void WordPosition(WordPosition L){

       System.out.println("copy constructor is called");

            this.right=right;
            this.left=left;
            this.topleft=topleft;
            this.topright=topright;
            this.bottomleft=bottomleft;
            this.bottomright=bottomright;


   }



    public String toString; {
        String st = "";

        String s = st;
        return st;
    }

    public boolean intersects(String intersecting_of_words){

        if () {
            intersects("intersecting of words");
            return true;


        } else {
            intersects("the word does not intersect");

            return false;
        }


    }

    public static void main(String[][] args) {

    }

    public static void Array(int, [20][20]){
    }
    private void printSolution() {
    }
}
