/*
 * Class for information of the room of a building
 * Most importantly gives the option to iterate over the rooms in a particular building
 */
package Domain;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author daniel
 */
public class BuildingRoom implements Serializable{
    private int roomId;
    private String roomName;
    
    
    // Do we keep info about damages in the object here as well?
    
    
    public BuildingRoom(int roomId, String roomName){
        this.roomId = roomId;
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    
}