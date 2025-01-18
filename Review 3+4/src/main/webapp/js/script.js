// Handle form validation for login
function validateLoginForm() {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
  
    if (!email || !password) {
      alert("Please fill in all fields.");
      return false;
    }
  
    // Additional validations can be added here (e.g., regex for email)
    return true;
  }
  
  // Handle form validation for registration
  function validateRegisterForm() {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;
  
    if (!name || !email || !password || !confirmPassword) {
      alert("Please fill in all fields.");
      return false;
    }
  
    if (password !== confirmPassword) {
      alert("Passwords do not match.");
      return false;
    }
  
    // Simulate user registration in localStorage for demo
    localStorage.setItem("user", JSON.stringify({ name, email }));
    return true;
  }
  
  // Load user profile from localStorage (Simulating backend)
  window.onload = function() {
    const user = JSON.parse(localStorage.getItem("user"));
  
    if (user) {
      document.getElementById("userName").innerText = user.name;
      document.getElementById("userEmail").innerText = user.email;
      document.getElementById("userSince").innerText = "January 2023";  // Example date
    }
  };
  