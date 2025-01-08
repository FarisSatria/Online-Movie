@import com.movieonline.Online.Movie.entity.model.UserEntity
@import java.util.List
@import java.util.Optional

@param String WebName
@param Long adminCount
@param Long userCount
@param String getUsername
@param List<UserEntity> userList
@param Optional<UserEntity> searchedUser

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
<body>
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
                        <i class="fas fa-home text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 2 -->
                <li>
                    <a href="#"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-film text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 3 -->
                <li>
                    <a href="#"
                       class="block text-black hover:text-sky-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-book text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
                <!-- Icon 4 -->
                <li>
                    <a href="#"
                       class="block text-sky-400 hover:text-yellow-400 hover:rotate-12 hover:scale-125 drop-shadow-md hover:drop-shadow-lg transition duration-200">
                        <i class="fas fa-users text-2xl"></i>
                    </a>
                    <div class="w-full h-px bg-black opacity-20 mt-1"></div>
                </li>
            </ul>

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
        </div>
    </div>
    <div class="flex-initial mt-8 space-y-5" style="width:88vw;">
        <div class="flex mb-4">
            <h1 class="text-2xl font-semibold">User Management</h1>
            <div class="ml-auto flex">
                <form action="/api/search/user" method="get">
                    <input type="text" name="username" placeholder="Search here..."
                           class="px-4 py-2 text-gray-800 shadow-inner-lg rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-400"/>
                    <button type="submit"
                            class="bg-sky-500 hover:bg-sky-400 transition duration-300 rounded-full p-2 px-3 shadow-card text-white">
                        Search
                    </button>
                </form>
                <button type="submit"
                        class="bg-green-500 hover:bg-green-400 transition duration-300 rounded-full p-2 px-3 ml-2 shadow-card text-white">
                    Submit
                </button>
            </div>
        </div>
        <div>
            <table class="min-w-full h-96 table-auto bg-gray-50 shadow-inner-lg rounded-lg overflow-hidden">
                <thead>
                <tr class="w-full bg-gradient-to-r from-sky-400 to-blue-500 shadow-md border-b border-gray-300">
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">ID</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">Name</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">Username</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">Profile Picture Path</th>
                    <th class="py-3 px-6 text-left text-gray-100 font-medium">User Role</th>
                    <th class="py-3 text-left text-gray-100 font-medium">Action</th>
                </tr>
                </thead>

                <tbody>
                @if(searchedUser != null)
                    <tr class="hover:bg-gray-100 border-b border-gray-100">
                        <td class="py-4 px-6 text-gray-700">${searchedUser.get().getId()}</td>
                        <td class="py-4 px-6 text-gray-700">${searchedUser.get().getName()}</td>
                        <td class="py-4 px-6 text-gray-700">${searchedUser.get().getUsername()}</td>
                        <td class="py-4 px-6 text-gray-700">${searchedUser.get().getProfilePicturePath()}</td>
                        @if(searchedUser.get().getIsAdmin() == true)
                            <td class="py-4 px-6 text-gray-700">Admin</td>
                        @else
                            <td class="py-4 px-6 text-gray-700">User</td>
                        @endif
                        <td class="py-4">
                            <button class="bg-orange-500 hover:bg-orange-400 transition duration-300 rounded-full p-2 px-5 shadow-card text-white">Edit</button>
                            <button class="bg-red-600 hover:bg-red-700 transition duration-300 rounded-full p-2 px-3 shadow-card text-white">Delete</button>
                        </td>
                    </tr>
                @else
                    @for(UserEntity users : userList)
                        <tr class="hover:bg-gray-100 border-b border-gray-100">
                            <td class="py-4 px-6 text-gray-700">${users.getId()}</td>
                            <td class="py-4 px-6 text-gray-700">${users.getName()}</td>
                            <td class="py-4 px-6 text-gray-700">${users.getUsername()}</td>
                            <td class="py-4 px-6 text-gray-700">${users.getProfilePicturePath()}</td>
                            @if(users.getIsAdmin() == true)
                                <td class="py-4 px-6 text-gray-700">Admin</td>
                            @else
                                <td class="py-4 px-6 text-gray-700">User</td>
                            @endif
                            <td class="py-4">
                                <button class="bg-orange-500 hover:bg-orange-400 transition duration-300 rounded-full p-2 px-5 shadow-card text-white">Edit</button>
                                <button class="bg-red-600 hover:bg-red-700 transition duration-300 rounded-full p-2 px-3 shadow-card text-white">Delete</button>
                            </td>
                        </tr>
                    @endfor
                @endif
                </tbody>
            </table>
        </div>
    </div>
</div>

<!-- Footer -->
@template.include.footer.footer()
<!-- Modal -->
@template.include.modal.logout-modal()
<!-- Custom JavaScript -->
<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/modal.js"></script>
</body>
</html>