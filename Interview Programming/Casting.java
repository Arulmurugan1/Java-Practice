class Basic {
    public void calling() {
        System.out.println("Basic mOBILE");
    }
}

class smart extends Basic {
    @Override
    public void calling() {
        System.out.println("Smart calling");
    }

    public void camera() {
        System.out.println("camera ....");
    }
}

public class Casting {
    public static void main(String[] args) {
        Basic bc = new smart();
        bc.calling();
        smart sc = (smart) bc;
        sc.calling();
        sc.camera();
    }
}