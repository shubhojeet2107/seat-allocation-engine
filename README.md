# Seat Allocation Engine (Train Booking System)

## 📌 Problem Statement
A console-based train booking system built using core Java (OOP) where users can book seats on trains, and the system manages seat availability.

## 🛠 Tech Stack
- Java
- OOP
- Collections Framework

---

## 🧱 Entities

### User
- userId (int)
- name (String)
- hashedPassword (String)
- ticketsBooked (List < Ticket>) 

### Train
- trainId (int)
- trainName (String)
- totalSeats (int)
- availableSeats (int)

### Booking
- bookingId (int)
- userId (int)
- trainId (int)

---

## ⚙️ Service Layer

### BookingManager
Handles core business logic:
- Add user
- Add train
- Book ticket
- View bookings

---

## 🔗 Relationships
- One User → Many Bookings (1:N)
- One Train → Many Bookings (1:N)

---

## 🔥 Core Booking Logic
1. Validate user
2. Validate train
3. Check seat availability
4. Deduct available seats
5. Create booking entry

---

## ⚠️ Edge Cases
- Invalid userId
- Invalid trainId
- No seats available

---

## 🚀 Future Enhancements
- Concurrency handling (multiple users booking simultaneously)
- Database integration (replace in-memory storage)
- REST API using Spring Boot
- Authentication & authorization