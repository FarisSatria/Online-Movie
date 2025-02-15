package gg.jte.generated.ondemand;
import java.util.List;
import java.util.Optional;
import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieGenresDTO;
import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import com.movieonline.Online.Movie.entity.model.UserEntity;
public final class JtemoviepageGenerated {
	public static final String JTE_NAME = "movie-page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,6,7,8,10,10,10,32,32,32,32,32,32,32,35,38,41,47,49,51,59,67,77,77,78,82,82,83,83,84,84,86,86,86,86,87,87,89,89,90,90,91,91,103,103,104,111,111,115,117,119,119,119,119,122,122,122,122,122,122,122,122,122,122,122,122,122,124,124,124,126,126,126,127,127,127,128,128,130,130,130,132,132,133,133,133,135,135,135,137,137,138,138,140,140,142,142,143,143,158,160,160,160,162,162,163,163,171,171,176,176,176,176,178,182,186,190,195,201,205,206,206,209,209,209,209,210,210,210,210,210,210,210,210,210,213,213,213,214,214,214,217,217,223,223,224,224,226,226,227,227,228,228,231,231,231,231,232,232,235,235,236,236,237,237,238,238,238,238,240,240,240,242,242,243,243,244,244,244,244,244,244,244,244,244,244,244,244,244,245,245,245,245,247,247,248,248,248,248,248,248,248,248,248,248,248,248,248,249,249,249,249,251,251,252,252,262,262,264,264,265,265,266,266,269,269,269,269,270,270,273,273,274,274,275,275,276,277,277,277,277,278,278,281,281,282,282,293,293,293,293,294,294,297,297,301,302,302,306,306,307,307,308,308,310,310,310,310,311,311,313,313,314,314,315,315,316,316,316,321,321,321,321,327,327,328,328,330,330,332,332,333,333,335,335,337,337,340,340,340,343,343,345,345,346,346,347,347,348,348,349,349,351,351,355,355,356,356,357,357,359,359,359,359,360,360,362,362,363,363,364,364,365,365,365,368,368,369,369,371,371,373,373,374,374,376,376,378,378,381,381,381,384,384,386,386,387,387,388,388,389,389,390,390,394,394,396,396,396,396,397,397,399,399,400,400,400,403,403,404,404,406,406,408,408,409,409,413,413,413,417,417,421,425,426,426,427,427,427,427,429,429,429,429,430,430,430,430,430,430,430,430,430,433,433,433,435,435,436,436,438,438,440,440,441,441,445,445,449,460,460,460,464,464,464,468,468,468,472,472,472,478,478,480,480,480,482,482,491,492,492,493,494,494,495,503,503,503,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,25,25,25};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, String getUsername, Boolean isLoggedIn, Optional<FeedBackEntity> matchingFeedback, MovieDTO movieDetail, MovieGenresDTO movieGenres, MovieAuthorDetailsReviewDTO movieAuthorDetailsReview, List<UserEntity> userList, List<FeedBackEntity> movieFeedbacks, List<MovieCastDTO> movieCast, List<MovieKeywordsDTO> movieKeywords, List<MovieReviewsDTO> movieReviews, List<MovieDTO> movieRecommendation, List<MovieDTO> popularMovies, List<MovieDTO> topRatedMovies, List<MovieDTO> upcomingMovies) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\" class=\"scroll-smooth\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | ");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n\n    ");
		jteOutput.writeContent("\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100 font-avenir min-h-screen\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li class=\"relative\">\n                    <a href=\"/movies/search\" id=\"searchIcon\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md\">\n                        <i id=\"searchIconSymbol\" class=\"fas fa-search text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n            </ul>\n\n            ");
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
		jteOutput.writeContent("\n        <div class=\"relative h-1/4 w-full mb-5 rounded-xl overflow-hidden shadow-card\" style=\"height:70vh;\">\n            ");
		jteOutput.writeContent("\n            <div id=\"carousel\" class=\"flex transition-transform duration-500 ease-in-out h-full\"\n                 style=\"background-image:url(https://image.tmdb.org/t/p/w1280");
		jteOutput.setContext("div", "style");
		jteOutput.writeUserContent(movieDetail.getBackdrop_path());
		jteOutput.setContext("div", null);
		jteOutput.writeContent(");\">\n                <div class=\"relative flex bg-black/60\">\n                    <img class=\"my-auto mx-10 rounded-lg h-5/6\"\n                         src=\"https://image.tmdb.org/t/p/w500");
		jteOutput.setContext("img", "src");
		jteOutput.writeUserContent(movieDetail.getPoster_path());
		jteOutput.setContext("img", null);
		jteOutput.writeContent("\"");
		var __jte_html_attribute_0 = movieDetail.getTitle();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" alt=\"");
			jteOutput.setContext("img", "alt");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">\n                    <div class=\"transform space-y-4 p-4 h-5/6 my-auto\">\n                        <h3 class=\"text-4xl text-white font-semibold \">");
		jteOutput.setContext("h3", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("</h3>\n                        <div class=\"flex space-x-1 flex-warp\">\n                            <p class=\"text-md text-zinc-300 py-1\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getAdultFormatted());
		jteOutput.writeContent("</p>\n                            <p class=\"text-md text-zinc-300 p-1\">• ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRelease_date());
		jteOutput.writeContent("</p>\n                            ");
		for (MovieGenresDTO genre : movieDetail.getGenres()) {
			jteOutput.writeContent("\n                                <div class=\"p-1 rounded-full shadow-inner-lg border border-gray-200 bg-gray-100\">\n                                    <p class=\"text-zinc-700\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(genre.getName());
			jteOutput.writeContent("</p>\n                                </div>\n                            ");
		}
		jteOutput.writeContent("\n                            <p class=\"text-md text-zinc-300 p-1\">• ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRuntimeFormatted());
		jteOutput.writeContent("</p>\n                        </div>\n                        <p class=\"text-sm text-zinc-300\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getOverview());
		jteOutput.writeContent("</p>\n                        <div class=\"flex items-center space-x-1\">\n                            ");
		for (int i = 1; i <= 5; i++) {
			jteOutput.writeContent("\n                                ");
			if (i <= movieDetail.getVote_average() / 2) {
				jteOutput.writeContent("\n                                    <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                ");
			} else {
				jteOutput.writeContent("\n                                    <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                ");
			}
			jteOutput.writeContent("\n                            ");
		}
		jteOutput.writeContent("\n                        </div>\n                        <div class=\"flex space-x-2\">\n                            <a id=\"bookNow\" href=\"#scrollToBehaviour\" class=\"book-button shadow-card p-3 bg-yellow-500 hover:bg-yellow-400 text-white rounded-lg transition duration-300 \">Book Now!</a>\n                            <div class=\"p-3 rounded-lg shadow-inner-lg border border-gray-200 bg-gray-100 flex\">\n                                <p class=\"text-zinc-700 font-semibold\">Quota Left: 5</p>\n                                <p class=\"text-zinc-700 font-medium\">/50</p>\n                            </div>\n                        </div>\n                    </div>\n                </div>\n            </div>\n        </div>\n        <div class=\"w-full flex space-x-5\">\n            <div class=\"flex-initial\" style=\"width:65.1vw;\">\n                ");
		jteOutput.writeContent("\n                <div id=\"scrollToBehaviour\" class=\"w-full hidden mb-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Booking ");
		jteOutput.setContext("h3", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("!</h3>\n                    <div class=\"w-full relative p-5 space-y-4\">\n                        ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                        ");
		} else {
			jteOutput.writeContent("\n                            <a href=\"/login\" class=\"absolute p-2 top-4 right-0 bottom-0 left-0 bg-gradient-to-b from-gray-400/40 to-gray-400/60\n                                      shadow-md hover:shadow-xl rounded-lg z-10 justify-center items-center font-bold text-3xl flex space-x-2 transition duration-300\">\n                                <p class=\"text-green-600 hover:text-green-700 drop-shadow-md transition duration-300\">Login </p>\n                                <p class=\"text-white\"> To Submit a Review!</p>\n\n                                <p class=\"text-white drop-shadow-md text-base font-semibold bottom-1 right-2 absolute\">Click it to Login!</p>\n                            </a>\n                        ");
		}
		jteOutput.writeContent("\n                        <div class=\"flex\">\n                            <div class=\"border-sky-400 border-l-4 pl-2 h-6\"></div>\n                            <h2 class=\"text-xl font-bold text-zinc-700\">Pick a Date and Time</h2>\n                        </div>\n                        <form action=\"/movie/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(movieDetail.getId());
		jteOutput.setContext("form", null);
		jteOutput.writeContent("/booking\" method=\"post\">\n                            <div class=\"grid grid-cols-2 gap-4\">\n                                ");
		jteOutput.writeContent("\n                                <div class=\"space-y-2\">\n                                    <label for=\"custom-date\" class=\"block font-medium text-zinc-700\">Date</label>\n                                    <select id=\"custom-date\" name=\"custom-date\" class=\"w-full px-3 py-2 border rounded-md focus:ring-blue-500 focus:border-blue-500 shadow-inner-lg\">\n                                        ");
		jteOutput.writeContent("\n                                    </select>\n                                </div>\n\n                                ");
		jteOutput.writeContent("\n                                <div class=\"space-y-2\">\n                                    <label for=\"custom-time\" class=\"block font-medium text-gray-700\">Time</label>\n                                    <select id=\"custom-time\" name=\"custom-time\" class=\"w-full px-3 py-2 border rounded-md focus:ring-blue-500 focus:border-blue-500 shadow-inner-lg\">\n                                        ");
		jteOutput.writeContent("\n                                    </select>\n                                </div>\n                            </div>\n\n                            ");
		jteOutput.writeContent("\n                            <button type=\"submit\" class=\"bg-green-500 hover:bg-green-400 mt-2 transition duration-300 rounded-full p-3 shadow-card text-white ml-[88%]\">Book Now</button>\n                        </form>\n\n                    </div>\n                </div>\n                ");
		jteOutput.writeContent("\n                <div class=\"overflow-x-scroll mb-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Top Billed Cast</h3>\n                    <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-4\">\n                        ");
		jteOutput.writeContent("\n                        ");
		for (MovieCastDTO movie : movieCast) {
			jteOutput.writeContent("\n                            <a class=\"rounded-lg bg-gray-50 shadow-card overflow-hidden\n                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 \">\n                                <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getProfile_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"\n                                    ");
			var __jte_html_attribute_1 = movie.getName();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_1);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                                <div class=\"p-4 space-y-2\">\n                                    <h3 class=\"text-xl text-black font-semibold\" style=\" display: -webkit-box;\n                                    -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getName());
			jteOutput.writeContent("</h3>\n                                    <p class=\"text-sm text-zinc-400\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getCharacter());
			jteOutput.writeContent("</p>\n                                </div>\n                            </a>\n                        ");
		}
		jteOutput.writeContent("\n                    </div>\n                </div>\n                <div class=\"space-y-5 mb-5\">\n                    <div class=\"space-y-5 overflow-hidden\">\n                        <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Movie Reviews</h3>\n                        ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                            ");
			if (matchingFeedback.isPresent()) {
				jteOutput.writeContent("\n                                <div id=\"userFeedbackInput\"  class=\"hidden p-5 relative flex rounded-lg\">\n                                    ");
				for (UserEntity user : userList) {
					jteOutput.writeContent("\n                                        ");
					if (user.getUsername().equals(getUsername)) {
						jteOutput.writeContent("\n                                            ");
						if (user.getProfilePicturePath() != null) {
							jteOutput.writeContent("\n                                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                                     src=\"/image/icon/");
							jteOutput.setContext("img", "src");
							jteOutput.writeUserContent(user.getProfilePicturePath());
							jteOutput.setContext("img", null);
							jteOutput.writeContent(".png\">\n                                            ");
						} else {
							jteOutput.writeContent("\n                                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                            ");
						}
						jteOutput.writeContent("\n                                        ");
					}
					jteOutput.writeContent("\n                                    ");
				}
				jteOutput.writeContent("\n                                    <form class=\"w-full\" action=\"/movie/");
				jteOutput.setContext("form", "action");
				jteOutput.writeUserContent(movieDetail.getId());
				jteOutput.setContext("form", null);
				jteOutput.writeContent("/feedback\" method=\"post\">\n                                        <input type=\"hidden\" name=\"_method\" value=\"PUT\">\n                                        <textarea class=\"resize-none min-h-8 h-8 max-h-28 bg-transparent border-b border-zinc-600/50 text-zinc-600 w-full focus:outline-none\" id=\"reviews\" name=\"reviews\" placeholder=\"Add Review...\">");
				jteOutput.setContext("textarea", null);
				jteOutput.writeUserContent(matchingFeedback.get().getReviews());
				jteOutput.writeContent("</textarea>\n                                        <div class=\"flex flex-row-reverse float-left mt-2\">\n                                            ");
				for (int i = 5; i >= 1; i--) {
					jteOutput.writeContent("\n                                                ");
					if (i <= matchingFeedback.get().getRating() / 2) {
						jteOutput.writeContent("\n                                                    <input type=\"radio\" id=\"star");
						jteOutput.setContext("input", "id");
						jteOutput.writeUserContent(i);
						jteOutput.setContext("input", null);
						jteOutput.writeContent("\" name=\"rating\"");
						var __jte_html_attribute_2 = i * 2;
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_2);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" class=\"hidden peer\">\n                                                    <label for=\"star");
						jteOutput.setContext("label", "for");
						jteOutput.writeUserContent(i);
						jteOutput.setContext("label", null);
						jteOutput.writeContent("\"\n                                                           class=\"cursor-pointer text-yellow-400 peer-checked:text-orange-400 hover:text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></label>\n                                                ");
					} else {
						jteOutput.writeContent("\n                                                    <input type=\"radio\" id=\"star");
						jteOutput.setContext("input", "id");
						jteOutput.writeUserContent(i);
						jteOutput.setContext("input", null);
						jteOutput.writeContent("\" name=\"rating\"");
						var __jte_html_attribute_3 = 2 * i;
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
							jteOutput.writeContent(" value=\"");
							jteOutput.setContext("input", "value");
							jteOutput.writeUserContent(__jte_html_attribute_3);
							jteOutput.setContext("input", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(" class=\"hidden peer\">\n                                                    <label for=\"star");
						jteOutput.setContext("label", "for");
						jteOutput.writeUserContent(i);
						jteOutput.setContext("label", null);
						jteOutput.writeContent("\"\n                                                           class=\"cursor-pointer text-gray-400 peer-checked:text-orange-400 hover:text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></label>\n                                                ");
					}
					jteOutput.writeContent("\n                                            ");
				}
				jteOutput.writeContent("\n                                        </div>\n                                        <button type=\"button\" id=\"cancelFeedbackButton\" class=\"self-start bg-gray-500 hover:bg-gray-600 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right mt-2 ml-auto\">\n                                            Cancel\n                                        </button>\n                                        <button type=\"submit\" class=\"self-start mr-2 bg-orange-500 hover:bg-orange-400 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right mt-2 ml-auto\">\n                                            Update\n                                        </button>\n                                    </form>\n                                </div>\n                            ");
			} else {
				jteOutput.writeContent("\n                                <div class=\"p-5 relative flex rounded-lg\">\n                                    ");
				for (UserEntity user : userList) {
					jteOutput.writeContent("\n                                        ");
					if (user.getUsername().equals(getUsername)) {
						jteOutput.writeContent("\n                                            ");
						if (user.getProfilePicturePath() != null) {
							jteOutput.writeContent("\n                                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                                     src=\"/image/icon/");
							jteOutput.setContext("img", "src");
							jteOutput.writeUserContent(user.getProfilePicturePath());
							jteOutput.setContext("img", null);
							jteOutput.writeContent(".png\">\n                                            ");
						} else {
							jteOutput.writeContent("\n                                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                            ");
						}
						jteOutput.writeContent("\n                                        ");
					}
					jteOutput.writeContent("\n                                    ");
				}
				jteOutput.writeContent("\n                                    ");
				jteOutput.writeContent("\n                                    <form class=\"w-full\" action=\"/movie/");
				jteOutput.setContext("form", "action");
				jteOutput.writeUserContent(movieDetail.getId());
				jteOutput.setContext("form", null);
				jteOutput.writeContent("/feedback\" method=\"post\">\n                                        ");
				gg.jte.generated.ondemand.include.miscellaneous.JteratingradioinputGenerated.render(jteOutput, jteHtmlInterceptor);
				jteOutput.writeContent("\n                                    </form>\n                                </div>\n                            ");
			}
			jteOutput.writeContent("\n                        ");
		} else {
			jteOutput.writeContent("\n                            <div class=\"p-5 relative flex rounded-lg\">\n                                <a href=\"/login\" class=\"absolute p-2 top-0 right-0 bottom-0 left-0 bg-gradient-to-b from-gray-400/30 to-gray-400/70\n                                      shadow-md hover:shadow-xl rounded-lg z-10 justify-center items-center font-bold text-3xl flex space-x-2 transition duration-300\">\n                                    <p class=\"text-green-600 hover:text-green-700 drop-shadow-md transition duration-300\">Login </p>\n                                    <p class=\"text-white\"> To Submit a Review!</p>\n\n                                    <p class=\"text-white drop-shadow-md text-base font-semibold bottom-1 right-2 absolute\">Click it to Login!</p>\n                                </a>\n                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                <form class=\"w-full\" action=\"/movie/");
			jteOutput.setContext("form", "action");
			jteOutput.writeUserContent(movieDetail.getId());
			jteOutput.setContext("form", null);
			jteOutput.writeContent("/feedback\" method=\"post\">\n                                    ");
			gg.jte.generated.ondemand.include.miscellaneous.JteratingradioinputGenerated.render(jteOutput, jteHtmlInterceptor);
			jteOutput.writeContent("\n                                </form>\n                            </div>\n                        ");
		}
		jteOutput.writeContent("\n\n                        <div class=\"transition-transform duration-500 ease-in-out max-h-96 overflow-y-scroll\n                                px-5 pb-4 space-y-12\">\n                            ");
		jteOutput.writeContent("\n                            ");
		if (matchingFeedback.isPresent()) {
			jteOutput.writeContent("\n                                <div id=\"currentUserFeedback\" class=\"w-full space-y-2\">\n                                    <div class=\"flex\">\n                                        <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                        ");
			for (UserEntity user : userList) {
				jteOutput.writeContent("\n                                            ");
				if (user.getUsername().equals(matchingFeedback.get().getUsername())) {
					jteOutput.writeContent("\n                                                ");
					if (user.getProfilePicturePath() != null) {
						jteOutput.writeContent("\n                                                    <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                                         src=\"/image/icon/");
						jteOutput.setContext("img", "src");
						jteOutput.writeUserContent(user.getProfilePicturePath());
						jteOutput.setContext("img", null);
						jteOutput.writeContent(".png\">\n                                                ");
					} else {
						jteOutput.writeContent("\n                                                    <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                                ");
					}
					jteOutput.writeContent("\n                                            ");
				}
				jteOutput.writeContent("\n                                        ");
			}
			jteOutput.writeContent("\n                                        <h3 class=\"text-xl font-bold my-auto\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(matchingFeedback.get().getUsername());
			jteOutput.writeContent("</h3>\n                                        <div class=\"flex ml-auto\">\n                                            <button id=\"updateFeedbackButton\" class=\"self-start mr-2 bg-orange-500 hover:bg-orange-400 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right\">\n                                                Update\n                                            </button>\n                                            <a href=\"/movie/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movieDetail.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("/feedback/delete\" class=\"self-start bg-red-600 hover:bg-red-700 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right\">\n                                                Delete\n                                            </a>\n                                        </div>\n                                    </div>\n                                    <div class=\"flex items-center\">\n                                        ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                            ");
				if (i <= matchingFeedback.get().getRating() / 2) {
					jteOutput.writeContent("\n                                                <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				} else {
					jteOutput.writeContent("\n                                                <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				}
				jteOutput.writeContent("\n                                        ");
			}
			jteOutput.writeContent("\n                                    </div>\n                                    ");
			if (matchingFeedback.get().getReviews().isBlank() || matchingFeedback.get().getReviews().isEmpty()) {
				jteOutput.writeContent("\n\n                                    ");
			} else {
				jteOutput.writeContent("\n                                        <div class=\"overflow-y-auto max-h-full\">\n                                            <p class=\"reviews text-md text-zinc-600\" style=\"display: -webkit-box; -webkit-box-orient: vertical;\n                                                                -webkit-line-clamp: 5; overflow: hidden;\">");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(matchingFeedback.get().getReviews());
				jteOutput.writeContent("</p>\n                                        </div>\n                                        <button class=\"show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white \">Show More!</button>\n                                    ");
			}
			jteOutput.writeContent("\n                                </div>\n                            ");
		}
		jteOutput.writeContent("\n                            ");
		if (movieFeedbacks != null) {
			jteOutput.writeContent("\n                                ");
			for (FeedBackEntity feedbacks : movieFeedbacks) {
				jteOutput.writeContent("\n                                    ");
				if (feedbacks.getMovieId() == movieDetail.getId()) {
					jteOutput.writeContent("\n                                        ");
					if (feedbacks.getIsDeleted() == true || matchingFeedback.isPresent()) {
						jteOutput.writeContent("\n\n                                        ");
					} else {
						jteOutput.writeContent("\n                                            <div class=\"w-full space-y-2\">\n                                                <div class=\"flex\">\n                                                    <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                    ");
						for (UserEntity user : userList) {
							jteOutput.writeContent("\n                                                        ");
							if (user.getUsername().equals(feedbacks.getUsername())) {
								jteOutput.writeContent("\n                                                            ");
								if (user.getProfilePicturePath() != null) {
									jteOutput.writeContent("\n                                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                                                     src=\"/image/icon/");
									jteOutput.setContext("img", "src");
									jteOutput.writeUserContent(user.getProfilePicturePath());
									jteOutput.setContext("img", null);
									jteOutput.writeContent(".png\">\n                                                            ");
								} else {
									jteOutput.writeContent("\n                                                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                                            ");
								}
								jteOutput.writeContent("\n                                                        ");
							}
							jteOutput.writeContent("\n                                                    ");
						}
						jteOutput.writeContent("\n                                                    <h3 class=\"text-xl font-bold my-auto\">");
						jteOutput.setContext("h3", null);
						jteOutput.writeUserContent(feedbacks.getUsername());
						jteOutput.writeContent("</h3>\n                                                </div>\n                                                <div class=\"flex items-center\">\n                                                    ");
						for (int i = 1; i <= 5; i++) {
							jteOutput.writeContent("\n                                                        ");
							if (i <= feedbacks.getRating() / 2) {
								jteOutput.writeContent("\n                                                            <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                                        ");
							} else {
								jteOutput.writeContent("\n                                                            <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                                        ");
							}
							jteOutput.writeContent("\n                                                    ");
						}
						jteOutput.writeContent("\n                                                </div>\n                                                ");
						if (feedbacks.getReviews().isBlank() || feedbacks.getReviews().isEmpty()) {
							jteOutput.writeContent("\n\n                                                ");
						} else {
							jteOutput.writeContent("\n                                                    <div class=\"overflow-y-auto max-h-full\">\n                                                        <p class=\"reviews text-md text-zinc-600\" style=\"display: -webkit-box; -webkit-box-orient: vertical;\n                                                            -webkit-line-clamp: 5; overflow: hidden;\">");
							jteOutput.setContext("p", null);
							jteOutput.writeUserContent(feedbacks.getReviews());
							jteOutput.writeContent("</p>\n                                                    </div>\n                                                    <button class=\"show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white \">Show More!</button>\n                                                ");
						}
						jteOutput.writeContent("\n                                            </div>\n                                        ");
					}
					jteOutput.writeContent("\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                            ");
		}
		jteOutput.writeContent("\n                            ");
		for (MovieReviewsDTO movie : movieReviews) {
			jteOutput.writeContent("\n                                <div class=\"w-full space-y-2\">\n                                    <div class=\"flex\">\n                                        <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                        ");
			if (movie.getAuthor_details().getAvatar_path() != null) {
				jteOutput.writeContent("\n                                            <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                                 src=\"https://image.tmdb.org/t/p/w92");
				jteOutput.setContext("img", "src");
				jteOutput.writeUserContent(movie.getAuthor_details().getAvatar_path());
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\">\n                                        ");
			} else {
				jteOutput.writeContent("\n                                            <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                                        ");
			}
			jteOutput.writeContent("\n                                        <h3 class=\"text-xl font-bold my-auto\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getAuthor());
			jteOutput.writeContent("</h3>\n                                    </div>\n                                    <div class=\"flex items-center\">\n                                        ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                            ");
				if (i <= movie.getAuthor_details().getRating() / 2) {
					jteOutput.writeContent("\n                                                <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				} else {
					jteOutput.writeContent("\n                                                <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				}
				jteOutput.writeContent("\n                                        ");
			}
			jteOutput.writeContent("\n                                    </div>\n                                    <div class=\"overflow-y-auto max-h-full\">\n                                        <p class=\"reviews text-md text-zinc-600\" style=\"display: -webkit-box; -webkit-box-orient: vertical;\n                                    -webkit-line-clamp: 5; overflow: hidden;\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getContent());
			jteOutput.writeContent("</p>\n                                    </div>\n                                    <button class=\"show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white \">Show More!</button>\n                                </div>\n                            ");
		}
		jteOutput.writeContent("\n                        </div>\n                    </div>\n                </div>\n                ");
		jteOutput.writeContent("\n                <div id=\"recommendation\" class=\"overflow-x-scroll mb-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Recommended For You</h3>\n                    <div class=\"flex space-x-4 overflow-y-hidden pb-4 pt-5\">\n                        ");
		jteOutput.writeContent("\n                        ");
		for (MovieDTO movie : movieRecommendation) {
			jteOutput.writeContent("\n                            <a href=\"/movie/");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(movie.getId());
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"  class=\"rounded-lg bg-gray-50 shadow-card overflow-hidden\n                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 \">\n                                <img class=\"w-full object-cover\" src=\"https://image.tmdb.org/t/p/w300");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getPoster_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\"\n                                    ");
			var __jte_html_attribute_4 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_4);
				jteOutput.setContext("img", null);
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">\n                                <div class=\"p-4 space-y-2\">\n                                    <h3 class=\"text-xl text-black font-semibold\" style=\" display: -webkit-box;\n                            -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;\">");
			jteOutput.setContext("h3", null);
			jteOutput.writeUserContent(movie.getTitle());
			jteOutput.writeContent("</h3>\n                                    <div class=\"flex items-center\">\n                                        ");
			for (int i = 1; i <= 5; i++) {
				jteOutput.writeContent("\n                                            ");
				if (i <= movie.getVote_average() / 2) {
					jteOutput.writeContent("\n                                                <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				} else {
					jteOutput.writeContent("\n                                                <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                            ");
				}
				jteOutput.writeContent("\n                                        ");
			}
			jteOutput.writeContent("\n                                    </div>\n                                </div>\n                            </a>\n                        ");
		}
		jteOutput.writeContent("\n                    </div>\n                </div>\n            </div>\n            ");
		jteOutput.writeContent("\n            <div class=\"flex-initial\" style=\"width:39%;\">\n                <div class=\"w-full\">\n                    <h3 class=\"text-xl sm:text-2xl lg:text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4\">\n                        Extra Details\n                    </h3>\n                    <div class=\"p-4 mt-4 w-full bg-gray-50 rounded-lg shadow-card relative overflow-hidden\">\n                        <div class=\"bg-gradient-to-r from-sky-400 to-blue-500 p-4 px-24 absolute top-0 left-0\" style=\"border-radius: 0 0 30px 0;\"></div>\n                        <div class=\"space-y-4 mt-8\">\n                            <div>\n                                <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold\">Status</p>\n                                <p class=\"text-zinc-700 ml-3\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getStatus());
		jteOutput.writeContent("</p>\n                            </div>\n                            <div>\n                                <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold\">Original Language</p>\n                                <p class=\"text-zinc-700 ml-3\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getEnglish_name());
		jteOutput.writeContent("</p>\n                            </div>\n                            <div>\n                                <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold\">Budget</p>\n                                <p class=\"text-zinc-700 ml-3\">$");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getBudgetFormatted());
		jteOutput.writeContent("</p>\n                            </div>\n                            <div>\n                                <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold\">Revenue</p>\n                                <p class=\"text-zinc-700 ml-3\">$");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRevenueFormatted());
		jteOutput.writeContent("</p>\n                            </div>\n                        </div>\n                        <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold mt-4\">Keywords</p>\n                        <div class=\"overflow-auto max-h-full\">\n                            <div class=\"ml-3 flex flex-wrap items-start\">\n                                ");
		for (MovieKeywordsDTO movie : movieKeywords) {
			jteOutput.writeContent("\n                                    <div class=\"mr-2 mt-2 p-1 shadow-inner-lg rounded-lg border border-gray-200 bg-gray-100\">\n                                        <p class=\"text-zinc-700\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(movie.getName());
			jteOutput.writeContent("</p>\n                                    </div>\n                                ");
		}
		jteOutput.writeContent("\n                            </div>\n                        </div>\n                    </div>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.footer.JtefooterGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.include.modal.JtelogoutmodalGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n");
		jteOutput.writeContent("\n<script src=\"/asset/js/AJAX-handler.js\"></script>\n<script src=\"/asset/js/feedback.js\"></script>\n<script src=\"/asset/js/navbar.js\"></script>\n<script src=\"/asset/js/modal.js\"></script>\n<script src=\"/asset/js/carousel.js\"></script>\n<script src=\"/asset/js/booking.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		String getUsername = (String)params.get("getUsername");
		Boolean isLoggedIn = (Boolean)params.get("isLoggedIn");
		Optional<FeedBackEntity> matchingFeedback = (Optional<FeedBackEntity>)params.get("matchingFeedback");
		MovieDTO movieDetail = (MovieDTO)params.get("movieDetail");
		MovieGenresDTO movieGenres = (MovieGenresDTO)params.get("movieGenres");
		MovieAuthorDetailsReviewDTO movieAuthorDetailsReview = (MovieAuthorDetailsReviewDTO)params.get("movieAuthorDetailsReview");
		List<UserEntity> userList = (List<UserEntity>)params.get("userList");
		List<FeedBackEntity> movieFeedbacks = (List<FeedBackEntity>)params.get("movieFeedbacks");
		List<MovieCastDTO> movieCast = (List<MovieCastDTO>)params.get("movieCast");
		List<MovieKeywordsDTO> movieKeywords = (List<MovieKeywordsDTO>)params.get("movieKeywords");
		List<MovieReviewsDTO> movieReviews = (List<MovieReviewsDTO>)params.get("movieReviews");
		List<MovieDTO> movieRecommendation = (List<MovieDTO>)params.get("movieRecommendation");
		List<MovieDTO> popularMovies = (List<MovieDTO>)params.get("popularMovies");
		List<MovieDTO> topRatedMovies = (List<MovieDTO>)params.get("topRatedMovies");
		List<MovieDTO> upcomingMovies = (List<MovieDTO>)params.get("upcomingMovies");
		render(jteOutput, jteHtmlInterceptor, WebName, getUsername, isLoggedIn, matchingFeedback, movieDetail, movieGenres, movieAuthorDetailsReview, userList, movieFeedbacks, movieCast, movieKeywords, movieReviews, movieRecommendation, popularMovies, topRatedMovies, upcomingMovies);
	}
}
