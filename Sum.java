import java.util.Scanner;


public class Sum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[10];
		int[] b=new int[10];
		int i=0,sum=0;
		while(n>0){
			arr[i]=n%10;
			n=n/10;
			i++;
		}
		int k=0;
		for(int j=i-1;j>=0;j--){
			b[k]=arr[j];
			k++;
		}
		for(int j=0;j<i;j++){
			for(int l=0;l<=j;l++){
			sum=sum+b[l];
			}
			
		}
		System.out.println(sum);

	}

}
