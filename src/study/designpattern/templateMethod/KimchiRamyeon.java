package study.designpattern.templatemethod;

public class KimchiRamyeon extends Ramyeon{
  @Override
  protected void putIn() {
    System.out.println("라면과 김치를 함께 넣습니다.");
  }
  
  public static void main(String[] args) {
    KimchiRamyeon k = new KimchiRamyeon();
    k.makeRamyeon();
  }
}
