@import com.movieonline.Online.Movie.entity.dto.MovieDTO
@import com.movieonline.Online.Movie.entity.model.UserEntity
@import java.util.List

@param String WebName
@param String getUsername
@param String movieHasBeenEnabled
@param String movieHasBeenDisabled
@param String movieBookingToggle
@param String searchMoviesPlaceholder
@param Integer getPreviousNumberPages
@param List<UserEntity> userList
@param List<MovieDTO> searchMovies
@param List<MovieDTO> getMoviesPage
@param List<MovieDTO> getAllMovies

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
                    <a href="/dashboard"
                       class="block text-black hover:text-sky-400 drop-shadow-md hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-desktop text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 2 -->
                <li>
                    <a href="#"
                       class="block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
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
    <div class="flex-initial mt-8 space-y-5" style="width:88vw;">
        <div class="flex mb-4">
            <h1 class="text-3xl font-semibold"><i class="fas fa-book mr-2"></i>Booking Management</h1>
            <div class="ml-auto flex">
                <form action="/api/search/movies" method="get" class="flex">
                    @if(searchMoviesPlaceholder == null)
                        <input type="text" name="name" placeholder="Search Movies..."
                               class="px-4 py-2 text-gray-800 shadow-inner-lg rounded-lg focus:outline-none bg-gray-50 focus:ring-2 focus:ring-blue-400"/>
                    @else
                        <input type="text" name="name" placeholder="Search Movies..." value="${searchMoviesPlaceholder}"
                               class="px-4 py-2 text-gray-800 shadow-inner-lg rounded-lg focus:outline-none bg-gray-50 focus:ring-2 focus:ring-blue-400"/>
                    @endif
                    <div class="ml-3 mt-1 w-8">
                        @if(searchMovies == null)
                            <button type="submit" class="hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md hover:drop-shadow-lg">
                                <i class="fas fa-search text-sky-400 hover:text-yellow-500 text-2xl text-center"></i>
                            </button>
                        @else
                            <a href="/dashboard/booking" class="hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md hover:drop-shadow-lg">
                                <i class="ml-1.5 fas fa-times text-red-600 hover:text-red-700 text-2xl text-center"></i>
                            </a>
                        @endif
                        <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                    </div>
                </form>
            </div>
        </div>
        <!-- Movies Section -->
        <div class="">
            <table class="table-auto w-full bg-gray-50 shadow-inner-lg rounded-t-lg overflow-hidden">
                <thead>
                <tr class="w-full bg-gradient-to-r from-sky-400 to-blue-500 shadow-md border-b border-gray-300">
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">ID</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">Title</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">Poster</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">Release Date</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">Action</th>
                </tr>
                </thead>

                <tbody>
                @if(searchMovies != null)
                    @for(MovieDTO movie : searchMovies)
                        <tr class="hover:bg-gray-100 border-b border-gray-100">
                            <td class="py-4 px-6 text-gray-700">${movie.getId()}</td>
                            <td class="py-4 px-6 text-gray-700 max-w-72">${movie.getTitle()}</td>
                            <td class="py-4 px-6 text-gray-700">
                                <img src="https://image.tmdb.org/t/p/w200${movie.getPoster_path()}" class="w-20 h-auto">
                            </td>
                            <td class="py-4 px-6 text-gray-700">${movie.getRelease_date()}</td>
                            <td class="py-4">
                                <a href="/movie/${movie.getId()}/booking/enable" class="bg-green-500 hover:bg-green-600 active:bg-orange-500 transition duration-300 rounded-full p-2 px-5 shadow-card text-white">Enable</a>
                                <a href="/movie/${movie.getId()}/booking/disable" class="bg-red-600 hover:bg-red-700 active:bg-red-600 transition duration-300 rounded-full p-2 px-3 shadow-card text-white">Disable</a>
                            </td>
                        </tr>
                    @endfor
                @elseif(getMoviesPage != null)
                    @for(MovieDTO movie : getMoviesPage)
                        <tr class="hover:bg-gray-100 border-b border-gray-100">
                            <td class="py-4 px-6 text-gray-700">${movie.getId()}</td>
                            <td class="py-4 px-6 text-gray-700 max-w-72">${movie.getTitle()}</td>
                            <td class="py-4 px-6 text-gray-700">
                                <img src="https://image.tmdb.org/t/p/w200${movie.getPoster_path()}" class="w-20 h-auto">
                            </td>
                            <td class="py-4 px-6 text-gray-700">${movie.getRelease_date()}</td>
                            <td class="py-4">
                                <a href="/movie/${movie.getId()}/booking/enable" class="bg-green-500 hover:bg-green-600 active:bg-orange-500 transition duration-300 rounded-full p-2 px-5 shadow-card text-white">Enable</a>
                                <a href="/movie/${movie.getId()}/booking/disable" class="bg-red-600 hover:bg-red-700 active:bg-red-600 transition duration-300 rounded-full p-2 px-3 shadow-card text-white">Disable</a>
                            </td>
                        </tr>
                    @endfor
                @else
                    @for(MovieDTO movie : getAllMovies)
                        <tr class="hover:bg-gray-100 border-b border-gray-100">
                            <td name="id" class="py-4 px-6 text-gray-700">${movie.getId()}</td>
                            <td class="py-4 px-6 text-gray-700">${movie.getTitle()}</td>
                            <td class="py-4 px-6 text-gray-700">
                                <img src="https://image.tmdb.org/t/p/w200${movie.getPoster_path()}" class="w-20 h-auto">
                            </td>
                            <td class="py-4 px-6 text-gray-700">${movie.getRelease_date()}</td>
                            <td class="py-4">
                                <a href="/movie/${movie.getId()}/booking/enable" class="bg-green-500 hover:bg-green-600 active:bg-orange-500 transition duration-300 rounded-full p-2 px-5 shadow-card text-white">Enable</a>
                                <a href="/movie/${movie.getId()}/booking/disable" class="bg-red-600 hover:bg-red-700 active:bg-red-600 transition duration-300 rounded-full p-2 px-3 shadow-card text-white">Disable</a>
                            </td>
                        </tr>
                    @endfor
                @endif
                </tbody>
            </table>
            <div class="flex w-full bg-gradient-to-r from-sky-400 to-blue-500 p-2 shadow-md rounded-b-lg overflow-hidden mb-5">
                @if(searchMovies != null)
                @elseif(getMoviesPage != null)
                    <!-- Page Numbers -->
                    <div class="p-1 size-24 rounded-full flex items-center justify-center shadow-inner-lg bg-gray-50">
                        <h2 class="text-4xl font-semibold text-gray-800 drop-shadow-md">${getPreviousNumberPages}</h2>
                    </div>
                    <!-- Navigation Arrows -->
                    <div class="p-1 h-24 ml-auto rounded-full shadow-inner-lg w-52 flex bg-gray-50">
                        <!-- Left Arrow -->
                        <a href="/dashboard/booking
                /
                    @if(getPreviousNumberPages == 1)
                        #
                    @else
                            ${getPreviousNumberPages - 1}
                        @endif
                "
                           class="mr-4 bg-sky-400 hover:bg-sky-500 flex items-center justify-center shadow-card w-1/2 h-full transition duration-300 rounded-full text-white">
                            <i class="fas fa-chevron-left"></i>
                        </a>
                        <!-- Right Arrow -->
                        <a href="/dashboard/booking/${getPreviousNumberPages + 1}"
                           class="bg-sky-400 hover:bg-sky-500 flex items-center justify-center shadow-card w-1/2 h-full transition duration-300 rounded-full text-white">
                            <i class="fas fa-chevron-right"></i>
                        </a>
                    </div>
                @else
                    <!-- Page Numbers -->
                    <div class="p-1 size-24 rounded-full flex items-center justify-center shadow-inner-lg bg-gray-50">
                        <h2 class="text-4xl font-semibold text-gray-800 drop-shadow-md">1</h2>
                    </div>
                    <!-- Navigation Arrows -->
                    <div class="p-1 h-24 ml-auto rounded-full shadow-inner-lg w-52 flex bg-gray-50">
                        <!-- Left Arrow -->
                        <a href="#"
                           class="mr-4 bg-sky-400 hover:bg-sky-500 flex items-center justify-center shadow-card w-1/2 h-full transition duration-300 rounded-full text-white">
                            <i class="fas fa-chevron-left"></i>
                        </a>
                        <!-- Right Arrow -->
                        <a href="/dashboard/booking/2"
                           class="bg-sky-400 hover:bg-sky-500 flex items-center justify-center shadow-card w-1/2 h-full transition duration-300 rounded-full text-white">
                            <i class="fas fa-chevron-right"></i>
                        </a>
                    </div>
                @endif
            </div>
        </div>
    </div>
</div>

@if(movieHasBeenEnabled != null)
    <div id="success-message-movie-enabled" class="drop-shadow-md fixed top-5 left-[39vw]">
        <div class="bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center">Success!</div>
        <div class="bg-white p-5 rounded-br-lg rounded-bl-lg">
            <p>${movieHasBeenEnabled}</p>
        </div>
    </div>
@endif

@if(movieHasBeenDisabled != null)
    <div id="error-message-movie-disabled" class="drop-shadow-md fixed top-5 left-[39vw]">
        <div class="bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center">Success!</div>
        <div class="bg-white p-5 rounded-br-lg rounded-bl-lg">
            <p>${movieHasBeenDisabled}</p>
        </div>
    </div>
@endif


@if(movieBookingToggle != null)
    <div id="error-message-movie-conflict" class="drop-shadow-md fixed top-5 left-[40vw]">
        <div class="bg-red-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center">Warning!</div>
        <div class="bg-white p-5 rounded-br-lg rounded-bl-lg">
            <p>${movieBookingToggle}</p>
        </div>
    </div>
@endif

<!-- Modal -->
@template.include.modal.logout-modal()
<!-- Custom JavaScript -->
<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/error-message.js"></script>
<script src="/asset/js/modal.js"></script>
</body>
</html>