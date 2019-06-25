package coffee.weneed.chat.api;


public interface IChatMessageHandler {
	void handleMessage(IChatClient client, IChatMessage message) throws Exception;

	boolean handles(IChatMessage message);
}
