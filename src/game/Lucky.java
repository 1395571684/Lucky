
/**���˳齱
 * @author haoyujing
 */
package game;

import java.util.Random;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Lucky {
	static int id = -1;// ���ڼ�¼��½�û��Ļ�Ա��		
	static int n = 0;//���ڼ�¼�û��ĸ���
	static String[] uname = new String[10];// ���ڼ�¼�û���
	static String[] pword = new String[10];// ���ڼ�¼�û�����
	static int[] mid = new int[10];// ���ڼ�¼�û��Ļ�Ա��
	static int[] ran = new int[5];// ���ڼ�¼���˺���
	static Random r=new Random();//���������
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {// ����������˺���
			//ran[i] = (int) (Math.random() * 10);
			ran[i]=r.nextInt(1000);
		}
		while (true) {
			System.out.println("***********��ӭ�������˳齱ϵͳ************");
			System.out.println("            1.ע��                                          ");
			System.out.println("            2.��½                                          ");
			System.out.println("            3.�齱                                          ");
			System.out.println("            4.�˳�                                          ");
			System.out.println("******************************************");
			System.out.println("��ѡ��");
			int ch;
			ch = input.nextInt();
			switch (ch) {
			case 1:// ע��
				login();
				break;
			case 2:// ��½
				register();
				break;
			case 3:// �齱
				check();
				break;
			case 4://�˳�
			return;

			}

		}
	}
	public static void login(){//ע��
		System.out.println("�������û�����");
		Scanner input=new Scanner(System.in);
		uname[n] = input.next();
		System.out.println("���������룺");
		pword[n] = input.next();
		System.out.println("ע��ɹ���");
		System.out.print("��Ա��Ϊ��");
		//mid[n] = (int) (Math.random() * 10);
		mid[n]=r.nextInt(1000);
		System.out.println(mid[n]);
		n++;
		
	}
	public static void register(){//��¼
		Scanner input = new Scanner(System.in);
String result;
for (int i = 0; i < 3; i++) {// ���Ƶ�¼����
	System.out.println("�������û�����");
	String u = input.next();// ���ڴ��������û���
	System.out.println("���������룺");
	String p = input.next();// ���ڴ�����������
	int k = 0;
	while ((k<n)&&(!uname[k].equals(u)||!pword[k].equals(p))) // ��������б�����Ѱ�ҷ��ϵ��û�
		k++;
	//System.out.println("k"+k);
	if (k <n)// �ҵ������������û�
	{
		System.out.println("��½�ɹ���");
		id = mid[k];
		System.out.println("��Ա��Ϊ��" + id);
		System.out.println("�Ƿ����[y/n]��");
		result=input.next();
		if(result.equals("y"))
			break;// ����switch����������
		else{
			System.out.println("ϵͳ�˳���ллʹ��");							
			return;
		}
	}
	if (i >= 2) {
		System.out.println("������½������");
		System.out.println("ϵͳ�˳���ллʹ��");	
		return;
	}
}}
	public static void check(){//�齱
		int m = 0;
		while (id!= ran[m] && m < 4)
				m++;
		if (m < n)
			System.out.println("��ϲ�н�");
		else
			System.out.println("��Ǹ���ٽ�����");
		System.out.println("���ε����˺���Ϊ");
		for (int j = 0; j < 5; j++) {
			System.out.println(ran[j]);

	}}
}
//