# EcoRide - API Reference

## Endpoints
### 1. **Login**
- **URL:** `/login`
- **Method:** POST
- **Description:** Authenticates a user.
- **Request Parameters:**
  | Parameter | Type   | Description           |
  |-----------|--------|-----------------------|
  | email     | String | User's email address  |
  | password  | String | User's password       |
- **Response:**
  - **200 OK:** Redirect to `profile.jsp`.
  - **400 Bad Request:** Invalid credentials.

---

### 2. **Register**
- **URL:** `/register`
- **Method:** POST
- **Description:** Registers a new user.
- **Request Parameters:**
  | Parameter         | Type   | Description             |
  |-------------------|--------|-------------------------|
  | name              | String | Full name of the user   |
  | email             | String | Email address           |
  | password          | String | User's chosen password  |
  | confirmPassword   | String | Confirmation of password |
- **Response:**
  - **200 OK:** Redirect to `success.jsp`.
  - **400 Bad Request:** Registration failed.

---

### 3. **Profile**
- **URL:** `/profile`
- **Method:** GET
- **Description:** Fetches and displays user profile information.
- **Response:** Profile details shown in `profile.jsp`.

---

## Utilities
### Validator
- **Methods:**
  - `isValidEmail(String email)`
  - `isValidPassword(String password)`
