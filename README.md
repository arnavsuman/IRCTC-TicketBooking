# IRCTC-TicketBooking

src/main/java/com/trainbooking
```
│
├── user
│   ├── model
│   │   └── User.java
│   ├── service
│   │   ├── UserService.java
│   │   └── UserServiceImpl.java
│   └── repository
│       └── UserRepository.java
│
├── ticket
│   ├── model
│   │   └── Ticket.java
│   ├── service
│   │   ├── TicketService.java
│   │   └── TicketServiceImpl.java
│   └── repository
│       └── TicketRepository.java
│
├── exception
│   └── BookingException.java
│
└── App.java

```

1 Model

Plain Java objects (POJOs)

Represents data

public class User {
    private int id;
    private String name;
}


2️ service

Business logic

Uses repositories

public interface UserService {
    void registerUser(User user);
}

public class UserServiceImpl implements UserService {
    public void registerUser(User user) {
        // business logic
    }
}


3️ repository

Data access layer

For now, use in-memory storage

public class UserRepository {
    private List<User> users = new ArrayList<>();
}


4️ exception

Custom exceptions

public class BookingException extends RuntimeException {
    public BookingException(String msg) {
        super(msg);
    }
}

