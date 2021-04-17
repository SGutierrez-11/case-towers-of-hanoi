package ui;

import java.util.Scanner;

public class Main {
	private static int[] towers;
	private static int disks;
	
	public static final int TOWER_AMOUNT = 3;
	public static final int TOWER_1=0;
	public static final int TOWER_2=1;
	public static final int TOWER_3=2;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		towers = new int[TOWER_AMOUNT];
		
		while(m!=0) {
			disks = sc.nextInt();
			towers[TOWER_1] = disks;
			hanoi();
			System.out.println("");
			towers[TOWER_1]=0;
			towers[TOWER_2]=0;
			towers[TOWER_3]=0;
			m--;
		}
		
		sc.close();
	}
	
	public static void hanoi() {
		System.out.print(towers[TOWER_1]+" "+towers[TOWER_2]+" "+towers[TOWER_3]+ "\n");
		hanoi(disks, TOWER_1,TOWER_3,TOWER_2);
	}
	
	public static void hanoi(int k,int origin, int target, int aux) {
		if(k>0) {
			hanoi(k-1,origin,aux,target);
			moveDisks(origin, target);
			System.out.print(towers[TOWER_1]+" "+towers[TOWER_2]+" "+towers[TOWER_3]+ "\n");
			hanoi(k-1, aux, target, origin);
		}
			
	}
	
	public static void moveDisks(int origin, int target) {
		towers[origin] = towers[origin]-1;
		towers[target] = towers[target]+1;
	}
	
}
