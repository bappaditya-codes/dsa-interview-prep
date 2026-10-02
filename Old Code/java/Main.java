import java.util.HashMap;
import java.util.Map;

class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Employee))
            return false;

        Employee other = (Employee) obj;
        return this.id == other.id;
    }
}

public class Main {

    public static void main(String[] args) {

        Map<Employee, String> map = new HashMap<>();

        Employee e = new Employee(10);

        map.put(e, "John");

        System.out.println(map.get(e));

        e.id = 20;

        System.out.println(map.get(e));
    }
}
