package coffee.weneed.chat.api.impl;

public class ChatPlatform {
	private String display;
	private String id;

	public ChatPlatform(String display, String id) {
		this.display = display;
		this.id = id;
	}

	public String getDisplayName() {
		return id;
	}

	public String getID() {
		return display;
	}
}
