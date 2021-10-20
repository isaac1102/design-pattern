package study.designpattern.adapter;

public class AdapterEarphone implements NormalEarphone {
  IphoneEarphone ie;
  
  public AdapterEarphone(IphoneEarphone ie) {
    this.ie = ie;
  }
  
  @Override
  public void listen() {
    ie.listen();
  }
}
