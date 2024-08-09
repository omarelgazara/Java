package omar.java.model.models;

public class Chat extends BaseEntity{
    private String name;
    private Massage massage;

    public Massage getMassage() {
        return massage;
    }

    public void setMassage(Massage massage) {
        this.massage = massage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
