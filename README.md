
# ToDoFullStack  

Welcome to **ToDoFullStack**, my first full-stack project! This project is a simple yet powerful To-Do list application built using Angular for the frontend and Spring Boot for the backend. 🚀  

---

## 🔧 Technologies Used  

### Frontend:  
- **Angular**  
- **HTML5**  
- **CSS3**  
- **TypeScript**  

### Backend:  
- **Spring Boot**  
- **Java**  
- **Hibernate (JPA)**  
- **MySQL** (as the database)  

---

## ✨ Features  
- **Task Management:** Create, update, delete, and mark tasks as complete.  
- **Responsive Design:** Optimized for both desktop and mobile devices.  
- **RESTful API:** Backend API for CRUD operations.  
- **Database Integration:** MySQL to store tasks.  

---

## 🚀 Getting Started  

### Prerequisites  
- **Java JDK 17+**  
- **Node.js** (https://nodejs.org/)  
- **MySQL**  
- **Angular CLI**  

### Installation  

1. Clone the repository:  
   ```bash  
   git clone https://github.com/aashif-sajah/ToDoFullStack.git  
   ```  

2. **Backend Setup (Spring Boot):**  
   - Navigate to the backend directory:  
     ```bash  
     cd backend  
     ```  
   - Configure the `application.properties` file:  
     ```properties  
     spring.datasource.url=jdbc:mysql://localhost:3306/todo_db  
     spring.datasource.username=your_mysql_username  
     spring.datasource.password=your_mysql_password  
     spring.jpa.hibernate.ddl-auto=update  
     ```  
   - Build and run the backend:  
     ```bash  
     ./mvnw spring-boot:run  
     ```  

3. **Frontend Setup (Angular):**  
   - Navigate to the frontend directory:  
     ```bash  
     cd ../frontend  
     ```  
   - Install dependencies:  
     ```bash  
     npm install  
     ```  
   - Run the frontend development server:  
     ```bash  
     ng serve  
     ```  
   The frontend will run on `http://localhost:4200/`.  

---


## 📜 License  

MIT License  

Copyright (c) 2024 Aashif Sajah  

Permission is hereby granted, free of charge, to any person obtaining a copy...  
```  

Visit [ChooseALicense.com](https://choosealicense.com/) for more details.  

---

## 🤝 Contribution Policy  

We welcome contributions! To contribute:  

1. Fork the repository.  
2. Create a new branch (`feature/your-feature-name`).  
3. Commit your changes.  
4. Open a pull request.  

Please ensure your code follows best practices and includes documentation.  

---

## 📝 Feedback  

Feel free to create issues for bugs, feature requests, or general feedback. Your input is valuable and appreciated! 🙌  
