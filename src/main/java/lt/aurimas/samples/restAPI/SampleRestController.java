package lt.aurimas.samples.restAPI;

import java.net.URI;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

// If using this annotation, no need to use @ResponseBody with method signature
@RestController
@RequestMapping(value = "/samples/restSample/items")
public class SampleRestController {
	
	@Autowired
	private ItemService itemService;
	
	private static Logger log = Logger.getLogger(SampleRestController.class);

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Item> getItem(@PathVariable("id") long id) {
		log.info("Get item method with item id " + id);
		Item item = itemService.getItem(id);
		if (item != null) {
			return new ResponseEntity<Item>(item, HttpStatus.OK);
		}
		log.info("Item with id " + id + " was not found");
		return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
	}
	
	// Example URI: localhost:8080/Dev/samples/restSample/items?title=ItemTitle
	@RequestMapping(params = {"title"}, method = RequestMethod.GET)
	public ResponseEntity<List<Item>> getItemsByTitle(@RequestParam(value = "title") String title) {
		log.info("Retrieving items with title " + title);
		List<Item> items = itemService.getItemsByTitle(title);
		if (items.isEmpty()) {
			log.info("No items found");
			return new ResponseEntity<List<Item>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Void> addItem(@RequestBody Item item, UriComponentsBuilder uriBuilder) {
		log.info("Adding item with title " + item.getTitle());
		try {
			item = itemService.addItem(item);
		} 
		// TODO Add various exceptions from service added at Oct 2, 2016
		catch (Exception ex) {
			log.info("Can't add item with title" + item.getTitle() + ". Cause: " + ex.getMessage());
			return new ResponseEntity<Void>(HttpStatus.EXPECTATION_FAILED);
		}
		URI buildedUri = uriBuilder.path("/item/{id}").buildAndExpand(item.getID()).toUri();
		log.info("Added item, URI to item: " + buildedUri.toString());
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.setLocation(buildedUri);
		return new ResponseEntity<Void>(httpHeader, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public ResponseEntity<Item> updateItem(@RequestBody Item item) {
		log.info("Updating item with id " + item.getID());
		try {
			item = itemService.updateItem(item);
		}
		// TODO Add various exceptions from service added at Oct 2, 2016
		catch (Exception ex) {
			log.info("Can't update item with id" + item.getID() + ". Cause: " + ex.getMessage());
			return new ResponseEntity<Item>(HttpStatus.EXPECTATION_FAILED);
		}
		return new ResponseEntity<Item>(item, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteItem(@PathVariable("id") long id) {
		log.info("Deleting item with id " + id);
		try {
			itemService.removeItem(id);
		}
		catch (Exception ex) {
			log.info("Can't delete item with id" + id + ". Cause: " + ex.getMessage());
			return new ResponseEntity<Void>(HttpStatus.EXPECTATION_FAILED);
		}
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
