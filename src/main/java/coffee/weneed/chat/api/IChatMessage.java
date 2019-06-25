package coffee.weneed.chat.api;

import java.util.List;

import coffee.weneed.utils.dataholders.IJSONObjectDataHolder;

public interface IChatMessage extends IJSONObjectDataHolder {
	List<IChatMessage> getHistory();

	String getMessageText();
	
	IChatUser getSender();
	
	IChatUser getContext();
	
	void setSender(IChatUser sender);
	
	void setContext(IChatUser context);

	long getTimestamp();

	boolean isDeleted();

	void setDeleted(boolean var1);

	void setHistory(List<IChatMessage> var1);

	void setMessageText(String var1);

	void setTimestamp(long var1);
}
