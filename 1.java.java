// Client - uses the unified interface to integrate all school systems
public class SchoolManagementDemo {
    public static void main(String[] args) {
        // Create the adaptee objects
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        // Wrap each adaptee in its corresponding adapter
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        // Use the unified interface to integrate all systems seamlessly
        System.out.println("=== Integrating School Systems ===\n");

        System.out.print("[Attendance] ");
        attendanceAdapter.integrateSystem();

        System.out.print("[Grading]    ");
        gradingAdapter.integrateSystem();

        System.out.print("[Library]    ");
        libraryAdapter.integrateSystem();

        System.out.println("\n=== All systems integrated successfully ===");
    }
}