public class ConcreteCommandClose implements Command{
    ReceiverTv receiverTv;

    public ConcreteCommandClose(ReceiverTv receiverTv){
        this.receiverTv = receiverTv;
    }

    @Override
    public void execute() {
        receiverTv.actiongClose();

    }
}
