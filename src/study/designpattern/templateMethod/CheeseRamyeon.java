package study.designpattern.templateMethod;

public class CheeseRamyeon extends Ramyeon{
  @Override
  protected void putIn() {
    System.out.println("라면에 치즈를 함께 넣습니다.");
  }
  
  public static void main(String[] args) {
    CheeseRamyeon c = new CheeseRamyeon();
    c.makeRamyeon();
  }
}
