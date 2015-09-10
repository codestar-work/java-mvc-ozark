package web;
import javax.mvc.*;
import javax.ws.rs.*;
import javax.inject.*;

@Path("/")
@Controller
public class MyController {

	@Inject
	Models model;
	
	@GET @Path("/area-of-circle")
	public String area(@QueryParam("radius") double radius) {
		model.put("result", Math.PI * radius * radius);
		return "test.jsp";
	}
	
	@GET @Path("/area-of-rectangle/{width}/{height}")
	public String area(
		@PathParam("width") double width, 
		@PathParam("height") double height) {
		model.put("result", width * height);
		return "test.jsp";
	}
	
}
