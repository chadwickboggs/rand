import java.util.Random;

public class Main {
  
  public static void main(String... argv){
    long value = Math.abs(new Random(((long) (Long.MAX_VALUE * Math.random())) % Long.MAX_VALUE).nextLong());
    System.out.println(String.valueOf(value));
  }
  
}
