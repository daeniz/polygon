/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author CJS
 */
public class ReportRoomDamage {
    private int repRoomDmgId;
    private String damageTime;
    private String place;
    private String whatHappened;
    private String whatIsRepaired;
    private String damageType;
    private int repRoomId;

    /**
     *
     * @param repRoomDmgId report room damage ID
     * @param damageTime   date when the damage was discovered
     * @param place        location of the damage
     * @param whatHappened cause of the damage
     * @param whatIsRepaired  part that has been repaired
     * @param damageType    type of damage
     * @param repRoomId     report room ID
     */
    public ReportRoomDamage(int repRoomDmgId, String damageTime, String place, String whatHappened, String whatIsRepaired, String damageType, int repRoomId) {
        this.repRoomDmgId = repRoomDmgId;
        this.damageTime = damageTime;
        this.place = place;
        this.whatHappened = whatHappened;
        this.damageType = damageType;
        this.repRoomId = repRoomId;
        this.whatIsRepaired = whatIsRepaired;
    }
    
    public ReportRoomDamage(String damageTime, String place, String whatHappened, String whatIsRepaired, String damageType, int repRoomId) {
        this.damageTime = damageTime;
        this.place = place;
        this.whatHappened = whatHappened;
        this.damageType = damageType;
        this.repRoomId = repRoomId;
        this.whatIsRepaired = whatIsRepaired;
    }

    public void setRepRoomDmgId(int repRoomDmgId) {
        this.repRoomDmgId = repRoomDmgId;
    }

    
    public int getRepRoomDmgId() {
        return repRoomDmgId;
    }

    public String getDamageTime() {
        return damageTime;
    }

    public String getPlace() {
        return place;
    }

    public String getWhatHappened() {
        return whatHappened;
    }

    public String getWhatIsRepaired() {
        return whatIsRepaired;
    }

    public String getDamageType() {
        return damageType;
    }

    public int getRepRoomId() {
        return repRoomId;
    }
    
}