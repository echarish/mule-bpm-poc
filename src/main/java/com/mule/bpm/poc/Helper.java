package com.mule.bpm.poc;

import org.drools.spi.KnowledgeHelper;

public class Helper {

	public static void log(final KnowledgeHelper drools, final String message) {
		System.out.println(message);
		System.out.println("rule triggered: " + drools.getRule().getName());
		System.out.println(drools.getActivation().getFactHandles());
		System.out.println();
	}

}