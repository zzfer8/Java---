package pack2;

public class Teacher extends Person{//Teacher��̳�Person�࣬��ø�������
	 public Course Course;//���Teacher�����������(���ڿγ�)
	 Teacher (String i,String n,String s){
	  super(i,n,s);//super()ʵ�������࣬Ϊ�������Ը�ֵ
	 }
	 public void Selectcourse (Course ce) {
		 this.Course = ce;
	 }
	 public String toString() {//��дtoString()����������������Լȶ���ʽ�����ʾ
	  return "���:"+this.ID+" ����:"+this.Name+" �Ա�:"+this.Sex+" ���ڿγ�:"+this.Course.Name;
	 }

	}

