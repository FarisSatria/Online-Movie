package gg.jte.generated.ondemand;
import java.util.List;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.model.UserEntity;
public final class JtesearchpageGenerated {
	public static final String JTE_NAME = "search-page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,15,15,15,15,18,21,24,30,32,34,42,59,59,60,64,64,65,65,66,66,68,68,68,68,69,69,71,71,72,72,73,73,85,85,86,93,93,97,113,119,120,120,121,126,126,126,4,5,6,7,8,8,8,8};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, String getUsername, Boolean isLoggedIn, List<MovieDTO> searchMovies, List<UserEntity> userList) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\" class=\"scroll-smooth\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Search</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n\n    ");
		jteOutput.writeContent("\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100 font-avenir min-h-screen\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 drop-shadow-md hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                <li class=\"relative\">\n                    <a href=\"#\" id=\"searchIcon\"\n                       class=\"block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md\">\n                        <i id=\"searchIconSymbol\" class=\"fas fa-search text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n            </ul>\n\n            ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                <div class=\"text-center w-full mt-auto relative\">\n                    <div class=\"w-full h-px bg-black opacity-20 mb-1\"></div>\n                    <button id=\"userButton\" class=\"block size-8 drop-shadow-lg rounded-full focus:outline-none\">\n                        ");
			for (UserEntity user : userList) {
				jteOutput.writeContent("\n                            ");
				if (user.getUsername().equals(getUsername)) {
					jteOutput.writeContent("\n                                ");
					if (user.getProfilePicturePath() != null) {
						jteOutput.writeContent("\n                                    <img rel=\"icon\" class=\"rounded-full mr-2 bg-gray-500 hover:drop-shadow-xl transition duration-200\"\n                                         src=\"/image/icon/");
						jteOutput.setContext("img", "src");
						jteOutput.writeUserContent(user.getProfilePicturePath());
						jteOutput.setContext("img", null);
						jteOutput.writeContent(".png\">\n                                ");
					} else {
						jteOutput.writeContent("\n                                    <img rel=\"icon\" class=\"rounded-full mr-2 bg-gray-500 hover:drop-shadow-xl transition duration-200\" src=\"/image/icon/user-icon.png\">\n                                ");
					}
					jteOutput.writeContent("\n                            ");
				}
				jteOutput.writeContent("\n                        ");
			}
			jteOutput.writeContent("\n                    </button>\n\n                    <div id=\"userPanel\" class=\"absolute w-40 -left-1 -top-36 text-left bg-gray-50 rounded-lg shadow-md border border-gray-300 hidden\">\n                        <a href=\"\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 rounded-t-lg cursor-pointer transition duration-300\">Booking</a>\n                        <a href=\"\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300\">Account</a>\n                        <div class=\"group\">\n                            <a id=\"openModal\" class=\"block px-4 py-2 text-zinc-700 group-hover:bg-red-600 group-hover:text-white border-t border-t-gray-300 cursor-pointer rounded-b-lg transition duration-300\">Logout</a>\n                            <div class=\"absolute group-hover:border-t-red-600 left-2 -bottom-4 w-0 h-0 border-l-[13px] border-r-[13px] border-l-transparent border-r-transparent border-t-[16px] border-t-gray-50 drop-shadow-md transition duration-300\"></div>\n                        </div>\n                    </div>\n                </div>\n            ");
		} else {
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                <div class=\"text-center mt-auto\">\n                    <a href=\"/login\"\n                       class=\"block text-green-500  hover:text-green-400 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-md transition duration-200\">\n                        <i class=\"fas fa-sign-in-alt text-2xl\"></i>\n                    </a>\n                </div>\n            ");
		}
		jteOutput.writeContent("\n        </div>\n    </div>\n    <div class=\"flex-initial mt-8\" style=\"width:87.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div id=\"searchBar\" class=\"overflow-hidden shadow-inner-lg bg-gray-50 rounded-lg pt-3\" style=\"top:width:87.6vw; height:92vh;\">\n            <form id=\"searchForm\" class=\"flex mt-2 border-yellow-400 border-l-4 pl-2 mx-auto w-2/5\" method=\"get\">\n                <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Search...\" class=\"p-2 border border-gray-300 w-full rounded-md focus:outline-none\"/>\n                <div class=\"ml-3 mt-1 w-8\">\n                    <button type=\"button\" id=\"searchButton\" class=\"hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md hover:drop-shadow-lg\">\n                        <i class=\"fas fa-search text-sky-400 hover:text-yellow-500 text-2xl\"></i>\n                    </button>\n                    <button type=\"reset\" id=\"resetButton\" class=\"hidden hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md hover:drop-shadow-lg\">\n                        <i class=\"fas fa-times text-red-600 hover:text-red-700 text-2xl\"></i>\n                    </button>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </div>\n            </form>\n            <div class=\" overflow-scroll p-4 h-full\" style=\"height: calc(91vh - 5rem);\">\n                <div id=\"movieResults\"  class=\"space-y-4\">\n                    ");
		jteOutput.writeContent("\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.modal.JtelogoutmodalGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n<script src=\"/asset/js/AJAX-handler.js\"></script>\n<script src=\"/asset/js/navbar.js\"></script>\n<script src=\"/asset/js/modal.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		String getUsername = (String)params.get("getUsername");
		Boolean isLoggedIn = (Boolean)params.get("isLoggedIn");
		List<MovieDTO> searchMovies = (List<MovieDTO>)params.get("searchMovies");
		List<UserEntity> userList = (List<UserEntity>)params.get("userList");
		render(jteOutput, jteHtmlInterceptor, WebName, getUsername, isLoggedIn, searchMovies, userList);
	}
}
