package hello.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("servlet:///list")
			.to("log:in")
			.to("sql:SELECT * FROM  myitems WHERE user_id = :#id")
			.marshal().json(JsonLibrary.Gson)
			.to("log:out");
	}
}
