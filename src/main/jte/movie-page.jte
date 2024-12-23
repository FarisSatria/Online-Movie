@import java.util.List
@import com.movieonline.Online.Movie.entity.dto.*
@import com.movieonline.Online.Movie.entity.dto.MovieDTO
@import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO
@import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO
@import com.movieonline.Online.Movie.entity.dto.MovieGenresDTO
@import com.movieonline.Online.Movie.entity.model.FeedBackEntity

@param String WebName
@param Boolean isLoggedIn
@param MovieDTO movieDetail
@param MovieGenresDTO movieGenres
@param MovieAuthorDetailsReviewDTO movieAuthorDetailsReview
@param List<FeedBackEntity> movieFeedbacks
@param List<MovieCastDTO> movieCast
@param List<MovieKeywordsDTO> movieKeywords
@param List<MovieReviewsDTO> movieReviews
@param List<MovieDTO> movieRecommendation
@param List<MovieDTO> popularMovies
@param List<MovieDTO> topRatedMovies
@param List<MovieDTO> upcomingMovies

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | Homepage</title>
    <link rel="icon" href="/image/favicon/eudaemonia.png">
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link rel="stylesheet" href="/asset/css/style.css">
</head>
<body class="bg-gray-100 font-avenir min-h-screen">
<div class="flex">
    <div class="flex-initial" style="width:9.5vw;">
        <!-- Floating Sidebar -->
        <div class="fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20">
            <!-- Top Icons -->
            <ul class="space-y-6 text-center">
                <!-- Icon 1 -->
                <li>
                    <a href="/"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-home text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 2 -->
                <li>
                    <a href="#"
                       class="block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-film text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                @template.include.header.sidebar-searchbar()
            </ul>

            @if(isLoggedIn)
                <!-- Logout Icon -->
                <div class="text-center mt-auto">
                    <a href="/logout"
                       class="block text-red-500 hover:text-red-700 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-md transition duration-200">
                        <i class="fas fa-sign-out-alt text-2xl"></i>
                    </a>
                </div>
            @else
                <!-- Login Icon -->
                <div class="text-center mt-auto">
                    <a href="/login"
                       class="block text-green-500  hover:text-green-400 hover:-rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-md transition duration-200">
                        <i class="fas fa-sign-in-alt text-2xl"></i>
                    </a>
                </div>
            @endif
        </div>
    </div>
    <div class="flex-initial mt-8" style="width:87.5vw;">
        <!-- Floating, Rounded, Shadow Carousel -->
        <div class="relative h-1/4 w-full mb-5 rounded-xl overflow-hidden shadow-card" style="height:70vh;">
            <!-- Carousel Images -->
            <div id="carousel" class="flex transition-transform duration-500 ease-in-out h-full"
                 style="background-image:url(https://image.tmdb.org/t/p/w1280${movieDetail.getBackdrop_path()});">
                    <div class="relative flex bg-black/60">
                        <img class="my-auto mx-10 rounded-lg h-5/6"
                             src="https://image.tmdb.org/t/p/w500${movieDetail.getPoster_path()}" alt="${movieDetail.getTitle()}">
                        <div class="transform space-y-4 p-4 h-5/6 my-auto">
                            <h3 class="text-4xl text-white font-semibold ">${movieDetail.getTitle()}</h3>
                            <div class="flex space-x-1 flex-warp">
                                <p class="text-md text-zinc-300 py-1">${movieDetail.getAdultFormatted()}</p>
                                <p class="text-md text-zinc-300 p-1">• ${movieDetail.getRelease_date()}</p>
                                @for (MovieGenresDTO genre : movieDetail.getGenres())
                                    <div class="p-1 rounded-full shadow-inner-lg border border-gray-200 bg-gray-100">
                                        <p class="text-zinc-700">${genre.getName()}</p>
                                    </div>
                                @endfor
                                <p class="text-md text-zinc-300 p-1">• ${movieDetail.getRuntimeFormatted()}</p>
                            </div>
                            <p class="text-sm text-zinc-300">${movieDetail.getOverview()}</p>
                            <div class="flex items-center space-x-1">
                                @for (int i = 1; i <= 5; i++)
                                    @if (i <= movieDetail.getVote_average() / 2)
                                        <span class="text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                    @else
                                        <span class="text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                    @endif
                                @endfor
                            </div>
                            <div class="flex space-x-2">
                                <a id="bookNow" href="#bookingSection" class="book-button shadow-card p-3 bg-yellow-400 hover:bg-yellow-500 text-white rounded-lg transition duration-300 ">Book Now!</a>
                                <div class="p-3 rounded-lg shadow-inner-lg border border-gray-200 bg-gray-100 flex">
                                    <p class="text-zinc-700 font-semibold">Quota Left: 5</p>
                                    <p class="text-zinc-700 font-medium">/50</p>
                                </div>
                            </div>
                        </div>
                    </div>
            </div>
        </div>
        <div class="w-full flex space-x-5">
            <div class="flex-initial" style="width:65.1vw;">
                <!-- Movie Booking Section -->
                <div id="bookingSection" class="w-full hidden mb-5">
                    <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Booking Section</h3>
                    <div class="main p-6 w-full space-y-4">
                        <div class="timings flex flex-col items-center w-full space-y-4">
                            <!-- Date Selection -->
                            <div class="dates w-full flex justify-center gap-4">
                                <input type="radio" name="date" id="d1" checked class="hidden">
                                <label for="d1" class="dates-item shadow-card shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">
                                    <div class="day text-xs font-semibold">Friday</div>
                                    <div class="date text-lg font-bold">12</div>
                                </label>
                                <input type="radio" name="date" id="d2" class="hidden">
                                <label for="d2" class="dates-item shadow-card shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">
                                    <div class="day text-xs font-semibold">Saturday</div>
                                    <div class="date text-lg font-bold">13</div>
                                </label>
                                <input type="radio" name="date" id="d3" class="hidden">
                                <label for="d3" class="dates-item shadow-card shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">
                                    <div class="day text-xs font-semibold">Sunday</div>
                                    <div class="date text-lg font-bold">14</div>
                                </label>
                                <input type="radio" name="date" id="d4" class="hidden">
                                <label for="d4" class="dates-item shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">
                                    <div class="day text-xs font-semibold">Monday</div>
                                    <div class="date text-lg font-bold">15</div>
                                </label>
                                <input type="radio" name="date" id="d5" class="hidden">
                                <label for="d5" class="dates-item shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">
                                    <div class="day text-xs font-semibold">Tuesday</div>
                                    <div class="date text-lg font-bold">16</div>
                                </label>
                                <input type="radio" name="date" id="d6" class="hidden">
                                <label for="d6" class="dates-item shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">
                                    <div class="day text-xs font-semibold">Wednesday</div>
                                    <div class="date text-lg font-bold">17</div>
                                </label>
                                <input type="radio" name="date" id="d7" class="hidden">
                                <label for="d7" class="dates-item shadow-card w-20 h-24 bg-white flex flex-col items-center justify-center p-2 rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">
                                    <div class="day text-xs font-semibold">Thursday</div>
                                    <div class="date text-lg font-bold">18</div>
                                </label>
                            </div>

                            <!-- Time Selection -->
                            <div class="times w-full flex justify-center gap-4">
                                <input type="radio" name="time" id="t1" checked class="hidden">
                                <label for="t1" class="time text-sm shadow-card w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">11:00</label>
                                <input type="radio" name="time" id="t2" class="hidden">
                                <label for="t2" class="time text-sm shadow-card w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">14:30</label>
                                <input type="radio" name="time" id="t3" class="hidden">
                                <label for="t3" class="time text-sm shadow-card w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">18:00</label>
                                <input type="radio" name="time" id="t4" class="hidden">
                                <label for="t4" class="time text-sm shadow-card w-fit px-4 py-2 bg-white rounded-md cursor-pointer hover:bg-sky-500 hover:text-white transition duration-200">21:30</label>
                            </div>
                            <a href="/movie/{id}/booking" type="button" class="bg-green-500 shadow-card hover:bg-green-400 text-white text-sm py-2 px-6 rounded-md transition duration-300 cursor-pointer shadow-card float-right">Book</a>
                        </div>
                    </div>
                </div>
                <!-- Movie Cast Section (Horizontal Scroll) -->
                <div class="overflow-x-scroll mb-5">
                    <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Top Billed Cast</h3>
                    <div class="flex space-x-4 overflow-y-hidden pb-4 pt-4">
                        <!-- Movie Card -->
                        @for (MovieCastDTO movie : movieCast)
                            <a class="rounded-lg bg-gray-50 shadow-card overflow-hidden
                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 ">
                                <img class="w-full object-cover" src="https://image.tmdb.org/t/p/w300${movie.getProfile_path()}"
                                     alt="${movie.getName()}">
                                <div class="p-4 space-y-2">
                                    <h3 class="text-xl text-black font-semibold" style=" display: -webkit-box;
                                    -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;">${movie.getName()}</h3>
                                    <p class="text-sm text-zinc-400">${movie.getCharacter()}</p>
                                </div>
                            </a>
                        @endfor
                    </div>
                </div>
                <div class="space-y-5 mb-5">
                    <div class="relative space-y-5 overflow-hidden">
                        <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Movie Reviews</h3>
                        @if(isLoggedIn)
                        @else
                            <div class="absolute p-2 w-full h-28  bg-gradient-to-b from-gray-400/30 to-gray-400/70
                              shadow-md rounded-lg">
                                <p class="text-center font-bold text-white text-3xl mt-7"><a href="/login" class="text-green-600 hover:text-green-700 drop-shadow-md transition duration-300">Login</a> To Submit a Review!</p>
                            </div>
                        @endif
                        <div class="p-5 flex rounded-lg">
                            <div class="border-sky-400 border-l-4 pl-2 h-8"></div>
                            <img class="size-8 rounded-full bg-gray-500 mr-2">
                            <form class="w-full" action="/movie/${movieDetail.getId()}/feedback" method="post">
                                <input class="bg-transparent border-b border-zinc-600/50 text-zinc-600 w-full focus:outline-none" type="text" id="reviews" name="reviews" placeholder="Add Review" required="required">
                                <div class="flex flex-row-reverse mt-2">
                                    <button type="submit"
                                            class="bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right ml-auto">
                                        Comment
                                    </button>
                                    <input type="radio" id="star5" name="rating" value="10.0" class="hidden peer">
                                    <label for="star5"
                                           class="cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg"><i class="fas fa-star"></i></label>

                                    <input type="radio" id="star4" name="rating" value="8.0" class="hidden peer">
                                    <label for="star4"
                                           class=" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg"><i class="fas fa-star"></i></label>

                                    <input type="radio" id="star3" name="rating" value="6.0" class="hidden peer">
                                    <label for="star3"
                                           class=" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg"><i class="fas fa-star"></i></label>

                                    <input type="radio" id="star2" name="rating" value="4.0" class="hidden peer">
                                    <label for="star2"
                                           class="cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg"><i class="fas fa-star"></i></label>

                                    <input type="radio" id="star1" name="rating" value="2.0" class="hidden peer">
                                    <label for="star1"
                                           class="cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md my-auto text-lg"><i class="fas fa-star"></i></label>
                                </div>
                            </form>
                        </div>
                        <div class="transition-transform duration-500 ease-in-out max-h-96 overflow-y-scroll
                                p-5 space-y-12">
                            @if(movieFeedbacks != null)
                                @for(FeedBackEntity feedbacks : movieFeedbacks)
                                    @if(feedbacks.getMovieId() == movieDetail.getId())
                                        <div class="w-full space-y-2">
                                            <div class="flex">
                                                <div class="border-sky-400 border-l-4 pl-2 h-8"></div>
                                                <img class="size-8 rounded-full bg-gray-500 mr-2">
                                                <h3 class="text-xl font-bold my-auto">${feedbacks.getUsername()}</h3>
                                            </div>
                                            <div class="flex items-center">
                                                @for (int i = 1; i <= 5; i++)
                                                    @if (i <= feedbacks.getRating() / 2)
                                                        <span class="text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                                    @else
                                                        <span class="text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                                    @endif
                                                @endfor
                                            </div>
                                            <div class="overflow-y-auto max-h-full">
                                                <p class="reviews text-md text-zinc-600" style="display: -webkit-box; -webkit-box-orient: vertical;
                                        -webkit-line-clamp: 5; overflow: hidden;">${feedbacks.getReviews()}</p>
                                            </div>
                                            <button class="show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white ">Show More!</button>
                                        </div>
                                    @endif
                                @endfor
                            @endif
                            @for (MovieReviewsDTO movie : movieReviews)
                                <div class="w-full space-y-2">
                                    <div class="flex">
                                        <div class="border-sky-400 border-l-4 pl-2 h-8"></div>
                                        <img class="size-8 rounded-full bg-gray-500 mr-2" src="https://image.tmdb.org/t/p/w92${movie.getAuthor_details().getAvatar_path()}">
                                        <h3 class="text-xl font-bold my-auto">${movie.getAuthor()}</h3>
                                    </div>
                                    <div class="flex items-center">
                                        @for (int i = 1; i <= 5; i++)
                                            @if (i <= movie.getAuthor_details().getRating() / 2)
                                                <span class="text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                            @else
                                                <span class="text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                            @endif
                                        @endfor
                                    </div>
                                    <div class="overflow-y-auto max-h-full">
                                        <p class="reviews text-md text-zinc-600" style="display: -webkit-box; -webkit-box-orient: vertical;
                                    -webkit-line-clamp: 5; overflow: hidden;">${movie.getContent()}</p>
                                    </div>
                                    <button class="show-more bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white ">Show More!</button>
                                </div>
                            @endfor
                        </div>
                    </div>
                </div>
                <!-- Movie Recommendation Section (Horizontal Scroll) -->
                <div id="recommendation" class="overflow-x-scroll mb-5">
                    <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Recommended For You</h3>
                    <div class="flex space-x-4 overflow-y-hidden pb-4 pt-5">
                        <!-- Movie Card -->
                        @for (MovieDTO movie : movieRecommendation)
                            <a href="/movie/${movie.getId()}"  class="rounded-lg bg-gray-50 shadow-card overflow-hidden
                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 ">
                                <img class="w-full object-cover" src="https://image.tmdb.org/t/p/w300${movie.getPoster_path()}"
                                     alt="${movie.getTitle()}">
                                <div class="p-4 space-y-2">
                                    <h3 class="text-xl text-black font-semibold" style=" display: -webkit-box;
                            -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;">${movie.getTitle()}</h3>
                                    <div class="flex items-center">
                                        @for (int i = 1; i <= 5; i++)
                                            @if (i <= movie.getVote_average() / 2)
                                                <span class="text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                            @else
                                                <span class="text-gray-400 drop-shadow-md"><i class="fas fa-star"></i></span>
                                            @endif
                                        @endfor
                                    </div>
                                </div>
                            </a>
                        @endfor
                    </div>
                </div>
            </div>
            <!-- Extra Detail Sections-->
            <div class="flex-initial" style="width:39%;">
                <div class="w-full">
                    <h3 class="text-xl sm:text-2xl lg:text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4">
                        Extra Details
                    </h3>
                    <div class="p-4 mt-4 w-full bg-white rounded-lg shadow-card relative overflow-hidden">
                        <div class="bg-gradient-to-r from-sky-400 to-blue-500 p-4 px-24 absolute top-0 left-0" style="border-radius: 0 0 30px 0;"></div>
                        <div class="space-y-4 mt-8">
                            <div>
                                <p class="border-sky-400 border-l-4 pl-2 text-black text-lg font-bold">Status</p>
                                <p class="text-zinc-700 ml-3">${movieDetail.getStatus()}</p>
                            </div>
                            <div>
                                <p class="border-sky-400 border-l-4 pl-2 text-black text-lg font-bold">Original Language</p>
                                <p class="text-zinc-700 ml-3">${movieDetail.getEnglish_name()}</p>
                            </div>
                            <div>
                                <p class="border-sky-400 border-l-4 pl-2 text-black text-lg font-bold">Budget</p>
                                <p class="text-zinc-700 ml-3">$${movieDetail.getBudgetFormatted()}</p>
                            </div>
                            <div>
                                <p class="border-sky-400 border-l-4 pl-2 text-black text-lg font-bold">Revenue</p>
                                <p class="text-zinc-700 ml-3">$${movieDetail.getRevenueFormatted()}</p>
                            </div>
                        </div>
                        <p class="border-sky-400 border-l-4 pl-2 text-black text-lg font-bold mt-4">Keywords</p>
                        <div class="overflow-auto max-h-full">
                            <div class="ml-3 flex flex-wrap items-start">
                                @for(MovieKeywordsDTO movie : movieKeywords)
                                    <div class="mr-2 mt-2 p-1 shadow-inner-lg rounded-lg border border-gray-200 bg-gray-100">
                                        <p class="text-zinc-700">${movie.getName()}</p>
                                    </div>
                                @endfor
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Footer -->
@template.include.footer.footer()
<script src="/asset/js/AJAX-handler.js"></script>
<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/carousel.js"></script>
<script src="/asset/js/booking.js"></script>
</body>
</html>