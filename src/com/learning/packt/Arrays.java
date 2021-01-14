package com.learning.packt;

import java.util.Comparator;

import com.learning.packt.models.MelonObject;

public class Arrays {

	public static void arrays() {
		MelonObject[] melonArray = new MelonObject[] { new MelonObject("Crenshaw", 2000), new MelonObject("Gac", 1200),
				new MelonObject("Bitter", 2200) };
		
		Comparator<MelonObject> bytype = Comparator.comparing(MelonObject::getType);
		
		System.out.println(bytype);
		
	}
}
