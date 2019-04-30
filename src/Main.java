public class Main {

    public static void main(String[] args) {
        Person John = new Person("John", 39, "MAN");
        Animal Cat = new Animal(0, "Murzik", John, 4.1);
        Animal Dog = new Animal(1,"Rex", John,5.2);
        Animal Turtle = new Animal(2,"Leo", John,1.2);

        AnimalCollection animals = new AnimalCollection();

        animals.addAnimal(Cat);
        animals.addAnimal(Dog);
        animals.addAnimal(Turtle);
        System.out.println("Общий список животных: "+animals.toString());

        /* Добавление дубликатов для генерирования исключительной ситуации */
        animals.addAnimal(Cat);
        animals.addAnimal(Dog);
        animals.addAnimal(Turtle);

        /* Вызов метода поиска животного по его кличке */
        animals.animalSearch("Rex");

        /* Вызов метода по изменению данных животного по его идентификатору */
        animals.changeAnimalRecord();
        System.out.println("Общий список животных: "+animals.toString());
    }
}