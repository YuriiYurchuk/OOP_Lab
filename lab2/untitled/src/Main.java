import java.util.ArrayList;
import java.util.Date;

class LibraryMember {
    private String id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String phoneNumber;
    private String address;
    private ArrayList<String> borrowedBooks;
    private Date lastVisitDate;
    private boolean overdueIncident;

    public LibraryMember(String id, String lastName, String firstName, String middleName, String phoneNumber, String address,
                         ArrayList<String> borrowedBooks, Date lastVisitDate, boolean overdueIncident) {
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

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Date getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public boolean isOverdueIncident() {
        return overdueIncident;
    }

    public void setOverdueIncident(boolean overdueIncident) {
        this.overdueIncident = overdueIncident;
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
                ", borrowedBooks=" + borrowedBooks +
                ", lastVisitDate=" + lastVisitDate +
                ", overdueIncident=" + overdueIncident +
                '}';
    }
}

public class Main {
    private static LibraryMember[] members = new LibraryMember[5];

    public static void main(String[] args) {
        // Test data
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("Book1");
        books1.add("Book2");
        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Book3");
        ArrayList<String> books3 = new ArrayList<>();
        books3.add("Book4");
        books3.add("Book5");
        ArrayList<String> books4 = new ArrayList<>();
        books4.add("Book6");
        Date currentDate = new Date();

        // Creating objects
        members[0] = new LibraryMember("1", "Tymoshchenko", "Ivan", "Ivanovich", "+380123456789", "St. Main 124", books1, currentDate, true);
        members[1] = new LibraryMember("2", "Dyadchenko", "Ivanka", "Ivanivna", "+380987654321", "St. Volitsa 43", books2, currentDate, false);
        members[2] = new LibraryMember("3", "Gordienko", "Dmytro", "Dmytrovych", "+380456789123", "St. Independence 10", books3, currentDate, false);
        members[3] = new LibraryMember("4", "Belous", "Nina", "Ihorivna", "+380789123456", "St. Mountain 58", books4, currentDate, false);
        members[4] = new LibraryMember("5", "Popov", "Mykhailo", "Mykhailovych", "+380321654987", "St. Lisova 12", new ArrayList<>(), currentDate, true);

        // Output test data
        for (LibraryMember member : members) {
            System.out.println(member);
        }

        // Example of using filtering methods
        filterByBorrowedBooks("Book1");
        filterByLastVisitDate(currentDate);
        filterByOverdueIncidents(true);
    }

    public static void filterByBorrowedBooks(String bookName) {
        System.out.println("Members who borrowed the book \"" + bookName + "\":");
        for (LibraryMember member : members) {
            if (member.getBorrowedBooks().contains(bookName)) {
                System.out.println(member);
            }
        }
    }

    public static void filterByLastVisitDate(Date date) {
        System.out.println("Members who haven't visited since " + date + ":");
        for (LibraryMember member : members) {
            if (member.getLastVisitDate().compareTo(date) < 0) {
                System.out.println(member);
            }
        }
    }


    public static void filterByOverdueIncidents(boolean hasOverdueIncidents) {
        String status = hasOverdueIncidents ? "have" : "don't have";
        System.out.println("Members who " + status + " overdue incidents:");
        for (LibraryMember member : members) {
            if (member.isOverdueIncident() == hasOverdueIncidents) {
                System.out.println(member);
            }
        }
    }
}
