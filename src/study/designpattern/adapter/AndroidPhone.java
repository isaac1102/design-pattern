package study.designpattern.adapter;

/**
 * ����ڴ� ������ �������� ���������, ���� �ȵ���̵�� �ٲٰ� �Ǹ鼭 
 * ������ �̾����� ����ؾ߸� �ϴ� ��Ȳ�� �ƴ�. 
 * ������ �̾����� ����� �� �ֵ��� ����Ͱ� �ʿ��� ��Ȳ.
 */
public class AndroidPhone {
  public static void main(String[] args) {
    AndroidPhone androidphone = new AndroidPhone();
    IphoneEarphoneImpl ie = new IphoneEarphoneImpl();
    AdapterEarphone earphone = new AdapterEarphone(ie);
    androidphone.listening(earphone);
  }
  
  public void listening(AdapterEarphone earphone) {
    earphone.listen();
  }
}
