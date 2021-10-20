package study.designpattern.factorymethod;

public class FinalSoupFactory extends SoupFactory{
  @Override
  Soup createSoup(String name) {
    switch(name) {
      case "pork" :
        return new PorkKimchiSoup(name); 
      case "tuna":
        return new TunaKimchiSoup(name);
      case "gochoojang":
        return new GochoojangSoup(name);
    }
    return null;
  }
  
  public static void main(String[] args) {
    FinalSoupFactory f = new FinalSoupFactory();
    f.createSoup("gochoojang");
  }
}
