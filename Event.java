public class Event {
    private String id;
    private String name;
    private String location;
    private String date;
    private String time;

    public Event(String id, String name, String location, String date, String time) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date = date;
        this.time = time;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getDate() { return date; }
    public String getTime() { return time; }

    public void setName(String name) { this.name = name; }
    public void setLocation(String location) { this.location = location; }
    public void setDate(String date) { this.date = date; }
    public void setTime(String time) { this.time = time; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Location: " + location +
               ", Date: " + date + ", Time: " + time;
    }
}
