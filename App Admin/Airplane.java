public class Airplane {
    Seat[][] seating;
    String name;

    public Airplane(Seat[][] seating, String name, int autonomy) {
        this.seating = seating;
        this.name = name;
    }

    public Seat[][] getSeating() {
        return seating;
    }

    public String getName() {
        return name;
    }

}
