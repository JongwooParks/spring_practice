package com.example.ex02.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Data
public class WorkVO {
    private String name;
    private String time;


    public boolean getGoCheck(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        try {
            Date goTime = dateFormat.parse("09:00");
            Date time = dateFormat.parse(this.time);
            boolean check = time.after(goTime);
            return check;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean getLeaveCheck(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        try {
            Date leaveTime = dateFormat.parse("17:00");
            Date time = dateFormat.parse(this.time);
            boolean check = time.after(leaveTime);
            return check;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }





}
