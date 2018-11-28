

public class Client {
    public static void main(String[] args){

        ReceiverTv receiverTv = new ReceiverTv();
        Invoker invoker = new Invoker();

        ConcreteCommandOpen concreteCommandOpen = new ConcreteCommandOpen(receiverTv);
        ConcreteCommandChange concreteCommandChange = new ConcreteCommandChange(receiverTv);
        ConcreteCommandClose concreteCommandClose = new ConcreteCommandClose(receiverTv);

        invoker.addCommand(concreteCommandOpen);
        invoker.addCommand(concreteCommandChange);
        invoker.addCommand(concreteCommandClose);

        invoker.runCommand();
    }



}
