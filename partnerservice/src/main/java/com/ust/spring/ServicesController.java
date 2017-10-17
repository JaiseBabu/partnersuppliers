package com.ust.spring;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.
servlet.config.annotation.EnableWebMvc;


import com.ust.spring.model.Service;
import com.ust.spring.model.UploadFile;
import com.ust.spring.model.Login;
import com.ust.spring.model.Partner;
import com.ust.spring.model.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ust.spring.dao.FileUploadDAO;


import com.ust.spring.service.PartnerService;



@RestController
@EnableWebMvc
public class ServicesController {
	
	private static final Object String = null;
	private PartnerService partnerService;
	
	@Autowired(required=true)
	@Qualifier(value="partnerService")
	public void setPartnerService(PartnerService ps){
		this.partnerService = ps;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView addLoginScreen(){
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
//	 @RequestMapping(value = "/doUpload", method = RequestMethod.POST)
//	    public String handleFileUpload(HttpServletRequest request,
//	            @RequestParam CommonsMultipartFile[] fileUpload) throws Exception {
//	          
//	        if (fileUpload != null && fileUpload.length > 0) {
//	            for (CommonsMultipartFile aFile : fileUpload){
//	                  
//	                System.out.println("Saving file: " + aFile.getOriginalFilename());
//	                 
//	                UploadFile uploadFile = new UploadFile();
//	                UploadFile.getPic_name(aFile.getOriginalFilename());
//	                FileUploadDAO.save(uploadFile);               
//	            }
//	        }
//	  
//	        return "Success";
//	    }  

	
	public boolean logged=false;
	@RequestMapping(value="/loginprocess", method = RequestMethod.GET)
	public @ResponseBody ModelAndView checkLogin(String Username, String Password){
		
		 if( this.partnerService.checkLogin(Username, Password) ){
			 logged=true;
			 return new ModelAndView("redirect:/homepage"); 
		 }
		 return new ModelAndView("login");
	
	}
	

	@RequestMapping(value="/homepage", method = RequestMethod.GET)
	public @ResponseBody ModelAndView welcome(){
		
		if (logged){
			List<Service> list = this.partnerService.listServices();
			 
			 ModelAndView mav = new ModelAndView("welcome");
			 mav.addObject("listw", list);
			 return mav;
		}
		return new ModelAndView("/login");
	}
	

	
	
	@RequestMapping(value="/services",produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public @ResponseBody List<Service> list(){
		
		
		return this.partnerService.listServices();   
	}
	


	
	
	
	@RequestMapping(value="/partners/{service_id}", method = RequestMethod.POST)

	public @ResponseBody ModelAndView listpartner(@PathVariable int service_id){
		 List<Partner> list= this.partnerService.listPartners(service_id);
		 ModelAndView mav = new ModelAndView("listpartner");
		 mav.addObject("listq", list);
		 mav.addObject(service_id);
		 return mav;
	}
	
	@RequestMapping(value="/products/{partner_id}", method = RequestMethod.POST)

	public @ResponseBody ModelAndView listproduct(@PathVariable int partner_id){
		 List<Product> list= this.partnerService.listProduct(partner_id);
		 ModelAndView mav = new ModelAndView("listproduct");
		 mav.addObject("liste", list);
		 mav.addObject(partner_id);
		 return mav;
	}
	
	
	
	
	
	@RequestMapping(value= "/service/add", method = RequestMethod.GET)
	public ModelAndView addServiceScreen(){
		
		ModelAndView mav = new ModelAndView("addservice");
         mav.addObject("service", new Service());
		
		return mav;
	}
	
	@RequestMapping(value="/service/serviceAdd", method = RequestMethod.GET)
	public @ResponseBody ModelAndView AddS(String service_name, String service_desc){
		
		 this.partnerService.AddS(service_name,  service_desc);
		 return new ModelAndView("redirect:/homepage");
	}
	
	@RequestMapping(value= "/service/remove/{service_id}", method = RequestMethod.GET)
	public ModelAndView removeServiceScreen(@PathVariable int service_id){
		this.partnerService.RemoveS(service_id);
		
		return new ModelAndView("redirect:/homepage");
		
	}
	
	@RequestMapping(value="/service/serviceRemove", method = RequestMethod.GET)
	public @ResponseBody ModelAndView RemoveS(int service_id){
		
		 this.partnerService.RemoveS(service_id);
		 return new ModelAndView("redirect:/services");
	}
	
	@RequestMapping(value= "/service/update/{id}/{service_name}/{service_desc}", method = RequestMethod.GET)
	public ModelAndView updateServiceScreen(@PathVariable int id,@PathVariable String service_name,@PathVariable  String service_desc){
		
		ModelAndView mav = new ModelAndView("updateservice");
		mav.addObject(service_name);
		mav.addObject(service_desc);
		mav.addObject(id);
		return mav;
		
	}
	
	@RequestMapping(value="/service/serviceUpdate", method = RequestMethod.GET)
	public @ResponseBody ModelAndView UpdateS(int service_id, String service_name, String service_desc){
		
		 this.partnerService.UpdateS(service_id,service_name, service_desc);
		 return new ModelAndView("redirect:/homepage");
	}
	
	
	@RequestMapping(value= "/partner/add/{service_id}", method = RequestMethod.GET)
	public ModelAndView addPartnerScreen(@PathVariable int service_id){
		
		ModelAndView mav = new ModelAndView("addpartner");
		mav.addObject("partner", new Partner());
		mav.addObject(service_id);

		
		return mav;
		
	}
	
	@RequestMapping(value= "/product/add/{partner_id}", method = RequestMethod.GET)
	public ModelAndView addProductScreen(@PathVariable int partner_id){
		
		ModelAndView mav = new ModelAndView("addproduct");
		mav.addObject("partner", new Partner());
		mav.addObject(partner_id);

		
		return mav;
		
	}
	
	@RequestMapping(value="/partner/partnerAdd", method = RequestMethod.GET)
	public @ResponseBody ModelAndView AddP(int service_id,String partner_name, String partner_desc){
		
		 this.partnerService.AddP(service_id,partner_name,  partner_desc);
		 return new ModelAndView("redirect:/homepage");
	}
	
	@RequestMapping(value="/product/productAdd", method = RequestMethod.GET)
	public @ResponseBody ModelAndView AddPr(int partner_id,String product){
		
		 this.partnerService.AddPr(partner_id,product);
		 return new ModelAndView("redirect:/homepage");
	}
	
	
	
	@RequestMapping(value= "/partner/remove/{partner_id}", method = RequestMethod.GET)
	public ModelAndView removePartnerScreen(@PathVariable int partner_id){
		this.partnerService.RemoveP(partner_id);
		return new ModelAndView("redirect:/homepage");
		
	}
	
	@RequestMapping(value= "/product/remove/{product_id}", method = RequestMethod.GET)
	public ModelAndView removeProductScreen(@PathVariable int product_id){
		this.partnerService.RemovePr(product_id);
		return new ModelAndView("redirect:/homepage");
		
	}
	
	
	@RequestMapping(value="/partner/partnerRemove", method = RequestMethod.POST)
	public @ResponseBody ModelAndView RemoveP(int partner_id){
		
		 this.partnerService.RemoveP(partner_id);
		 return new ModelAndView("redirect:/homepage");
	}
	
	
	
	      
	@RequestMapping(value= "/partner/update/{id}/{service_id}/{partner_name}/{partner_desc}", method = RequestMethod.GET)
	public ModelAndView updatePartnerScreen(@PathVariable int id,@PathVariable int service_id,@PathVariable String partner_name,@PathVariable  String partner_desc){
		
		ModelAndView mav = new ModelAndView("updatepartner");
        mav.addObject(id);
        mav.addObject(service_id);
        mav.addObject(partner_name);
        mav.addObject(partner_desc);
		return mav;
		
	}
	@RequestMapping(value= "/product/update/{id}/{partner_id}/{product}", method = RequestMethod.GET)
	public ModelAndView updateProductScreen(@PathVariable int id,@PathVariable int partner_id,@PathVariable String product){
		
		ModelAndView mav = new ModelAndView("updateproduct");
        mav.addObject(id);
        mav.addObject(partner_id);
        mav.addObject(product);
		return mav;
		
	}
	
	@RequestMapping(value="/partner/partnerUpdate", method = RequestMethod.POST)
	public @ResponseBody ModelAndView UpdateP(int partner_id, String partner_name, String partner_desc){
		
		 this.partnerService.UpdateP(partner_id,partner_name, partner_desc);
		 return new ModelAndView("redirect:/homepage");
	}
	@RequestMapping(value="/product/productUpdate", method = RequestMethod.POST)
	public @ResponseBody ModelAndView UpdatePr(int product_id,int partner_id, String product){
		
		 this.partnerService.UpdatePr(product_id,partner_id,product);
		 return new ModelAndView("redirect:/homepage");
	}
	/*
	@RequestMapping(value= "/partner", method = RequestMethod.POST)
	public String addPartner(@ModelAttribute("partner") Partner p){
		
		if(p.getId() == 0){
			//new partner, add it
			this.partnerService.addPartner(p);
		}else{
			//existing partner, call update
			this.partnerService.updatePartner(p);
		}
		
		return "redirect:/partners";
		
	}
	
	@RequestMapping(value= "/service/add", method = RequestMethod.POST)
	public String addService(@ModelAttribute("service") Service s){
			
			if(s.getId() == 0){
				//new partner, add it
				this.partnerService.addService(s);
			}else{
				//existing partner, call update
				this.partnerService.updateService(s);
			}
			
			return "redirect:/partners";
			
		}
	 @RequestMapping("/service_partners/{id}")
	    public List<Partner> message(@PathVariable String id ) {//REST Endpoint.
	 
	        List<Partner> msg = null;
			//dtabase call
	        return msg;
	    }
	    @RequestMapping("/partners/{id}")
	    public Partner message2(@PathVariable String id ) {
	    	
	    	Partner msg = null;
			//dtabase call
	    	return msg;
	    }
	
	
	@RequestMapping("/remove/{id}")
    public String removePartner(@PathVariable("id") int id){
		
        this.partnerService.removePartner(id);
        return "redirect:/partners";
    }*/
 
   
	
}
