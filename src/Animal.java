public class Animal{
    public int id;
    public String animalName;
    public Object owner;
    public double weight;

    public Animal(int givenId, String givenName, Object givenOwner, double givenWeight){
        this.id = givenId;
        this.animalName = givenName;
        this.owner = givenOwner;
        this.weight = givenWeight;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getId() {
        return id;
    }

    public Object getOwner() {
        return owner;
    }

    public double getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setOwner(Object owner) {
        this.owner = owner;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //@Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                ", owner='" + owner.toString()  + '\'' +
                ", weight=" + weight +
                '}';
    }
}

