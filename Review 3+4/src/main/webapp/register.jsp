<%@ include file="includes/header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EcoRide | Register</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <main>
        <section class="form-container">
            <h2>Create an Account</h2>
            <form action="register" method="POST">
                <div class="input-group">
                    <label for="name">Full Name</label>
                    <input type="text" id="name" name="name" placeholder="Enter your full name" required>
                </div>
                <div class="input-group">
                    <label for="email">Email Address</label>
                    <input type="email" id="email" name="email" placeholder="Enter your email" required>
                </div>
                <div class="input-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" placeholder="Choose a password" required>
                </div>
                <div class="input-group">
                    <label for="confirmPassword">Confirm Password</label>
                    <input type="password" id="confirmPassword" name="confirmPassword" placeholder="Confirm your password" required>
                </div>
                <button type="submit" class="btn">Sign Up</button>
                <p class="link-text">Already have an account? <a href="login.jsp">Login</a></p>
            </form>
        </section>
    </main>
    <%@ include file="includes/footer.jsp" %>
</body>
</html>
