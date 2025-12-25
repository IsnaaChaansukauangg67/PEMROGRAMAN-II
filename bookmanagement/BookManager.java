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
import java.util.List;

public class BookManager {

    private Service service;

    // Dependency Injection
    public BookManager(Service service) {
        this.service = service;
    }

    // Method berparameter (sesuai soal)
    public void tambahBuku(String id, String judul, String penulis, int tahun) {
        Book book = new Book(id, judul, penulis, tahun);
        service.addBook(book);
    }

    public List<Book> getDataBuku() {
        return service.getAllBooks();
    }
}
