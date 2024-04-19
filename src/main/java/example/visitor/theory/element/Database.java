package example.visitor.theory.element;

import example.visitor.theory.developer.Developer;

public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
