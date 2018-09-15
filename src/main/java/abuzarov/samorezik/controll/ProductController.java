package abuzarov.samorezik.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import abuzarov.samorezik.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/")
	public ModelAndView startPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("startPage");
		return modelAndView;
		
	}
	@RequestMapping("/catalog")
	public ModelAndView catalogPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("catalog");
	}
	

}
