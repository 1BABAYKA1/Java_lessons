package test.domain.domain.domain;

public class Parcel {
    private int id;
    private int weight;
    private Destination destination;
    public class Destination {
        public String street;
        private int homeNumber;
        private int roomNumber;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println(destination.roomNumber);
    }
}


