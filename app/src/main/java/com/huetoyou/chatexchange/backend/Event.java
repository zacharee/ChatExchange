package com.huetoyou.chatexchange.backend;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Chat event generated by a backend
 * <p>
 * The backends generate a stream of events that signal various types of
 * activity in a room. This includes new messages being posted, users entering
 * or leaving the room, replies, etc.
 */
public class Event implements Parcelable
{

    public static final int EVENT_MESSAGE_POSTED = 1;

    @SerializedName("id")
    private final int mId;

    /**
     * Retrieve the event ID
     */
    public int getId()
    {
        return mId;
    }

    @SerializedName("event_type")
    private final int mEventType;

    /**
     * Retrieve the event type
     */
    public int getEventType()
    {
        return mEventType;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeInt(mId);
        dest.writeInt(mEventType);
    }

    private Event(Parcel in)
    {
        mId = in.readInt();
        mEventType = in.readInt();
    }

    public static final Creator<Event> CREATOR = new Creator<Event>()
    {
        @Override
        public Event createFromParcel(Parcel in)
        {
            return new Event(in);
        }

        @Override
        public Event[] newArray(int size)
        {
            return new Event[size];
        }
    };
}
