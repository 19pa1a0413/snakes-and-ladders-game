import java.util.*;
public class Startplay{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Start the game");

            int boardsize=Integer.parseInt(sc.nextLine());
            int n1=Integer.parseInt(sc.nextLine());
            System.out.println("number of snakes are :"+n1);
            int n2=Integer.parseInt(sc.nextLine());
            System.out.println("number of ladders are :"+n2);
            HashMap<Integer,snakes>map1=new HashMap<Integer,snakes>();
            for(int i=0;i<n1;i++){
                String[]data=sc.nextLine().split(" ");
                int ending=Integer.parseInt(data[1]);
                int starting=Integer.parseInt(data[0]);
                snakes snake=new snakes(starting,ending);
                map1.put(starting,snake);
                }
            HashMap<Integer,Ladders>map2=new HashMap<Integer,Ladders>();
            for(int j=0;j<n2;j++){
                String[]data=sc.nextLine().split(" ");
                int ending=Integer.parseInt(data[1]);
                int starting=Integer.parseInt(data[0]);
                Ladders ladder=new Ladders(starting,ending);
                map2.put(starting,ladder);
                }
            Queue<Player>playerslist=new LinkedList<Player>();
            int n=Integer.parseInt(sc.nextLine());
            System.out.println("number of players playing  : "+n);
            for(int k=0;k<n;k++){
                String name=sc.nextLine();
                Player p1=new Player(name);
                playerslist.add(p1);
                }
            Board b=new Board(boardsize,map1,map2,playerslist);
            b.SnakesandLadders();
        } 
        }
        
    }


