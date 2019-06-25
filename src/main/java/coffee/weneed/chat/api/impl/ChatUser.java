package coffee.weneed.chat.api.impl;

import java.util.UUID;
import org.json.JSONObject;

import coffee.weneed.chat.api.IChatHistory;
import coffee.weneed.chat.api.IChatUser;

public class ChatUser implements IChatUser {
	private String id;
	private ChatPlatform platform;
	private IChatHistory history;
	private String name;
	private boolean room;
	private boolean roomUser;
	private UUID linkageID;
	public void addChatMessage(IChatHistory h) {
		history = h;
	}

	public JSONObject getData() {
		return new JSONObject();
	}

	@Override
	public IChatHistory getHistory() {
		return history;
	}

	@Override
	public String getID() {
		return id;
	}

	@Override
	public String getName() {
		return name == null ? "" : name;
	}

	@Override
	public ChatPlatform getPlatform() {
		return platform;
	}

	@Override
	public void setChatHistory(IChatHistory h) {
		history = h;
	}

	@Override
	public void setID(String ID) {
		id = ID;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setPlatform(ChatPlatform p) {
		platform = p;
	}

	@Override
	public boolean isRoom() {
		return room;
	}

	@Override
	public boolean isRoomUser() {
		return roomUser;
	}

	@Override
	public UUID getLinkageID() {
		return linkageID;
	}

	@Override
	public void setLinkageID(UUID id) {
		this.linkageID = id;
	}
}
