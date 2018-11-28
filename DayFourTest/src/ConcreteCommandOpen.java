public class ConcreteCommandOpen implements Command {

    ReceiverTv receiverTv;

    public ConcreteCommandOpen(ReceiverTv receiverTv){
        this.receiverTv = receiverTv;
    }

    @Override
    public void execute() {
        receiverTv.actiongOpen();

    }

}
