package com.example.moviedexv7;

import android.content.Context;
import java.io.IOException;

public class SaveMovieDataFormat
{
    public void moviedata(String Dates, String Title, String Watched,Context context) throws IOException
    {
        SaveMovieDataFile F = new SaveMovieDataFile();
        String Entry = Title + " - " + Watched + " - " + Dates + "\n";
        F.FileSave("MovieLogs.txt", Entry, context);
    }
}

