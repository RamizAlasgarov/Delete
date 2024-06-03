package Cinema.session;

public class Hall {
    private int id;
    private int hallNumber;
    private int numberOfSeats;
    private int numberOfRow;

    public Hall(int id, int hallNumber, int numberOfSeats, int numberOfRow) {
        this.id = id;
        this.hallNumber = hallNumber;
        this.numberOfSeats = numberOfSeats;
        this.numberOfRow = numberOfRow;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }
}
