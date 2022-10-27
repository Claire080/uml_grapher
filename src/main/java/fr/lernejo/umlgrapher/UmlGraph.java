package fr.lernejo.umlgrapher;

public class UmlGraph {
    private final Class[] className;

    public UmlGraph(Class... className){
        this.className=className;
    }

    public String as(GraphType graph_t ){
        String str="""
        classDiagram
        class Machin {
            <<interface>>
        }
        """;
        return str;
    }
}
