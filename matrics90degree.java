package RCOE;

public class matrics90degree {

	
	public static void main(String args[]) {
		int[][] a= {{1,2,3,},{4,5,6},{7,8,9}};
		

		System.out.println("Question==>>>>");

		print(a);
//		System.out.println(a)
		
		
//		***transpose the matrix
		transpose(a);
		Reverse(a);
		
	}
	static void print(int[][] a) {
		for(int[] row:a) {
			for(int val: row) {
				System.out.print(val+" ");
				
			}
			System.out.println();
		}
	}
	static void transpose(int[][] a) {
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
				
			}
			
			
		 
	}
		System.out.println();
		System.out.println("Transposed Matrix");

		print(a);
		

		
	}
	
	static void Reverse(int[][] a) {
		
	
		int n=a.length;
		for(int i=0;i<n;i++) {
			int start=0;
			int n1=a.length;
			int end=n1-1;
			
			while(start<end) {
				int temp=a[i][start];
				a[i][start]=a[i][end];
				a[i][end]=temp;
				
				
				
	
				
			start++;
			end--;
			}

			
			
		}
		System.out.println();
		System.out.println("Rotated Matrix");


		print(a);

	}


}