package ZongHe;

import java.util.Scanner;

/*综合练习
 * 有一个数列:8.4.2.1.23.344.12
 * 循环输出数列的值
 * 求数列中所有数值的和
 * 猜游戏:从键盘中任意输入一个数据,判断数列中是否包含此数
 */
public class LX1{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] nums={8,4,2,1,23,344,12};
		//总和
		int sum=0;
		//标识:记录用户是否猜对了数字 true:猜对了 false:没猜中
		boolean flag=false;
		
		//循环输出数列的值
		System.out.println("数列中的值为:");
		/*for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]+"\t");
		}*/
		for(int num:nums){
			System.out.println(num+"\t");
			sum+=num;
		}
			System.out.println("\n数列中的数值总和为:"+sum);
			//猜数
			System.out.println("您猜猜有哪个数字?");
			int guess=input.nextInt();
			for(int i=0;i<nums.length;i++){
			   if(nums[i]==guess){
				//猜对了,for循环就不用往后进行了
				flag=true;
				break;
			}
		}
			if(flag){
				System.out.println("恭喜 猜对了!");	
			}else{
				System.out.println("对不起 没猜中!");
				input.close();
			}
		}
	}

