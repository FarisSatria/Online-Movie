 var showMore = document.getElementsByClassName("show-more");
         var reviews = document.getElementsByClassName('reviews');

         // Define default styles that should be reapplied
         var defaultStyles = {
             display: "-webkit-box",
             "-webkit-box-orient": "vertical",
             "-webkit-line-clamp": "5",
             overflow: "hidden"
         };

         for (var i = 0; i < showMore.length; i++) {
             var more = showMore[i];
             more.addEventListener('click', function() {
                 for (var j = 0; j < reviews.length; j++) {
                     var rvw = reviews[j];

                     // Check if the review currently has the 'clamped' styles
                     if (rvw.style.display === defaultStyles.display) {
                         // Remove the styles to show more content
                         rvw.style.removeProperty("display");
                         rvw.style.removeProperty("-webkit-box-orient");
                         rvw.style.removeProperty("-webkit-line-clamp");
                         rvw.style.removeProperty("overflow");
                     } else {
                         // Reapply the default styles to 'clamp' the content
                         rvw.style.display = defaultStyles.display;
                         rvw.style["-webkit-box-orient"] = defaultStyles["-webkit-box-orient"];
                         rvw.style["-webkit-line-clamp"] = defaultStyles["-webkit-line-clamp"];
                         rvw.style.overflow = defaultStyles.overflow;
                     }
                 }
             });
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

const prevButton = document.getElementById('prev');
const nextButton = document.getElementById('next');
const carousel = document.getElementById('carousel');
const slides = carousel.children;
let currentSlide = 0;

// Only run if there are slides
if (slides.length > 0) {
   // Set the carousel width based on the number of slides
   carousel.style.width = `${slides.length * 100}%`;

   const nextSlide = () => {
       currentSlide = (currentSlide + 1) % slides.length;
       updateCarousel();
   };

   const prevSlide = () => {
       currentSlide = (currentSlide - 1 + slides.length) % slides.length;
       updateCarousel();
   };

   const updateCarousel = () => {
       const slideWidth = 100 / slides.length; // Calculate the width of each slide
       carousel.style.transform = `translateX(-${currentSlide * slideWidth}%)`;
   };

   nextButton.addEventListener('click', nextSlide);
   prevButton.addEventListener('click', prevSlide);
} else {
   // Hide buttons if no slides
   prevButton.style.display = 'none';
   nextButton.style.display = 'none';
}

