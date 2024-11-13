@param String WebName

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | Register</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link rel="stylesheet" href="/asset/css/register.css">
</head>
<body>
<div class="container">
    <div class="screen">
        <div class="screen__content">
            <form class="register" method="post" action="/register">
                <h2 class="register__name">${WebName}</h2>
                <div class="register__field">
                    <i class="register__icon fas fa-user"></i>
                    <input type="text" name="name" class="register__input" placeholder="Name" required>
                </div>
                <div class="register__field">
                    <i class="register__icon fas fa-user"></i>
                    <input type="text" name="username" class="register__input" placeholder="User name" required>
                </div>
                <div class="register__field">
                    <i class="register__icon fas fa-lock"></i>
                    <input type="password" name="password" class="register__input" placeholder="Password" required>
                </div>
                <a href="#" id="animateStart">Start Animation</a>
                <button class="button register__submit">
                    <span class="button__text">Register Now</span>
                    <i class="button__icon fas fa-chevron-right"></i>
                </button>
            </form>
            <div class="social-login">
                <h3>Register via</h3>
                <div class="social-icons">
                    <a href="#" class="social-login__icon fab fa-instagram"></a>
                    <a href="#" class="social-login__icon fab fa-facebook"></a>
                    <a href="#" class="social-login__icon fab fa-twitter"></a>
                </div>
            </div>
        </div>
        <div class="screen__background">
            <span class="screen__background__shape screen__background__shape4"></span>
            <span class="screen__background__shape screen__background__shape3"></span>
            <span class="screen__background__shape screen__background__shape2"></span>
            <span class="screen__background__shape screen__background__shape1"></span>
        </div>
    </div>
</div>

<script src="/asset/js/animation.js"></script>
</body>
</html>
