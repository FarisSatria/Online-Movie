window.addEventListener('DOMContentLoaded', (event) => {
    const errorMessageElements = [
        document.getElementById('error-message'),
        document.getElementById('success-message-add-valid'),
        document.getElementById('error-message-add-invalid'),
        document.getElementById('success-message-delete-valid'),
        document.getElementById('error-message-delete-invalid'),
        document.getElementById('success-message-movie-enabled'),
        document.getElementById('error-message-movie-disabled'),
        document.getElementById('error-message-movie-conflict'),
        document.getElementById('success-message-booking-valid'),
        document.getElementById('success-message-update-valid'),
       document.getElementById('success-message-registration-valid')
    ];

    errorMessageElements.forEach((element) => {
        if (element) {
            setTimeout(() => {
                element.style.transition = 'opacity 0.5s';
                element.style.opacity = 0;

                setTimeout(() => {
                    element.classList.add('hidden');
                }, 500);
            }, 1500);
        }
    });
});
