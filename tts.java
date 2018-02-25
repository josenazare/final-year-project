import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.content.Intent;
import java.util.Locale;
import android.widget.Toast;

public class compose extends AppCompatActivity {
Button button,b2;
    TextToSpeech tts;
    int result;
    EditText edit;
    String test;

  /*    Repeated code 
  
  
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);


        button=(Button)findViewById(R.id.back1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent i = new Intent(compose.this, startpage.class);
                startActivity(i);
            }
        });
*/   

// TTS start


        edit = (EditText) findViewById(R.id.editText);

        tts = new TextToSpeech(compose.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    result = tts.setLanguage(Locale.ENGLISH);
                } else {
                    Toast.makeText(getApplicationContext(), "Feature not supported", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
        public void TTS(View v1){
        switch(v1.getId()){
            case R.id.speak:
                if (result==TextToSpeech.LANG_MISSING_DATA||result==TextToSpeech.LANG_NOT_SUPPORTED){
                    Toast.makeText(getApplicationContext(), "Not supported", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    test=edit.getText().toString();
                    tts.speak(test,TextToSpeech.QUEUE_FLUSH,null);
                }

       break;


        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(tts!=null){
            tts.stop();
            tts.shutdown();
        }
    }
    }
