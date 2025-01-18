<%@ include file="includes/header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EcoRide | Login</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <main>
        <section class="form-container">
            <h2>Login to Your Account</h2>
            <form action="login" method="POST">
                <div class="input-group">
                    <label for="email">Email Address</label>
                    <input type="email" id="email" name="email" placeholder="Enter your email" required>
                </div>
                <div class="input-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" placeholder="Enter your password" required>
                </div>
                <button type="submit" class="btn">Login</button>
                <p class="link-text">Don't have an account? <a href="register.jsp">Sign Up</a></p>
            </form>
        </section>
    </main>
    <%@ include file="includes/footer.jsp" %>
</body>
</html>
