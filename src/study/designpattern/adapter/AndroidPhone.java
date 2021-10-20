package study.designpattern.adapter;

/**
 * 사용자는 기존에 아이폰을 사용했지만, 폰을 안드로이드로 바꾸게 되면서 
 * 아이폰 이어폰을 사용해야만 하는 상황이 됐다. 
 * 아이폰 이어폰을 사용할 수 있도록 어댑터가 필요한 상황.
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
