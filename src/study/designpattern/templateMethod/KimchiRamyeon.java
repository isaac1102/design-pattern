package study.designpattern.templatemethod;

public class KimchiRamyeon extends Ramyeon{
  @Override
  protected void putIn() {
    System.out.println("���� ��ġ�� �Բ� �ֽ��ϴ�.");
  }
  
  public static void main(String[] args) {
    KimchiRamyeon k = new KimchiRamyeon();
    k.makeRamyeon();
  }
}
