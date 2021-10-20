package study.designpattern.adapter;

public class IphoneEarphoneImpl implements IphoneEarphone {
  
  @Override
  public void listen() {
    System.out.println("아이폰 이어폰을 통해 음악을 듣습니다.");
  }
}
