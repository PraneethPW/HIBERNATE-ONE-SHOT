# 🧠 Hibernate One-Shot CRUD Operations

This repository provides a complete one-shot guide to mastering Hibernate CRUD operations using Java and MySQL. Ideal for beginners who want a clear, no-fluff example of using Hibernate for real-world applications.

---

## 📌 Features Included

✅ Insertion (Create).
✅ Selection (Read).  
✅ Updation (Update).  
✅ Deletion (Delete).  
✅ Working with `Date` and `Time` fields.  
✅ Storing & retrieving **Images (BLOB)** and **Text (CLOB)** in MySQL.

---

## 🛠️ Tech Stack

- Java (JDK 8+)
- Hibernate ORM (5.x+)
- MySQL Database
- Maven (for dependency management)

---

## 📁 Project Structure

HibernateOneShot/
├── src/
│   └── main/
│       └── java/
│           ├── in/praneeth/Entity/
│           │   └── Employee.java
│           └── in/praneeth/LLMS/HibernateOneShot/
│               ├── DATETIMEInsertion.java
│               ├── Delete.java
│               ├── ImageAndText.java
│               ├── Insertion.java
│               ├── Selection.java
│               └── Updation.java
│   └── resources/
│       └── hibernate.cfg.xml
├── src/test/java/
├── pom.xml
├── target/















---

## ⚙️ How to Run

1. Clone this repository  
   ```bash
   git clone https://github.com/PraneethPW/Hibernate-OneShot-CRUD.git

   
2. Import it into your favorite IDE (IntelliJ / Eclipse).
3. Update MySQL credentials in hibernate.cfg.xml.
4. Run the individual operation files under /operations/ to test CRUD functionality.

## 🖼️ Image & Text Storage
The ImageTextOps.java file demonstrates how to:

1. Insert image files as BLOBs.
2. Insert large text files as CLOBs.

## 📅 Date & Time Handling
DateTimeOps.java showcases storing:

1. Java Date, LocalDate, and LocalDateTime.
2. Auto-generated timestamps using annotations like @Temporal.

## 🙌 Author
Made with 💻 by Praneeth Reddy

Feel free to ⭐ the repo if it helped you!

## 🔖 License
This project is licensed under the MIT License.






