package example.structural.decorator;

public class Task {
    public static void main(String[] args) {
        var developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
