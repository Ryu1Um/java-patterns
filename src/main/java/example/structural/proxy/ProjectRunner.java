package example.structural.proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        var project = new ProxyProject("https://www.dfjdf.com/realproject");

        project.run();
    }
}
