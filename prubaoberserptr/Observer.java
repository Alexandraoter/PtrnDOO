package prubaoberserptr;
abstract class Observer {
    protected Subject subject;
    public abstract void update();
}