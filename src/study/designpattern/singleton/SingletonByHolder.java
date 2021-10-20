package study.designpattern.singleton;

/**
 * 클래스 안에 홀더(Holder)를 두어 JVM의 클래스 로더 매커니즘과 클래스가 로드되는 시점을 이용하는 방법
 */
public class SingletonByHolder {
  // 생성자 접근제한
  private SingletonByHolder() {}
  
  /**
   * 클래스가 로드되는 시점에 static 변수에 생성된 객체가 할당된다.
   * 사람이 싱글턴 객체 시점을 지정하지 않으며, synchronized로 인한 동기화 문제를 작성하지 않기 때문에 심플하고 안정성이 높다.
   * JVM의 클래스 초기화 과정에서 보장되는 원자적 특성을 이용해 싱글톤의 초기화 문제에 대한 책임을 JVM에게 떠넘기는 걸 활용한다.
   * 
   * 클래스 안에 선언한 클래스인 holder에서 선언된 인스턴스는 static이기 때문에 클래스 로딩시점에서 한번만 호출된다. 
   * 또한 final을 사용해서 다시 값이 할당되지 않도록 만드는 방식을 사용하였다.
   */
  private static class LazyHolder {
    public static final SingletonByHolder INSTANCE = new SingletonByHolder();
  }
  
  public static SingletonByHolder getInstance() {
    return LazyHolder.INSTANCE;
  }
}
