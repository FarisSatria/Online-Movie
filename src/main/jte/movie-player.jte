@import com.movieonline.Online.Movie.entity.model.UserEntity
@import java.util.List

@param String WebName
@param Long userCount
@param String getUsername
@param UserEntity getCurrentUser
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
                <!-- Icon 3 -->
                <li class="relative">
                    <a href="/movies/search" id="searchIcon"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 transition duration-200 drop-shadow-md">
                        <i id="searchIconSymbol" class="fas fa-search text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
            </ul>

            <!-- User Icon -->
            <div class="text-center w-full mt-auto relative">
                @if(getCurrentUser != null || getCurrentUser.getIsAdmin() == true)
                    <a href="/dashboard"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200 ">
                        <i class="fas fa-desktop text-2xl"></i>
                    </a>
                @endif
                <div class="w-full h-px bg-black opacity-20 mb-1"></div>
                <button id="userButton" class="block size-8 drop-shadow-lg rounded-full focus:outline-none">
                    @for(UserEntity user : userList)
                        @if(user.getUsername().equals(getUsername))
                            @if(user.getProfilePicturePath() != null)
                                <img rel="icon" class="rounded-full mr-2 size-8 bg-gray-500 hover:drop-shadow-xl hover:scale-110 transition duration-200"
                                     src="/image/${user.getId()}">
                            @else
                                <img rel="icon" class="rounded-full mr-2 size-8 bg-gray-500 hover:drop-shadow-xl transition hover:scale-110 duration-200" src="/image/icon/user-icon.png">
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
        <div class="w-full rounded-lg shadow-lg">
            <video class="w-full rounded-lg" controls>
                <source src="https://www.w3schools.com/html/mov_bbb.mp4" type="video/mp4">
                Your browser does not support the video tag.
            </video>
        </div>

        <!-- Ads Placeholder -->
        <div class="border-2 border-dashed w-full h-[18.8%] border-gray-300 bg-white shadow-md rounded-lg flex items-center justify-center">
            <p class="text-gray-500 font-medium">Ads Placeholder</p>
        </div>
    </div>
</div>

<!-- Modal -->
@template.include.modal.logout-modal()
<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/modal.js"></script>
</body>
</html>