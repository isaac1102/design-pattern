package study.designpattern.templateMethod;

public class CheeseRamyeon extends Ramyeon{
  @Override
  protected void putIn() {
    System.out.println("��鿡 ġ� �Բ� �ֽ��ϴ�.");
  }
  
  public static void main(String[] args) {
    CheeseRamyeon c = new CheeseRamyeon();
    c.makeRamyeon();
  }
}
