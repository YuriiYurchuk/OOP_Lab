import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryMember extends Person {
    private static int counter = 0;
    private Integer id;
    private ArrayList<String> borrowedBooks;
    private LocalDate lastVisitDate;
    private Boolean overdueIncident;
    private String gender;
    private String email;

    public LibraryMember() {
        super("", "", "", "", "", ""); // Викликаємо конструктор Person з порожніми рядками
        this.id = ++counter;
        this.borrowedBooks = new ArrayList<>();
        this.lastVisitDate = LocalDate.now();
        this.overdueIncident = false;
        this.gender = "";
        this.email = "";
    }

    public LibraryMember(Integer id, String lastName, String firstName, String middleName, String phoneNumber, String address,
                         ArrayList<String> borrowedBooks, LocalDate lastVisitDate, Boolean overdueIncident, String gender, String email) {
        super(lastName, firstName, middleName, phoneNumber, address, email);
        this.id = id;
        this.borrowedBooks = borrowedBooks;
        this.lastVisitDate = lastVisitDate;
        this.overdueIncident = overdueIncident;
        this.gender = gender;
        this.email = email;
    }

    public LibraryMember(Integer id, String lastName, String firstName, String middleName, String phoneNumber, String address) {
        this(id, lastName, firstName, middleName, phoneNumber, address, new ArrayList<>(), LocalDate.now(), false, "", "");
    }

    public LibraryMember(String lastName, String firstName, String middleName) {
        this(null, lastName, firstName, middleName, "", "", new ArrayList<>(), LocalDate.now(), false, "", "");
    }

    public LibraryMember(LibraryMember member) {
        this(member.id, member.lastName, member.firstName, member.middleName, member.phoneNumber, member.address,
                new ArrayList<>(member.borrowedBooks), member.lastVisitDate, member.overdueIncident, member.gender, member.email);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LibraryMember{" +
                "id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                ", lastVisitDate=" + lastVisitDate +
                ", overdueIncident=" + overdueIncident +
                '}';
    }
}