package brian.gradle.dhbw;

public class Supplier {
    private int id;
    private String name;
    private String contact;

    public Supplier(int id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
    public String getInfor(){
        return name + " " + contact;}
}
