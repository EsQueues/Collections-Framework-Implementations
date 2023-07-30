import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
        List<Person>list=new ArrayList<>();
        Set<Person>set=new TreeSet<>();
        addElements(list);
        addElements(set);
        System.out.println(list);
        System.out.println(set);
    }
    private static void addElements(Collection<Person> collection){
        collection.add(new Person(3,"Sayat"));
        collection.add(new Person(1,"Bigeldi"));
        collection.add(new Person(4,"Berdibek"));
        collection.add(new Person(2,"Ali"));
        collection.add(new Person(5,"Nurgisa"));

    }

}
class Person implements Comparable<Person>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.id, o.getId());
    }
}
