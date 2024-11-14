package gg.jte.generated.ondemand;
public final class JteloginGenerated {
	public static final String JTE_NAME = "login.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,8,8,8,8,12,26,28,28,28,29,31,36,41,48,59,61,61,61,62,64,69,74,79,87,90,90,90,96,99,99,99,111,111,111,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\">\n\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title> ");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Login</title>\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n    <style>\n        ");
		jteOutput.writeContent("\n        .transition-opacity {\n            transition: opacity 0.5s ease-in-out;\n        }\n\n        .hidden {\n            display: none;\n        }\n    </style>\n</head>\n\n<body class=\"bg-gradient-to-r from-gray-800 via-slate-600 to-gray-900 font-mono min-h-screen flex items-center justify-center\">\n\n    <div class=\"w-10/12 max-w-4xl bg-slate-800 rounded-lg shadow-2xl flex\">\n        ");
		jteOutput.writeContent("\n        <div id=\"loginForm\" class=\"p-8 w-1/2 text-white transition-opacity\">\n            <h2 class=\"text-4xl font-bold text-center mb-6\">");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent("</h2>\n            ");
		jteOutput.writeContent("\n            <form method=\"post\" action=\"/login\" class=\"space-y-4\">\n                ");
		jteOutput.writeContent("\n                <div class=\"flex items-center border-b border-gray-600 py-2\">\n                    <i class=\"fas fa-user text-gray-400 mr-3\"></i>\n                    <input type=\"text\" name=\"username\" class=\"bg-transparent w-full placeholder-gray-400 text-gray-300 focus:outline-none\" placeholder=\"Username\" required>\n                </div>\n                ");
		jteOutput.writeContent("\n                <div class=\"flex items-center border-b border-gray-600 py-2\">\n                    <i class=\"fas fa-lock text-gray-400 mr-3\"></i>\n                    <input type=\"password\" name=\"password\" class=\"bg-transparent w-full placeholder-gray-400 text-gray-300 focus:outline-none\" placeholder=\"Password\" required>\n                </div>\n                ");
		jteOutput.writeContent("\n                <button class=\"w-full mt-6 py-3 bg-indigo-600 hover:bg-indigo-500 text-white font-semibold rounded-lg flex items-center justify-center space-x-2 transition duration-200\">\n                    <span>Log In Now</span>\n                    <i class=\"fas fa-chevron-right\"></i>\n                </button>\n            </form>\n\n            ");
		jteOutput.writeContent("\n            <div class=\"mt-8 text-center\">\n                <h3 class=\"text-sm text-gray-400 mb-4\">Or log in via</h3>\n                <div class=\"flex justify-center space-x-6\">\n                    <a href=\"#\" class=\"text-gray-400 hover:text-pink-500 text-2xl transition-colors\"><i class=\"fab fa-instagram\"></i></a>\n                    <a href=\"#\" class=\"text-gray-400 hover:text-blue-600 text-2xl transition-colors\"><i class=\"fab fa-facebook\"></i></a>\n                    <a href=\"#\" class=\"text-gray-400 hover:text-blue-400 text-2xl transition-colors\"><i class=\"fab fa-twitter\"></i></a>\n                </div>\n            </div>\n        </div>\n\n        ");
		jteOutput.writeContent("\n        <div id=\"registerForm\" class=\"p-8 w-1/2 text-white transition-opacity hidden\">\n            <h2 class=\"text-4xl font-bold text-center mb-6\">");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent("</h2>\n            ");
		jteOutput.writeContent("\n            <form method=\"post\" action=\"/register\" class=\"space-y-4\">\n                ");
		jteOutput.writeContent("\n                <div class=\"flex items-center border-b border-gray-600 py-2\">\n                    <i class=\"fas fa-envelope text-gray-400 mr-3\"></i>\n                    <input type=\"text\" name=\"name\" class=\"bg-transparent w-full placeholder-gray-400 text-gray-300 focus:outline-none\" placeholder=\"Name\" required>\n                </div>\n                ");
		jteOutput.writeContent("\n                <div class=\"flex items-center border-b border-gray-600 py-2\">\n                    <i class=\"fas fa-user text-gray-400 mr-3\"></i>\n                    <input type=\"text\" name=\"username\" class=\"bg-transparent w-full placeholder-gray-400 text-gray-300 focus:outline-none\" placeholder=\"Username\" required>\n                </div>\n                ");
		jteOutput.writeContent("\n                <div class=\"flex items-center border-b border-gray-600 py-2\">\n                    <i class=\"fas fa-lock text-gray-400 mr-3\"></i>\n                    <input type=\"password\" name=\"password\" class=\"bg-transparent w-full placeholder-gray-400 text-gray-300 focus:outline-none\" placeholder=\"Password\" required>\n                </div>\n                ");
		jteOutput.writeContent("\n                <button class=\"w-full mt-6 py-3 bg-green-600 hover:bg-green-500 text-white font-semibold rounded-lg flex items-center justify-center space-x-2 transition duration-200\">\n                    <span>Register Now</span>\n                    <i class=\"fas fa-user-plus\"></i>\n                </button>\n            </form>\n        </div>\n\n        ");
		jteOutput.writeContent("\n        <div id=\"registerPrompt\" class=\"p-8 w-1/2 flex flex-col justify-center items-center text-white border-l border-gray-700 transition-opacity\">\n            <h2 class=\"text-2xl font-semibold mb-4\">Don’t have an account?</h2>\n            <p class=\"text-gray-400 mb-8 text-center\">Register now to join ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" and enjoy exclusive content!</p>\n            <button onclick=\"toggleView()\" class=\"px-6 py-3 bg-green-500 hover:bg-green-400 text-white font-semibold rounded-lg transition duration-200\">\n                Register Now\n            </button>\n        </div>\n\n        ");
		jteOutput.writeContent("\n        <div id=\"loginPrompt\" class=\"p-8 w-1/2 flex flex-col justify-center items-center text-white border-l border-gray-700 transition-opacity hidden\">\n            <h2 class=\"text-2xl font-semibold mb-4\">Already have an account?</h2>\n            <p class=\"text-gray-400 mb-8 text-center\">Log in to access your account and continue exploring ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent("!</p>\n            <button onclick=\"toggleView()\" class=\"px-6 py-3 bg-indigo-500 hover:bg-indigo-400 text-white font-semibold rounded-lg transition duration-200\">\n                Log In\n            </button>\n        </div>\n    </div>\n\n    <script src=\"/asset/js/login-to-register.js\"></script>\n\n</body>\n\n</html>\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		render(jteOutput, jteHtmlInterceptor, WebName);
	}
}
