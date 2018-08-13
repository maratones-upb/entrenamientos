//package maratones;

import java.util.Scanner;

public class horror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int n = sc.nextInt();
		int result =0;
		int parcial =0;
		int[] p1 = new int[n];		
		
		for (int i = 0; i < n; i++) {
			p1[i] = sc.nextInt();	
			
			if(p1[i] > max) {
				max =p1[i];
			}			
			if(p1[i] < min) {
				min =p1[i];
			}
			
		}
		
		int m = sc.nextInt();
		int[] p2 = new int[m];
		
		for (int i = 0; i < m; i++) {			
			p2[i] = sc.nextInt();	
			
			if(p2[i] > max) {
				max =p2[i];
			}			
			if(p2[i] < min) {
				min =p2[i];
			}
		}
		
		if(max != Integer.MIN_VALUE) {
			int compu[] = new int[max+1];
			
			for (int i = 0; i < n; i++) {
				compu[p1[i]] = 1;
			}
			
			for (int i = 0; i < m; i++) {
				if(compu[p2[i]] == 1) {
					compu[p2[i]] = 3;
				}
				else {
					compu[p2[i]] = 2;
				}
			}
			int ant = 0;
			for (int i = min; i <= max; i++) {
				//if(compu[i] != 0 && compu[i] == ant && compu[i] != 3 ){
					//if(parcial >  result) {
						//result = parcial;
						//parcial = 1;
					//}				
					
				//}
				if(compu[i] != 0 && (compu[i] != ant ||(ant == 3) )){
					result++;
					//if(compu[i] != 3) {
					ant = compu[i];
					//}
				}
				
			}
			
			//if(parcial >  result) {
				//result = parcial;				
			//}
			
			System.out.println(result);
		}
		else {
			
			System.out.println(result);
		}
		
		
		
		
	}

}
