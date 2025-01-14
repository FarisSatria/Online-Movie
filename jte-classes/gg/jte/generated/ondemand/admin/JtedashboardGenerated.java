package gg.jte.generated.ondemand.admin;
import com.movieonline.Online.Movie.entity.model.UserEntity;
import java.util.List;
import java.util.Optional;
public final class JtedashboardGenerated {
	public static final String JTE_NAME = "admin/dashboard.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,4,4,4,16,16,16,16,19,22,25,31,33,35,43,51,59,69,73,73,74,74,75,75,77,77,77,77,78,78,80,80,81,81,82,82,97,103,103,103,107,107,107,116,122,128,161,161,163,163,163,164,164,164,165,165,165,166,166,166,167,167,169,169,171,171,177,177,178,178,180,180,180,181,181,181,182,182,182,183,183,183,184,184,186,186,188,188,191,191,191,191,194,194,195,195,203,204,204,205,206,206,207,211,211,211,4,5,6,7,8,9,9,9,9};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, Long adminCount, Long userCount, String getUsername, List<UserEntity> userList, Optional<UserEntity> searchedUser) {
		jteOutput.writeContent("\n<!doctype html>\n<html lang=\"en\" class=\"scroll-smooth\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Dashboard</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n\n    ");
		jteOutput.writeContent("\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body>\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-sky-400 hover:text-yellow-400 drop-shadow-md hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#movies\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#booking\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-book text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/dashboard/users\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-users text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n            </ul>\n\n            ");
		jteOutput.writeContent("\n            <div class=\"text-center w-full mt-auto relative\">\n                <div class=\"w-full h-px bg-black opacity-20 mb-1\"></div>\n                <button id=\"userButton\" class=\"block size-8 drop-shadow-lg rounded-full focus:outline-none\">\n                    ");
		for (UserEntity user : userList) {
			jteOutput.writeContent("\n                        ");
			if (user.getUsername().equals(getUsername)) {
				jteOutput.writeContent("\n                            ");
				if (user.getProfilePicturePath() != null) {
					jteOutput.writeContent("\n                                <img rel=\"icon\" class=\"rounded-full mr-2 bg-gray-500 hover:drop-shadow-xl transition duration-200\"\n                                     src=\"/image/icon/");
					jteOutput.setContext("img", "src");
					jteOutput.writeUserContent(user.getProfilePicturePath());
					jteOutput.setContext("img", null);
					jteOutput.writeContent(".png\">\n                            ");
				} else {
					jteOutput.writeContent("\n                                <img rel=\"icon\" class=\"rounded-full mr-2 bg-gray-500 hover:drop-shadow-xl transition duration-200\" src=\"/image/icon/user-icon.png\">\n                            ");
				}
				jteOutput.writeContent("\n                        ");
			}
			jteOutput.writeContent("\n                    ");
		}
		jteOutput.writeContent("\n                </button>\n\n                <div id=\"userPanel\" class=\"absolute w-40 -left-1 -top-36 text-left bg-gray-50 rounded-lg shadow-md border border-gray-300 hidden\">\n                    <a href=\"\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 rounded-t-lg cursor-pointer transition duration-300\">Booking</a>\n                    <a href=\"\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300\">Account</a>\n                    <div class=\"group\">\n                        <a id=\"openModal\" class=\"block px-4 py-2 text-zinc-700 group-hover:bg-red-600 group-hover:text-white border-t border-t-gray-300 cursor-pointer rounded-b-lg transition duration-300\">Logout</a>\n                        <div class=\"absolute group-hover:border-t-red-600 left-2 -bottom-4 w-0 h-0 border-l-[13px] border-r-[13px] border-l-transparent border-r-transparent border-t-[16px] border-t-gray-50 drop-shadow-md transition duration-300\"></div>\n                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n    <div class=\"flex-initial mt-8\" style=\"width:87.5vw;\">\n        ");
		jteOutput.writeContent("\n        <section id=\"home\" class=\"mb-6\">\n            <h1 class=\"text-2xl font-semibold mb-4\">Dashboard Overview</h1>\n            <div class=\"grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-4\">\n                <div class=\"bg-gray-50 rounded-lg shadow-md p-4 text-center\">\n                    <h2 class=\"text-gray-700 font-medium\">Users</h2>\n                    <p class=\"text-blue-600 text-2xl font-bold\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(userCount);
		jteOutput.writeContent("</p>\n                </div>\n                <div class=\"bg-gray-50 rounded-lg shadow-md p-4 text-center\">\n                    <h2 class=\"text-gray-700 font-medium\">Admins</h2>\n                    <p class=\"text-green-600 text-2xl font-bold\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(adminCount);
		jteOutput.writeContent("</p>\n                </div>\n                <div class=\"bg-gray-50 rounded-lg shadow-md p-4 text-center\">\n                    <h2 class=\"text-gray-700 font-medium\">Total Movies</h2>\n                    <p class=\"text-purple-600 text-2xl font-bold\">892</p>\n                </div>\n            </div>\n        </section>\n\n        ");
		jteOutput.writeContent("\n        <section id=\"movies\" class=\"mb-6 scroll-mt-12\">\n            <h1 class=\"text-2xl font-semibold mb-4\">Movies Management</h1>\n            <p class=\"text-gray-700\">This is the movies management section.</p>\n        </section>\n\n        ");
		jteOutput.writeContent("\n        <section id=\"booking\" class=\"mb-6 scroll-mt-12\">\n            <h1 class=\"text-2xl font-semibold mb-4\">Booking Management</h1>\n            <p class=\"text-gray-700\">This is the booking management section.</p>\n        </section>\n\n        ");
		jteOutput.writeContent("\n        <section id=\"user\" class=\"mb-6 scroll-mt-12\">\n            <div class=\"flex mb-4\">\n                <h1 class=\"text-2xl font-semibold\">User Management</h1>\n                <div class=\"ml-auto flex\">\n                    <form action=\"/api/search/user\" method=\"get\">\n                        <input type=\"text\" name=\"username\" placeholder=\"Search here...\"\n                               class=\"px-4 py-2 text-gray-800 shadow-inner-lg rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-400\"/>\n                        <button type=\"submit\"\n                                class=\"bg-sky-500 hover:bg-sky-400 transition duration-300 rounded-full p-2 px-3 shadow-card text-white\">\n                            Search\n                        </button>\n                    </form>\n                    <button type=\"submit\"\n                            class=\"bg-green-500 hover:bg-green-400 transition duration-300 rounded-full p-2 px-3 ml-2 shadow-card text-white\">\n                        Submit\n                    </button>\n                </div>\n            </div>\n            <div>\n                <table class=\"min-w-full table-auto bg-gray-50 shadow-inner-lg rounded-lg overflow-hidden\">\n                    <thead>\n                    <tr class=\"w-full bg-gradient-to-r from-sky-400 to-blue-500 shadow-md border-b border-gray-300\">\n                        <th class=\"py-3 px-6 text-left text-gray-100 font-medium\">ID</th>\n                        <th class=\"py-3 px-6 text-left text-gray-100 font-medium\">Name</th>\n                        <th class=\"py-3 px-6 text-left text-gray-100 font-medium\">Username</th>\n                        <th class=\"py-3 px-6 text-left text-gray-100 font-medium\">Profile Picture Path</th>\n                        <th class=\"py-3 px-6 text-left text-gray-100 font-medium\">User Role</th>\n                        <th class=\"py-3 text-left text-gray-100 font-medium\">Action</th>\n                    </tr>\n                    </thead>\n\n                    <tbody>\n                    ");
		if (searchedUser != null) {
			jteOutput.writeContent("\n                        <tr class=\"hover:bg-gray-100 border-b border-gray-100\">\n                            <td class=\"py-4 px-6 text-gray-700\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(searchedUser.get().getId());
			jteOutput.writeContent("</td>\n                            <td class=\"py-4 px-6 text-gray-700\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(searchedUser.get().getName());
			jteOutput.writeContent("</td>\n                            <td class=\"py-4 px-6 text-gray-700\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(searchedUser.get().getUsername());
			jteOutput.writeContent("</td>\n                            <td class=\"py-4 px-6 text-gray-700\">");
			jteOutput.setContext("td", null);
			jteOutput.writeUserContent(searchedUser.get().getProfilePicturePath());
			jteOutput.writeContent("</td>\n                            ");
			if (searchedUser.get().getIsAdmin() == true) {
				jteOutput.writeContent("\n                                <td class=\"py-4 px-6 text-gray-700\">Admin</td>\n                            ");
			} else {
				jteOutput.writeContent("\n                                <td class=\"py-4 px-6 text-gray-700\">User</td>\n                            ");
			}
			jteOutput.writeContent("\n                            <td class=\"py-4\">\n                                <button class=\"bg-orange-500 hover:bg-orange-400 transition duration-300 rounded-full p-2 px-5 shadow-card text-white\">Edit</button>\n                                <button class=\"bg-red-600 hover:bg-red-700 transition duration-300 rounded-full p-2 px-3 shadow-card text-white\">Delete</button>\n                            </td>\n                        </tr>\n                    ");
		} else {
			jteOutput.writeContent("\n                        ");
			for (UserEntity users : userList) {
				jteOutput.writeContent("\n                            <tr class=\"hover:bg-gray-100 border-b border-gray-100\">\n                                <td class=\"py-4 px-6 text-gray-700\">");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(users.getId());
				jteOutput.writeContent("</td>\n                                <td class=\"py-4 px-6 text-gray-700\">");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(users.getName());
				jteOutput.writeContent("</td>\n                                <td class=\"py-4 px-6 text-gray-700\">");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(users.getUsername());
				jteOutput.writeContent("</td>\n                                <td class=\"py-4 px-6 text-gray-700\">");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(users.getProfilePicturePath());
				jteOutput.writeContent("</td>\n                                ");
				if (users.getIsAdmin() == true) {
					jteOutput.writeContent("\n                                    <td class=\"py-4 px-6 text-gray-700\">Admin</td>\n                                ");
				} else {
					jteOutput.writeContent("\n                                    <td class=\"py-4 px-6 text-gray-700\">User</td>\n                                ");
				}
				jteOutput.writeContent("\n                                <td class=\"py-4\">\n                                    <button class=\"bg-orange-500 hover:bg-orange-400 transition duration-300 rounded-full p-2 px-5 shadow-card text-white\">Edit</button>\n                                    <a href=\"/api/user/");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(users.getId());
				jteOutput.setContext("a", null);
				jteOutput.writeContent("/delete\" class=\"bg-red-600 hover:bg-red-700 transition duration-300 rounded-full p-2 px-3 shadow-card text-white\">Delete</a>\n                                </td>\n                            </tr>\n                        ");
			}
			jteOutput.writeContent("\n                    ");
		}
		jteOutput.writeContent("\n                    </tbody>\n                </table>\n            </div>\n        </section>\n    </div>\n</div>\n\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.footer.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.modal.JtelogoutmodalGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n<script src=\"/asset/js/navbar.js\"></script>\n<script src=\"/asset/js/modal.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		Long adminCount = (Long)params.get("adminCount");
		Long userCount = (Long)params.get("userCount");
		String getUsername = (String)params.get("getUsername");
		List<UserEntity> userList = (List<UserEntity>)params.get("userList");
		Optional<UserEntity> searchedUser = (Optional<UserEntity>)params.get("searchedUser");
		render(jteOutput, jteHtmlInterceptor, WebName, adminCount, userCount, getUsername, userList, searchedUser);
	}
}
