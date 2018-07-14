/*
 * Copyright (C) 2017 Marc Magon
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
import com.jwebmp.Page;
import com.jwebmp.PageConfigurator;
import com.jwebmp.plugins.PluginInformation;

@PluginInformation(pluginName = "JQuery UI Date Time Picker",
		pluginUniqueName = "jqueryui-datetime-picker",
		pluginDescription = "A nice JQuery UI Date Time Picker complete with theme roller capabilities",
		pluginVersion = "2.4.7",
		pluginDependancyUniqueIDs = "jquery-ui,jquery",
		pluginCategories = "Date Time Picker, JQuery UI, Drop Down",
		pluginSubtitle = "Date and Time for JQuery UI",
		pluginGitUrl = "https://github.com/xdan/datetimepicker.git",
		pluginSourceUrl = "https://github.com/GedMarc/JQueryUIDateTimePicker",
		pluginWikiUrl = "https://github.com/GedMarc/BlankComponentPageConfigurator/wiki",
		pluginOriginalHomepage = "https://github.com/xdan/datetimepicker",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQueryUIDateTimePicker.jar/download",
		pluginIconUrl = "jqueryuidatetimepicker.png",
		pluginIconImageUrl = "jqueryuidatetimepicker.png",
		pluginLastUpdatedDate = "2017/08/28"
)
@Singleton
public class ModernizrPageConfigurator
		extends PageConfigurator
{
	/**
	 * Configures the page for this component
	 */
	public ModernizrPageConfigurator()
	{
		//Nothing Needed
	}

	@Override
	public Page configure(Page page)
	{
		return page;
	}
}