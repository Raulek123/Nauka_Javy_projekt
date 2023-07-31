package ProgramowanieObiektowe2.Klimatyzacja;


import java.util.Random;

public class Building {
    private Room[] rooms;

    public Building(int numberOfRooms) {
        rooms = new Room[numberOfRooms];
        generateRooms();
    }

    private void generateRooms() {
        Random random = new Random();
        for (int i = 0; i < rooms.length; i++) {
            int currentTemperature = 20 + random.nextInt(15); //od 20 do 35 stopni
            int targetTemperature = currentTemperature - random.nextInt(10);
            int volume = 20 + random.nextInt(30);
            AirConditioner airConditioner = getRandomAirConditioner();
            rooms[i] = new Room(i+1, currentTemperature, targetTemperature, volume, airConditioner);
        }
    }

    private AirConditioner getRandomAirConditioner() {
        Random random = new Random();
        double value = random.nextDouble();
        if(value < 0.5)
            return new BasicAirConditioner();
        else
            return new ProAirConditioner();
    }

    public boolean areAllRoomsCool() {
        for (Room room : rooms) {
            if(room.getCurrentTemperature() > room.getTargetTemperature())
                return false;
        }
        return true;
    }

    public void coolRooms() {
        for (Room room : rooms) {
            room.cool();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Room room : rooms) {
            builder.append(room.toString()).append("\n");
        }
        return builder.toString();
    }
}