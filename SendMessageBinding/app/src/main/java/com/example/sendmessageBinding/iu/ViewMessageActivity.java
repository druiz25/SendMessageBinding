package com.example.sendmessageBinding.iu;
import androidx.appcompat.app.AppCompatActivity;
import com.example.sendmessageBinding.data.Message;
import android.os.Bundle;
import android.util.Log;
import com.example.sendmessageBinding.databinding.ActivityViewMessageBinding;

/**
 * Clase que muestra el mensaje de un usuario.Recoge un mensaje que implmenta la interfaz
 * Parcelable.
 * @author Daniel Ruiz
 * @version 1.0
 */
public class ViewMessageActivity extends AppCompatActivity {

    private static final String TAG = "ViewMessageActivity";
    private ActivityViewMessageBinding binding;
    //region Ciclo de vida
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "sendMessageActivity -> onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "sendMessageActivity -> onStop()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "sendMessageActivity -> onStart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "sendMessageActivity -> onStart()");
    }

    /**
     * ESte metodo se ejecuta cuando se destruye la Activity(Hay que asegurarse de destruir todo lo que se crea en el create)
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
        Log.d(TAG, "sendMessageActivity -> onDestroy()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //textMessage = findViewById(R.id.textMessage);
        //textRemitente = findViewById(R.id.textRemitente);
        //1.Recoger el bundle que me an enviado en el Intent que a iniciado esta actividad
        Bundle bundle = getIntent().getExtras();
        Message message = bundle.getParcelable("message");
        binding.setMessage(message);
        binding.textUsuario.setText(binding.getMessage().getUser().getName());
        binding.textMessage.setText(binding.getMessage().getContent());
        //binding.textMessage.setText(message.getContent());
        Log.d(TAG, "ViewMessageActivity -> onCreate()");
    }
    //endregion
}