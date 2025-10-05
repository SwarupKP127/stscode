package com.javatechie.test;

import java.util.ArrayList;
import java.util.List;

public class FinalKeywordList {

	 private final List<String> names = new ArrayList<>();

	    public void addName(String name) {
	        names.add(name);  // ✅ Allowed
	    }

	    public void changeList() {
	        // names = new ArrayList<>(); ❌ Not allowed — final variable can't be reassigned
	    }

	    public List<String> getNames() {
	        return names;
	    }

}
