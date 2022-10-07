package com.example.sendmessageBinding.data;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/**
 * Clase modelo que contiene el dato del usuario y el mensaje que manda
 * Al ser user un objeto se debe implementar la interfaz Serializable y Parcelable en el objeto User
 * @author Daniel Ruiz Villodres
 * @version 1.0
 */
public class Message implements Serializable, Parcelable {
    private User user;
    private String content;

    //Si no se declara un constructor, Java implementa el constructor vacio

    public Message(User user, String content) {
        this.user = user;
        this.content = content;
    }

    public Message(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    //region METODOS CREADOS POR LA INTERFAZ PARCELABLE
    protected Message(Parcel in) {
        user = in.readParcelable(User.class.getClassLoader());
        content = in.readString();
    }

    public static final Creator<Message> CREATOR = new Creator<Message>() {
        @Override
        public Message createFromParcel(Parcel in) {
            return new Message(in);
        }

        @Override
        public Message[] newArray(int size) {
            return new Message[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(user, i);
        parcel.writeString(content);
    }
    //endregion

}
