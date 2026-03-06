package application.domain;

public class employee extends Person {

    private String role;
    private double salary;


    public employee() {
    }

    // Constructor con parámetros
    public employee(int id, String name, String lastName, String email, String password, boolean state,
                    String role, double salary) {
        super(id, name, lastName, email, password, state);
        this.role = role;
        this.salary = salary;
    }

    // Getters y Setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
