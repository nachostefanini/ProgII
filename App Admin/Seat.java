public class Seat {
    int row;
    int column;

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
    }
    public boolean full(boolean occupied){
        return occupied;
    }
}
