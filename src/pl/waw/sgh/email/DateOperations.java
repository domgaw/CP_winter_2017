package pl.waw.sgh.email;


import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateOperations {

    public static void main(String[] args) {


        Date date = new Date();
        System.out.println(date); //current date

        System.out.println(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate); // format String
        System.out.println(sdf2.format(date)); // format String
        JOptionPane.showInputDialog(null, "Please provide a date");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        boolean sucsess = false;
        Date outDate = null;
        while (!sucsess) {
            try {

                String inDate = JOptionPane.showInputDialog(null, "Please provide a date");
                outDate = sdf3.parse(inDate);

                Calendar c = Calendar.getInstance();
                c.add(Calendar.DATE,10);
                outDate = c.getTime();
                sucsess= true;
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Can't interpret the provided date, please try again ");
            }

            JOptionPane.showMessageDialog(null, "Success");
        }
    }
}
