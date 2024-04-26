package example.iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        var skills = new String[]{"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        var javaDeveloper = new JavaDeveloper("Ivan Ivanov", skills);

        var iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
