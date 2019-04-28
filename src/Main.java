import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person John = new Person("John", 39, "MAN");
        Animal Cat = new Animal(0, "Murzik", John, 4.1);
        Animal Dog = new Animal(1,"Rex", John,5.2);

        AnimalCollection animals = new AnimalCollection();
        animals.addAnimal(Cat);
        animals.addAnimal(Dog);

        System.out.println(animals.toString());

        animals.addAnimal(Cat);
        animals.addAnimal(Dog);
    }

        public static class AnimalCollection{
            private Set<Object> animalCollection = new HashSet<>();

            void addAnimal(Object givenAnimal){
                if (equals(givenAnimal)){
                    System.out.println("Объект: " + givenAnimal.toString() + " уже в списке!");
                }
                animalCollection.add(givenAnimal);
            }

            /* Переписанный метод equals() для выявления добавляемых дубликатов
            * для генерирования исключительной ситуации */
            @Override
            public boolean equals(Object o) {
                Iterator itr = animalCollection.iterator();
                while (itr.hasNext()) {
                    Object x = itr.next();
                    if (x.equals(o)) {
                        return true;
                    }
                }
            return false;
            }

            @Override
            public int hashCode() {
                return Objects.hash(animalCollection);
            }

            /* Метод toString() для вывода на экран списка животных */
            @Override
            public String toString() {
                return "AnimalCollection{" +
                        "animalCollection=" + animalCollection +
                        '}';
            }
        }
    }