package org.bootstrap.sos.example;

import org.porcupine.interfaces.IScriptEntity;

public class Placeholder implements IScriptEntity {
	@Override
	public String getName() {
		return "Placeholder";
	}

	@Override
	public String getDescription() {
		return "Placeholder";
	}

	@Override
	public void onInitializeEarly() {
		System.out.println("Placeholder initialized early.");
	}

	@Override
	public void onInitializeLate() {
		System.out.println("Placeholder initialized late.");
	}
}
