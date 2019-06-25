package coffee.weneed.chat.api;

import java.util.Map;

public interface IChatHistory {
	void addMessage(IChatMessage var1);

	void editMessage(long var1, IChatMessage var3);

	long getCurrentID();

	IChatMessage getMessage(long var1);

	Map<Long, IChatMessage> getMessages();

	void setCurrentID(long var1);
}
