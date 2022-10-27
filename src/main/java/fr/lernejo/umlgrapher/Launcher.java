package fr.lernejo.umlgrapher;

import picocli.CommandLine;
import picocli.CommandLine.Option;


class Launcher implements Runnable{

    /*@Parameters(index = "0", description = "The file whose checksum to calculate.")
    private File file;*/

    @Option(names = {"-c", "--classes"}, description = "fill in the classes from which to start the analysis")
    private Class[] classes;

    @Option(names = {"-g", "--graph-type"}, description = "select the type of graph you want to output")
    private GraphType graphType=GraphType.Mermaid;

    @Override
    public void run(){
        System.out.println(""+(new UmlGraph(classes[0])).as(graphType));
    }


    public static void main(String... args) {
        new CommandLine(new Launcher()).execute(args);
    }

}
