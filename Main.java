
class Dormitory {
    private String name;
    private String location;
    private int capacity;
    private List<Room> rooms;


    public Dormitory(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.rooms = new ArrayList<>();
    }


    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }
}

class Room {
    private int roomNumber;
    private String type;
    private boolean occupancyStatus;


    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.occupancyStatus = false;
    }

    public boolean isOccupied() {
        return occupancyStatus;
    }

    public void setOccupancyStatus(boolean status) {
        this.occupancyStatus = status;
    }
}

class Student {
    private String studentId;
    private String name;
    private String gender;
    private String preferences;
    private Room roomAssignment;
    private boolean paymentStatus;


    public Student(String studentId, String name, String gender, String preferences) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.preferences = preferences;
        this.paymentStatus = false; // Default to unpaid
    }

    public void assignRoom(Room room) {
        this.roomAssignment = room;
    }

    public boolean hasPaid() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean status) {
        this.paymentStatus = status;
    }
}

class Application {
    private String applicationId;
    private String studentId;
    private String preferences;
    private String status;


    public Application(String applicationId, String studentId, String preferences) {
        this.applicationId = applicationId;
        this.studentId = studentId;
        this.preferences = preferences;
        this.status = "Pending";
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class MaintenanceRequest {
    private String requestId;
    private int roomNumber;
    private String description;
    private String status;


    public MaintenanceRequest(String requestId, int roomNumber, String description) {
        this.requestId = requestId;
        this.roomNumber = roomNumber;
        this.description = description;
        this.status = "Open";
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
