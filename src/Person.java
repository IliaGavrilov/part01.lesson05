public class Person{
    String ownerName;
    int age;
    String sex;


    public Person(String givenOwnerName, int givenOwnerAge, String givenSex){
        this.ownerName = givenOwnerName;
        this.age = givenOwnerAge;
        this.sex = givenSex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ownerName='" + ownerName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
