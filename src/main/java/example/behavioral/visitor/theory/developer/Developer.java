package example.behavioral.visitor.theory.developer;

import example.behavioral.visitor.theory.element.Database;
import example.behavioral.visitor.theory.element.ProjectClass;
import example.behavioral.visitor.theory.element.Test;

public interface Developer {

    void create(ProjectClass projectClass);

    void create(Database database);

    void create(Test test);
}
