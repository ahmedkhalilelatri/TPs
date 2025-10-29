class Database {
    private static Database instance;
    private String name;
    private Database(String name) {
        this.name = name;
    }
    public static Database getInstance(String name) {
        if (instance == null) {
            instance = new Database(name);
        }
        return instance;
    }
    public void getConnection() {
        System.out.println("You are connected to the database " + name + ".");
    }
}
public class design {
    public static void main(String[] args) {
        Database db1 = Database.getInstance("StudentsDB");
        db1.getConnection();
        Database db2 = Database.getInstance("LibraryDB");
        db2.getConnection();
        if (db1 == db2) {
            System.out.println("They are the same database.");
        } else {
            System.out.println("They are different databases.");
        }
    }
}

