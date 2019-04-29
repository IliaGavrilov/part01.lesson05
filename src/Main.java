public class Main {

    public static void main(String[] args) {
        Person John = new Person("John", 39, "MAN");
        Animal Cat = new Animal(0, "Murzik", John, 4.1);
        Animal Dog = new Animal(1,"Rex", John,5.2);

        AnimalCollection animals = new AnimalCollection();

        animals.addAnimal(Cat);
        animals.addAnimal(Dog);
        System.out.println("Общий список животных: "+animals.toString());

        /* Добавление дубликатов для генерирования исключительной ситуации */
        animals.addAnimal(Cat);
        animals.addAnimal(Dog);

        /* Вызов метода поиска животного по его кличке */
        animals.animalSearch("Rex");
    }
}