package org.pai.javabrains.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.pai.javabrains.messenger.model.Message;
import org.pai.javabrains.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return messageService.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{msgID}")
	public Message getMessage(@PathParam("msgID") long msgID){
		return messageService.getMessage(msgID);
	}
}
