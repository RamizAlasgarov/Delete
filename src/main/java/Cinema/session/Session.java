package Cinema.session;

import Cinema.Film.AbstractFilm;

import java.time.LocalDateTime;

/**
 * Создать класс `Session`, представляющий сеанс, который содержит фильм, время и количество доступных билетов.

 */
public class Session {
    private AbstractFilm film;
    private LocalDateTime localDateTime;
    private int tichet;

    public Session(AbstractFilm film, LocalDateTime localDateTime, int tichet) {
        this.film = film;
        this.localDateTime = localDateTime;
        this.tichet = tichet;
    }

    public AbstractFilm getFilm() {
        return film;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public int getTichet() {
        return tichet;
    }
}
