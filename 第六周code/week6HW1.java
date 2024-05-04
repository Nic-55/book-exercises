public class week6HW1 {
	public static void main(String[] args) {
		//某人有100,000元,每经过一次路口都要缴费.规则如下
		//1.当现金》50000时,每次交5%
		//2.当现金《=50000时,每次交100
		//编程计算该人可以经过路口多少次.要求使用while break方法
/* 以下是我自己的code,也能实现但是不会用break
		double cash = 100000;
        double taxRate = 0.05;
        int lowFee = 1000;
        int timePassing = 1;
		while (cash > 50000){
			double taxPaid = taxRate * cash;
			cash = cash - taxPaid;
			System.out.println("路过第 " + timePassing + " 次.");
			System.out.println("本次缴费: " + taxPaid);
			System.out.println("余额为: " + cash);
			timePassing++;
		}
		while (cash <= 50000 && cash >= lowFee){
            cash = cash - lowFee;
            System.out.println("路过第 " + timePassing + " 次.");
			System.out.println("本次缴费: " + lowFee);
			System.out.println("余额为: " + cash);
			timePassing++;
			if (cash < lowFee) {
				System.out.println("余额不足,不能再通过.");
			}
		}
		System.out.println("共通过 " + timePassing + " 次."); */

		//教程给的方法
		double cash = 100000;
		int passTimes = 0;
		while(true) { //无限循环
			if(cash > 50000){
            cash *= 0.95;
            passTimes++;
		}
		    else if (cash >= 1000 && cash <= 50000){
		    	cash -= 1000;
		    	passTimes++;
		    }
		    else {
		    	break;
		    }
	}
	     System.out.println("共通过 " + passTimes + " 次.");
	}
}


