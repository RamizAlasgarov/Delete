package Cinema.session;

public class SessionExample {

    public static void main(String[] args) {


        Session session = new Session(1, "Astral",
                14.00, 90, "2D",
                "Fantasy", "USA", 5.00,
                "Our Cinema", 99);
        session.displaySessionInfo();
    }

}


