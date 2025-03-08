package gg.jte.generated.ondemand;
import com.movieonline.Online.Movie.entity.model.UserEntity;
import java.util.List;
public final class JtemovieplayerGenerated {
	public static final String JTE_NAME = "movie-player.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,3,3,3,14,14,14,14,17,20,23,29,31,33,41,49,59,61,61,66,66,69,69,70,70,71,71,73,73,73,73,74,74,76,76,77,77,78,78,100,107,108,108,112,112,112,3,4,5,6,7,7,7,7};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, Long userCount, String getUsername, UserEntity getCurrentUser, List<UserEntity> userList) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\" class=\"scroll-smooth\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Dashboard</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n\n    ");
		jteOutput.writeContent("\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li class=\"relative\">\n                    <a href=\"/movies/search\" id=\"searchIcon\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md\">\n                        <i id=\"searchIconSymbol\" class=\"fas fa-search text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n            </ul>\n\n            ");
		jteOutput.writeContent("\n            <div class=\"text-center w-full mt-auto relative\">\n                ");
		if (getCurrentUser != null || getCurrentUser.getIsAdmin() == true) {
			jteOutput.writeContent("\n                    <a href=\"/dashboard\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200 \">\n                        <i class=\"fas fa-desktop text-2xl\"></i>\n                    </a>\n                ");
		}
		jteOutput.writeContent("\n                <div class=\"w-full h-px bg-black opacity-20 mb-1\"></div>\n                <button id=\"userButton\" class=\"block size-8 drop-shadow-lg rounded-full focus:outline-none\">\n                    ");
		for (UserEntity user : userList) {
			jteOutput.writeContent("\n                        ");
			if (user.getUsername().equals(getUsername)) {
				jteOutput.writeContent("\n                            ");
				if (user.getProfilePicturePath() != null) {
					jteOutput.writeContent("\n                                <img rel=\"icon\" class=\"rounded-full mr-2 size-8 bg-gray-500 hover:drop-shadow-xl hover:scale-110 transition duration-200\"\n                                     src=\"/image/");
					jteOutput.setContext("img", "src");
					jteOutput.writeUserContent(user.getId());
					jteOutput.setContext("img", null);
					jteOutput.writeContent("\">\n                            ");
				} else {
					jteOutput.writeContent("\n                                <img rel=\"icon\" class=\"rounded-full mr-2 size-8 bg-gray-500 hover:drop-shadow-xl transition hover:scale-110 duration-200\" src=\"/image/icon/user-icon.png\">\n                            ");
				}
				jteOutput.writeContent("\n                        ");
			}
			jteOutput.writeContent("\n                    ");
		}
		jteOutput.writeContent("\n                </button>\n\n                <div id=\"userPanel\" class=\"absolute w-40 -left-1 -top-28 text-left bg-gray-50 rounded-lg shadow-md border border-gray-300 hidden\">\n                    <a href=\"/booking\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 rounded-t-lg cursor-pointer transition duration-300\">Booking</a>\n                    <a href=\"/account\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300\">Account</a>\n                    <div class=\"group\">\n                        <a id=\"openModal\" class=\"block px-4 py-2 text-zinc-700 group-hover:bg-red-600 group-hover:text-white border-t border-t-gray-300 cursor-pointer rounded-b-lg transition duration-300\">Logout</a>\n                        <div class=\"absolute group-hover:border-t-red-600 left-2 -bottom-4 w-0 h-0 border-l-[13px] border-r-[13px] border-l-transparent border-r-transparent border-t-[16px] border-t-gray-50 drop-shadow-md transition duration-300\"></div>\n                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n    <div class=\"flex-initial mt-8 space-y-5\" style=\"width:88vw;\">\n        <div class=\"w-full rounded-lg shadow-lg\">\n            <video class=\"w-full rounded-lg\" controls>\n                <source src=\"https://www.w3schools.com/html/mov_bbb.mp4\" type=\"video/mp4\">\n                Your browser does not support the video tag.\n            </video>\n        </div>\n\n        ");
		jteOutput.writeContent("\n        <div class=\"border-2 border-dashed w-full h-[18.8%] border-gray-300 bg-white shadow-md rounded-lg flex items-center justify-center\">\n            <p class=\"text-gray-500 font-medium\">Ads Placeholder</p>\n        </div>\n    </div>\n</div>\n\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.modal.JtelogoutmodalGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n<script src=\"/asset/js/navbar.js\"></script>\n<script src=\"/asset/js/modal.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		Long userCount = (Long)params.get("userCount");
		String getUsername = (String)params.get("getUsername");
		UserEntity getCurrentUser = (UserEntity)params.get("getCurrentUser");
		List<UserEntity> userList = (List<UserEntity>)params.get("userList");
		render(jteOutput, jteHtmlInterceptor, WebName, userCount, getUsername, getCurrentUser, userList);
	}
}
