public class Id {
    private static Integer id;
    protected static int getId(){
        if(id == null){
            id = new Integer(0);
        }
        id++;
        return id;
    }
}
