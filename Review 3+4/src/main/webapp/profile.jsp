<%@ include file="includes/header.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EcoRide | Profile</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <main>
        <section class="profile-container">
            <h2>Your Profile</h2>
            <div class="profile-info">
                <div class="info-item">
                    <strong>Name:</strong> <span><%= request.getAttribute("userName") %></span>
                </div>
                <div class="info-item">
                    <strong>Email:</strong> <span><%= request.getAttribute("userEmail") %></span>
                </div>
                <div class="info-item">
                    <strong>Member Since:</strong> <span><%= request.getAttribute("userSince") %></span>
                </div>
            </div>
            <a href="edit-profile.jsp" class="btn">Edit Profile</a>
        </section>
    </main>
    <%@ include file="includes/footer.jsp" %>
</body>
</html>
