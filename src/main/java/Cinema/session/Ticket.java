package Cinema.session;

import Cinema.uses.User;

/**
 *  *    - Создать класс `Ticket`, представляющий билет, который содержит информацию о пользователе, сеансе и месте.
 */

public class Ticket {
    private User uSer;
    private Session session;

    private String place;

    public Ticket(User uSer, Session session, String place) {
        this.uSer = uSer;
        this.session = session;
        this.place = place;
    }

    public User getuSer() {
        return uSer;
    }

    public void setuSer(User uSer) {
        this.uSer = uSer;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "uSer=" + uSer +
                ", session=" + session +
                ", place='" + place + '\'' +
                '}';
    }
}
