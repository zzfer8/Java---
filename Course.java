package pack2;

public class Course {
	String ID;
	 String Name;
	 String Location;
	 String Time;
	 Teacher Teacher;
	 Student Student;
	 Course (String i,String n,String l,String te,Teacher tr,Student st){//ͨ�����췽��ʵ��������Ϊ���Ը�ֵ
	  this.ID = i;
	  this.Name = n;
	  this.Location = l;
	  this.Time = te;
	  this.Teacher = tr;
	  this.Student = st;
	 }
	 public String toString() {//��дtoString()����������������Լȶ���ʽ�����ʾ
	  return "���:"+this.ID+" �γ�����:"+this.Name+" �Ͽεص�:"+this.Location+" ʱ��:"+this.Time+" �ڿν�ʦ:"+this.Teacher.Name+" ѡ��ѧ��:"+this.Student.Name;
	 }
	}

