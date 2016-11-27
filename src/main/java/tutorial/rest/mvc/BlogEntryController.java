package tutorial.rest.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tutorial.core.entities.BlogEntry;
import tutorial.core.services.BlogEntryService;
import tutorial.rest.resources.BlogEntryResource;
import tutorial.rest.resources.asm.BlogEntryResourceAsm;

/**
 * Created by PDeb on 11/26/2016.
 */
@Controller
public class BlogEntryController {

    private BlogEntryService blogEntryService;

    public BlogEntryController(BlogEntryService blogEntryService){
        this.blogEntryService = blogEntryService;
    }

    @RequestMapping(value = "/rest/blog-entries/{blogEntryId}", method = RequestMethod.GET)
    public ResponseEntity<BlogEntryResource> getBlogEntry(@PathVariable Long blogEntryId){
        BlogEntry entry = blogEntryService.find(blogEntryId);
        if(entry != null) {
            BlogEntryResource blogEntryResource = new BlogEntryResourceAsm().toResource(entry);
            return new ResponseEntity<BlogEntryResource>(blogEntryResource, HttpStatus.OK);
        }else{
            return new ResponseEntity<BlogEntryResource>(HttpStatus.NOT_FOUND);
        }

    }

}
