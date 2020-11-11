package com.jwebmp.plugins.modernizr.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class ModernizrExclusionsModule
		implements IGuiceScanModuleExclusions<ModernizrExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.modernizr");
		return strings;
	}
}
