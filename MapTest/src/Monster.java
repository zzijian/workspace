import java.util.Timer;
import java.util.TimerTask;

public class Monster extends Lives{

    public Monster()  {
        name = "Monster"+id;
        health=(int)(100+Math.random()*90);
        x = (double) Math.round((Math.random()*10)*10)/10;
        y = (double) Math.round((Math.random()*10)*10)/10;
        heartbeats();
    }


    @Override
    void heartbeats(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                x++;
                y++;
                health++;
            }
        },2000,2000);
    }

    public void show(){
        System.out.println("id: "+id+"   怪物名字: "+name+"   health: "+health+"   (x,y): ("+x+","+y+")");
    }



}
