import java.util.Timer;
import java.util.TimerTask;

public class Player extends Lives {

    int level;
    int experienceBar;


    public  Player(){
        level = 1;
        experienceBar = 0;
        name = "Player"+id;
        health=(int)(10+Math.random()*90);

        x = (double)(double) Math.round((Math.random()*10)*10)/10;
        y= (double)(double) Math.round((Math.random()*10)*10)/10;

        heartbeats();
    }

    @Override
    void heartbeats()  {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                x = x +0.5;
                y = y +0.5;
                health++;
                experienceBar =experienceBar+5;
                if (experienceBar==100){
                    level = level+1;
                    experienceBar = 0;
                }
            }
        },1000,1000);


    }

    public void show(){
        System.out.println("id: "+id+"   玩家名字: "+name+"   等级: "+level+"   health: "+health+"   经验: "+experienceBar+"   (x,y): ("+x+","+y+")");
    }
}
