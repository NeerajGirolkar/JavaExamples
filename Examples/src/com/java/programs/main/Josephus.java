package com.java.programs.main;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
	public int execute(int people, int pass){
		int killId = 0;
		List<Integer> peopleList = new ArrayList<Integer>(people);
		for(int i = 1; i <= people; i++){
			peopleList.add(i);
		}
		
		System.out.println("Prisoners Executed in Order: ");
		while(peopleList.size() > 1){
			killId = (killId + pass - 1) % peopleList.size();
            System.out.print(peopleList.get(killId) + " ");
            peopleList.remove(killId);
		}
		System.out.println();
        return peopleList.get(0);
    }
 
    public static void main(String[] args){
        System.out.println("Survivor: " + new Josephus().execute(10, 3));
    }
}
