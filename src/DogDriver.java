public class DogDriver
{
    public static void main (String[]args)
    {
        Dog dog1 = new Dog("Fang", "Husky", 5, 80);
        Dog dog2 = new Dog("Nutmeg", "Australian Sheepdog", 12, 45);
        Dog dog3 = new Dog("Thea", "German Shepherd", 3, 60);

        System.out.println("Fang's breed and age: ");
        System.out.println(dog1.getBreed());
        System.out.println(dog1.getAge());

        System.out.println("Nutmeg's weight: ");
        System.out.println(dog2.toKilos());

        System.out.println("My dog's information: ");
        System.out.println(dog3.toString());
        // System.out.println(Dog.getCount());
    } //end method main
} //end class DogDriver
