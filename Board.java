import java.util.*;
public class Board{
    private int boardsize;
    private HashMap<Integer, snakes> snakes;
    private HashMap<Integer, Ladders> ladders;
    private Queue<Player> playerslist;
    public Board(int boardsize,HashMap<Integer,snakes> snakes,HashMap<Integer,Ladders> ladders, Queue<Player> playerslist){
    this.boardsize=boardsize;
    this.snakes=snakes;
    this.ladders=ladders;
    this.playerslist=playerslist;   
    }
    public void SnakesandLadders(){
        while(true){
            Player p1=playerslist.poll();
            int lastposition=p1.getplayerspotted();
            int newposition=lastposition + Die.rollingdie();
            if(newposition <= boardsize){
                if(snakes.containsKey(newposition)){
                    System.out.println(p1.getName()+" snake caught and came to  tail of the snake");
                    snakes s2=snakes.get(newposition);
                    newposition=s2.getEndPoint();
                
                }
                else if(ladders.containsKey(newposition)){
                     System.out.println(p1.getName()+"climbed the ladder and reach the top of ladder");
                    Ladders l2=ladders.get(newposition);
                    newposition=l2.getEndPoint();
                   
                }
                else{
                    System.out.println(p1.getName()+" moved from "+lastposition+"to "+newposition);
                }
                if(newposition==boardsize){
                    System.out.println(p1.getName()+"won the game");
                    break;
                }
            p1.setplayerspotted(newposition);
            }
        playerslist.add(p1);
    }
}
}


