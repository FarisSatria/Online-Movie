package gg.jte.generated.ondemand;
import java.util.List;
import com.movieonline.Online.Movie.entity.model.UserBookingEntity;
import com.movieonline.Online.Movie.entity.model.UserEntity;
import com.movieonline.Online.Movie.repository.UserRepository;
public final class JteaccountpageGenerated {
	public static final String JTE_NAME = "account-page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,5,5,5,17,17,17,17,20,23,26,32,34,36,44,52,62,64,64,69,69,72,72,73,73,74,74,76,76,76,76,77,77,79,79,80,80,81,81,96,98,98,99,99,99,99,100,100,102,102,104,104,104,107,107,107,124,126,128,137,140,140,140,140,140,140,140,140,140,144,147,147,147,147,147,147,147,147,147,151,158,166,173,189,199,199,199,199,207,214,216,217,217,218,253,253,253,5,6,7,8,9,10,10,10,10};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, String getUsername, String updateAccountSuccess, UserEntity getCurrentUser, List<UserEntity> userList, UserRepository userRepository) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\" class=\"scroll-smooth\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Account</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n\n    ");
		jteOutput.writeContent("\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100 font-avenir min-h-screen\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 drop-shadow-md hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
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
		jteOutput.writeContent("\n                </button>\n\n                <div id=\"userPanel\" class=\"absolute w-40 -left-1 -top-28 text-left bg-gray-50 rounded-lg shadow-md border border-gray-300 hidden\">\n                    <a href=\"/booking\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 rounded-t-lg cursor-pointer transition duration-300\">Booking</a>\n                    <a href=\"/account\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300\">Account</a>\n                    <div class=\"group\">\n                        <a id=\"openModal\" class=\"block px-4 py-2 text-zinc-700 group-hover:bg-red-600 group-hover:text-white border-t border-t-gray-300 cursor-pointer rounded-b-lg transition duration-300\">Logout</a>\n                        <div class=\"absolute group-hover:border-t-red-600 left-2 -bottom-4 w-0 h-0 border-l-[13px] border-r-[13px] border-l-transparent border-r-transparent border-t-[16px] border-t-gray-50 drop-shadow-md transition duration-300\"></div>\n                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n    <div class=\"flex-initial mt-8 space-y-6\" style=\"width:87.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"shadow-card bg-gray-50 rounded-xl p-6 flex items-center space-x-6\">\n            ");
		if (getCurrentUser.getProfilePicturePath() != null) {
			jteOutput.writeContent("\n                <img src=\"/image/");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(getCurrentUser.getId());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\" alt=\"User Profile\" class=\"size-40 rounded-full shadow-lg border-4 border-sky-400\">\n            ");
		} else {
			jteOutput.writeContent("\n                <img src=\"/image/icon/user-icon.png\" alt=\"User Profile\" class=\"size-40 rounded-full shadow-lg border-4 border-sky-400\">\n            ");
		}
		jteOutput.writeContent("\n            <div class=\"space-y-2\">\n                <h2 class=\"text-3xl font-semibold text-gray-800\">");
		jteOutput.setContext("h2", null);
		jteOutput.writeUserContent(getCurrentUser.getName());
		jteOutput.writeContent("</h2>\n                <div class=\"flex justify-between items-center\">\n                    <p class=\"text-gray-700\">Username:</p>\n                    <p class=\"text-black font-medium\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(getUsername);
		jteOutput.writeContent("</p>\n                </div>\n\n                <div class=\"flex justify-between items-center\">\n                    <p class=\"text-gray-700\">Password:</p>\n                    <p class=\"text-black font-medium\">••••••••</p>\n                </div>\n                <div class=\"flex space-x-2\">\n                    <button onclick=\"document.getElementById('updateProfileModal').classList.remove('hidden')\"\n                            class=\"px-4 py-2 bg-sky-400 text-white rounded-lg shadow-card hover:bg-sky-500 transition duration-300 \">\n                        Edit Profile\n                    </button>\n                    <a href=\"/logout\" class=\"px-4 py-2 bg-red-600 hover:bg-red-700 text-white rounded-lg shadow-card transition duration-300 \">Logout</a>\n                </div>\n            </div>\n        </div>\n\n        ");
		jteOutput.writeContent("\n        <div id=\"updateProfileModal\" class=\"fixed hidden -inset-8 bg-black bg-opacity-50 flex justify-center items-center z-50\">\n            ");
		jteOutput.writeContent("\n            <div class=\"bg-gray-50 p-6 rounded-lg shadow-card w-96 relative\">\n                ");
		jteOutput.writeContent("\n                <button id=\"closeModal\" class=\"absolute top-3 right-3 text-red-600 hover:text-red-700\">\n                    <i class=\"fas fa-times text-xl\"></i>\n                </button>\n\n                <h2 class=\"text-2xl font-semibold text-gray-800 mb-4\">Update Profile</h2>\n\n                <form action=\"/api/user/update\" method=\"post\" enctype=\"multipart/form-data\">\n\n                    ");
		jteOutput.writeContent("\n                    <div class=\"mb-3\">\n                        <label class=\"block text-gray-700\">Name:</label>\n                        <input type=\"text\" name=\"name\"");
		var __jte_html_attribute_0 = getCurrentUser.getName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("\n                               class=\"w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none\">\n                    </div>\n\n                    ");
		jteOutput.writeContent("\n                    <div class=\"mb-3\">\n                        <label class=\"block text-gray-700\">Username:</label>\n                        <input type=\"text\" name=\"username\"");
		var __jte_html_attribute_1 = getCurrentUser.getUsername();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("\n                               class=\"w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none\">\n                    </div>\n\n                    ");
		jteOutput.writeContent("\n                    <div class=\"mb-3\">\n                        <label class=\"block text-gray-700\">New Password:</label>\n                        <input type=\"password\" name=\"newPassword\" id=\"newPassword\"\n                               class=\"w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none\">\n                    </div>\n\n                    ");
		jteOutput.writeContent("\n                    <div class=\"mb-3\">\n                        <label class=\"block text-gray-700\">Confirm Password:</label>\n                        <input type=\"password\" name=\"verifyPassword\" id=\"verifyPassword\"\n                               class=\"w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none\">\n                        <p id=\"passwordError\" class=\"text-red-500 text-sm mt-1 hidden\">Passwords do not match!</p>\n                    </div>\n\n                    ");
		jteOutput.writeContent("\n                    <div class=\"mb-3\">\n                        <label class=\"block text-gray-700\">Profile Picture:</label>\n                        <input type=\"file\" name=\"profilePicture\" accept=\"image/*\"\n                               class=\"w-full px-1 py-1 rounded-lg\">\n                    </div>\n\n                    ");
		jteOutput.writeContent("\n                    <div class=\"flex justify-end space-x-2 mt-4\">\n                        <button type=\"button\" id=\"cancelUpdate\"\n                                class=\"px-4 py-2 bg-red-600 text-white rounded-lg shadow-card hover:bg-red-700 transition duration-300 \">\n                            Cancel\n                        </button>\n                        <button type=\"submit\" id=\"submitUpdate\"\n                                class=\"px-4 py-2 bg-sky-400 text-white rounded-lg shadow-card hover:bg-sky-500 transition duration-300 \">\n                            Save\n                        </button>\n                    </div>\n                </form>\n            </div>\n        </div>\n\n\n        ");
		jteOutput.writeContent("\n        <div>\n            <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Account Settings</h3>\n            <div class=\"mt-4 space-y-5 px-5\">\n                <div class=\"flex justify-between items-center pb-4 border-b border-b-zinc-600/10\">\n                    <p class=\"text-gray-600\">Manage Bookings</p>\n                    <a href=\"/booking\" class=\"px-4 py-2 bg-sky-400 hover:bg-sky-500 text-white rounded-full shadow-card transition duration-300 \">View</a>\n                </div>\n                <div class=\"flex justify-between items-center pb-4 border-b border-b-zinc-600/10\">\n                    <p class=\"text-gray-600\">Delete Account</p>\n                    <a href=\"/api/user/");
		jteOutput.setContext("a", "href");
		jteOutput.writeUserContent(getCurrentUser.getId());
		jteOutput.setContext("a", null);
		jteOutput.writeContent("/delete\" class=\"px-4 py-2 bg-red-600 hover:bg-red-700 text-white rounded-full shadow-card transition duration-300 \">Delete</a>\n                </div>\n            </div>\n        </div>\n\n    </div>\n</div>\n\n");
		jteOutput.writeContent("\n    <div id=\"success-message-update-valid\" class=\"drop-shadow-md absolute top-5 left-[39vw]\">\n        <div class=\"bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center\">Success!</div>\n        <div class=\"bg-white p-5 rounded-br-lg rounded-bl-lg\">\n            <p>Account has been successfully deleted!</p>\n        </div>\n    </div>\n");
		jteOutput.writeContent("\n\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.modal.JtelogoutmodalGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n<script>\n    document.getElementById(\"closeModal\").addEventListener(\"click\", function () {\n        document.getElementById(\"updateProfileModal\").classList.add(\"hidden\");\n    });\n\n    document.getElementById(\"cancelUpdate\").addEventListener(\"click\", function () {\n        document.getElementById(\"updateProfileModal\").classList.add(\"hidden\");\n    });\n\n    document.getElementById(\"updateProfileModal\").addEventListener(\"click\", function (event) {\n        if (event.target === this) {\n            this.classList.add(\"hidden\");\n        }\n    });\n\n    document.getElementById(\"submitUpdate\").addEventListener(\"click\", function (event) {\n        let newPassword = document.getElementById(\"newPassword\").value;\n        let verifyPassword = document.getElementById(\"verifyPassword\").value;\n        let errorText = document.getElementById(\"passwordError\");\n\n        if (newPassword !== verifyPassword) {\n            event.preventDefault();\n            errorText.classList.remove(\"hidden\");\n        } else {\n            errorText.classList.add(\"hidden\");\n        }\n    });\n</script>\n\n<script src=\"/asset/js/navbar.js\"></script>\n<script src=\"/asset/js/error-message.js\"></script>\n<script src=\"/asset/js/modal.js\"></script>\n<script src=\"/asset/js/carousel.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		String getUsername = (String)params.get("getUsername");
		String updateAccountSuccess = (String)params.get("updateAccountSuccess");
		UserEntity getCurrentUser = (UserEntity)params.get("getCurrentUser");
		List<UserEntity> userList = (List<UserEntity>)params.get("userList");
		UserRepository userRepository = (UserRepository)params.get("userRepository");
		render(jteOutput, jteHtmlInterceptor, WebName, getUsername, updateAccountSuccess, getCurrentUser, userList, userRepository);
	}
}
