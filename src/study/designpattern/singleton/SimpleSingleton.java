package study.designpattern.singleton;

/**
 * 외부에서의 생성자 사용을 제한하고, 객체의 생성여부를 확인하여 생성을 제한하는 방법이다. 
 */
public class SimpleSingleton {
  private static  SimpleSingleton instance;
  
  private SimpleSingleton() {}
  
  /**
   * 기본적으로 thread-safe하게 singleton을 생성할 수 있지만, 
   * synchronized로 인한 성능저하가 유발될 수 있다. 
   */
  public static synchronized SimpleSingleton getInstance() {
    if(instance == null) {
      instance = new SimpleSingleton();
    }
    return instance;
  }
}
