/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.modernizr;

import com.google.inject.Singleton;
import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

@PluginInformation(pluginName = "Modernizr",
        pluginUniqueName = "modernizr",
        pluginDescription = "Provides information about the browser/device capabilities",
        pluginVersion = "1.0",
        pluginDependancyUniqueIDs = "jquery",
        pluginCategories = "jwebmp, modernizr",
        pluginSubtitle = "Device Capability Detection",
        pluginGitUrl = "https://modernizr.com/",
        pluginSourceUrl = "https://github.com/GedMarc/JWebMP-Modernizr",
        pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Modernizr/wiki",
        pluginOriginalHomepage = "https://modernizr.com/",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.javascript/jwebmp-modernizr",
        pluginIconUrl = "https://modernizr.com/img/logo.svg",
        pluginIconImageUrl = "https://modernizr.com/img/logo.svg",
        pluginLastUpdatedDate = "2017/08/28",
        pluginGroupId = "com.jwebmp.plugins.javascript",
        pluginArtifactId = "jwebmp-modernizr",
        pluginModuleName = "com.jwebmp.plugins.modernizr",
        pluginStatus = PluginStatus.Released
)
@Singleton
public class ModernizrPageConfigurator
        implements IPageConfigurator<ModernizrPageConfigurator>
{
    /**
     * If this configurator is enabled
     */
    private static boolean enabled = true;

    /**
     * Configures the page for this component
     */
    public ModernizrPageConfigurator()
    {
        //Nothing Needed
    }

    /**
     * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
     */
    public static boolean isEnabled()
    {
        return ModernizrPageConfigurator.enabled;
    }

    /**
     * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
     */
    public static void setEnabled(boolean mustEnable)
    {
        ModernizrPageConfigurator.enabled = mustEnable;
    }

    @NotNull
    @Override
    public IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return ModernizrPageConfigurator.enabled;
    }
}
