module com.jwebmp.plugins.modernizr {

	exports com.jwebmp.plugins.modernizr;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.google.guice;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.modernizr.ModernizrPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.modernizr.implementations.ModernizrExclusionsModule;

	opens com.jwebmp.plugins.modernizr to com.fasterxml.jackson.databind, com.jwebmp.core;
}
