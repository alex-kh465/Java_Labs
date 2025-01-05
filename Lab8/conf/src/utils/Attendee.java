package utils;

public class Attendee {
    private int id;
    private String fullName;
    private String email;
    private String contactNumber;
    private String country;

    // Constructors, Getters, and Setters
    public Attendee(String fullName, String email, String contactNumber, String country) {
        this.fullName = fullName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.country = country;
    }

    // Add getters and setters for all fields
}
