public class TV {
    private int nrCanal = 1;
    private int volumCurent = 15;
    private boolean pornit = false;

    public void volumUp() {
        if (pornit != false && volumCurent != 50)
            volumCurent++;
        System.out.println("The volume is now at " + volumCurent);
    }

    public void volumDown() {
        if (pornit != false && volumCurent != 0)
            volumCurent--;
        System.out.println("The volume is now at " + volumCurent);
    }

    public void channelUp() {
        if (pornit != false)
            if (nrCanal != 100)
                nrCanal++;
            else nrCanal = 0;
        System.out.println("You are now on channel " + nrCanal);
    }

    public void channelDown() {
        if (pornit != false)
            if (nrCanal != 0)
                nrCanal--;
            else nrCanal = 100;
        System.out.println("You are now on channel " + nrCanal);
    }

    public void turnOn() {
        pornit = true;
        System.out.println("The TV is now ON");
    }

    public void turnOff() {
        pornit = false;
        System.out.println("The TV is now OFF");
    }
}
