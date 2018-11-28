import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Invoker {
    private List<Command> command= new ArrayList<Command>();

    public  void addCommand(Command command){
        this.command.add(command);
    }

    public void runCommand(){
        Iterator<Command> commandIterator = command.iterator();
        for (Iterator<Command> it = commandIterator; it.hasNext(); ) {
            Command c = it.next();
            c.execute();
        }

    }

}
