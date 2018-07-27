
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Congress3{
  private static int n;                       // number of items on priority queue
  private static long seats;

  //----------------------------------------------------------
  public static class State implements Comparable<State>{
    private String name;
    private long population;
    private long seat;
    private double qouta;

    public State(String name, long population){
      this.name = name;
      this.population = population;
      seat = 1;
      qouta = population/Math.sqrt(seat*(seat+1));
    }

    public void addSeat(){
      seat++;
      qouta = population/Math.sqrt(seat*(seat+1));
    }

    public void print(){
      System.out.println(name + " " + seat);
    }

    public int compareTo(State other){
      return Double.compare(this.qouta, other.qouta);
    }
  }

  //-------------------------------------------------------------

  public static void main(String[] args) {
    n = StdIn.readInt();
    seats =  StdIn.readLong();
    StdIn.readLine();
    MaxPQ<State> states = new MaxPQ<State>();

    while(!StdIn.isEmpty()){
      String name = StdIn.readLine();
      Long population = Long.parseLong(StdIn.readLine());
      State state = new State(name, population);
      states.insert(state);
      seats--;
    }

    while(seats > 0){
      State high = states.delMax();
      high.addSeat();
      states.insert(high);
      seats--;
    }

    while(!states.isEmpty()){
      State stat = states.delMax();
      stat.print();
    }
  }
}
