package nl.topicus.wqplot.components.plugins;

/**
 * @author Ernesto Reinaldo Barreiro
 */
public class JQPlotCanvasAxisTickRenderer extends Renderer
{
	private static final JQPlotCanvasAxisTickRenderer INSTANCE = new JQPlotCanvasAxisTickRenderer();

	private JQPlotCanvasAxisTickRenderer()
	{
		super("$.jqplot.CanvasAxisTickRenderer", JQPlotCanvasAxisTickRendererResourceReference
			.get());
	}

	public static JQPlotCanvasAxisTickRenderer get()
	{
		return INSTANCE;
	}
}
