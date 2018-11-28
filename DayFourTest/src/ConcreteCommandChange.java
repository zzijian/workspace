public class ConcreteCommandChange implements Command{
    ReceiverTv receiverTv;

    public ConcreteCommandChange(ReceiverTv receiverTv){
        this.receiverTv = receiverTv;
    }

    @Override
    public void execute() {
        receiverTv.actiongChange();

    }
}
