
/**幸运抽奖
 * @author haoyujing
 */
package game;

import java.util.Random;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Lucky {
	static int id = -1;// 用于记录登陆用户的会员号		
	static int n = 0;//用于记录用户的个数
	static String[] uname = new String[10];// 用于记录用户名
	static String[] pword = new String[10];// 用于记录用户密码
	static int[] mid = new int[10];// 用于记录用户的会员号
	static int[] ran = new int[5];// 用于记录幸运号码
	static Random r=new Random();//生成随机数
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {// 生成五个幸运号码
			//ran[i] = (int) (Math.random() * 10);
			ran[i]=r.nextInt(1000);
		}
		while (true) {
			System.out.println("***********欢迎进入幸运抽奖系统************");
			System.out.println("            1.注册                                          ");
			System.out.println("            2.登陆                                          ");
			System.out.println("            3.抽奖                                          ");
			System.out.println("            4.退出                                          ");
			System.out.println("******************************************");
			System.out.println("请选择：");
			int ch;
			ch = input.nextInt();
			switch (ch) {
			case 1:// 注册
				login();
				break;
			case 2:// 登陆
				register();
				break;
			case 3:// 抽奖
				check();
				break;
			case 4://退出
			return;

			}

		}
	}
	public static void login(){//注册
		System.out.println("请输入用户名：");
		Scanner input=new Scanner(System.in);
		uname[n] = input.next();
		System.out.println("请输入密码：");
		pword[n] = input.next();
		System.out.println("注册成功！");
		System.out.print("会员号为：");
		//mid[n] = (int) (Math.random() * 10);
		mid[n]=r.nextInt(1000);
		System.out.println(mid[n]);
		n++;
		
	}
	public static void register(){//登录
		Scanner input = new Scanner(System.in);
String result;
for (int i = 0; i < 3; i++) {// 限制登录次数
	System.out.println("请输入用户名：");
	String u = input.next();// 用于存放输入的用户名
	System.out.println("请输入密码：");
	String p = input.next();// 用于存放输入的密码
	int k = 0;
	while ((k<n)&&(!uname[k].equals(u)||!pword[k].equals(p))) // 对数组进行遍历，寻找符合的用户
		k++;
	//System.out.println("k"+k);
	if (k <n)// 找到符合条件的用户
	{
		System.out.println("登陆成功！");
		id = mid[k];
		System.out.println("会员号为：" + id);
		System.out.println("是否继续[y/n]：");
		result=input.next();
		if(result.equals("y"))
			break;// 跳出switch进入主界面
		else{
			System.out.println("系统退出，谢谢使用");							
			return;
		}
	}
	if (i >= 2) {
		System.out.println("超出登陆次数！");
		System.out.println("系统退出，谢谢使用");	
		return;
	}
}}
	public static void check(){//抽奖
		int m = 0;
		while (id!= ran[m] && m < 4)
				m++;
		if (m < n)
			System.out.println("恭喜中奖");
		else
			System.out.println("抱歉，再接再厉");
		System.out.println("本次的幸运号码为");
		for (int j = 0; j < 5; j++) {
			System.out.println(ran[j]);

	}}
}
//