package correct.service;

import correct.entity.User;

public interface IMailService {
	
	public void forgotPasswordMail(User user);

}
