package gg.jte.generated.ondemand.include.modal;
public final class JtelogoutmodalGenerated {
	public static final String JTE_NAME = "include/modal/logout-modal.jte";
	public static final int[] JTE_LINE_INFO = {2,2,2,2,2,2,8,11,21,21,21,21,21,21};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<div id=\"logoutModal\" class=\"fixed inset-0 bg-gray-800 bg-opacity-50 flex items-center justify-center hidden z-30\">\n    <div class=\"bg-gray-50 rounded-lg shadow-card w-96 p-6 space-y-7\">\n        ");
		jteOutput.writeContent("\n        <div class=\"space-y-2\">\n            <h2 class=\"text-xl font-semibold text-black text-center\">Log out</h2>\n            <div class=\"w-full h-px bg-black opacity-20\"></div>\n        </div>\n\n        ");
		jteOutput.writeContent("\n        <p class=\"text-zinc-700 text-center\">Are you sure you want to log out?</p>\n\n        ");
		jteOutput.writeContent("\n        <div class=\"flex justify-between space-x-2\">\n            <button id=\"cancelButton\" class=\"text-zinc-700 text-center border border-black/20 hover:bg-white shadow-md hover:shadow-lg font-medium py-2 px-4 rounded-lg cursor-pointer w-full transition duration-300\">\n                Cancel\n            </button>\n            <a id=\"logoutButton\" href=\"/logout\" class=\"bg-red-500 hover:bg-red-600 text-center text-white shadow-md hover:shadow-lg font-medium py-2 px-4 rounded-lg cursor-pointer w-full transition duration-300\">\n                Log out\n            </a>\n        </div>\n    </div>\n</div>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
