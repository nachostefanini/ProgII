public class Seat {
//    int row;
//    int column;
    String name;

    public Seat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Seat(int row, int column) {
//        this.row = row;
//        this.column = column;
//    }
    public boolean full(boolean occupied){
        return occupied;
    }

    public String printName(){
        return name;
    }
}
