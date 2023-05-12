public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = this.title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    DigitalVideoDisc(String title) {
        setTitle(title);
    }

    DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        setCategory(category);
        setCost(cost);
    }

    DigitalVideoDisc(String director, String category, String title, float cost) {
        this(category, title, cost);
        setDirector(director);
    }

    DigitalVideoDisc(String title, String category, String diretor, int length, float cost) {
        this(diretor, category, title, cost);
        setLength(length);
    }
}
