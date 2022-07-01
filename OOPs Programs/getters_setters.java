class MyEmployee {
    private int id; // Private access modifires so that anyone can't be edited .
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }

}

public class getters_setters {
    public static void main(String[] args) {
        MyEmployee Dhruv = new MyEmployee();
        // Dhruv.id = 45;
        // Dhruv.name = "Dhruv Karavadiya"; // Error due to Private Accss Modifier
        Dhruv.setName("Dhruv Karavadiya");
        System.out.println(Dhruv.getName());
        Dhruv.setId(34);
        System.out.println(Dhruv.getId());
    }
}