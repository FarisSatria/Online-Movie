@param String WebName

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${WebName} | Login</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link rel="stylesheet" href="/asset/css/login.css">
  </head>
  <body>
  <div class="container">
    <div class="screen">
      <div class="screen__content">
        <form class="login" method="post" action="/login">
          <h2 class="login__name">${WebName}</h2>
          <div class="login__field">
            <i class="login__icon fas fa-user"></i>
            <input type="text" name="username" class="login__input" placeholder="User name" required>
          </div>
          <div class="login__field">
            <i class="login__icon fas fa-lock"></i>
            <input type="password" name="password" class="login__input" placeholder="Password" required>
          </div>
          <a href="/register">Don't have an account? Register here!</a>
          <button class="button login__submit">
            <span class="button__text">Log In Now</span>
            <i class="button__icon fas fa-chevron-right"></i>
          </button>
        </form>
        <div class="social-login">
          <h3>log in via</h3>
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
  </body>
</html>