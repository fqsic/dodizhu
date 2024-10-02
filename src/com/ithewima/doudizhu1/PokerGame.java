package com.ithewima.doudizhu1;


import java.util.ArrayList;
import java.util.Collections;


public class PokerGame {
	
	static ArrayList<String> list = new ArrayList<>();

	
	
	static {
		
		
		String[] color = {"♥","♦", "♠"," ♣"};
		String[] number= {"2"," A"," K"," Q"," J"," 10"," 9"," 8"," 7"," 6"," 5"," 4"," 3"};
		
		for(String c : color) {
			
			for(String n : number ) {
				
				list.add(c+n);
			}
			
		}
		
		list.add("小王");
		list.add("大王");
	}
	
	
	public PokerGame() {
		// TODO Auto-generated constructor stub
		Collections.shuffle(list);
	  
		ArrayList<String> lord =  new ArrayList<>();
		
		ArrayList<String> play1 = new ArrayList<>();
		
		ArrayList<String> play2=new ArrayList<>();
		
		ArrayList<String> play3 = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			
			String poker =list.get(i);
			
			if (i<=2) {
				
				lord.add(poker);
				continue;
				
			}
			
			if (i%3==0) {
				play1.add(poker);
				
			}else if (i%3==1) {
				play2.add(poker);
				
			}else {
				
				play3.add(poker);
				
			}
				
			}
		
		lookPoker("底牌", lord);
		lookPoker("玩家一", play1);
		lookPoker("玩家二", play2);
		lookPoker("玩家三", play3);
		
		}
		
	private void lookPoker(String name,ArrayList<String> list) {
		// TODO Auto-generated method stub
		System.out.print(name + ": ");
		
		for (String poker : list) {
			
			System.out.print(poker + " ");
			
		}
		
		System.out.println();

	}
	
	}
	
	

