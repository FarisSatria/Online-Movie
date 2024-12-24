// JavaScript to toggle between login and register views
function toggleView() {
    const loginForm = document.getElementById('loginForm');
    const registerForm = document.getElementById('registerForm');
    const registerPrompt = document.getElementById('registerPrompt');
    const loginPrompt = document.getElementById('loginPrompt');

    // Toggle visibility between login and register sections
    loginForm.classList.toggle('hidden');
    registerForm.classList.toggle('hidden');
    registerPrompt.classList.toggle('hidden');
    loginPrompt.classList.toggle('hidden');
}

window.addEventListener('DOMContentLoaded', (event) => {
    const errorMessageElement = document.getElementById('error-message');

    if (errorMessageElement) {
        setTimeout(() => {
            errorMessageElement.style.transition = 'opacity 0.5s';
            errorMessageElement.style.opacity = 0;
        }, 1500);
    }
});