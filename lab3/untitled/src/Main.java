import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    private static LibraryMember[] members = new LibraryMember[5];

    public static void main(String[] args) {
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
        members[0] = new LibraryMember(1, "Tymoshchenko", "Ivan", "Ivanovich", "+380123456789", "St. Main 124", books1, LocalDate.of(2022,12,1),true);
        members[1] = new LibraryMember(2, "Dyadchenko", "Ivanka", "Ivanivna", "+380987654321", "St. Volitsa 43", books2, LocalDate.of(2024,2,27), false);
        members[2] = new LibraryMember(3, "Gordienko", "Dmytro", "Dmytrovych", "+380456789123", "St. Independence 10", books3, LocalDate.of(2024,1,24), false);
        members[3] = new LibraryMember(4, "Belous", "Nina", "Ihorivna", "+380789123456", "St. Mountain 58", books4, LocalDate.of(2021,1,1), false);
        members[4] = new LibraryMember(5, "Popov", "Mykhailo", "Mykhailovych", "+380321654987", "St. Lisova 12", new ArrayList<>(), LocalDate.of(2024,2,12), true);
        for (LibraryMember member : members) {
            System.out.println(member);
        }
        filterByBorrowedBooks("Book1");
        filterByOverdueIncidents(true);
        filterByLastVisitDate();
    }

    public static void filterByBorrowedBooks(String bookName) {
        System.out.println("Members who borrowed the book \"" + bookName + "\":");
        for (LibraryMember member : members) {
            if (member.getBorrowedBooks().contains(bookName)) {
                System.out.println(member);
            }
        }
    }

    public static void filterByLastVisitDate() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Members who haven't visited for more than a year:");
        int currentYear = currentDate.getYear();
        for (LibraryMember member : members) {
            if (member != null) {
                int lastVisitYear = member.getLastVisitDate().getYear();
                if (currentYear - lastVisitYear > 1) {
                    System.out.println(member);
                }
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