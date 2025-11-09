public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("Thin GF63 12UC", "MSI", "51,300 mWh");
        Monitor theMonitor = new Monitor("27inch Beast", "MSI", 27, "1920x1080");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer(theMonitor, theMotherboard, theCase);

        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getComputerCase().pressPowerButton();
    }
}
