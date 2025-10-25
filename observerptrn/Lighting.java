package observerptrn;

class Lighting implements AlarmListener {
    public void alarm() {
        System.out.println("lights up");
    }
}