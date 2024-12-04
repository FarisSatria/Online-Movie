@import java.util.List
@import com.movieonline.Online.Movie.entity.dto.*
@import com.movieonline.Online.Movie.entity.dto.MovieDTO
@import com.movieonline.Online.Movie.entity.dto.MovieKeywordsDTO
@import com.movieonline.Online.Movie.entity.dto.MovieReviewsDTO
@import com.movieonline.Online.Movie.entity.dto.MovieGenresDTO

@param String WebName
@param MovieDTO movieDetail
@param MovieGenresDTO movieGenres
@param MovieAuthorDetailsReviewDTO movieAuthorDetailsReview
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
        @template.include.header.navbar()
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
                                    <div class="p-1 rounded-full shadow-inner-lg bg-gray-100">
                                        <p class="text-zinc-700">${genre.getName()}</p>
                                    </div>
                                @endfor
                                <p class="text-md text-zinc-300 p-1">• ${movieDetail.getRuntimeFormatted()}</p>
                            </div>
                            <p class="text-sm text-zinc-300">${movieDetail.getOverview()}</p>
                            <div class="flex items-center space-x-1">
                                @for (int i = 1; i <= 5; i++)
                                    @if (i <= movieDetail.getVote_average() / 1.5)
                                        <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                                    @else
                                        <span class="text-gray-400"><i class="fas fa-star"></i></span>
                                    @endif
                                @endfor
                            </div>
                            <button class="book-button p-3 bg-sky-400 hover:bg-sky-500 text-white rounded-lg transition duration-300 ">Book Now!</button>
                        </div>
                    </div>
            </div>
        </div>
        <div class="w-full flex space-x-5">
            <div class="flex-initial space-y-5" style="width:65.1vw;">
                <!-- Movie Cast Section (Horizontal Scroll) -->
                <div class="overflow-x-scroll">
                    <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Top Billed Cast</h3>
                    <div class="flex space-x-4 overflow-y-hidden pb-4 pt-4">
                        <!-- Movie Card -->
                        @for (MovieCastDTO movie : movieCast)
                            <a class="rounded-lg bg-gray-50 shadow-card overflow-hidden
                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-card">
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
                <div class="space-y-5">
                    <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Movie Reviews</h3>
                    <div class="transition-transform duration-500 ease-in-out max-h-96 overflow-y-scroll
                                p-5 space-y-12">
                        @for (MovieReviewsDTO movie : movieReviews)
                            <div class="w-full space-y-2">
                                <div class="flex">
                                    <div class="border-sky-400 border-l-4 pl-2 h-6"></div>
                                    <img class="h-6 w-6 rounded-full bg-gray-500 mr-2" src="https://image.tmdb.org/t/p/w92${movie.getAuthor_details().getAvatar_path()}">
                                    <h3 class="text-xl font-bold">${movie.getAuthor()}</h3>
                                </div>
                                <div class="flex items-center">
                                    @for (int i = 1; i <= 5; i++)
                                        @if (i <= movie.getAuthor_details().getRating() / 1.5)
                                            <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                                        @else
                                            <span class="text-gray-400"><i class="fas fa-star"></i></span>
                                        @endif
                                    @endfor
                                </div>
                                <div class="overflow-y-auto max-h-full">
                                    <p class="text-md text-zinc-600 " style=" display: -webkit-box; -webkit-box-orient: vertical;
                                    -webkit-line-clamp: 5; overflow: hidden;">${movie.getContent()}</p>
                                </div>
                            </div>
                        @endfor
                    </div>
                </div>
                <!-- Movie Recommendation Section (Horizontal Scroll) -->
                <div id="recommendation" class="overflow-x-scroll">
                    <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Recommended For You</h3>
                    <div class="flex space-x-4 overflow-y-hidden pb-4 pt-5">
                        <!-- Movie Card -->
                        @for (MovieDTO movie : movieRecommendation)
                            <a href="/movie/${movie.getId()}"  class="rounded-lg bg-gray-50 shadow-card overflow-hidden
                    max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-card">
                                <img class="w-full object-cover" src="https://image.tmdb.org/t/p/w300${movie.getPoster_path()}"
                                     alt="${movie.getTitle()}">
                                <div class="p-4 space-y-2">
                                    <h3 class="text-xl text-black font-semibold" style=" display: -webkit-box;
                            -webkit-box-orient: vertical; -webkit-line-clamp: 1; overflow: hidden;">${movie.getTitle()}</h3>
                                    <div class="flex items-center">
                                        @for (int i = 1; i <= 5; i++)
                                            @if (i <= movie.getVote_average() / 1.5)
                                                <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                                            @else
                                                <span class="text-gray-400"><i class="fas fa-star"></i></span>
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
            <div class="flex-initial" style="width:39;">
                <div class="w-full">
                    <h3 class="text-xl sm:text-2xl lg:text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4">
                        Extra Details
                    </h3>
                    <div class="p-4 mt-4 mx-auto bg-white rounded-lg shadow-card relative overflow-hidden">
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
                                    <div class="mr-2 mt-2 p-1 rounded-lg border border-gray-200 bg-gray-100">
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
<!-- The Modal -->
@template.include.modal.booking()
<script src="/asset/js/modal.js"></script>
<script src="/asset/js/main.js"></script>
</body>
</html>