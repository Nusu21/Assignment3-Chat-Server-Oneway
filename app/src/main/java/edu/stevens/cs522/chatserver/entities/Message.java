package edu.stevens.cs522.chatserver.entities;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

import edu.stevens.cs522.chatserver.contracts.MessageContract;

/**
 * Created by dduggan.
 */

public class Message implements Parcelable, Persistable {

    public long id;

    public String chatRoom;

    public String messageText;

    public Date timestamp;

    public Double latitude;

    public Double longitude;

    public String sender;

    public long senderId;

    public Message() {
    }

    public Message(Cursor in) {
        id = MessageContract.getId(in);
        chatRoom = MessageContract.getChatRoom(in);
        messageText = MessageContract.getMessageText(in);
        timestamp = MessageContract.getTimestamp(in);
        latitude = MessageContract.getLatitude(in);
        longitude = MessageContract.getLongitude(in);
        sender = MessageContract.getSender(in);
        senderId = MessageContract.getSenderId(in);
    }

    public Message(Parcel in) {
        // TODO
    }

    @Override
    public void writeToProvider(ContentValues out) {
        // TODO

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO
    }

    public static final Creator<Message> CREATOR = new Creator<Message>() {

        @Override
        public Message createFromParcel(Parcel source) {
            // TODO
            return null;
        }

        @Override
        public Message[] newArray(int size) {
            // TODO
            return null;
        }

    };

}

