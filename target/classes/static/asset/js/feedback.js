
document.addEventListener("DOMContentLoaded", () => {
  const textarea = document.getElementById("reviews");

  // Adjust textarea height on input
  textarea.addEventListener("keydown", () => {
    if (event.key === 'Enter') {
        textarea.style.height = "auto"; // Reset height to calculate new height
        textarea.style.height = textarea.scrollHeight + "px"; // Set new height for Enter key
    } else if (event.key === 'Backspace') {
        textarea.style.height = "2rem"; // Reset height to calculate new height
        textarea.style.height = "px" - textarea.scrollHeight; // Adjust height after Backspace (it works just like Enter)
    }
  });
});

const currentUserFeedback = document.getElementById('currentUserFeedback');
const userFeedbackInput = document.getElementById('userFeedbackInput');
const updateFeedbackButton = document.getElementById('updateFeedbackButton');
const cancelFeedbackButton = document.getElementById('cancelFeedbackButton');

updateFeedbackButton.addEventListener('click', function (event) {
     currentUserFeedback.classList.add('hidden');
     userFeedbackInput.classList.remove('hidden');
 });

cancelFeedbackButton.addEventListener('click', function (event) {
    currentUserFeedback.classList.remove('hidden');
    userFeedbackInput.classList.add('hidden');
});

