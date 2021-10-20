package study.designpattern.singleton;

/**
 * Ŭ���� �ȿ� Ȧ��(Holder)�� �ξ� JVM�� Ŭ���� �δ� ��Ŀ����� Ŭ������ �ε�Ǵ� ������ �̿��ϴ� ���
 */
public class SingletonByHolder {
  // ������ ��������
  private SingletonByHolder() {}
  
  /**
   * Ŭ������ �ε�Ǵ� ������ static ������ ������ ��ü�� �Ҵ�ȴ�.
   * ����� �̱��� ��ü ������ �������� ������, synchronized�� ���� ����ȭ ������ �ۼ����� �ʱ� ������ �����ϰ� �������� ����.
   * JVM�� Ŭ���� �ʱ�ȭ �������� ����Ǵ� ������ Ư���� �̿��� �̱����� �ʱ�ȭ ������ ���� å���� JVM���� ���ѱ�� �� Ȱ���Ѵ�.
   * 
   * Ŭ���� �ȿ� ������ Ŭ������ holder���� ����� �ν��Ͻ��� static�̱� ������ Ŭ���� �ε��������� �ѹ��� ȣ��ȴ�. 
   * ���� final�� ����ؼ� �ٽ� ���� �Ҵ���� �ʵ��� ����� ����� ����Ͽ���.
   */
  private static class LazyHolder {
    public static final SingletonByHolder INSTANCE = new SingletonByHolder();
  }
  
  public static SingletonByHolder getInstance() {
    return LazyHolder.INSTANCE;
  }
}
