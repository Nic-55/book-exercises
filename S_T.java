//输入学生数量,一桌能坐几个人,输出需要多少张桌子和剩下多少人

import java.util.Scanner;
public class S_T{
	
public static void main(String[]args)
{
Scanner keyboard = new Scanner(System.in);
int people,capacity,teamN,leftP;

System.out.println("How many students wish to join a study team?");
people = keyboard.nextInt();

System.out.println("Desired study team capacity:");
capacity = keyboard.nextInt();

teamN = people / capacity;
System.out.println(teamN + " teams will be formed.");

leftP = people % capacity;
System.out.println(leftP + " students will be left without a team.");

}

}