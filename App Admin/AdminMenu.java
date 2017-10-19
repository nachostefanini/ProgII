import java.util.List;

public class AdminMenu {
    public static void main(String[] args) {
        while (true) {
            System.out.println("+--------------------------------------------+");
            System.out.println("              Australis Airlines              ");
            System.out.println("                  Admin app                   ");
            System.out.println("+--------------------------------------------+");
            System.out.println();
            System.out.println("Operation: ");
            System.out.println("1. Add Pilot: ");
            System.out.println("2. Quit Pilot: ");
            System.out.println("3. Add Airplane: ");
            System.out.println("4. Quit Airplane: ");
            System.out.println("5. Add Airport: ");
            System.out.println("6. Quit Airport: ");
            System.out.println("7. Add Flight");
            System.out.println("8. Quit Flight");
            System.out.println("9. View Flight: ");
            System.out.println("10. Exit: ");
            System.out.println();
            int opc = Scanner.getInt("What operation do you want to do: ");
            System.out.println("+--------------------------------------------+");
            System.out.println("              Australis Airlines              ");
            System.out.println("                  Admin app                   ");
            System.out.println("+--------------------------------------------+");

            System.out.println("\t");

            switch (opc) {
                case 1:
                    System.out.flush();
                    String name = Scanner.getString("Enter the name of the pilot: ");
                    String surname = Scanner.getString("Enter the surname of the pilot: ");
                    int dni = Scanner.getInt("Enter the DNI of the pilot");
                    int salary = 0;
                    Pilot newPilot = new Pilot(name, surname, dni, salary);
                    List<Pilot> pilots = null;
                    pilots.add(newPilot);
                    System.out.println();
                    break;
                case 2:
                    System.out.flush();
                    System.out.println();
                    break;
                case 3:
                    System.out.flush();
                    String code = Scanner.getString("Please enter the name of the airplane: ");
                    int rows = Scanner.getInt("Please enter the number of rows of seats: ");
                    int columns = Scanner.getInt("Please enter the number of columns of seats: ");
                    int autonomy = Scanner.getInt("Please enter the autonomy of the airplane: ");
                    Seat[][] seats = new Seat[rows][columns];
                    Airplane airplane = new Airplane(seats, code, autonomy);
                    List<Airplane> airplanes = null;
                    System.out.println("Thank for add a new Airplane.");
                    break;
                case 4:
                    System.out.flush();
                    System.out.println();
                    break;
                case 5:
                    System.out.flush();
                    String codeOfAirport = Scanner.getString("Please enter a code of the Airport");
                    Airport newAirport = new Airport(codeOfAirport);
                    List<Airport> airports = null;
                    airports.add(newAirport);
                    System.out.println();
                    break;
                case 6:
                    System.out.flush();
                    System.out.println();
                    break;
                case 7:
                    System.out.flush();
                    String codeOfAirportFrom = Scanner.getString("Enter the code of the airport From ");
                    String codeOfAirportTo = Scanner.getString("Enter the code of the airport To ");
                    if (codeOfAirportFrom.equals(codeOfAirportTo)){
                        System.out.println("The departure airport can not be the same as the arrival airport");
                    }else {
//                    for (Airport airport : airports) {
//                        if(airports.size(airport).getCodeOfAirport.equals(codeOfAirportFrom)){
//
//                            }
//                        }
                    }

                    break;
                case 8:
                    System.out.flush();
                    System.out.println();
                    System.exit(0);
                    break;
                default:
                    System.out.flush();
                    System.out.println("Please, insert a correct character: ");
                    break;
            }
        }
    }
}
