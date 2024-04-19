package example.visitor.theory.developer;

import example.visitor.theory.element.Database;
import example.visitor.theory.element.ProjectClass;
import example.visitor.theory.element.Test;

public interface Developer {

    void create(ProjectClass projectClass);

    void create(Database database);

    void create(Test test);
}
