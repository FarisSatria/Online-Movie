<textarea id="reviews" class="resize-none min-h-8 h-8 max-h-28 bg-transparent border-b border-zinc-600/50 text-zinc-600 w-full focus:outline-none" type="text" name="reviews" placeholder="Add Review..."></textarea>
<div class="flex flex-row-reverse float-left mt-2">
    <input type="radio" id="star5" name="rating" value="10" class="hidden peer" required>
    <label for="star5"
           class="cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></label>

    <input type="radio" id="star4" name="rating" value="8" class="hidden peer">
    <label for="star4"
           class=" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></label>

    <input type="radio" id="star3" name="rating" value="6" class="hidden peer">
    <label for="star3"
           class=" cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></label>

    <input type="radio" id="star2" name="rating" value="4" class="hidden peer">
    <label for="star2"
           class="cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></label>

    <input type="radio" id="star1" name="rating" value="2" class="hidden peer">
    <label for="star1"
           class="cursor-pointer text-gray-400 peer-checked:text-yellow-500 hover:text-yellow-400 drop-shadow-md"><i class="fas fa-star"></i></label>
</div>
<button type="submit"
        class="self-start bg-sky-400 hover:bg-sky-500 transition duration-300 rounded-full p-2 px-3 shadow-card text-white float-right mt-2 ml-auto">
    Submit
</button>