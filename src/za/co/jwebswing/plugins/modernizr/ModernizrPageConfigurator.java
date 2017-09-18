package za.co.jwebswing.plugins.modernizr;


import com.google.inject.Singleton;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

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
public class ModernizrPageConfigurator extends PageConfigurator
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
