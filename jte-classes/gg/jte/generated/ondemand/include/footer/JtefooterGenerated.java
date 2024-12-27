package gg.jte.generated.ondemand.include.footer;
public final class JtefooterGenerated {
	public static final String JTE_NAME = "include/footer/footer.jte";
	public static final int[] JTE_LINE_INFO = {5,5,5,5,5,5,5,5,5,5,5};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<div class=\"p-5 text-center text-lg\">\n    <ul>\n        <li><p class=\"font-avenir\">That's the end of the show!</p></li>\n        <li><i class=\"fas fa-film\"></i></li>\n    </ul>\n</div>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
