package controllers;

import static org.fest.assertions.Assertions.assertThat;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.POST;
import static play.test.Helpers.callAction;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.status;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.Before;

import play.mvc.Result;
import play.test.FakeRequest;
import play.test.WithApplication;

public class AccountTest extends WithApplication {

	@Before
	public void before() {
		// TODO delete account accountTestUser
	}

	@Test
	public void failedToLoginByNotRegistered() {
		Map<String, String> params = new HashMap<>();
		params.put("name", "accountTestUser");
		params.put("password", "password");

		Result result = callAction(
				controllers.routes.ref.Account.doLogin(),
				new FakeRequest(POST, "/account/login").withFormUrlEncodedBody(params));
		assertThat(status(result)).isEqualTo(OK);
		assertThat(contentAsString(result)).contains("Account not registerd.");
	}
}
