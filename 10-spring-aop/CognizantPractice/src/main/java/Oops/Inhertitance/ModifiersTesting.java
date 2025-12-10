package Oops.Inhertitance;

// Parent class
class Parent {
    private int privateData = 10;
    int defaultData = 20;       // default
    protected int protectedData = 30;
    public int publicData = 40;

    // Getter for private
    public int getPrivateData() {
        return privateData;
    }
}

// Child class
class Child extends Parent {
    void showData() {
        // System.out.println(privateData); // ❌ Not accessible
        System.out.println("Private (via getter): " + getPrivateData()); // ✅ Access via getter
        System.out.println("Default: " + defaultData);                 // ✅ Accessible (same package)
        System.out.println("Protected: " + protectedData);             // ✅ Accessible
        System.out.println("Public: " + publicData);                   // ✅ Accessible
    }
}

public class ModifiersTesting {
    public static void main(String[] args) {
        Child c = new Child();
        c.showData();
    }
}
