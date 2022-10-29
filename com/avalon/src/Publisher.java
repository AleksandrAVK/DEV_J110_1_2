public class Publisher {
    String name_Publisher;

    @Override
    public String toString() {
        return "Publisher{" +
                "name_Publisher='" + name_Publisher + '\'' +
                ", city_Publisher='" + city_Publisher + '\'' +
                '}';
    }

    String city_Publisher;

    public Publisher(String name_Publisher, String city_Publisher) {
        this.name_Publisher = name_Publisher;
        this.city_Publisher = city_Publisher;
    }
}
