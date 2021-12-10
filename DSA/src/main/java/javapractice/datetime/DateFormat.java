package javapractice.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class DateFormat {
    private static final String DATE_TIME_FORMAT="MMM dd, yyyy hh:mm a";

    public static void main(String[] args) {
            System.out.println(getTimeStampFromDateString("Dec 01, 2021 07:38 PM","UTC"));
    }


    private static Long getTimeStampFromDateString(String aInDateTime,
                                            String aInTimeZoneId)
    {
        SimpleDateFormat lDateFormat =
                new SimpleDateFormat(DATE_TIME_FORMAT);
        if (aInTimeZoneId != null && !aInTimeZoneId.equals(""))
        {
            lDateFormat.setTimeZone(TimeZone.getTimeZone(aInTimeZoneId));
        }

        Long lNewDateTime = null;
        try
        {
            lNewDateTime = lDateFormat.parse(aInDateTime).getTime();
        }
        catch(ParseException aInE)
        {
            lNewDateTime = 0L;
        }
        return lNewDateTime;
    }
}
