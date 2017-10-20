public class Airplane {
    Seat[][] seats;
    String name;

    public Airplane(Seat[][] seating, String name, int autonomy) {
        this.seats = seating;
        this.name = name;
    }

    public Seat[][] getSeating() {
        return seats;
    }

    public String getName() {
        return name;
    }

}
