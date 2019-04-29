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

//    @Override
//    public String toString() {
//        return animalName;
//    }

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

