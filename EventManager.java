import java.util.*;

public class EventManager {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event event) {
        eventList.add(event);
        System.out.println("✅ Event added successfully.");
    }

    public void viewEvents() {
        if (eventList.isEmpty()) {
            System.out.println("⚠️ No events available.");
        } else {
            for (Event e : eventList) {
                System.out.println(e);
            }
        }
    }

    public Event findEventById(String id) {
        for (Event e : eventList) {
            if (e.getId() == id) return e;
        }
        return null;
    }

    public void updateEvent(String id, String name, String location, String date, String time) {
        Event e = findEventById(id);
        if (e != null) {
            e.setName(name);
            e.setLocation(location);
            e.setDate(date);
            e.setTime(time);
            System.out.println("✅ Event updated.");
        } else {
            System.out.println("❌ Event not found.");
        }
    }

    public void deleteEvent(String id) {
        Event e = findEventById(id);
        if (e != null) {
            eventList.remove(e);
            System.out.println("✅ Event deleted.");
        } else {
            System.out.println("❌ Event not found.");
        }
    }

    public void searchEventByName(String keyword) {
        boolean found = false;
        for (Event e : eventList) {
            if (e.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("⚠️ No matching events found.");
        }
    }
}
