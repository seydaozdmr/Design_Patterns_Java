package Behavioral.ChainOfResponsibility.Hospital;

public class AbstractHandler implements Handler{
    protected Handler successor;
    protected Handler predecessor;
    protected Prescription prescription;

    public AbstractHandler(Handler successor, Handler predecessor) {
        this.successor = successor;
        this.predecessor = predecessor;
    }

    @Override
    public Prescription handleRequest(Context context) {
        return null;
    }
}
