// Adapter - adapts LibrarySystem to the SchoolManagementApp interface
public class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public void integrateSystem() {
        // Translate the call to the adaptee's method
        librarySystem.manageBooks();
    }
}