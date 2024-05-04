package example.behavioral.interpreter;

public class InterpreterRunner {

    public static void main(String[] args) {
        var isJava = getJavaExpression();
        var isJavaDeveloper = getJavaEEExpression();

        System.out.println("Does developer knows Java Core: " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaDeveloper.interpret("Java Spring"));
    }

    public static Expression getJavaExpression() {
        var java = new TerminalExpression("Java");
        var javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        var java = new TerminalExpression("Java");
        var spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
