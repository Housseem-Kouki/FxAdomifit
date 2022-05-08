/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 *
 * @author Kouki
 */
public class Calendar {
     private int id; 
     private String title;
     private Date start;
     private Date end;
     private String description;
     private boolean allday;
     private String background_color;
     private String border_color;
     private String text_color;
     private int suivi_regime_id;
     private boolean checked;

    public Calendar() {
    }

    public Calendar(int id, String title, Date start, Date end, String description, boolean allday, String background_color, String border_color, String text_color, int suivi_regime_id, boolean checked) {
        this.id = id;
        this.title = title;
        this.start = start;
        this.end = end;
        this.description = description;
        this.allday = allday;
        this.background_color = background_color;
        this.border_color = border_color;
        this.text_color = text_color;
        this.suivi_regime_id = suivi_regime_id;
        this.checked = checked;
    }

    public Calendar(String title, Date start, Date end, String description, boolean allday, String background_color, String border_color, String text_color, int suivi_regime_id, boolean checked) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.description = description;
        this.allday = allday;
        this.background_color = background_color;
        this.border_color = border_color;
        this.text_color = text_color;
        this.suivi_regime_id = suivi_regime_id;
        this.checked = checked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAllday() {
        return allday;
    }

    public void setAllday(boolean allday) {
        this.allday = allday;
    }

    public String getBackground_color() {
        return background_color;
    }

    public void setBackground_color(String background_color) {
        this.background_color = background_color;
    }

    public String getBorder_color() {
        return border_color;
    }

    public void setBorder_color(String border_color) {
        this.border_color = border_color;
    }

    public String getText_color() {
        return text_color;
    }

    public void setText_color(String text_color) {
        this.text_color = text_color;
    }

    public int getSuivi_regime_id() {
        return suivi_regime_id;
    }

    public void setSuivi_regime_id(int suivi_regime_id) {
        this.suivi_regime_id = suivi_regime_id;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "Calendar{" + "id=" + id + ", title=" + title + ", start=" + start + ", end=" + end + ", description=" + description + ", allday=" + allday + ", background_color=" + background_color + ", border_color=" + border_color + ", text_color=" + text_color + ", suivi_regime_id=" + suivi_regime_id + ", checked=" + checked + '}';
    }
     
     
     
             
}
