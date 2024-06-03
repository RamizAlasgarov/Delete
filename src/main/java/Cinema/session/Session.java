package Cinema.session;

/**
 * Создать класс `Session`, представляющий сеанс, который содержит фильм, время и количество доступных билетов.

 */
public class Session {

    private int sessionID;
    private String movieTitle;
    private double sessionStartTime;
    private double sessionDuration;
    private String contentFormat; //тяни данные из справочника TicketFormatGuide
    private String movieGenre;
    private String country;
    private double ticketPrice;
    private String cinemaName; //зачем хз
    private int ticketsAvailable;

    public Session(int sessionID, String movieTitle, double sessionEvent, double sessionDuration, String contentFormat,
                   String movieGenre, String country, double ticketPrice, String cinemaName, int ticketsAvailable) {
        this.sessionID = sessionID;
        this.movieTitle = movieTitle;
        this.sessionStartTime = sessionEvent;
        this.sessionDuration = sessionDuration;
        this.contentFormat = contentFormat; //тяни данные из справочника TicketFormatGuide
        this.movieGenre = movieGenre;
        this.country = country;
        this.ticketPrice = ticketPrice;
        this.cinemaName = cinemaName;
        this.ticketsAvailable = ticketsAvailable;
    }

    public int getSessionID() {
        return sessionID;
    }

    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getSessionStartTime() {
        return sessionStartTime;
    }

    public void setSessionStartTime(double sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
    }

    public double getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(double sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public String getContentFormat() {
        return contentFormat;
    }

    public void setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

    @Override
    public String toString() {
        return "Session{" +
                "sessionID=" + sessionID +
                ", movieTitle='" + movieTitle + '\'' +
                ", sessionStartTime=" + sessionStartTime +
                ", sessionDuration=" + sessionDuration +
                ", contentFormat='" + contentFormat + '\'' +
                ", movieGenre='" + movieGenre + '\'' +
                ", country='" + country + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", cinemaName='" + cinemaName + '\'' +
                ", ticketsAvailable=" + ticketsAvailable +
                '}';
    }

    public void displaySessionInfo() {
        System.out.println("Session ID: " + sessionID);
        System.out.println("Movie :" + movieTitle);
        System.out.println("Movie starts at: " + sessionStartTime);
        System.out.println("Movie duration :" + sessionDuration);
        System.out.println("Format: " + contentFormat);
        System.out.println("Genre: " + movieGenre);
        System.out.println("Country: " + country);
        System.out.println("Ticket price: " + ticketPrice);
        System.out.println("Cinema name: " + cinemaName);
        System.out.println("Tickets available: " + ticketsAvailable);
    }


    //    private AbstractFilm film;
//    private LocalDateTime localDateTime;
//    private int tichet;



//    public AbstractFilm getFilm() {
//        return film;
//    }
//
//    public LocalDateTime getLocalDateTime() {
//        return localDateTime;
//    }
//
//    public int getTichet() {
//        return tichet;
//    }
}
