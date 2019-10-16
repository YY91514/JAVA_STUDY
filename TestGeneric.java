/* 泛型类 */
class Generic<T> {
  private T key;

  public Generic(T key){
    this.key = key;
  }
  public T getKey(){
    return key;
  }
}

public class TestGeneric{
  public static void main(String[] args){
    Generic<Integer> generic = new Generic<Integer>(99);
    System.out.println("Generic<Integer> is " + generic.getKey());
  }
}