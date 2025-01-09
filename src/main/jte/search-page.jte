@import java.util.List
@import com.movieonline.Online.Movie.entity.dto.MovieDTO
@import com.movieonline.Online.Movie.entity.model.UserEntity

@param String WebName
@param String getUsername
@param Boolean isLoggedIn
@param List<MovieDTO> searchMovies
@param List<UserEntity> userList

<!DOCTYPE html>
<html lang="en" class="scroll-smooth">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | Search</title>
    <link rel="icon" href="/image/favicon/eudaemonia.png">

    <!-- Tailwind CSS -->
    <script src="https://cdn.tailwindcss.com"></script>

    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <!-- Custom Styles -->
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
                       class="block text-black hover:text-sky-400 drop-shadow-md hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-home text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 2 -->
                <li>
                    <a href="/"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-film text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <li class="relative">
                    <a href="#" id="searchIcon"
                       class="block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md">
                        <i id="searchIconSymbol" class="fas fa-search text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
            </ul>

            @if(isLoggedIn)
                <!-- User Icon -->
                <div class="text-center w-full mt-auto relative">
                    <div class="w-full h-px bg-black opacity-20 mb-1"></div>
                    <button id="userButton" class="block size-8 drop-shadow-lg rounded-full focus:outline-none">
                        @for(UserEntity user : userList)
                            @if(user.getUsername().equals(getUsername))
                                @if(user.getProfilePicturePath() != null)
                                    <img rel="icon" class="rounded-full mr-2 bg-gray-500 hover:drop-shadow-xl transition duration-200"
                                         src="/image/icon/${user.getProfilePicturePath()}.png">
                                @else
                                    <img rel="icon" class="rounded-full mr-2 bg-gray-500 hover:drop-shadow-xl transition duration-200" src="/image/icon/user-icon.png">
                                @endif
                            @endif
                        @endfor
                    </button>

                    <div id="userPanel" class="absolute w-40 -left-1 -top-36 text-left bg-gray-50 rounded-lg shadow-md border border-gray-300 hidden">
                        <a href="" class="block px-4 py-2 text-zinc-700 hover:bg-gray-200 rounded-t-lg cursor-pointer transition duration-300">Booking</a>
                        <a href="" class="block px-4 py-2 text-zinc-700 hover:bg-gray-200 cursor-pointer transition duration-300">Account</a>
                        <div class="group">
                            <a id="openModal" class="block px-4 py-2 text-zinc-700 group-hover:bg-red-600 group-hover:text-white border-t border-t-gray-300 cursor-pointer rounded-b-lg transition duration-300">Logout</a>
                            <div class="absolute group-hover:border-t-red-600 left-2 -bottom-4 w-0 h-0 border-l-[13px] border-r-[13px] border-l-transparent border-r-transparent border-t-[16px] border-t-gray-50 drop-shadow-md transition duration-300"></div>
                        </div>
                    </div>
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
        <!-- Search bar dropdown -->
        <div id="searchBar" class="overflow-hidden shadow-inner-lg bg-gray-50 rounded-lg pt-3" style="top:width:87.6vw; height:92vh;">
            <form id="searchForm" class="flex mt-2 border-yellow-400 border-l-4 pl-2 mx-auto w-2/5" method="get">
                <input type="text" id="name" name="name" placeholder="Search..." class="p-2 border border-gray-300 w-full rounded-md focus:outline-none"/>
                <div class="ml-3 mt-1 w-8">
                    <button type="button" id="searchButton" class="hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md hover:drop-shadow-lg">
                        <i class="fas fa-search text-sky-400 hover:text-yellow-500 text-2xl"></i>
                    </button>
                    <button type="reset" id="resetButton" class="hidden hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md hover:drop-shadow-lg">
                        <i class="fas fa-times text-red-600 hover:text-red-700 text-2xl"></i>
                    </button>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </div>
            </form>
            <div class=" overflow-scroll p-4 h-full" style="height: calc(91vh - 5rem);">
                <div id="movieResults"  class="space-y-4">
                    <!-- Movies Results will appear in here -->
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Modal -->
@template.include.modal.logout-modal()
<!-- Custom JavaScript -->
<script src="/asset/js/AJAX-handler.js"></script>
<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/modal.js"></script>
</body>
</html>