package example.visitor.practice;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);
}