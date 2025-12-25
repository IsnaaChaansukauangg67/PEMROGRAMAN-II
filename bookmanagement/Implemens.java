/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagement;

/**
 *
 * @author x260
 */
import java.util.ArrayList;
import java.util.List;

public class Implemens implements Service {

// ===== SINGLETON INSTANCE =====
    private static Implemens instance;

    public static Implemens getInstance() {
        if (instance == null) {
            instance = new Implemens();
        }
        return instance;
    }

    // ===== LOGIN DATA =====
    private final String ADMIN_USERNAME = "admin";
    private final String ADMIN_PASSWORD = "12345";

    // ===== BOOK STORAGE (DATA TIDAK HILANG) =====
    private final List<Book> bookList = new ArrayList<>();

    // ===== CONSTRUCTOR PRIVATE =====
    private Implemens() {
    }

    @Override
    public boolean login(User user) {
        return user.getUsername().equals(ADMIN_USERNAME)
                && user.getPassword().equals(ADMIN_PASSWORD);
    }

    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }
}
