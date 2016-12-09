import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入日期：");
		String str = scanner.nextLine();
		int year = Integer.parseInt(str.substring(0, 4));
		int month = Integer.parseInt(str.substring(5, 7));
		int day = Integer.parseInt(str.substring(8,10));
		int num = 0;
		switch(month){
		case 12:num+=day;
		case 11:if(month>11)num+=30;
				else num+=day;
		case 10:if(month>10)num+=31;
				else num+=day;
		case 9:if(month>9)num+=30;
				else num+=day;
		case 8:if(month>8)num+=31;
				else num+=day;
		case 7:if(month>7)num+=31;
				else num+=day;
		case 6:if(month>6)num+=30;
				else num+=day;
		case 5:if(month>5)num+=31;
				else num+=day;
		case 4:if(month>4)num+=30;
				else num+=day;
		case 3:if(month>3)num+=31;
				else num+=day;
		case 2:if(month>2){
					if(year%100==0){
						if(year%400==0)num+=29;
						else num+=28;
					}else if(year%4==0){
						num+=29;
					}else num+=28;
				}else num+=day;
		case 1:if(month>1)num+=31;
				else num+=day;
		}
		System.out.println("你输入的日期为当年的第"+num+"天");
	}

}
