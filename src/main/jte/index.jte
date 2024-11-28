@import java.util.List
@import com.movieonline.Online.Movie.entity.dto.MovieDTO

@param String WebName
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
<body class="bg-gray-200 font-avenir min-h-screen shadow-inner-xl">
<div class="flex">
    <div class="flex-initial" style="width:9.5vw;">
        <!-- Floating Sidebar -->
        <div class="fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-md flex flex-col justify-between p-4">
            <!-- Top Icons -->
            <ul class="space-y-6 text-center">
                <!-- Icon 1 -->
                <li>
                    <a href="/"
                       class="block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200">
                        <i class="fas fa-home text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 2 -->
                <li>
                    <a href="#"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200">
                        <i class="fas fa-film text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 3 -->
                <li>
                    <a href="#"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200">
                        <i class="fas fa-fire text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 4 -->
                <li>
                    <a href="#"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200">
                        <i class="fas fa-search text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
            </ul>

            <!-- Logout Icon -->
            <div class="text-center mt-auto">
                <a href="/logout"
                   class="block text-red-500 hover:text-red-700 hover:-rotate-12 hover:scale-125 hover:drop-shadow-md transition duration-200">
                    <i class="fas fa-sign-out-alt text-2xl"></i>
                </a>
            </div>
        </div>
    </div>
    <div class="flex-initial mt-8" style="width:60vw;">
        <!-- Floating, Rounded, Shadow Carousel -->
        <div class="relative h-1/4 w-full mb-5 rounded-xl overflow-hidden shadow-md" style="height:70vh;">
            <!-- Carousel Images -->
            <div id="carousel" class="flex transition-transform duration-500 ease-in-out h-full">
                @for (MovieDTO movie : popularMovies)
                    <div class="relative">
                        <img class="w-screen h-full object-fill"
                             src="https://image.tmdb.org/t/p/w1280${movie.getBackdrop_path()}" alt="${movie.getTitle()}">
                        <div class="absolute left-4 top-1/2 transform -translate-y-1/2 w-72 h-97 space-y-4 p-4 rounded-lg shadow-inner-lg bg-white">
                            <h4 class="text-xl font-medium text-black border-sky-400 border-l-4 pl-2 ">#Popular
                                Movies!</h4>
                            <h3 class="text-4xl text-black font-semibold ">${movie.getTitle()}</h3>
                            <p class="text-sm text-zinc-400 h-24 overflow-hidden">${movie.getOverview()}</p>
                            <div class="flex items-center space-x-1 ">
                                @for (int i = 1; i <= 5; i++)
                                    @if (i <= movie.getVote_average() / 1.5)
                                        <span class="text-yellow-400"><i class="fas fa-star"></i></span>
                                    @else
                                        <span class="text-gray-400"><i class="fas fa-star"></i></span>
                                    @endif
                                @endfor
                            </div>
                        </div>
                    </div>
                @endfor
            </div>

            <!-- Navigation Arrows -->
            <div class="right-3 bottom-3 p-1 h-24 rounded-full shadow-inner-lg w-52 absolute flex bg-gray-50">
                <!-- Left Arrow -->
                <button id="prev"
                        class="mr-4 bg-sky-400 hover:bg-sky-500 shadow-md w-1/2 h-full transition duration-300 rounded-full text-white">
                    <i class="fas fa-chevron-left"></i>
                </button>
                <!-- Right Arrow -->
                <button id="next"
                        class="bg-sky-400 hover:bg-sky-500 shadow-md w-1/2 h-full transition duration-300 rounded-full text-white">
                    <i class="fas fa-chevron-right"></i>
                </button>
            </div>
        </div>
        <!-- Popular Movies Section (Horizontal Scroll) -->
        <div class="w-full mb-5">
            <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Popular Movies</h3>
            <div class="flex space-x-4 overflow-y-hidden pb-4 pt-5">
                <!-- Movie Card -->
                @for (MovieDTO movie : popularMovies)
                    <a href="/movie/${movie.getId()}" class="rounded-lg bg-gray-50 shadow-md overflow-hidden
                max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md">
                        <img class="w-full object-cover" src="https://image.tmdb.org/t/p/w300${movie.getPoster_path()}"
                             alt="${movie.getTitle()}">
                        <div class="p-4 space-y-2">
                            <h3 class="text-xl text-black font-semibold overflow-hidden text-ellipsis h-6">${movie.getTitle()}</h3>
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
        <!-- Top Rated Movies Section (Horizontal Scroll) -->
        <div class="w-full mb-5">
            <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Top Rated Movies</h3>
            <div class="flex space-x-4 overflow-y-hidden pb-4 pt-5">
                <!-- Movie Card -->
                @for (MovieDTO movie : topRatedMovies)
                    <a href="/movie/${movie.getId()}" class="rounded-lg bg-gray-50 shadow-md overflow-hidden
                max-w-xs w-48 h-96 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2 hover:shadow-md">
                        <img class="w-full object-cover" src="https://image.tmdb.org/t/p/w300${movie.getPoster_path()}"
                             alt="${movie.getTitle()}">
                        <div class="p-4  space-y-2">
                            <h3 class="text-xl text-black font-semibold overflow-hidden text-ellipsis h-6">${movie.getTitle()}</h3>
                            <div class="flex items-center">
                                @for (int i = 1; i <= 5; i++)
                                    @if (i <= movie.getVote_average() / 2)
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
    <div class="flex-initial" style="width:30vw;">
        <div class="w-3/12 ml-5 mt-8">
            <div class="w-96">
                <h3 class="ml-3 text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold mb-4">Upcoming
                    Movies</h3>
                <div class="overflow-auto p-3 h-screen">
                    <div class="flex flex-col space-y-6">
                        @for (MovieDTO movie : topRatedMovies)
                            <a href="/movie/${movie.getId()}" class="bg-gray-50 rounded-xl flex shadow-md overflow-hidden max-w-sm w-full h-40
                    flex-shrink-0 transition-transform transform hover:scale-105 hover:-rotate-2">
                                <img class="w-28 object-cover"
                                     src="https://image.tmdb.org/t/p/w500${movie.getPoster_path()}"
                                     alt="${movie.getTitle()}">
                                <div class="p-4 overflow-hidden space-y-2" style="height:90%;">
                                    <h3 class="text-xl text-black font-semibold">${movie.getTitle()}</h3>
                                    <p class="text-sm text-zinc-400">${movie.getOverview()}</p>
                                </div>
                            </a>
                        @endfor
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="p-5 text-center text-lg">
    <ul>
        <li><p class="font-avenir">That's the end of the show!</p></li>
        <li><i class="fas fa-film"></i></li>
    </ul>
</div>
<script src="/asset/js/main.js"></script>
</body>
</html>