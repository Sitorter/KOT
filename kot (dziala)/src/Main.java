
class Kot{
    private String name;
    private String data;
    private double weight;
    private String ownerName;
    public Kot(String name, String data, double weight, String ownerName) {
        this.name = name;
        this.data = data;
        this.weight = weight;
        this.ownerName = ownerName;

    }
    public String getName() {
        return name;
    }
    public String getData() {
        return data;
    }
    public double getWeight() {
        return weight;
    }
    public String getOwnerName() {
        return ownerName;
    }

}

public class Main {
    public static void main(String[] args) {

        Kot k = new Kot("maslo", "16.09.2000", 10.0, "Adam");
        System.out.println(k.getName() + " " + k.getData() + " " + k.getWeight() + " " + k.getOwnerName());

    }
}