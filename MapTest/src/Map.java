import java.util.*;

public class Map {
    List<Monster> monstersList = new ArrayList<>();
    List<Player> playersList = new ArrayList<>();
    public void addPlayers(int n){
        for(int i=0;i<n;i++){
            playersList.add(new Player());
        }
    }

    public void addMonsters(int m){

        for(int i=0;i<m;i++){
            monstersList.add(new Monster());
        }
    }

    public void show(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            int i =1;
            @Override
            public void run() {

                System.out.println("第"+i+"输出");
                i++;
                Iterator<Player> playerIterator = playersList.iterator();
                for (Iterator<Player> it = playerIterator; it.hasNext(); ) {
                    Player player = it.next();
                    player.show();
                }


                Iterator<Monster> monsterIterator = monstersList.iterator();
                for (Iterator<Monster> it = monsterIterator; it.hasNext(); ) {
                    Monster monster = it.next();
                    monster.show();
                }

                System.out.println();
                System.out.println();

            }
        },0,10000);

    }
}
