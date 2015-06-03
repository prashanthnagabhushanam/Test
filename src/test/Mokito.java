package test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.prashanth.dao.UserDao;
import com.prashanth.domain.User;

@RunWith(MockitoJUnitRunner.class)

public class Mokito {

	@Mock private User user;
	
	@Mock private UserDao userdao;
	
	@Test
	public void findUserById()
	{
		final Long id = 123l;
		Mockito.doReturn(createUser()).when(userdao).getUser(id);
	}

	private Object createUser() {
		return new User();
	}
	
	
}
