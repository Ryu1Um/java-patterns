package example.behavioral.visitor.practice;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);
}