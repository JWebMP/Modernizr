module com.jwebmp.plugins.modernizr {

	exports com.jwebmp.plugins.modernizr;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.google.guice;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.modernizr.ModernizrPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.modernizr.implementations.ModernizrExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.modernizr.implementations.ModernizrExclusionsModule;

	opens com.jwebmp.plugins.modernizr to com.fasterxml.jackson.databind, com.jwebmp.core;
}
