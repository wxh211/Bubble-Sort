class Sort{
	public static void main(String[] args){
		int input[] = {-9,1,2,-10,22,87,44,33,-77};
		sort(input);
	}

	public static void sort(int[] input){
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input.length;j++){
				if(input[i] < input[j]){
					// 交换 input[i] input[j]
					int x;
					x=input[j];
					input[j]=input[i];
					input[i]=x;
				}
			}
			
		}

		for(int i=0; i < input.length; i++){
			System.out.println(input[i]);
		}
	}
	
} 