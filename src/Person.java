public class Person {

    String name;
    static int nextID = 0;
    int id;
    int personCount = 0;
    Person[] people = new Person[1000];

    public Person(String name) {
        this.name = name;
        this.id = nextID;
        nextID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addPerson(Person p) {
        people[personCount] = p;
        personCount++;
    }
}