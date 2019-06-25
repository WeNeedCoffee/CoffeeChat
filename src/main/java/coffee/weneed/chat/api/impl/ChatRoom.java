package coffee.weneed.chat.api.impl;

import java.util.List;

import coffee.weneed.chat.api.IChatRoom;
import coffee.weneed.chat.api.IChatUser;

public abstract class ChatRoom extends ChatUser implements IChatRoom {
	private List<IChatUser> users;

	@Override
	public List<IChatUser> getUsers() {
		return users;
	}
}
