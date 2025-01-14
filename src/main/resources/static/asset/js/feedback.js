
document.addEventListener("DOMContentLoaded", () => {
  const textarea = document.getElementById("reviews");

  // Adjust textarea height on input
  textarea.addEventListener("input", () => {
    textarea.style.height = "auto"; // Reset height to calculate new height
    textarea.style.height = textarea.scrollHeight + "px"; // Set new height
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

