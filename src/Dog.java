public class Dog
{
    private String name, breed;
    private int age, weight;
    private static int dogCount;

    public Dog()
    {
        name = null;
        breed = null;
        age = 0;
        weight = 0;
        dogCount++;
    } //default constructor

    public Dog(String name, String breed, int age, int weight)
    {
        name = this.name;
        breed = this.breed;
        age = this.age;
        weight = this.weight;
        dogCount++;
    } //full constructor

    //getters
    public static String getName()
    {
        return name;
    }

    public static String getBreed()
    {
        return breed;
    }

    public static int getAge()
    {
        return age;
    }





} // end class Dog
