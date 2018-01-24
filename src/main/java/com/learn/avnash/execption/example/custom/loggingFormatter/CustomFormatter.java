package com.learn.avnash.execption.example.custom.loggingFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

public class CustomFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        String level = record.getLevel().getName();
        String loggerName = record.getLoggerName();
        String message = record.getMessage();
        String dateTime = formatDate(record.getMillis());
        
        StringBuffer sb = new StringBuffer();
        sb.append("<tr>");
        sb.append("<td>");
        sb.append(level);
        sb.append("</td>");
        sb.append("<td>");
        sb.append(message);
        sb.append("</td>");
        sb.append("<td>");
        sb.append(dateTime);
        sb.append("</td>");
        sb.append("</tr>");
        
        return sb.toString();
//        return level + " | " + message + " | " + dateTime + "\n";
    }

    @Override
    public String getHead(Handler h) {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("Log File");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<table border='1'>");
        return sb.toString();
    }

    @Override
    public String getTail(Handler h) {
        StringBuffer sb = new StringBuffer();
        sb.append("</table>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
    
    private String formatDate(long millisecs) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy HH:mm");
        Date date = new Date(millisecs);
        return dateFormat.format(date);
    }

}
