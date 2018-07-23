import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.modernizr.ModernizrPageConfigurator;

module com.jwebmp.plugins.modernizr {

	exports com.jwebmp.plugins.modernizr;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.google.guice;

	provides IPageConfigurator with ModernizrPageConfigurator;

}
