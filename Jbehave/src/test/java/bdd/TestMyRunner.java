package bdd;

import net.serenitybdd.jbehave.SerenityStories;

public class TestMyRunner extends SerenityStories{

	@Override
	protected String getRootPackage() {
		return "step";
	}

}
