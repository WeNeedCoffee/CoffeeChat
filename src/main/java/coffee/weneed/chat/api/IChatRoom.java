package coffee.weneed.chat.api;

import java.util.List;

public interface IChatRoom extends IChatUser {
	List<IChatUser> getUsers();
}
