package example.behavioral.visitor.theory.developer;

import example.behavioral.visitor.theory.element.Database;
import example.behavioral.visitor.theory.element.ProjectClass;
import example.behavioral.visitor.theory.element.Test;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
