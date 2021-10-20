package study.designpattern.singleton;

/**
 * �ܺο����� ������ ����� �����ϰ�, ��ü�� �������θ� Ȯ���Ͽ� ������ �����ϴ� ����̴�. 
 */
public class SimpleSingleton {
  private static  SimpleSingleton instance;
  
  private SimpleSingleton() {}
  
  /**
   * �⺻������ thread-safe�ϰ� singleton�� ������ �� ������, 
   * synchronized�� ���� �������ϰ� ���ߵ� �� �ִ�. 
   */
  public static synchronized SimpleSingleton getInstance() {
    if(instance == null) {
      instance = new SimpleSingleton();
    }
    return instance;
  }
}
