package practiceproject4;


public class LISS_PP3 {
		 public static void main(String[] args){

		 int[] numb = {0,1,5,3,2,13,7,33,5,55};
		 printLIS(numb);
		 }
			public static void printLIS(int[] numb){
			String[] paths = new String[numb.length];
			int[] size1 = new int[numb.length];

		for(int i=0; i<numb.length; i++){
			size1[i] = 1;
			paths[i] = numb[i] + " " ;
		}
		int maxLength = 1; 

		for(int i=1; i<numb.length; i++){ 
			for(int j=0; j<numb.length; j++){

		if(numb[i]>numb[j] && size1[i] < size1[j] + 1){;
			size1[i] = size1[j] + 1;
			paths[i] = paths[j] + numb[i] + " "; 
			if(maxLength < size1[i])
				maxLength = size1[i];
			}
		   }
		}
		
		  for(int i=1; i<numb.length; i++){
		    if(size1[i] == maxLength)
			System.out.println("Longest Increasing Subsequences : " + paths[i]);
		  }
		 }
		}


