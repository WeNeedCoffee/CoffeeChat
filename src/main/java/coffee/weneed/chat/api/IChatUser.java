package coffee.weneed.chat.api;

import java.util.UUID;
import coffee.weneed.chat.api.impl.ChatPlatform;

public interface IChatUser {
	IChatHistory getHistory();

	boolean isRoom();
	
	boolean isRoomUser();
	
	String getID();

	String getName();

	ChatPlatform getPlatform();

	void setChatHistory(IChatHistory history);

	void setID(String id);

	void setName(String name);

	void setPlatform(ChatPlatform platform);
	
	/***
	 * used to link multiple unique users to each other when they are the same user/account
	 * @return
	 */
	UUID getLinkageID();
	
	void setLinkageID(UUID id);
}
