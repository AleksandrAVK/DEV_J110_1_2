public class Main {
    public static void main(String[] args) {
        Publisher publisher_prospekt = new Publisher("Проспект","Москва");
        Publisher publisher_bhv = new Publisher("БХВ","СПБ");
        Publisher publisher_piter = new Publisher("Питер","Санкт-Петербург");
        Publisher publisher_dialektika = new Publisher("Диалектика","Киев");

        Book [] booksArray = {new Book("Computer Science: основы программирования на Java,ООП, алгоритмы и структуры данных",
                publisher_piter,2018, new String[]{"Седжвик Роберт", "Уэйн Кевин"}) ,new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное",
                publisher_bhv,2019, new String[]{"Вигерс Карл"}),new Book("Java. Полное руководство, 10-е издание",
                publisher_dialektika,2018, new String[]{"Шилдт Герберт"}),new Book("C/C++. Процедурное программирование",
                publisher_bhv,2017, new String[]{"Полубенцева М.И."}),new Book("Конституция РФ",
                publisher_prospekt,2020)};
        Book book = new Book();
        book.print_and_bagFix(booksArray);
    }
}