let menu = document.querySelector('#menu-bars');
let navbar = document.querySelector('.navbar');
var header = document.getElementById("header");
var sticky = navbar.offsetTop;

menu.onclick = () =>{
  menu.classList.toggle('fa-times');
  navbar.classList.toggle('active');
}

window.onscroll = function() {funcOpaque()};
  function funcOpaque() {
    if (window.pageYOffset >= sticky) {
      header.classList.add("opaque-header")
    } else {
      header.classList.remove("opaque-header");
    }
  }

var swiper = new Swiper(".home-slider", {
    spaceBetween: 30,
    centeredSlides: true,
    autoplay: {
      delay: 7500,
      disableOnInteraction: false,
    },
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
    loop:true,
  });

  var swiper = new Swiper(".card-slider", {
    slidesPerView: 3,
    spaceBetween: 290,
    centeredSlides: true,
    autoplay: {
      delay: 2500,
      disableOnInteraction: true,
    },
    pagination: {
      el: ".swiper-pagination",
      clickable: false,
    },
    loop:true
  });

  var swiper = new Swiper(".anime-slider", {
    slidesPerView: 3,
    centeredSlides: true,
    autoplay: {
      delay: 4500,
      disableOnInteraction: false,
    },
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
    loop:true
  });


  var swiper = new Swiper(".action-slider", {
    slidesPerView: 3,
    centeredSlides: true,
    autoplay: {
      delay: 3500,
      disableOnInteraction: false,
    },
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
    loop:true
  });


  var swiper = new Swiper(".child-slider", {
    slidesPerView: 3,
    centeredSlides: true,
    autoplay: {
      delay: 2500,
      disableOnInteraction: false,
    },
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
    loop:true
  });

  var swiper = new Swiper(".family-slider", {
    slidesPerView: 3,
    centeredSlides: true,
    autoplay: {
      delay: 1500,
      disableOnInteraction: false,
    },
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
    loop:true
  });

