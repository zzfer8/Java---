package pack2;

public class Student extends Person {//Student��̳�Person�࣬��ø�������
	 public Course Course;//���Student�����������(��ѡ�γ�)
	 Student (String i,String n,String s){
	  super(i,n,s);//super()ʵ�������࣬Ϊ�������Ը�ֵ
	 }
	 public void Selectcourse (Course ce) {
		 this.Course = ce;
	 }
	 public String toString() {//��дtoString()����������������Լȶ���ʽ�����ʾ
	  return "���:"+this.ID+" ����:"+this.Name+" �Ա�:"+this.Sex+" ��ѡ�γ�:"+this.Course.Name;
	 }
	}