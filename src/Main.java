public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Random";

        dog.feed();

        Animal lion = new Animal("lion");
        lion.name = "leo";

        lion.feed();

        Human me = new Human();
        me.firstName = "Igor";
        me.lastName = "Shauliuk";
        me.pet = dog;

        me.pet.feed();
    }
}
