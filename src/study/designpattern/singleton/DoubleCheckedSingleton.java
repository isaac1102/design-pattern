package study.designpattern.singleton;

/**
 * SimpleSingleton�� synchronized�� ���� �������ϸ� ���̱� ���� ����̴�. 
 * ó������ synchronized�� ������� �ʴ´�.
 * 
 * �� ����� �Ѱ�
 * -  volatile�� java 1.5���� ���� ����̱� ������ java1.4�� �� ������ ���������� ����� �� ����.
 * - simpleSingleton�� ���Ͽ� ������ �����Ǿ�����, �ڵ尡 ��Ȳ�ϰ� �������� ��������. 
 */
public class DoubleCheckedSingleton {
  /**
   *  volatile keyword�� Java ������ Main Memory�� �����ϰڴٶ�� ���� ����ϴ� ���̴�.
   *  �Ź� ������ ���� Read�� ������ CPU cache�� ����� ���� �ƴ� Main Memory���� �д� ���̴�.
   *  ���� ������ ���� Write�� ������ Main Memory�� ���� �ۼ��ϴ� ���̴�.
   */
  private volatile static DoubleCheckedSingleton instance;
  
  // ������ ��������
  private DoubleCheckedSingleton() {}
  
  public static DoubleCheckedSingleton getInstance() {
    if(instance == null) {
      /**
       * synchronized�� parameter
       * - ������ ��ü�� �ٸ� �κ��� ����ȭ�� �� �ִ�. ���� ���� synchronized ������� ���� �ÿ� ���� �������� ���� �� �ִ�. 
       */
      synchronized(DoubleCheckedSingleton.class) {
        // �۾��� ���������� �����ϱ� ���� synchronized ��� �Ŀ� �˻縦 �����Ѵ�.
        if(instance == null) {
          instance = new DoubleCheckedSingleton();
        }
      }
    }
    return instance;
  }
}
