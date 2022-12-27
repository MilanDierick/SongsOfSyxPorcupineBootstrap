package org.bootstrap.sos.example;

import org.porcupine.interfaces.IScriptEntity;
import org.porcupine.utilities.Logger;

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
		Logger.info("Placeholder initialized early.");
	}

	@Override
	public void onInitializeLate() {
		Logger.info("Placeholder initialized late.");
	}
}
