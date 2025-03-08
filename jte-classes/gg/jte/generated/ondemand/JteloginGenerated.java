package gg.jte.generated.ondemand;
public final class JteloginGenerated {
	public static final String JTE_NAME = "login.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,10,10,10,10,13,16,19,25,27,27,27,29,34,39,46,55,58,58,58,63,63,67,67,67,70,70,72,72,76,76,76,79,79,81,81,85,85,85,88,88,90,97,99,103,103,103,0,1,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, String invalidCredentials, String registrationSuccess, String deleteAccountSuccess) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Login</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n\n    ");
		jteOutput.writeContent("\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100 font-avenir min-h-screen flex items-center justify-center\">\n\n<div class=\"w-10/12 h-96 max-w-4xl bg-gray-50 rounded-lg shadow-card flex flex-row\">\n    ");
		jteOutput.writeContent("\n    <div id=\"loginForm\" class=\"p-8 w-full md:w-1/2 text-gray-900\">\n        <h2 class=\"text-4xl text-black font-bold text-center mb-6\">");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent("</h2>\n        <form class=\"space-y-4\" method=\"post\" action=\"/login\">\n            ");
		jteOutput.writeContent("\n            <div class=\"flex items-center border-b border-gray-400 py-2\">\n                <i class=\"fas fa-user text-gray-400 mr-3\"></i>\n                <input type=\"text\" name=\"username\" class=\"w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none\" placeholder=\"Username\" required>\n            </div>\n            ");
		jteOutput.writeContent("\n            <div class=\"flex items-center border-b border-gray-400 py-2\">\n                <i class=\"fas fa-lock text-gray-400 mr-3\"></i>\n                <input type=\"password\" name=\"password\" class=\"w-full bg-transparent placeholder-gray-400 text-gray-900 focus:outline-none\" placeholder=\"Password\" required>\n            </div>\n            ");
		jteOutput.writeContent("\n            <button class=\"w-full mt-6 py-3 bg-sky-500 shadow-card hover:bg-sky-400 text-white font-semibold rounded-lg flex items-center justify-center space-x-2 transition\">\n                <span>Log In Now</span>\n                <i class=\"fas fa-chevron-right\"></i>\n            </button>\n        </form>\n\n        ");
		jteOutput.writeContent("\n        <div class=\"mt-8 text-center\">\n            <h3 class=\"text-sm text-gray-500 mb-4\">Or enter as a Guest</h3>\n            <div class=\"flex justify-center space-x-6\">\n                <a href=\"/\" class=\"text-gray-500 hover:text-yellow-500 hover:rotate-12 hover:scale-125 hover:drop-shadow-md text-2xl transition\"><i class=\"fas fa-home\"></i></a>\n            </div>\n        </div>\n    </div>\n\n    ");
		jteOutput.writeContent("\n    <div id=\"registerPrompt\" class=\"p-8 w-full md:w-1/2 flex flex-col justify-center items-center text-gray-900 border-t md:border-t-0 md:border-l border-gray-400\">\n        <h2 class=\"text-2xl text-black font-semibold mb-4\">Don’t have an account?</h2>\n        <p class=\"text-gray-400 mb-8 text-center\">Register now to join ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" and enjoy exclusive content!</p>\n        <a href=\"/register\" class=\"px-6 py-3 bg-green-500 hover:bg-green-600 text-white font-semibold rounded-lg transition shadow-card\">Register Now</a>\n    </div>\n</div>\n\n");
		if (invalidCredentials != null) {
			jteOutput.writeContent("\n    <div id=\"error-message\" class=\"drop-shadow-md fixed top-5\">\n        <div class=\"bg-red-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center\">Warning!</div>\n        <div class=\"bg-white p-5 rounded-br-lg rounded-bl-lg\">\n            <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(invalidCredentials);
			jteOutput.writeContent("</p>\n        </div>\n    </div>\n");
		}
		jteOutput.writeContent("\n\n");
		if (deleteAccountSuccess != null) {
			jteOutput.writeContent("\n    <div id=\"success-message-registration-valid\" class=\"drop-shadow-md absolute top-5 left-[45vw]\">\n        <div class=\"bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center\">Success!</div>\n        <div class=\"bg-white p-5 rounded-br-lg rounded-bl-lg\">\n            <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(registrationSuccess);
			jteOutput.writeContent("</p>\n        </div>\n    </div>\n");
		}
		jteOutput.writeContent("\n\n");
		if (registrationSuccess != null) {
			jteOutput.writeContent("\n    <div id=\"success-message-registration-valid\" class=\"drop-shadow-md absolute top-5 left-[42.5vw]\">\n        <div class=\"bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center\">Success!</div>\n        <div class=\"bg-white p-5 rounded-br-lg rounded-bl-lg\">\n            <p>");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(registrationSuccess);
			jteOutput.writeContent("</p>\n        </div>\n    </div>\n");
		}
		jteOutput.writeContent("\n\n");
		jteOutput.writeContent("\n<div id=\"success-message-update-valid\" class=\"drop-shadow-md absolute top-5 left-[39vw]\">\n    <div class=\"bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center\">Success!</div>\n    <div class=\"bg-white p-5 rounded-br-lg rounded-bl-lg\">\n        <p>Account has been successfully deleted!</p>\n    </div>\n</div>\n");
		jteOutput.writeContent("\n\n");
		jteOutput.writeContent("\n<script src=\"/asset/js/error-message.js\"></script>\n</body>\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		String invalidCredentials = (String)params.get("invalidCredentials");
		String registrationSuccess = (String)params.get("registrationSuccess");
		String deleteAccountSuccess = (String)params.get("deleteAccountSuccess");
		render(jteOutput, jteHtmlInterceptor, WebName, invalidCredentials, registrationSuccess, deleteAccountSuccess);
	}
}
