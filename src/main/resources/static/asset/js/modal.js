
//JavaScript For Showing Booking Modal
// Get the modal
var modal = document.getElementById("bookingModal");

// Get all elements with the class 'book-button'
var buttons = document.getElementsByClassName("book-button");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

 // When the user clicks on the button, open the modal
 for (var i = 0; i < buttons.length; i++) {
     var btn = buttons[i];

     // Add an event listener for the 'click' event
     btn.addEventListener('click', function() {
         // Inside this function, open the modal
         modal.style.display = "block";
     });
 }

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

let seats = document.querySelector(".all-seats");
for (let i = 0; i < 40; i++) {
    let randint = Math.floor(Math.random() * 2);
    let booked = randint === 1 ? "booked" : "";

    seats.insertAdjacentHTML(
        "beforeend",
        `<input type="checkbox" name="tickets" id="s${i + 2}" class="hidden"/>
        <label for="s${i + 2}" class="seat ${booked} bg-red-400 cursor-pointer rounded-t-full shadow-md hover:bg-[#47a3ff] active:bg-[#47a3ff] transition duration-300 p-4"></label>`
    )
}
