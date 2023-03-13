package taint.sample.gradle;

import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.tainting.qual.Untainted;

public class VarTest {

    public void Process() {
        List<@Untainted String> command = new ArrayList<@Untainted String>();
        command.add("sh");
        command.add(" -c");
        ProcessBuilder p = new ProcessBuilder(command);
    }

    public void ProcessVar() {
        var command = new ArrayList<@Untainted String>();
        command.add("sh");
        command.add(" -c");
        ProcessBuilder p = new ProcessBuilder(command);
    }
    
}
