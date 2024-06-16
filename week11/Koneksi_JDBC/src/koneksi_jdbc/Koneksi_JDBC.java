package koneksi_jdbc;

import java.sql.*;
import java.util.Scanner;

public class Koneksi_JDBC {
    // Konstanta untuk JDBC driver dan URL basis data
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";

    // Variabel untuk koneksi, statement, dan result set
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        try {
            // Memuat JDBC driver
            Class.forName(JDBC_DRIVER);
            // Membuat koneksi ke basis data
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // Membuat statement untuk eksekusi query SQL
            stmt = conn.createStatement();

            Scanner scanner = new Scanner(System.in);
            while (true) {
                // Menampilkan menu pilihan kepada pengguna
                System.out.println("1. Show Data");
                System.out.println("2. Insert Data");
                System.out.println("3. Update Data");
                System.out.println("4. Delete Data");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline

                // Memilih aksi berdasarkan input pengguna
                switch (choice) {
                    case 1:
                        showData(scanner);
                        break;
                    case 2:
                        insertData(scanner);
                        break;
                    case 3:
                        updateData(scanner);
                        break;
                    case 4:
                        deleteData(scanner);
                        break;
                    case 5:
                        // Menutup statement dan koneksi sebelum keluar
                        stmt.close();
                        conn.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method untuk menampilkan data
    public static void showData(Scanner scanner) {
        try {
            System.out.println("1. Show Penulis");
            System.out.println("2. Show Buku");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            String sql;
            if (choice == 1) {
                // Query untuk menampilkan semua data dari tabel penulis
                sql = "SELECT * FROM penulis";
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    // Menampilkan data penulis
                    System.out.println("ID: " + rs.getInt("id") + ", Nama Penulis: " + rs.getString("nama_penulis"));
                }
            } else if (choice == 2) {
                // Query untuk menampilkan semua data dari tabel buku dengan join ke tabel penulis
                sql = "SELECT buku.id, buku.judul_buku, buku.stok, penulis.nama_penulis FROM buku INNER JOIN penulis ON buku.penulis = penulis.id";
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    // Menampilkan data buku
                    System.out.println("ID: " + rs.getInt("id") + ", Judul Buku: " + rs.getString("judul_buku") + ", Stok: " + rs.getInt("stok") + ", Penulis: " + rs.getString("nama_penulis"));
                }
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method untuk memasukkan data baru
    public static void insertData(Scanner scanner) {
        try {
            System.out.println("1. Insert Penulis");
            System.out.println("2. Insert Buku");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            if (choice == 1) {
                // Memasukkan data penulis baru
                System.out.print("Enter Nama Penulis: ");
                String namaPenulis = scanner.nextLine();
                String sql = "INSERT INTO penulis (nama_penulis) VALUES (?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, namaPenulis);
                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    System.out.println("A new penulis was inserted successfully!");
                }
            } else if (choice == 2) {
                // Memasukkan data buku baru
                System.out.print("Enter Judul Buku: ");
                String judulBuku = scanner.nextLine();
                System.out.print("Enter Stok: ");
                int stok = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline
                System.out.print("Enter Penulis ID: ");
                int penulisId = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline

                String sql = "INSERT INTO buku (judul_buku, stok, penulis) VALUES (?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, judulBuku);
                pstmt.setInt(2, stok);
                pstmt.setInt(3, penulisId);
                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    System.out.println("A new buku was inserted successfully!");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method untuk memperbarui data
    public static void updateData(Scanner scanner) {
        try {
            System.out.println("1. Update Penulis");
            System.out.println("2. Update Buku");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            if (choice == 1) {
                // Memperbarui data penulis
                System.out.print("Enter Penulis ID to update: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline
                System.out.print("Enter new Nama Penulis: ");
                String namaPenulis = scanner.nextLine();

                String sql = "UPDATE penulis SET nama_penulis = ? WHERE id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, namaPenulis);
                pstmt.setInt(2, id);
                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    System.out.println("Penulis information was updated successfully!");
                }
            } else if (choice == 2) {
                // Memperbarui data buku
                System.out.print("Enter Buku ID to update: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline
                System.out.print("Enter new Judul Buku: ");
                String judulBuku = scanner.nextLine();
                System.out.print("Enter new Stok: ");
                int stok = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline
                System.out.print("Enter new Penulis ID: ");
                int penulisId = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline

                String sql = "UPDATE buku SET judul_buku = ?, stok = ?, penulis = ? WHERE id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, judulBuku);
                pstmt.setInt(2, stok);
                pstmt.setInt(3, penulisId);
                pstmt.setInt(4, id);
                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    System.out.println("Buku information was updated successfully!");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method untuk menghapus data
    public static void deleteData(Scanner scanner) {
        try {
            System.out.println("1. Delete Penulis");
            System.out.println("2. Delete Buku");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            if (choice == 1) {
                // Menghapus data penulis
                System.out.print("Enter Penulis ID to delete: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline

                String sql = "DELETE FROM penulis WHERE id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, id);
                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    System.out.println("Penulis information was deleted successfully!");
                }
            } else if (choice == 2) {
                // Menghapus data buku
                System.out.print("Enter Buku ID to delete: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline

                String sql = "DELETE FROM buku WHERE id = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, id);
                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    System.out.println("Buku information was deleted successfully!");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
