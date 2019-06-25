package coffee.weneed.chat.api;

import coffee.weneed.chat.api.impl.ChatPlatform;

public interface IChatClient {
	void connect();

	void disconnect();

	ChatPlatform getPlatform();

	void login(String var1, String var2);

	void logout();
}
