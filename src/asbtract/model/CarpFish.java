package asbtract.model;

public class CarpFish extends BigFish {
    private String language;

    public CarpFish(String language) {
        this.language = language;
    }

    public CarpFish(String id, String name, double price, String language) {
        super(id, name, price);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
