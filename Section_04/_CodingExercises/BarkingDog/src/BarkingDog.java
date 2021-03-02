public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        boolean wake = false;

        if(hourOfDay < 0 && hourOfDay > 23)
            wake = false;

        else if (hourOfDay >= 0 && hourOfDay <= 23)
        {
            if (barking == true)
            {
                if (hourOfDay < 8 || hourOfDay > 22)
                    wake = true;
                else
                    wake = false;
            }
        }
        return wake;
    }
}
