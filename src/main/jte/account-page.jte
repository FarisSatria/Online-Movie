@import java.util.List
@import com.movieonline.Online.Movie.entity.model.UserBookingEntity
@import com.movieonline.Online.Movie.entity.model.UserEntity
@import com.movieonline.Online.Movie.repository.UserRepository

@param String WebName
@param String getUsername
@param String updateAccountSuccess
@param UserEntity getCurrentUser
@param List<UserEntity> userList
@param UserRepository userRepository

<!DOCTYPE html>
<html lang="en" class="scroll-smooth">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | Account</title>
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
    <div class="flex-initial mt-8 space-y-6" style="width:87.5vw;">
        <!-- Profile Card -->
        <div class="shadow-card bg-gray-50 rounded-xl p-6 flex items-center space-x-6">
            @if(getCurrentUser.getProfilePicturePath() != null)
                <img src="/image/${getCurrentUser.getId()}" alt="User Profile" class="size-40 rounded-full shadow-lg border-4 border-sky-400">
            @else
                <img src="/image/icon/user-icon.png" alt="User Profile" class="size-40 rounded-full shadow-lg border-4 border-sky-400">
            @endif
            <div class="space-y-2">
                <h2 class="text-3xl font-semibold text-gray-800">${getCurrentUser.getName()}</h2>
                <div class="flex justify-between items-center">
                    <p class="text-gray-700">Username:</p>
                    <p class="text-black font-medium">${getUsername}</p>
                </div>

                <div class="flex justify-between items-center">
                    <p class="text-gray-700">Password:</p>
                    <p class="text-black font-medium">••••••••</p>
                </div>
                <div class="flex space-x-2">
                    <button onclick="document.getElementById('updateProfileModal').classList.remove('hidden')"
                            class="px-4 py-2 bg-sky-400 text-white rounded-lg shadow-card hover:bg-sky-500 transition duration-300 ">
                        Edit Profile
                    </button>
                    <a href="/logout" class="px-4 py-2 bg-red-600 hover:bg-red-700 text-white rounded-lg shadow-card transition duration-300 ">Logout</a>
                </div>
            </div>
        </div>

        <!-- Overlay -->
        <div id="updateProfileModal" class="fixed hidden -inset-8 bg-black bg-opacity-50 flex justify-center items-center z-50">
            <!-- Form Container -->
            <div class="bg-gray-50 p-6 rounded-lg shadow-card w-96 relative">
                <!-- Close Button -->
                <button id="closeModal" class="absolute top-3 right-3 text-red-600 hover:text-red-700">
                    <i class="fas fa-times text-xl"></i>
                </button>

                <h2 class="text-2xl font-semibold text-gray-800 mb-4">Update Profile</h2>

                <form action="/api/user/update" method="post" enctype="multipart/form-data">

                    <!-- Name Input -->
                    <div class="mb-3">
                        <label class="block text-gray-700">Name:</label>
                        <input type="text" name="name" value="${getCurrentUser.getName()}"
                               class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none">
                    </div>

                    <!-- Username Input -->
                    <div class="mb-3">
                        <label class="block text-gray-700">Username:</label>
                        <input type="text" name="username" value="${getCurrentUser.getUsername()}"
                               class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none">
                    </div>

                    <!-- New Password -->
                    <div class="mb-3">
                        <label class="block text-gray-700">New Password:</label>
                        <input type="password" name="newPassword" id="newPassword"
                               class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none">
                    </div>

                    <!-- Verify Password -->
                    <div class="mb-3">
                        <label class="block text-gray-700">Confirm Password:</label>
                        <input type="password" name="verifyPassword" id="verifyPassword"
                               class="w-full px-4 py-2 border rounded-lg focus:ring-2 focus:ring-sky-400 focus:outline-none">
                        <p id="passwordError" class="text-red-500 text-sm mt-1 hidden">Passwords do not match!</p>
                    </div>

                    <!-- Profile Picture Upload -->
                    <div class="mb-3">
                        <label class="block text-gray-700">Profile Picture:</label>
                        <input type="file" name="profilePicture" accept="image/*"
                               class="w-full px-1 py-1 rounded-lg">
                    </div>

                    <!-- Buttons -->
                    <div class="flex justify-end space-x-2 mt-4">
                        <button type="button" id="cancelUpdate"
                                class="px-4 py-2 bg-red-600 text-white rounded-lg shadow-card hover:bg-red-700 transition duration-300 ">
                            Cancel
                        </button>
                        <button type="submit" id="submitUpdate"
                                class="px-4 py-2 bg-sky-400 text-white rounded-lg shadow-card hover:bg-sky-500 transition duration-300 ">
                            Save
                        </button>
                    </div>
                </form>
            </div>
        </div>


        <!-- Account Settings -->
        <div>
            <h3 class="text-3xl text-black border-yellow-400 border-l-4 pl-2 font-semibold">Account Settings</h3>
            <div class="mt-4 space-y-5 px-5">
                <div class="flex justify-between items-center pb-4 border-b border-b-zinc-600/10">
                    <p class="text-gray-600">Manage Bookings</p>
                    <a href="/booking" class="px-4 py-2 bg-sky-400 hover:bg-sky-500 text-white rounded-full shadow-card transition duration-300 ">View</a>
                </div>
                <div class="flex justify-between items-center pb-4 border-b border-b-zinc-600/10">
                    <p class="text-gray-600">Delete Account</p>
                    <a href="/api/user/${getCurrentUser.getId()}/delete" class="px-4 py-2 bg-red-600 hover:bg-red-700 text-white rounded-full shadow-card transition duration-300 ">Delete</a>
                </div>
            </div>
        </div>

    </div>
</div>

@if(updateAccountSuccess != null)
    <div id="success-message-update-valid" class="drop-shadow-md absolute top-5 left-[39vw]">
        <div class="bg-green-500 p-2 rounded-tl-lg rounded-tr-lg text-white font-bold text-center">Success!</div>
        <div class="bg-white p-5 rounded-br-lg rounded-bl-lg">
            <p>${updateAccountSuccess}</p>
        </div>
    </div>
@endif

<!-- Modal -->
@template.include.modal.logout-modal()
<!-- Custom JavaScript -->
<script>
    document.getElementById("closeModal").addEventListener("click", function () {
        document.getElementById("updateProfileModal").classList.add("hidden");
    });

    document.getElementById("cancelUpdate").addEventListener("click", function () {
        document.getElementById("updateProfileModal").classList.add("hidden");
    });

    document.getElementById("updateProfileModal").addEventListener("click", function (event) {
        if (event.target === this) {
            this.classList.add("hidden");
        }
    });

    document.getElementById("submitUpdate").addEventListener("click", function (event) {
        let newPassword = document.getElementById("newPassword").value;
        let verifyPassword = document.getElementById("verifyPassword").value;
        let errorText = document.getElementById("passwordError");

        if (newPassword !== verifyPassword) {
            event.preventDefault();
            errorText.classList.remove("hidden");
        } else {
            errorText.classList.add("hidden");
        }
    });
</script>

<script src="/asset/js/navbar.js"></script>
<script src="/asset/js/error-message.js"></script>
<script src="/asset/js/modal.js"></script>
<script src="/asset/js/carousel.js"></script>
</body>
</html>