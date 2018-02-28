package day1;

public class Test1 {

	public static void main(String[] args) {
		data();
		array();
	}

	public static void data(){
		int[]a={10,20,30};
		int[]b=new int[a.length];
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
			System.out.println(b[i]);
		}
	}
	
	
	public static void array(){
		int data[][]={
				{3,4,5},
				{7,8,9},
				{0,1,2}
		};
		for(int i=0;i<data.length;i++){  //输出行
			for(int j=0;j<data[i].length;j++){ //输出列
				System.out.println(data[i][j]);
			}
		}
	}
	
}
