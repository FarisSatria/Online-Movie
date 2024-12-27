package gg.jte.generated.ondemand;
import java.util.List;
import com.movieonline.Online.Movie.entity.dto.*;
import com.movieonline.Online.Movie.entity.dto.MovieDTO;
import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO;
import com.movieonline.Online.Movie.entity.dto.MovieGenresDTO;
import com.movieonline.Online.Movie.entity.model.FeedBackEntity;
import com.movieonline.Online.Movie.entity.model.UserEntity;
public final class JtemoviepageGenerated {
	public static final String JTE_NAME = "movie-page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,4,5,6,7,9,9,9,30,30,30,30,33,36,39,45,47,49,57,65,65,68,68,69,81,81,82,89,89,93,95,97,97,97,97,100,100,100,100,100,100,100,100,100,100,100,100,100,102,102,102,104,104,104,105,105,105,106,106,108,108,108,110,110,111,111,111,113,113,113,115,115,116,116,118,118,120,120,121,121,136,138,138,138,140,140,141,141,146,146,148,189,210,217,221,222,222,225,225,225,225,226,226,226,226,226,226,226,226,226,229,229,229,230,230,230,233,233,240,240,241,241,246,246,248,248,249,249,250,250,252,252,252,252,253,253,254,254,256,256,258,258,259,259,259,259,290,290,291,291,292,292,297,297,297,300,300,301,301,303,303,305,305,306,306,310,310,310,314,314,315,315,316,316,317,317,321,321,321,321,322,322,322,325,325,326,326,328,328,330,330,331,331,335,335,335,339,339,343,347,348,348,349,349,349,349,351,351,351,351,352,352,352,352,352,352,352,352,352,355,355,355,357,357,358,358,360,360,362,362,363,363,367,367,371,382,382,382,386,386,386,390,390,390,394,394,394,400,400,402,402,402,404,404,413,414,414,415,416,416,417,424,424,424,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,23,23,23};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, String WebName, String getUsername, Boolean isLoggedIn, MovieDTO movieDetail, MovieGenresDTO movieGenres, MovieAuthorDetailsReviewDTO movieAuthorDetailsReview, List<UserEntity> userList, List<FeedBackEntity> movieFeedbacks, List<MovieCastDTO> movieCast, List<MovieKeywordsDTO> movieKeywords, List<MovieReviewsDTO> movieReviews, List<MovieDTO> movieRecommendation, List<MovieDTO> popularMovies, List<MovieDTO> topRatedMovies, List<MovieDTO> upcomingMovies) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"en\" class=\"scroll-smooth\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(WebName);
		jteOutput.writeContent(" | Homepage</title>\n    <link rel=\"icon\" href=\"/image/favicon/eudaemonia.png\">\n\n    ");
		jteOutput.writeContent("\n    <script src=\"https://cdn.tailwindcss.com\"></script>\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n\n    ");
		jteOutput.writeContent("\n    <link rel=\"stylesheet\" href=\"/asset/css/style.css\">\n</head>\n<body class=\"bg-gray-100 font-avenir min-h-screen\">\n<div class=\"flex\">\n    <div class=\"flex-initial\" style=\"width:9.5vw;\">\n        ");
		jteOutput.writeContent("\n        <div class=\"fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20\">\n            ");
		jteOutput.writeContent("\n            <ul class=\"space-y-6 text-center\">\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"/\"\n                       class=\"block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-home text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		jteOutput.writeContent("\n                <li>\n                    <a href=\"#\"\n                       class=\"block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200\">\n                        <i class=\"fas fa-film text-2xl\"></i>\n                    </a>\n                    <div class=\"w-full h-px bg-black opacity-20 mt-1\"></div>\n                </li>\n                ");
		gg.jte.generated.ondemand.include.header.JtesidebarsearchbarGenerated.render(jteOutput, jteHtmlInterceptor);
		jteOutput.writeContent("\n            </ul>\n\n            ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                ");
			jteOutput.writeContent("\n                <div class=\"text-center mt-auto relative group\">\n                    <button id=\"userButton\" class=\"block size-8 drop-shadow-lg hover:drop-shadow-xl transition duration-200 rounded-full focus:outline-none\">\n                        <img rel=\"icon\" class=\"rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                    </button>\n\n                    <div id=\"userPanel\" class=\"absolute overflow-hidden -left-4 w-48 bg-white rounded-r-md bg-gray-50 shadow-md border-t border-r border-b border-gray-300 hidden\" style=\"top:-7.8rem;\">\n                        <a href=\"\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300\">Settings</a>\n                        <a href=\"\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300\">Account</a>\n                        <a id=\"openModal\" class=\"block px-4 py-2 text-zinc-700 hover:bg-gradient-to-r from-red-500 to-red-700 hover:text-white border-t border-t-gray-300 cursor-pointer  transition duration-300\">Logout</a>\n                    </div>\n                </div>\n            ");
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
		jteOutput.writeContent(");\">\n                    <div class=\"relative flex bg-black/60\">\n                        <img class=\"my-auto mx-10 rounded-lg h-5/6\"\n                             src=\"https://image.tmdb.org/t/p/w500");
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
		jteOutput.writeContent(">\n                        <div class=\"transform space-y-4 p-4 h-5/6 my-auto\">\n                            <h3 class=\"text-4xl text-white font-semibold \">");
		jteOutput.setContext("h3", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("</h3>\n                            <div class=\"flex space-x-1 flex-warp\">\n                                <p class=\"text-md text-zinc-300 py-1\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getAdultFormatted());
		jteOutput.writeContent("</p>\n                                <p class=\"text-md text-zinc-300 p-1\">• ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRelease_date());
		jteOutput.writeContent("</p>\n                                ");
		for (MovieGenresDTO genre : movieDetail.getGenres()) {
			jteOutput.writeContent("\n                                    <div class=\"p-1 rounded-full shadow-inner-lg border border-gray-200 bg-gray-100\">\n                                        <p class=\"text-zinc-700\">");
			jteOutput.setContext("p", null);
			jteOutput.writeUserContent(genre.getName());
			jteOutput.writeContent("</p>\n                                    </div>\n                                ");
		}
		jteOutput.writeContent("\n                                <p class=\"text-md text-zinc-300 p-1\">• ");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getRuntimeFormatted());
		jteOutput.writeContent("</p>\n                            </div>\n                            <p class=\"text-sm text-zinc-300\">");
		jteOutput.setContext("p", null);
		jteOutput.writeUserContent(movieDetail.getOverview());
		jteOutput.writeContent("</p>\n                            <div class=\"flex items-center space-x-1\">\n                                ");
		for (int i = 1; i <= 5; i++) {
			jteOutput.writeContent("\n                                    ");
			if (i <= movieDetail.getVote_average() / 2) {
				jteOutput.writeContent("\n                                        <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                    ");
			} else {
				jteOutput.writeContent("\n                                        <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                    ");
			}
			jteOutput.writeContent("\n                                ");
		}
		jteOutput.writeContent("\n                            </div>\n                            <div class=\"flex space-x-2\">\n                                <a id=\"bookNow\" href=\"#scrollToBehaviour\" class=\"book-button shadow-card p-3 bg-yellow-500 hover:bg-yellow-400 text-white rounded-lg transition duration-300 \">Book Now!</a>\n                                <div class=\"p-3 rounded-lg shadow-inner-lg border border-gray-200 bg-gray-100 flex\">\n                                    <p class=\"text-zinc-700 font-semibold\">Quota Left: 5</p>\n                                    <p class=\"text-zinc-700 font-medium\">/50</p>\n                                </div>\n                            </div>\n                        </div>\n                    </div>\n            </div>\n        </div>\n        <div class=\"w-full flex space-x-5\">\n            <div class=\"flex-initial\" style=\"width:65.1vw;\">\n                ");
		jteOutput.writeContent("\n                <div id=\"scrollToBehaviour\" class=\"w-full hidden mb-5\">\n                    <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Booking ");
		jteOutput.setContext("h3", null);
		jteOutput.writeUserContent(movieDetail.getTitle());
		jteOutput.writeContent("!</h3>\n                    <div class=\"main w-full relative p-8\">\n                        ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                        ");
		} else {
			jteOutput.writeContent("\n                            <div class=\"absolute p-2 top-4 right-0 bottom-0 left-0 bg-gradient-to-b from-gray-400/30 to-gray-400/70\n                              shadow-md rounded-lg\">\n                                <p class=\"text-center font-bold text-white text-3xl mt-48\"><a href=\"/login\" class=\"text-green-600 hover:text-green-700 drop-shadow-md transition duration-300\">Login</a> To Book a Movie!</p>\n                            </div>\n                        ");
		}
		jteOutput.writeContent("\n                        <div class=\"timing w-full\">\n                            ");
		jteOutput.writeContent("\n                            <div class=\"date-picker w-full overflow-x-auto\">\n                                <h3 class=\"text-2xl font-semibold text-gray-800 mb-6\">Select Date Time</h3>\n                                <div class=\"flex space-x-6 mx-2 mb-8\">\n                                    <div class=\"date-card bg-white shadow-xl rounded-lg w-32 h-40 flex flex-col items-center justify-center cursor-pointer transition-all duration-300 hover:bg-blue-500 hover:text-white\">\n                                        <div class=\"day text-xl font-semibold\">Mon</div>\n                                        <div class=\"date text-3xl font-bold\">12</div>\n                                    </div>\n\n                                    <div class=\"date-card bg-white shadow-xl rounded-lg w-32 h-40 flex flex-col items-center justify-center cursor-pointer transition-all duration-300 hover:bg-blue-500 hover:text-white\">\n                                        <div class=\"day text-xl font-semibold\">Tue</div>\n                                        <div class=\"date text-3xl font-bold\">13</div>\n                                    </div>\n\n                                    <div class=\"date-card bg-white shadow-xl rounded-lg w-32 h-40 flex flex-col items-center justify-center cursor-pointer transition-all duration-300 hover:bg-blue-500 hover:text-white\">\n                                        <div class=\"day text-xl font-semibold\">Wed</div>\n                                        <div class=\"date text-3xl font-bold\">14</div>\n                                    </div>\n\n                                    <div class=\"date-card bg-white shadow-xl rounded-lg w-32 h-40 flex flex-col items-center justify-center cursor-pointer transition-all duration-300 hover:bg-blue-500 hover:text-white\">\n                                        <div class=\"day text-xl font-semibold\">Thu</div>\n                                        <div class=\"date text-3xl font-bold\">15</div>\n                                    </div>\n\n                                    <div class=\"date-card bg-white shadow-xl rounded-lg w-32 h-40 flex flex-col items-center justify-center cursor-pointer transition-all duration-300 hover:bg-blue-500 hover:text-white\">\n                                        <div class=\"day text-xl font-semibold\">Fri</div>\n                                        <div class=\"date text-3xl font-bold\">16</div>\n                                    </div>\n\n                                    <div class=\"date-card bg-white shadow-xl rounded-lg w-32 h-40 flex flex-col items-center justify-center cursor-pointer transition-all duration-300 hover:bg-blue-500 hover:text-white\">\n                                        <div class=\"day text-xl font-semibold\">Sat</div>\n                                        <div class=\"date text-3xl font-bold\">17</div>\n                                    </div>\n\n                                    <div class=\"date-card bg-white shadow-xl rounded-lg w-32 h-40 flex flex-col items-center justify-center cursor-pointer transition-all duration-300 hover:bg-blue-500 hover:text-white\">\n                                        <div class=\"day text-xl font-semibold\">Sun</div>\n                                        <div class=\"date text-3xl font-bold\">18</div>\n                                    </div>\n                                </div>\n                            </div>\n\n                            ");
		jteOutput.writeContent("\n                            <div class=\"time-picker flex flex-col space-y-6 mb-8\">\n                                <h3 class=\"text-2xl font-semibold text-gray-800\">Select Show Time</h3>\n                                <div class=\"time-slot grid gap-6 grid-cols-4 mx-2\">\n                                    <div class=\"time-card bg-white shadow-lg rounded-lg p-6 text-center cursor-pointer transition duration-300 hover:bg-yellow-500 hover:text-white\">\n                                        <div class=\"time text-xl font-semibold\">11:00 AM</div>\n                                    </div>\n\n                                    <div class=\"time-card bg-white shadow-lg rounded-lg p-6 text-center cursor-pointer transition duration-300 hover:bg-yellow-500 hover:text-white\">\n                                        <div class=\"time text-xl font-semibold\">02:30 PM</div>\n                                    </div>\n\n                                    <div class=\"time-card bg-white shadow-lg rounded-lg p-6 text-center cursor-pointer transition duration-300 hover:bg-yellow-500 hover:text-white\">\n                                        <div class=\"time text-xl font-semibold\">06:00 PM</div>\n                                    </div>\n\n                                    <div class=\"time-card bg-white shadow-lg rounded-lg p-6 text-center cursor-pointer transition duration-300 hover:bg-yellow-500 hover:text-white\">\n                                        <div class=\"time text-xl font-semibold\">09:30 PM</div>\n                                    </div>\n                                </div>\n                            </div>\n                            ");
		jteOutput.writeContent("\n                            <a href=\"/movie/{id}/booking\" class=\"bg-green-500  hover:bg-green-400 transition duration-300 text-white rounded-full py-4 px-8 shadow-card flex mx-auto justify-center items-center\">\n                                <span class=\"text-xl font-semibold\">Book Now</span>\n                            </a>\n                        </div>\n                    </div>\n                </div>\n                ");
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
		jteOutput.writeContent("\n                    </div>\n                </div>\n                <div class=\"space-y-5 mb-5\">\n                    <div class=\"space-y-5 overflow-hidden\">\n                        <h3 class=\"text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold\">Movie Reviews</h3>\n                        <div class=\"p-5 relative flex rounded-lg\">\n                            ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                            ");
		} else {
			jteOutput.writeContent("\n                                <div class=\"absolute p-2 top-0 right-0 bottom-0 left-0 bg-gradient-to-b from-gray-400/30 to-gray-400/70\n                              shadow-md rounded-lg\">\n                                    <p class=\"text-center font-bold text-white text-3xl mt-7\"><a href=\"/login\" class=\"text-green-600 hover:text-green-700 drop-shadow-md transition duration-300\">Login</a> To Submit a Review!</p>\n                                </div>\n                            ");
		}
		jteOutput.writeContent("\n                            <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                            ");
		if (isLoggedIn) {
			jteOutput.writeContent("\n                                ");
			for (UserEntity user : userList) {
				jteOutput.writeContent("\n                                    ");
				if (user.getUsername().equals(getUsername) && user.getProfile_picture_path() != null) {
					jteOutput.writeContent("\n                                        <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\"\n                                             src=\"/image/icon/");
					jteOutput.setContext("img", "src");
					jteOutput.writeUserContent(user.getProfile_picture_path());
					jteOutput.setContext("img", null);
					jteOutput.writeContent(".png\">\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                            ");
		} else {
			jteOutput.writeContent("\n                                <img rel=\"icon\" class=\"block size-10 rounded-full mr-2 bg-gray-500\" src=\"/image/icon/user-icon.png\">\n                            ");
		}
		jteOutput.writeContent("\n                            <form class=\"w-full\" action=\"/movie/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(movieDetail.getId());
		jteOutput.setContext("form", null);
		jteOutput.writeContent("/feedback\" method=\"post\">\n                                <input class=\"bg-transparent border-b border-zinc-600/50 text-zinc-600 w-full focus:outline-none\" type=\"text\" id=\"reviews\" name=\"reviews\" placeholder=\"Add Review\" required=\"required\">\n                                <div class=\"flex flex-row-reverse mt-2\">\n                                    <button type=\"submit\"\n                                            class=\"bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right ml-auto\">\n                                        Comment\n                                    </button>\n                                    <input type=\"radio\" id=\"star5\" name=\"rating\" value=\"10.0\" class=\"hidden peer\">\n                                    <label for=\"star5\"\n                                           class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                    <input type=\"radio\" id=\"star4\" name=\"rating\" value=\"8.0\" class=\"hidden peer\">\n                                    <label for=\"star4\"\n                                           class=\" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                    <input type=\"radio\" id=\"star3\" name=\"rating\" value=\"6.0\" class=\"hidden peer\">\n                                    <label for=\"star3\"\n                                           class=\" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                    <input type=\"radio\" id=\"star2\" name=\"rating\" value=\"4.0\" class=\"hidden peer\">\n                                    <label for=\"star2\"\n                                           class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n\n                                    <input type=\"radio\" id=\"star1\" name=\"rating\" value=\"2.0\" class=\"hidden peer\">\n                                    <label for=\"star1\"\n                                           class=\"cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg\"><i class=\"fas fa-star\"></i></label>\n                                </div>\n                            </form>\n                        </div>\n                        <div class=\"transition-transform duration-500 ease-in-out max-h-96 overflow-y-scroll\n                                p-5 space-y-12\">\n                            ");
		if (movieFeedbacks != null) {
			jteOutput.writeContent("\n                                ");
			for (FeedBackEntity feedbacks : movieFeedbacks) {
				jteOutput.writeContent("\n                                    ");
				if (feedbacks.getMovieId() == movieDetail.getId()) {
					jteOutput.writeContent("\n                                        <div class=\"w-full space-y-2\">\n                                            <div class=\"flex\">\n                                                <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                                <img class=\"size-10 rounded-full bg-gray-500 mr-2\">\n                                                <h3 class=\"text-xl font-bold my-auto\">");
					jteOutput.setContext("h3", null);
					jteOutput.writeUserContent(feedbacks.getUsername());
					jteOutput.writeContent("</h3>\n                                            </div>\n                                            <div class=\"flex items-center\">\n                                                ");
					for (int i = 1; i <= 5; i++) {
						jteOutput.writeContent("\n                                                    ");
						if (i <= feedbacks.getRating() / 2) {
							jteOutput.writeContent("\n                                                        <span class=\"text-yellow-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                                    ");
						} else {
							jteOutput.writeContent("\n                                                        <span class=\"text-gray-400 drop-shadow-md\"><i class=\"fas fa-star\"></i></span>\n                                                    ");
						}
						jteOutput.writeContent("\n                                                ");
					}
					jteOutput.writeContent("\n                                            </div>\n                                            <div class=\"overflow-y-auto max-h-full\">\n                                                <p class=\"reviews text-md text-zinc-600\" style=\"display: -webkit-box; -webkit-box-orient: vertical;\n                                        -webkit-line-clamp: 5; overflow: hidden;\">");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(feedbacks.getReviews());
					jteOutput.writeContent("</p>\n                                            </div>\n                                            <button class=\"show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white \">Show More!</button>\n                                        </div>\n                                    ");
				}
				jteOutput.writeContent("\n                                ");
			}
			jteOutput.writeContent("\n                            ");
		}
		jteOutput.writeContent("\n                            ");
		for (MovieReviewsDTO movie : movieReviews) {
			jteOutput.writeContent("\n                                <div class=\"w-full space-y-2\">\n                                    <div class=\"flex\">\n                                        <div class=\"border-sky-400 border-l-4 pl-2 h-10\"></div>\n                                        <img class=\"size-10 rounded-full bg-gray-500 mr-2\" src=\"https://image.tmdb.org/t/p/w92");
			jteOutput.setContext("img", "src");
			jteOutput.writeUserContent(movie.getAuthor_details().getAvatar_path());
			jteOutput.setContext("img", null);
			jteOutput.writeContent("\">\n                                        <h3 class=\"text-xl font-bold my-auto\">");
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
			var __jte_html_attribute_2 = movie.getTitle();
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
				jteOutput.writeContent(" alt=\"");
				jteOutput.setContext("img", "alt");
				jteOutput.writeUserContent(__jte_html_attribute_2);
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
		jteOutput.writeContent("\n            <div class=\"flex-initial\" style=\"width:39%;\">\n                <div class=\"w-full\">\n                    <h3 class=\"text-xl sm:text-2xl lg:text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4\">\n                        Extra Details\n                    </h3>\n                    <div class=\"p-4 mt-4 w-full bg-white rounded-lg shadow-card relative overflow-hidden\">\n                        <div class=\"bg-gradient-to-r from-sky-400 to-blue-500 p-4 px-24 absolute top-0 left-0\" style=\"border-radius: 0 0 30px 0;\"></div>\n                        <div class=\"space-y-4 mt-8\">\n                            <div>\n                                <p class=\"border-sky-400 border-l-4 pl-2 text-black text-lg font-bold\">Status</p>\n                                <p class=\"text-zinc-700 ml-3\">");
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
		jteOutput.writeContent("\n<script src=\"/asset/js/AJAX-handler.js\"></script>\n<script src=\"/asset/js/navbar.js\"></script>\n<script src=\"/asset/js/modal.js\"></script>\n<script src=\"/asset/js/carousel.js\"></script>\n<script src=\"/asset/js/booking.js\"></script>\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		String WebName = (String)params.get("WebName");
		String getUsername = (String)params.get("getUsername");
		Boolean isLoggedIn = (Boolean)params.get("isLoggedIn");
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
		render(jteOutput, jteHtmlInterceptor, WebName, getUsername, isLoggedIn, movieDetail, movieGenres, movieAuthorDetailsReview, userList, movieFeedbacks, movieCast, movieKeywords, movieReviews, movieRecommendation, popularMovies, topRatedMovies, upcomingMovies);
	}
}
