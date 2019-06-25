package coffee.weneed.chat.api.impl;

import java.util.List;

import org.json.JSONObject;

import coffee.weneed.chat.api.IChatMessage;
import coffee.weneed.chat.api.IChatUser;

public class ChatMessage implements IChatMessage {
	private long timestamp;
	private List<IChatMessage> history;
	private IChatUser sender;
	private IChatUser context;
	private boolean deleted;

	public ChatMessage() {
		timestamp = System.currentTimeMillis();
	}

	public ChatMessage(JSONObject json) {
		fromJSON(json);
	}

	@Override
	public void fromJSON(JSONObject json) {
	}

	@Override
	public List<IChatMessage> getHistory() {
		return history;
	}

	@Override
	public String getMessageText() {
		return null;
	}

	@Override
	public long getTimestamp() {
		return timestamp;
	}

	@Override
	public boolean isDeleted() {
		return deleted;
	}

	@Override
	public void setDeleted(boolean d) {
		this.deleted = d;
	}

	@Override
	public void setHistory(List<IChatMessage> h) {
		history = h;
	}

	@Override
	public void setMessageText(String msg) {
	}

	@Override
	public void setTimestamp(long t) {
		timestamp = t;
	}

	@Override
	public JSONObject toJSON() {
		return null;
	}

	@Override
	public IChatUser getSender() {
		return sender;
	}

	@Override
	public IChatUser getContext() {
		return context;
	}

	@Override
	public void setSender(IChatUser sender) {
		this.sender = sender;
	}

	@Override
	public void setContext(IChatUser context) {
		this.context = context;
	}
}
