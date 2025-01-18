# EcoRide - System Design

## Architecture
The EcoRide platform uses a layered architecture with the following components:
1. **Presentation Layer:** Handles user interactions via JSP and Servlets.
2. **Service Layer:** Business logic implemented in services like `UserService` and `AuthenticationService`.
3. **Data Access Layer:** Manages database operations using DAOs (e.g., `UserDao`).
4. **Database Layer:** MySQL database for persistent storage.

## Database Schema
### Users Table
| Column Name    | Data Type | Constraints          |
|----------------|-----------|----------------------|
| id             | INT       | Primary Key, Auto Increment |
| name           | VARCHAR   | NOT NULL            |
| email          | VARCHAR   | UNIQUE, NOT NULL    |
| password       | VARCHAR   | NOT NULL            |
| member_since   | DATE      | Default: CURRENT_DATE |

## Key Components
- **Authentication:** Verifies user credentials during login.
- **User Management:** Handles registration, profile updates, and account deletion.
- **Database Connection:** JDBC-based database access.

## System Flow
1. **Registration:**
   - User submits the registration form.
   - Data is validated, and the user is stored in the database.
2. **Login:**
   - User submits login credentials.
   - Authentication service verifies details and grants access.
3. **Profile Management:**
   - Logged-in users can view and edit their profile information.

## Security
- Passwords are securely stored (e.g., hashed using SHA-256).
- Input validation prevents SQL injection and XSS attacks.
