package example.visitor.theory;

import example.visitor.theory.developer.Developer;
import example.visitor.theory.developer.JuniorDeveloper;
import example.visitor.theory.developer.SeniorDeveloper;
import example.visitor.theory.element.Project;

public class ProjectRunner {
    public static void main(String[] args) {
        var project = new Project();

        Developer junior = new JuniorDeveloper();
        SeniorDeveloper senior = new SeniorDeveloper();

        System.out.println("Junior in Action");
        project.beWritten(junior);

        System.out.println("\n==========================\n");

        System.out.println("Senior in Action");
        project.beWritten(senior);
    }
}
