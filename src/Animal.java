public class Animal {
    int id;
    String animalName;
    Object owner;
    double weight;

    public Animal (int givenId, String givenName, Object givenOwner, double givenWeight){
        this.id = givenId;
        this.animalName = givenName;
        this.owner = givenOwner;
        this.weight = givenWeight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                ", owner='" + owner.toString()  + '\'' +
                ", weight=" + weight +
                '}';
    }
}

