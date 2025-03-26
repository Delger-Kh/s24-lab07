package frogger;

public class PlayerProfile {
    private String firstName, lastName, phoneNumber, zipCode, state, gender;
    public PlayerProfile(String firstName, String lastName, String phoneNumber, String zipCode, String state, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
        this.gender = gender;
    }
}