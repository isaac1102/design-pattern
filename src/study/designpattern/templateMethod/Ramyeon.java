package study.designpattern.templatemethod;

/**
 * 로직을 단계별로 나눠야 할 경우 사용한다.  
 * 단계별로 나눈 로직들이 수정될 가능성이 높은 경우에 좋다.
 * 단계를 실행하는 메소드는 수정이 불가능하게 final로 선언한다.
 * 
 *  1. 클래스는 abstract로 만든다.
 *  2. 단계를 진행하는 메소드는 수정이 불가능하도록 final로 선언한다.
 *  3. 각 단계들은 외부 접근은 막고, 
 *  자식들과 동일 패키지에서만 수정 가능하도록 protected로 선언한다.
 */
abstract class Ramyeon {
  protected void boilingWater(){System.out.println("물을 끓입니다.");}
  protected void putIn(){}
  protected void shutOffGas(){System.out.println("가스를 잠급니다.");}
  protected void plating(){System.out.println("그릇에 담습니다.");}
  
  final void makeRamyeon() {
    this.boilingWater();
    this.putIn();
    this.shutOffGas();
    this.plating();
  }
}
