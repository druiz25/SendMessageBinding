package com.example.sendmessageBinding;
import android.app.Application;
import com.example.sendmessageBinding.data.User;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class SendMessageApplication extends Application {
    /*Usuario que ha iniciado sesión es un dato Global porque siempre se va a acceder a el con
    el método getApplication().getUser()*/
    private User user;
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.addLogAdapter(new AndroidLogAdapter());
        Logger.d("Se ha inicializado el objeto Application");
        user = new User("Daniel", "dani@iesportada.org");
    }

    public User getUser() {
        return user;
    }
}
