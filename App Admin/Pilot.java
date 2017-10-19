public class Pilot {
    String name;
    String surname;
    int dni;
    int salary;

    public Pilot(String name, String surname, int dni, int salary) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDni() {
        return dni;
    }

    public int getSalary() {
        return salary;
    }
}
