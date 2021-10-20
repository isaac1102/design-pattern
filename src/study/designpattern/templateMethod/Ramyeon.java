package study.designpattern.templatemethod;

/**
 * ������ �ܰ躰�� ������ �� ��� ����Ѵ�.  
 * �ܰ躰�� ���� �������� ������ ���ɼ��� ���� ��쿡 ����.
 * �ܰ踦 �����ϴ� �޼ҵ�� ������ �Ұ����ϰ� final�� �����Ѵ�.
 * 
 *  1. Ŭ������ abstract�� �����.
 *  2. �ܰ踦 �����ϴ� �޼ҵ�� ������ �Ұ����ϵ��� final�� �����Ѵ�.
 *  3. �� �ܰ���� �ܺ� ������ ����, 
 *  �ڽĵ�� ���� ��Ű�������� ���� �����ϵ��� protected�� �����Ѵ�.
 */
abstract class Ramyeon {
  protected void boilingWater(){System.out.println("���� ���Դϴ�.");}
  protected void putIn(){}
  protected void shutOffGas(){System.out.println("������ ��޴ϴ�.");}
  protected void plating(){System.out.println("�׸��� ����ϴ�.");}
  
  final void makeRamyeon() {
    this.boilingWater();
    this.putIn();
    this.shutOffGas();
    this.plating();
  }
}
