import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    private static LibraryMember[] members = new LibraryMember[6];

    public static void main(String[] args) {
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("Book1");
        books1.add("Book2");
        ArrayList<String> books4 = new ArrayList<>();
        books4.add("Book4");
        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Book2");

        LibraryMember member1 = new LibraryMember();
        LibraryMember member2 = new LibraryMember(2, "Dyadchenko", "Ivanka", "Ivanivna", "+380987654321", "St. Volitsa 43", books1, LocalDate.of(2024, 2, 27), false);
        LibraryMember member3 = new LibraryMember("Gordienko", "Dmytro", "Dmytrovych");
        LibraryMember member4 = new LibraryMember(member2);
        LibraryMember member5 = new LibraryMember(3, "Belous", "Nina", "Ihorivna", "+380789123456", "St. Mountain 58", books4, LocalDate.of(2021,1,1), false);
        LibraryMember member6 = new LibraryMember(4, "Tymoshchenko", "Ivan", "Ivanovich", "+380123456789", "St. Main 124", books1, LocalDate.of(2022,12,1),true);

        members[0] = member1;
        members[1] = member2;
        members[2] = member3;
        members[3] = member4;
        members[4] = member5;
        members[5] = member6;

        for (int i = 0; i < 6; i++) {
            if (members[i] != null) {
                System.out.println(members[i]);
            }
        }

        filterByBorrowedBooks("Book1");
        filterByOverdueIncidents(true);
        filterByLastVisitDate();
    }

    public static void filterByBorrowedBooks(String bookName) {
        System.out.println("Members who borrowed the book \"" + bookName + "\":");
        for (LibraryMember member : members) {
            if (member != null && member.getBorrowedBooks().contains(bookName)) {
                System.out.println(member);
            }
        }
    }

    public static void filterByLastVisitDate() {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Members who haven't visited for more than a year:");
        int currentYear = currentDate.getYear();
        for (LibraryMember member : members) {
            if (member != null && member.getLastVisitDate() != null) {
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
            if (member != null && member.isOverdueIncident() != null && member.isOverdueIncident() == hasOverdueIncidents) {
                System.out.println(member);
            }
        }
    }
}
