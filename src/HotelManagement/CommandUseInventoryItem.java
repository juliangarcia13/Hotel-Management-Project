package HotelManagement;

import java.io.IOException;
import java.text.ParseException;

public class CommandUseInventoryItem extends aCommand {
    public CommandUseInventoryItem(Hotel h) {
        hotel = h;
    }

    @Override
    public boolean execute() throws IOException, ParseException {
        InventoryFileController.useItem(hotel.cdInventoryFolder());
        return true;
    }

    @Override
    public String getDescription() {
        return "use inventory item";
    }
}