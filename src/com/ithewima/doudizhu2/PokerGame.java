package com.ithewima.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
	
	
   static	HashMap<Integer,String> hm = new HashMap<>();
	static ArrayList<Integer> list = new ArrayList<>();
	
	
		/*
		 * 1=♥2, 2=♥ A, 3=♥ K, 4=♥ Q, 5=♥ J, 6=♥ 10, 7=♥ 9, 8=♥ 8, 9=♥ 7, 10=♥ 6, 11=♥
		 * 5, 12=♥ 4, 13=♥ 3, 14=♦2, 15=♦ A, 16=♦ K, 17=♦ Q, 18=♦ J, 19=♦ 10, 20=♦ 9,
		 * 21=♦ 8, 22=♦ 7, 23=♦ 6, 24=♦ 5, 25=♦ 4, 26=♦ 3, 27=♠2, 28=♠ A, 29=♠ K, 30=♠
		 * Q, 31=♠ J, 32=♠ 10, 33=♠ 9, 34=♠ 8, 35=♠ 7, 36=♠ 6, 37=♠ 5, 38=♠ 4, 39=♠ 3,
		 * 40= ♣2, 41= ♣ A, 42= ♣ K, 43= ♣ Q, 44= ♣ J, 45= ♣ 10, 46= ♣ 9, 47= ♣ 8, 48= ♣
		 * 7, 49= ♣ 6, 50= ♣ 5, 51= ♣ 4, 52= ♣ 3, 53=小王, 54=大王
		 */

	static {
		
		
		String[] color = {"♥","♦", "♠"," ♣"};
		String[] number= {"2"," A"," K"," Q"," J"," 10"," 9"," 8"," 7"," 6"," 5"," 4"," 3"};
		
		int serialNumber = 1;
		
		for (String n : number) {
			
			
			
			for (String c : color) {
				
				
				hm.put(serialNumber, c+n);
				
				list.add(serialNumber);
				serialNumber++;
				
			}
			
		}
		hm.put(serialNumber, "小王");
		list.add(serialNumber);
		serialNumber++;
		hm.put(serialNumber, "大王");
		list.add(serialNumber);
		
		System.out.println(hm);
	}
	
	
	public  PokerGame() {
		Collections.shuffle(list);
		
		  
				TreeSet<Integer> lord =  new TreeSet<>();
				
				TreeSet<Integer> play1 = new TreeSet<>();
				
				TreeSet<Integer> play2=new TreeSet<>();
				
				TreeSet<Integer> play3 = new TreeSet<>();
				
				
				
				for (int i = 0; i < list.size(); i++) {
					
					int serialNumber = list.get(i); 
					
					if (i<=2) {
						
						lord.add(serialNumber);
						continue;
						
					}
					
					if (i%3==0) {
						play1.add(serialNumber);
						
					}else if (i%3==1) {
						play2.add(serialNumber);
						
					}else {
						
						play3.add(serialNumber);
						
					}
						
					}
				
				lookPoker("底牌", lord);
				lookPoker("玩家1", play1);
				lookPoker("玩家2", play2);
				lookPoker("玩家3", play3);
				
				}
public void lookPoker(String name,TreeSet<Integer> ts) {
	
	System.out.print(name + ": ");

for (Integer serialNumber : ts) {
	
	String poker = hm.get(serialNumber);
	System.out.print(poker + " ");
	
}
System.out.println();
}
	
	}
				
	
	

