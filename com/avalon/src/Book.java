import java.util.Arrays;

public class Book {
    String name_Book;
    String name_author;
    Publisher publisher;
    int year_of_Publication;
    String[] authors_Book;

    public Book() {
    }

    public Book(String name_Book, Publisher publisher, int year_of_Publication) {
        this.name_Book = name_Book;
        this.publisher = publisher;
        this.year_of_Publication = year_of_Publication;

    }

    public Book(String name_Book, Publisher publisher, int year_of_Publication, String[] authors_Book) {
        this.name_Book = name_Book;
        this.publisher = publisher;
        this.year_of_Publication = year_of_Publication;
        this.authors_Book = authors_Book;
    }

    public Book(String name_Book, Publisher publisher, int year_of_Publication, int index_author) {
        this.name_Book = name_Book;
        this.publisher = publisher;
        this.year_of_Publication = year_of_Publication;
        this.name_author = getAuthor_book(index_author);
    }


    public String getName_Book() {
        return name_Book;
    }

    public void setName_Book(String name_Book) {
        if (name_Book.length() > 0) {
            this.name_Book = name_Book;
        } else {
            System.out.println("Имя книги должно содержать один или более символов");
        }


    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {

        if (publisher.city_Publisher != null && !publisher.city_Publisher.trim().isEmpty() && publisher.name_Publisher != null && !publisher.name_Publisher.trim().isEmpty()) {
            this.publisher = publisher;
        } else {
            System.out.println("Не указано название города или имени издательства");
        }
    }

    public int getYear_of_Publication() {
        return year_of_Publication;
    }

    public void setYear_of_Publication(int year_of_Publication) {
        if (year_of_Publication > 0) {
            this.year_of_Publication = year_of_Publication;
        } else {
            System.out.println("Год публикации должен быть больше ноля");
        }

    }

    public int getCount_authors_book() {
        return authors_Book.length;
    }

    public String getAuthor_book(int index) {
        if (index >= 0 && index < authors_Book.length) {
            return authors_Book[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
        }

    }

    public void setAuthors_Book(String[] authors_Book) {
        if (authors_Book.length > 0) {
            for (int i = 0; i < authors_Book.length - 1; i++) {
                if (authors_Book[i] == null || authors_Book[i].trim().isEmpty()) {
                    System.out.println("Имя автора должно быть больше ноля или ссылка указывает на null");
                    throw new IllegalArgumentException("Что-то не пошло не так с массивом авторов");
                }
            }
            this.authors_Book = authors_Book;
        } else {
            System.out.println("Длина массива авторов должна быть больше ноля");
        }

    }


    public String print() {

        return "about_Book{" +
                "name_Book='" + name_Book + '\'' +
                ", publisher=" + publisher +
                ", year_of_Publication=" + year_of_Publication +
                ", authors_Book=" + Arrays.toString(authors_Book) +
                '}';

    }

    public static void printAll(Book[] booksArr) {
        for (int i = 0; i < booksArr.length; i++) {
            System.out.println(booksArr[i].print());
        }
    }

    public void print_and_bagFix(Book [] booksArray){
        Book.printAll(booksArray);
        for (int i = 0; i < booksArray.length; i++) {
            if(booksArray[i].publisher.name_Publisher.equalsIgnoreCase("БХВ"))
            {
                booksArray[i].publisher.city_Publisher = "Санкт-Петербург";
            }
        }
        System.out.println();
        System.out.println("Повторная печать, так как был исправлен город издательства БХВ. Такое поведение предусмотрено тех.заданием заказчика");
        System.out.println();
        Book.printAll(booksArray);
        /*
        Вывод для всех книг издательства БХВ изменился так как мы поправили название города
         */
    }


}
