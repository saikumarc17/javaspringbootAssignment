package assignment1Patterns;

public class iNeuron {

	public static void main(String[] args) {
	//iNeuron	
		int n=9;
		//letter i		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0|| i==n-1|| j==(n-1)/2 ) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
			
			
		}
		
		// letter N
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0|| j==n-1|| i==j ) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		//letter E
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0|| i==0|| i==(n-1)/2 || i==(n-1)) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		//letter U
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( i==n-1 && j>0 && j<n-1 || i>0 && i<n-1 && (j<1 || j==n-1)  ) {
				System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		//		letter r
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i==0 && j<n-1 || i==(n-1)/2  && j<n-1 ||  i>0 && i<(n-1)/2 && j==n-1 || i>(n-1)/2 && i==j )   {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
//		letter O
		System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( (i==0 || i==n-1 )&& j>0 && j<n-1 || i>0 && i<n-1 && (j<1 || j==n-1) )   {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		// letter N
				System.out.println();
				
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(j==0|| j==n-1|| i==j ) {
						System.out.print("* ");
						}else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				
		
	}

}
