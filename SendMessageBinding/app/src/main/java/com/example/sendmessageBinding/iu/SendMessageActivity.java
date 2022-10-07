package com.example.sendmessageBinding.iu;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.sendmessageBinding.R;
import com.example.sendmessageBinding.SendMessageApplication;
import com.example.sendmessageBinding.data.Message;
import com.example.sendmessageBinding.databinding.ActivitySendMessageBinding;

/**
 * <h1>Proyecto sendMessage</h1>
 * En este proyecto aprenderemos a realizar las siguientes operaciones
 * <ol>
 *     <li>Crear un evento de un componente button @see android en codigo XML</li>
 *     <li>Crear un escuchador/listener del evento <code>OnClick()</code></li>
 *     <li>Crear un escuchador/listener y un elemento Bundle para pasar información entre Activity</li>
 *     <li>El ciclo de vida de una Activity</li>
 *      <li>Manejar una pila de actividades</li>
 * </ol>
 *
 * @author Daniel Ruiz
 * @version 1.0
 * @see android.widget.Button
 * @see android.app.Activity
 * @see android.content.Intent
 * @see android.os.Bundle
 */
public class SendMessageActivity extends AppCompatActivity {

    //private SendMessageOnClickListener delegado;
    //region Ciclo de vida de la activity
    private static final String TAG = "SendMessageActivity";
    private ActivitySendMessageBinding binding;

    //Método que se ejecuta cuando se crea la Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySendMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        /*etUser = findViewById(R.id.etUser);
        etMessage = findViewById(R.id.etMessage);
        btsend = findViewById(R.id.btSend);*/
        //Se incializa el delegaddo
        //delegate = new sendMessageOnClickListener();
        //btsend.setOnClickListener(delegate);
        //Establecer listener OnClick listener al boton mediante una clase anonima que
        //implementa la interfaz View.OnclickListener
        //binding.setMessage(new Message(new User("Daniel","daniel@iesportada.org")));
        binding.setMessage(new Message(((SendMessageApplication) getApplication()).getUser()));
        binding.btsend.setOnClickListener(view -> sendMessage());
        Log.d(TAG, "SendMessageActivity -> onCreate()");
    }

    //Método que se ejecuta cuando se empieza la Activity
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "SendMessageActivity -> onStart()");
    }

    //Método que se ejecuta cuando se continua la Activity
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SendMessageActivity -> onResume()");
    }

    //Método que se ejecuta cuando se para la Activity
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SendMessageActivity -> onPause()");
    }

    //Método que se ejecuta cuando se para la Activity
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "SendMessageActivity -> onStop()");
    }

    //Método que se ejecuta cuando se destruye la Activity
    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
        Log.d(TAG, "SendMessageActivity -> onDestroy()");
    }
    //endregion

    /**
     * Este metodo callback crea el menu de opciones en la vista, devuelve true para indicar al SO
     * que se a realizado la opción de modificar menu
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * Este metodo callback se llama cuando se pulsa sobre una de las opciones del menu de la aplicación
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_aboutUs:
                Toast.makeText(this, "Se ha pulsado About Us",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, AboutUsActivity.class);
                break;
        }
        return true;
    }

    //Método para el OnClick de btnSend
    /*Refactorizacion
    public void sendMessage(View view) {
        sendMessage();
    }*/

    public void sendMessage() {
        //TODO Se modificara este ejercicio para estudiar ViewBinding
        //Toast.makeText(this, "Hemos pulsado el botón", Toast.LENGTH_SHORT).show();
        //1. Crear el contenedor para añadir los datos
        Bundle bundle = new Bundle();
        //1.1. Pasar dato a dato
        //bundle.putString("user", binding.getMessage().getUser().getName());
        //bundle.putString("message", binding.getMessage().getContent());
        //1.2. Crear un objeto Message
        Message message = new Message(binding.getMessage().getUser(), binding.getMessage().getContent());
        bundle.putParcelable("message", message);
        //2. Vamos a crear el obejto Intent explicito porque se conoce la Actividad destino
        Intent intent = new Intent(this, ViewMessageActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /*
    Esta clase NO ANONIMA integra el listenerOnClick
    *
    class sendMessageOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Toast.makeText(SendMessageActivity.this, "Esto es atraves de un delegado", Toast.LENGTH_SHORT).show();
        }
    }*/
}