public class SeatMap {

    Seat aSeat;
    String[] rowLetter = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T"};

    int row;
    int column;
    Seat[][] map;

    public SeatMap(int row, int column) {
        if (row<20){
            this.row = row;
        }else {
           throw new RuntimeException("Too big");
        }

        if (column<20){
            this.column = column;
        }else {
            throw new RuntimeException("Too big");
        }

        map = new Seat[row][column];
        map = fillSeatMap(map);

    }

    public Seat[][] getMap() {
        return map;
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


//    public static void main(String[]args){
//        SeatMap a = new SeatMap(19,19);
//        a.print();
//
//    }

}
