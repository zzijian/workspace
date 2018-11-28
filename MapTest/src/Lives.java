public abstract class Lives {
    int id;
    public Lives(){
       id = Id.getId();
    }

    String name;
    int health;
    double x;
    double y;

    abstract void heartbeats();
}
