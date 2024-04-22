package example.state;

public class DeveloperDay {
    public static void main(String[] args) {
        var activity = new Sleeping();
        var developer = new Developer();

        developer.setActivity(activity);
        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
