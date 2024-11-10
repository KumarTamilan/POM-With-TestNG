package org.pom.testRunner;

public class Arrayss {
	public static void main(String [] args) {
		int [] a = {23,34,45,56,67,78,89,98,87,67,76,65,54,43};
			System.out.println("A length");
			System.out.println(a.length);
			System.out.println("=================================");
			System.out.println("A Total Index");
			System.out.println(a.length-1);

//		System.out.println();
//		System.out.println("=============================");
//		System.out.println("A All Data Using For Loop");
//		for(int i=0; i<=a.length-1; i++){  
//			System.out.println(a[i]); 

		System.out.println("=====================");
		System.out.println("A All Data Using ForEach");
		for(int aa : a){
			System.out.println(aa);
}
		System.out.println("=======================");
		System.out.println("A Reverse");
		for(int i=a.length-1; i>=0; i--){
			System.out.println(a[i]);
}
		System.out.println("========================");

		int [] [] b = {{126,23,34,4365,576,67,7388,89,9890,1700},
					{22,333,4894,55,666,777,898,949},
					{2381,332,463,574,685},
					{881,663,518,451,844,846,544,332},
					{630,750,4683,219},
					{2493,4644,768},
					{23,456,687,899,4003},
					{2432,3551,449,3775,5685,7985,8988,64},
					{760,172,844,256,5641,869,382},
					{9802,676,538,493,2571,496,504,655}
					};
			System.out.println("B Total Length");
			System.out.println(b.length);
			System.out.println("=====================");
			System.out.println("B Total Index");
			System.out.println(b[6].length);

//			System.out.println("========================");
//			System.out.println("B All Data Using For Loop");
//			for(int i=0; i<=b.length-1; i++){
//				for(int j=0; j<=b[i].length-1; j++){
//					System.out.print("|"+b[i][j]+"|");
//}
//				System.out.println();
//}
			
			System.out.println("=============================");
			System.out.println("B All Data Using For Each Loop");
			for(int bb[] : b){
				for(int cc : bb){
					System.out.print("|"+cc+"|");
}
				System.out.println();
}
			System.out.println("===============================");

		int [] c = {122,122,233,233,344,344,455,455,566,566,677,677,788,899};

		System.out.println("C Total  Duplicate");
		for(int i=0; i<=c.length-1; i++){
			for(int j=i+1; j<c.length-1; j++){
				if(c[i]==c[j]){
					System.out.println(c[i]);
}
}
}
		System.out.println("=====================================");
		System.out.println("C Duplicate Count");
		int count=0;	
		for(int i=0; i<=c.length-1; i++){
			for(int j=i+1; j<c.length-1; j++){
				if(c[i]==c[j]){
					count++;
}
}
}
		System.out.println(count);
		System.out.println("=======================");
		System.out.println("Print The MIssing Number : ");

		int [] d = {1234,1235,1236,1238,1239};

		int sum1=0;
		for(int i=0; i<=d.length-1; i++){
			sum1=sum1+d[i];
}
		int sum2=0;
		for(int i=1234; i<=1239; i++){
			sum2 = sum2+i;
}
		int sum=0;
		sum=sum2-sum1;

		System.out.println(sum);

//		System.out.println("=================================");
//
//		System.out.println("Find The Highest Number : ");
//		int max=0;
//		for(int i=0; i<=d.length-1; i++){
//			if(d[i]>max){
//			max=d[i];
//}
//}
//		System.out.println(max);
//
//		System.out.println("================================");
//		System.out.println("Find The 1236 Index position");
//
//		for(int i=0; i<=d.length-1; i++){
//			if(d[i]==1236){
//				System.out.println(i);
//}
//}
//
//		System.out.println("================================");
//		System.out.println("Overcome The Similar DataType ");
//
//		Object e [] = {1233,2144,13244,2134545326532L,2145432.243f,134415,'S',true,"Selenium"};
//
//		for(Object aa : e){
//			System.out.println(aa);
//}




			
		
}
}