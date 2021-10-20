package study.designpattern.singleton;

/**
 * SimpleSingleton의 synchronized로 인한 성능저하를 줄이기 위한 방법이다. 
 * 처음부터 synchronized가 적용되지 않는다.
 * 
 * 이 방법의 한계
 * -  volatile은 java 1.5부터 나온 기능이기 때문에 java1.4나 그 이전의 버전에서는 사용할 수 없다.
 * - simpleSingleton에 비하여 성능이 개선되었지만, 코드가 장황하고 가독성이 떨어진다. 
 */
public class DoubleCheckedSingleton {
  /**
   *  volatile keyword는 Java 변수를 Main Memory에 저장하겠다라는 것을 명시하는 것이다.
   *  매번 변수의 값을 Read할 때마다 CPU cache에 저장된 값이 아닌 Main Memory에서 읽는 것이다.
   *  또한 변수의 값을 Write할 때마다 Main Memory에 까지 작성하는 것이다.
   */
  private volatile static DoubleCheckedSingleton instance;
  
  // 생성자 접근제한
  private DoubleCheckedSingleton() {}
  
  public static DoubleCheckedSingleton getInstance() {
    if(instance == null) {
      /**
       * synchronized의 parameter
       * - 동일한 객체의 다른 부분을 동기화할 수 있다. 여러 개의 synchronized 블록으로 나눌 시에 서로 간섭받지 않을 수 있다. 
       */
      synchronized(DoubleCheckedSingleton.class) {
        // 작업을 원자적으로 유지하기 위해 synchronized 블록 후에 검사를 수행한다.
        if(instance == null) {
          instance = new DoubleCheckedSingleton();
        }
      }
    }
    return instance;
  }
}
