@import com.movieonline.Online.Movie.entity.dto.MovieDTO
@import com.movieonline.Online.Movie.entity.model.UserEntity
@import java.util.List

@param String WebName
@param Long adminCount
@param Long userCount
@param String getUsername
@param List<MovieDTO> topRatedMovies
@param List<MovieDTO> popularMovies
@param List<MovieDTO> upcomingMovies
@param List<UserEntity> userList

<!doctype html>
<html lang="en" class="scroll-smooth">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | Dashboard</title>
    <link rel="icon" href="/image/favicon/eudaemonia.png">

    <!-- Tailwind CSS -->
    <script src="https://cdn.tailwindcss.com"></script>

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <!-- Custom Styles -->
    <link rel="stylesheet" href="/asset/css/style.css">
</head>
<body class="bg-gray-100">
<div class="flex">
    <div class="flex-initial" style="width:9.5vw;">
        <!-- Floating Sidebar -->
        <div class="fixed top-8 bg-gray-50 left-8 bottom-8 w-16 rounded-xl shadow-card flex flex-col justify-between p-4 z-20">
            <!-- Top Icons -->
            <ul class="space-y-6 text-center">
                <!-- Icon 1 -->
                <li>
                    <a href="#"
                       class="block text-sky-400 hover:text-yellow-400 drop-shadow-md hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-desktop text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 2 -->
                <li>
                    <a href="/dashboard/booking"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-book text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 3 -->
                <li>
                    <a href="/dashboard/users"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-users text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
            </ul>

            <!-- User Icon -->
            <div class="text-center w-full mt-auto relative">
                <a href="/"
                   class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200 ">
                    <i class="fas fa-home text-2xl"></i>
                </a>
                <div class="w-full h-px bg-black opacity-20 mb-1"></div>
                <button id="userButton" class="block size-8 drop-shadow-lg rounded-full focus:outline-none">
                    @for(UserEntity user : userList)
                        @if(user.getUsername().equals(getUsername))
                            @if(user.getProfilePicturePath() != null)
                                <img rel="icon" class="rounded-full mr-2 size-8 bg-gray-500 hover:drop-shadow-xl hover:scale-110 transition duration-200"
                                      src="/image/${user.getId()}">
                            @else
                                <img rel="icon" class="rounded-full mr-2 size-8 bg-gray-500 hover:drop-shadow-xl hover:scale-110 transition duration-200" src="/image/icon/user-icon.png">
                            @endif
                        @endif
                    @endfor
                </button>

                <div id="userPanel" class="absolute w-40 -left-1 -top-28 text-left bg-gray-50 rounded-lg shadow-md border border-gray-300 hidden">
                    <a href="/booking" class="block px-4 py-2 text-zinc-700 hover:bg-gray-200 rounded-t-lg cursor-pointer transition duration-300">Booking</a>
                    <a href="/account" class="block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300">Account</a>
                    <div class="group">
                        <a id="openModal" class="block px-4 py-2 text-zinc-700 group-hover:bg-red-600 group-hover:text-white border-t border-t-gray-300 cursor-pointer rounded-b-lg transition duration-300">Logout</a>
                        <div class="absolute group-hover:border-t-red-600 left-2 -bottom-4 w-0 h-0 border-l-[13px] border-r-[13px] border-l-transparent border-r-transparent border-t-[16px] border-t-gray-50 drop-shadow-md transition duration-300"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="flex-initial mt-8" style="width:87.5vw;">
        <!-- Home Section -->
        <section id="home" class="mb-6">
            <h1 class="text-2xl font-semibold mb-4">Dashboard Overview</h1>
            <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-4">
                <div class="bg-gray-50 rounded-lg shadow-md p-4 text-center">
                    <h2 class="text-gray-700 font-medium">Users</h2>
                    <p class="text-blue-600 text-2xl font-bold">${userCount}</p>
                </div>
                <div class="bg-gray-50 rounded-lg shadow-md p-4 text-center">
                    <h2 class="text-gray-700 font-medium">Admins</h2>
                    <p class="text-green-600 text-2xl font-bold">${adminCount}</p>
                </div>
                <div class="bg-gray-50 rounded-lg shadow-md p-4 text-center">
                    <h2 class="text-gray-700 font-medium">Total Movies</h2>
                    <p class="text-purple-600 text-2xl font-bold">2387</p>
                </div>
                <div class="bg-gray-50 rounded-lg shadow-md p-4 text-center border-2 border-dashed border-gray-300
                flex items-center justify-center">
                    <p class="text-gray-500 font-medium">Coming Soon!</p>
                </div>
            </div>
        </section>

        <!-- Movies Section -->
        <div class="space-x-5 flex h-[71.5vh] overflow-hidden">
            <div class="w-[55%] space-y-5">
                <!-- Popular Movies Section -->
                <div class="flex space-x-4 pb-4 overflow-x-scroll">
                    <!-- Movie Card -->
                    @for (MovieDTO movie : popularMovies.stream().limit(8).toList())
                        <a href="/movie/${movie.getId()}" class="rounded-lg bg-transparent border-b border-b-zinc-600/10 overflow-hidden
                max-w-xs w-32 h-60 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2">
                            <img class="w-full object-cover" src="https://image.tmdb.org/t/p/w300${movie.getPoster_path()}"
                                 alt="${movie.getTitle()}">
                            <div class="py-1 px-2 text-xs space-y-1">
                                <h3 class=" text-black font-semibold" style=" display: -webkit-box;
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
                <!-- Top Rated Movies Section -->
                <div class="flex space-x-4 pb-4 overflow-x-scroll">
                    <!-- Movie Card -->
                    @for (MovieDTO movie : topRatedMovies.stream().limit(8).toList())
                        <a href="/movie/${movie.getId()}" class="rounded-lg bg-transparent border-b border-b-zinc-600/10 overflow-hidden
                max-w-xs w-32 h-60 flex-shrink-0 transition-transform transform hover:scale-105 hover:rotate-2">
                            <img class="w-full object-cover" src="https://image.tmdb.org/t/p/w300${movie.getPoster_path()}"
                                 alt="${movie.getTitle()}">
                            <div class="py-1 px-2 text-xs space-y-1">
                                <h3 class=" text-black font-semibold" style=" display: -webkit-box;
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
            <div class="space-y-4 h-[71.5vh] overflow-y-scroll">
                @for(MovieDTO movie : upcomingMovies.stream().limit(8).toList())
                    <a href="/movie/${movie.getId()}" class="relative border-l-sky-400 border-l-4 pl-2 border-b border-b-zinc-600/10 flex overflow-hidden w-full w-full h-40 flex-shrink-0 transition-transform transform hover:scale-95 hover:rotate-1">
                        <img class="w-28 h-full object-cover" src="https://image.tmdb.org/t/p/w185${movie.getPoster_path()}" alt="${movie.getTitle()}">
                        <div class="p-4 space-y-1" style="height:90%;">
                            <h3 class="text-xl text-black font-semibold">${movie.getTitle()}</h3>
                            <div class="flex space-x-1 flex-warp">
                                <p class="text-md text-zinc-400 py-1">${movie.getAdultFormatted()}</p>
                                <p class="text-md text-zinc-400 p-1">• ${movie.getRelease_date()}</p>
                            </div>
                            <div class="text-sm text-zinc-500 relative max-h-24" style=" display: -webkit-box; -webkit-box-orient: vertical; -webkit-line-clamp: 3; overflow: hidden;">${movie.getOverview()}</div>
                        </div>
                    </a>
                @endfor
            </div>
        </div>

    </div>
</div>

<!-- Modal -->
@template.include.modal.logout-modal()
<!-- Custom JavaScript -->
<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/modal.js"></script>
</body>
</html>