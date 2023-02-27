package com.example.moviedexv7;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SaveMovieDataFile{
    public void FileSave(String fileName, String content,Context context){
        try {

                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("MovieLogs.txt", Context.MODE_APPEND));

            outputStreamWriter.write(content);
            Toast.makeText(context,"Wrote to file " + fileName, Toast.LENGTH_SHORT).show();
            //Toast.makeText(getBaseContext(), "Wrote To The File", Toast.LENGTH_SHORT).show();
            outputStreamWriter.close();


        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }


}



