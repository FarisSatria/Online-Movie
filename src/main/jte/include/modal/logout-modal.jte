<div id="logoutModal" class="fixed inset-0 bg-gray-800 bg-opacity-50 flex items-center justify-center hidden z-30">
    <div class="bg-gray-50 rounded-lg shadow-card w-96 p-6 space-y-7">
        <!-- Modal Header -->
        <div class="space-y-2">
            <h2 class="text-xl font-semibold text-black text-center">Log out</h2>
            <div class="w-full h-px bg-black opacity-20"></div>
        </div>

        <!-- Modal Message -->
        <p class="text-zinc-700 text-center">Are you sure you want to log out?</p>

        <!-- Modal Buttons -->
        <div class="flex justify-between space-x-2">
            <button id="cancelButton" class="text-zinc-700 text-center border border-black/20 hover:bg-white shadow-md hover:shadow-lg font-medium py-2 px-4 rounded-lg cursor-pointer w-full transition duration-300">
                Cancel
            </button>
            <a id="logoutButton" href="/logout" class="bg-red-600 hover:bg-red-700 text-center text-white shadow-md hover:shadow-lg font-medium py-2 px-4 rounded-lg cursor-pointer w-full transition duration-300">
                Log out
            </a>
        </div>
    </div>
</div>