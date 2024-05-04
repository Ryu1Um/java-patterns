package example.behavioral.visitor.theory.element;

import example.behavioral.visitor.theory.developer.Developer;

public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
