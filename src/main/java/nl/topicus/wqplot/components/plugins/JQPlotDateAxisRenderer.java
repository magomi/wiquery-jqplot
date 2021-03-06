package nl.topicus.wqplot.components.plugins;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class JQPlotDateAxisRenderer extends Renderer
{

	private static final JQPlotDateAxisRenderer INSTANCE = new JQPlotDateAxisRenderer();

	private JQPlotDateAxisRenderer()
	{
		super("$.jqplot.DateAxisRenderer", JQPlotDateAxisRendererResourceReference.get());
	}

	public static JQPlotDateAxisRenderer get()
	{
		return INSTANCE;
	}
}
