public class SeatMap {

    Seat aSeat;
    String[] rowLetter = {"A","B","C","D","E","F","G","H"};

    int row;
    int column;
    Seat[][] map;

    public SeatMap(int row, int column) {
        this.row = row;
        this.column = column;
        map = new Seat[row][column];
        map = fillSeatMap(map);



    }
    public Seat[][] fillSeatMap(Seat[][] matrix) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = new Seat(rowLetter[i] + " " + (j+1));
            }
        }
        return matrix;
    }

public void print() {
    String str = "\t";

    System.out.println("Seat Map");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            str += map[i][j].printName() + "  -" + "\t";
        }
        System.out.println(str);
        str = "\t";
    }
}


    public static void main(String[]args){
        SeatMap a = new SeatMap(3,3);
        a.print();

    }

}
