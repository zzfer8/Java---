package pack2;

public class Test {
	static char opt;//����Test���µ���������
	 public char curriculumTest (char o){
		 return this.opt = o;}//����Ϊ���Ը�ֵ
	 public static void main(String args[]) {
	  Teacher T1 = new Teacher("201931XXXX","��XX","��");
	  Student S1 = new Student("2019310635","��溺�","Ů");
	  Course C1 = new Course("CST202-1","Java������Ӧ��","��300","1-16��",T1,S1);//����������µĹ��췽����Ϊ�������Ը�ֵ��Ϣ
	  T1.Selectcourse(C1);//��ʦ�ڿ�
	  S1.Selectcourse(C1);//ѧ��ѡ��
	  System.out.println("ѧ����Ϣ "+S1);//�������������д��toString()����,����������Ը�ֵ��Ϣ
	  System.out.println("�γ���Ϣ "+C1);
	  System.out.println("��ʦ��Ϣ "+T1);
	  Test t= new Test();//����Test���͵Ķ���t
	  t.curriculumTest('F');//���÷���ΪTest���Ͷ���t�е����Ը�ֵ
	  if(opt == 'T')//ѧ��ͨ������T/Fʵ��ѡ���˿�
	   System.out.println("ѡ�γɹ�!");
	  if(opt == 'F')
	   System.out.println("�˿γɹ�!");
	   else
		   System.out.println("��Ч�ַ������������룡");
	 }
	}

