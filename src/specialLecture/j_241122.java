package src.specialLecture;

public class j_241122 {
    public static void main(String[] args) {
        char[][] bar = new char[4][];

        bar[0] = new char[5];
        bar[1] = new char[3];
        bar[2] = new char[1];
        bar[3] = new char[4];

        bar[0][0] = 'h';
        bar[0][1] = 'e';
        bar[0][2] = 'l';
        bar[0][3] = 'l';
        bar[0][4] = 'o';

        bar[1][0] = 'H';
        bar[1][1] = 'o';
        bar[1][2] = 'w';

        bar[2][0] = 'a';

        bar[3][0] = 't';
        bar[3][1] = 'o';
        bar[3][2] = 'p';
        bar[3][3] = 's';

        for (int i = 0; i < bar.length; i++) {
            for (int j = 0; j < bar[i].length; j++) {
                System.out.print(bar[i][j] + " ");
            }
            System.out.println();
        }System.out.println();

        for (char[] item : bar) {
            System.out.println(item);
        }

        short[][][] foo = new short[2][][];
        foo[0] = new short[3][];
        foo[1] = new short[1][];

//        bar[0][0] = new short[5];
    }
}
