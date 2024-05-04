package example.behavioral.visitor.theory.developer;

import example.behavioral.visitor.theory.element.Database;
import example.behavioral.visitor.theory.element.ProjectClass;
import example.behavioral.visitor.theory.element.Test;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable test...");
    }
}
