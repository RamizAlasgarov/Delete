package Cinema.session;

import Cinema.Film.Film;
import Cinema.Guides.TicketFormatGuide;
import Cinema.Guides.TicketStatusGuide;


import java.text.SimpleDateFormat;


import static Cinema.Guides.TicketFormatGuide.PREMIUM;
import static Cinema.Guides.TicketFormatGuide.STANDART;
import static Cinema.Guides.TicketStatusGuide.ACTIVE;

public class Ticket {
    private int id;
    private static Film filmTitle;
    private static SimpleDateFormat dateSession;
    private static String  formatSession; //справочник FormatSessionGuide
    private static double ticketPrice;
    private static String cinemaName = "Berlin Alexa";
    private static int hallNumber;
    private static int row;
    private static int seat;
    private static TicketFormatGuide ticketFormat = STANDART; //справочник TicketFormatGuide
    private TicketStatusGuide ticketStatus = ACTIVE; //справочник ticketStatus


    public Ticket(int id, Film film, SimpleDateFormat dateSession, double ticketPrice, Hall hall, Session session) {
        this.id = id;
//        this.filmTitle = film.getFilmName;
        this.dateSession = dateSession;
        this.formatSession = session.getContentFormat();
        this.hallNumber = hall.getHallNumber();
        this.row = hall.getNumberOfRow();
        this.seat = hall.getNumberOfSeats();

        if (ticketFormat.equals(STANDART)) {
            this.ticketPrice = 300;
        } else if (ticketFormat.equals(PREMIUM)) {
            this.ticketPrice = 500;
        }
    }

    public static double getTicketPrice() {
        return ticketPrice;
    }

    public String toString(int id) {
        return """
               Ticket info:
               Film Name: %s,
               Session date:
               Hall numer: %d,
               Row number: %d,
               Seat number: %d
               """.formatted(filmTitle, formatSession, hallNumber, row, seat);
    }

}
