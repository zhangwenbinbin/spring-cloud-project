package cn.sprsec;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OauthServerApplicationTests {

	@Test
	public void contextLoads() {
		String token = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1Njg3NTQxMzMsInVzZXJfbmFtZSI6ImFkbWluIiwiYXV0aG9yaXRpZXMiOlsiYWRtaW4iXSwianRpIjoiOTI3NTU0MTYtMTI3NS00YjczLTg4YTYtYmVkZWIwNzIyMjc1IiwiY2xpZW50X2lkIjoiY2xpZW50Iiwic2NvcGUiOlsiYXBwIl19.LMIhM6dMJ4OLFOTqKrGm18Xd88BXgQBvaOYip9WIfJ6kJh03iH8tnJr4WxT0SQS45-ncoScKeLUXlLzo3wJDxAdzdDTQdt8j4XIGCqdyIy-6PC-lzMDFV-PNYuSaWQh2Jstjyn57qKB6uscsqla-a6oeDXPdqwDwns9hYvJ7C2U79wUJMJJpDWw5dIVVFOCdk-ToPmRqM2Vwh3UkQng6q2wKdA2MMjRnmSzvanyyKD8OBA3dbYgxSQJYby0O07ObvlS543nEaK3NR5DBJcqVWga3LO8DGoFwMgik8xG-xLupNrHVzdq3WghmG_ZhUO0H-ie3DJAEeCJFS5RYW7K-UA";
		Jwt jwt = JwtHelper.decode(token);
		System.out.println("jwt+"+jwt+"+jwt");
	}

}
