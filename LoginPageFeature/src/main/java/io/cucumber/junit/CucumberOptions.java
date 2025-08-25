package io.cucumber.junit;

public @interface CucumberOptions {

	String features();

	String[] glue();

	String[] plugin();

	boolean monochrome();

}
