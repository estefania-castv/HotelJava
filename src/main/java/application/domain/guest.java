package application.domain;

public class guest extends Person {

    private String origin;
    private String guestType;


    public guest() {
    }

    // Constructor con parámetros
    public guest(int id, String name, String lastName, String email, String password, boolean state,
                 String origin, String guestType) {
        super(id, name, lastName, email, password, state);
        this.origin = origin;
        this.guestType = guestType;
    }

    // Getters y Setters
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }
}
