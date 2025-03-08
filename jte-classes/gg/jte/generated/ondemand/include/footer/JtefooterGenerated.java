package gg.jte.generated.ondemand.include.footer;
public final class JtefooterGenerated {
	public static final String JTE_NAME = "include/footer/footer.jte";
	public static final int[] JTE_LINE_INFO = {2,2,2,2,2,2,24,24,24,24,24,24};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<div class=\"text-black py-5 px-8\">\n    <div class=\"max-w-7xl mx-auto\">\n        ");
		jteOutput.writeContent("\n        <div class=\"flex space-y-4\">\n            <ul class=\"list-none text-center ml-[40%]\">\n                <li>\n                    <p class=\"text-2xl font-bold font-avenir\">Cinema Eudaemonia</p>\n                </li>\n                <li>\n                    <p class=\"italic\">\"That's the end of the show!\"</p>\n                </li>\n                <li>\n                    <i class=\"fas fa-film text-3xl\"></i>\n                </li>\n                <li class=\"text-xs\">Thank you for watching!</li>\n            </ul>\n\n            <div class=\"text-right text-sm ml-auto\">\n                <p class=\"mt-[19%]\">&copy; 2025 Cinema Eudaemonia. Made with ❤️<br> by <span class=\"font-bold\">Faris Satria</span>.</p>\n            </div>\n\n        </div>\n    </div>\n</div>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
