package utils;

import java.sql.*;

public class AttendeeDAO {
    public void addAttendee(Attendee attendee) {
        String sql = "INSERT INTO attendees (full_name, email, contact_number, country) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, attendee.getFullName());
            stmt.setString(2, attendee.getEmail());
            stmt.setString(3, attendee.getContactNumber());
            stmt.setString(4, attendee.getCountry());
            stmt.executeUpdate();
            System.out.println("Attendee added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAttendee(int id) {
        String sql = "DELETE FROM attendees WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Attendee deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Implement other methods (Edit, Search, Statistics)
}
