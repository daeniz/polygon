/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author CJS
 */
public class Report {
    private int reportNum;
    private Date date;
    private ArrayList<ReportRoom> listOfRepRoom;
    private int bdgId;
    private int categoryConclusion;

    /**
     *
     * @param reportNum  report number
     * @param date   date
     * @param bdgId    building's ID
     */
    public Report(int reportNum, Date date, int bdgId, int catCon) {
        this.reportNum = reportNum;
        this.date = date;
        this.bdgId = bdgId;
        this.categoryConclusion = catCon;
    }

    public int getReportNum() {
        return reportNum;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<ReportRoom> getListOfRepRoom() {
        return listOfRepRoom;
    }

    public int getBdgId() {
        return bdgId;
    }
  
    public void setListOfRepRoom(ArrayList<ReportRoom> listOfRepRoom) {
        this.listOfRepRoom = listOfRepRoom;
    }

    public int getCategoryConclusion() {
        return categoryConclusion;
    }

}
