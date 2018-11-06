import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.modernizr.ModernizrPageConfigurator;
import com.jwebmp.plugins.modernizr.implementations.ModernizrExclusionsModule;

module com.jwebmp.plugins.modernizr {

	exports com.jwebmp.plugins.modernizr;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.google.guice;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with ModernizrPageConfigurator;

	provides IGuiceScanJarExclusions with ModernizrExclusionsModule;
	provides IGuiceScanModuleExclusions with ModernizrExclusionsModule;

	opens com.jwebmp.plugins.modernizr to com.fasterxml.jackson.databind, com.jwebmp.core;
}
