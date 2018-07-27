
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Congress {
  private static int n; // number of items on priority queue
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
}
