@RestController // @Controller
@RequestMapping("")
public class Controller {
	@Autowired
	Service service;

	@RequestMapping(value = "", method = RequestMethod.GET)
	// @RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
		// @APIDescription(description = "", title = "")
	public Object (
			/*@ParamDescription("") */@RequestParam(value="") Type var
			// /*@ParamDescription("") */@RequestParam(value="", required=false) Type var
			// /*@ParamDescription("") */@RequestParam("") Type var
			@ModelAttribute Object obj
	) {
		return service.get();
	}

	@RequestMapping(value = "/s", method = {RequestMethod.GET})
	@APIDescription(description = " 목록", title = "")
	public Object (
			@ParamDescription("") @RequestParam(value="") int 
	) {
		return service.get();
	}

	@RequestMapping(value = "//new", method = {RequestMethod.POST})
	@APIDescription(description = " 생성", title = "")
	public Object create(
			@ParamDescription("") @RequestParam(value="") String 
	) {
		paramObj = new ();
		paramObj.set();
		return service.create(paramObj);
	}

	@RequestMapping(value = "//update", method = {RequestMethod.POST})
	@APIDescription(description = " 수정", title = "")
	public Object update(
			@ParamDescription("") @RequestParam(value="", required=false) String 
	) {
		paramObj = new ();
		paramObj.set();
		return service.update(paramObj);
	}

	@RequestMapping(value = "//delete", method = {RequestMethod.POST})
	@APIDescription(description = " 삭제", title = "")
	public Object delete(
			@ParamDescription("") @RequestParam(value="") int 
	) {
		return service.delete();
	}
}