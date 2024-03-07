import java.time.LocalDate;
import java.util.ArrayList;

class LibraryMember {
    private Integer id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String phoneNumber;
    private String address;
    private ArrayList<String> borrowedBooks;
    private LocalDate lastVisitDate;
    private Boolean overdueIncident;

    public LibraryMember(Integer id, String lastName, String firstName, String middleName, String phoneNumber, String address,
                         ArrayList<String> borrowedBooks, LocalDate lastVisitDate, Boolean overdueIncident) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.borrowedBooks = borrowedBooks;
        this.lastVisitDate = lastVisitDate;
        this.overdueIncident = overdueIncident;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public LocalDate getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(LocalDate lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public Boolean isOverdueIncident() {
        return overdueIncident;
    }

    public void setOverdueIncident(Boolean overdueIncident) {
        this.overdueIncident = overdueIncident;
    }

    public String toString() {
        return "LibraryMember{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                ", lastVisitDate=" + lastVisitDate +
                ", overdueIncident=" + overdueIncident +
                '}';
    }
}
