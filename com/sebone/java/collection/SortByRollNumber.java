package com.sebone.java.collection;

import java.util.Comparator;

public class SortByRollNumber implements Comparator<UserData> {
	public int compare(UserData o1, UserData o2) {
		// TODO Auto-generated method stub
		return o1.getRollNumber()-o2.getRollNumber();
	}
}
