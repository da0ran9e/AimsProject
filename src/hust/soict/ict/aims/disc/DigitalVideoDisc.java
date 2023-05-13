package hust.soict.ict.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    public int getId() {
		return id;
	}
	public void setId() {
		this.id = ++nbDigitalVideoDiscs;
	}
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
        this.title = title;
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
    public DigitalVideoDisc(String title) {
        setTitle(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        setCategory(category);
        setCost(cost);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this(title, category, cost);
        setDirector(director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(director, category, title, cost);
        setLength(length);
    }
    public String toString(){
        return this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+" - "+this.getLength()+": "+this.getCost()+" $";
    }
    public boolean isMatch(String title) {
        if (this.title.toLowerCase().contains(title.toLowerCase())) {
            return true;
        }
		return false;
	}
}
