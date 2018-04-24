package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Book;
import java.io.File;
import io.swagger.model.ModelApiResponse;
import ua.bookUnity.dao.BookDAO;
import ua.bookUnity.dao.CategoryDAO;
import ua.bookUnity.dao.ConditionDAO;
import ua.bookUnity.dao.impl.BookDAOImpl;
import ua.bookUnity.dao.impl.CategoryDAOImpl;
import ua.bookUnity.dao.impl.ConditionDAOImpl;
import ua.bookUnity.model.Category;

import java.util.LinkedList;
import java.util.List;
import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-24T18:42:49.417Z")
public class BookApiServiceImpl extends BookApiService {
    
	@Override
    public Response addBook(Book body, SecurityContext securityContext) throws NotFoundException {
    	CategoryDAO categoryDAO = new CategoryDAOImpl();
    	Category category = categoryDAO.getOneByName(body.getCategory());
    	BookDAO bookDAO = new BookDAOImpl();
    	ua.bookUnity.model.Book book = bookDAO.save(body.getName(), body.getAuthor(), body.getLanguage(), body.getYearOfIssue(), body.getPublishingHouse(), body.getDescription(), body.getNumberOfPages(), body.getPrice(), body.getOwnImpression(),body.getLogin() , body.getCondition().getId(),  category.getCategoryID());
    //add genre    
    	if(book!=null) {
       	 return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Book is created!!!")).build();
       }
       return Response.status(Status.CONFLICT).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "Book can't be created!!!")).build();
    }
    @Override
    public Response deleteBook(Long bookId, String apiKey, SecurityContext securityContext) throws NotFoundException {
        
    	BookDAO bookDAO = new BookDAOImpl();
    	bookDAO.delete(bookId.intValue());  	
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Book is deleted!!!")).build();
    }
    @Override
    public Response findBook( @NotNull String category,  List<String> genre,  String author,  Integer year, SecurityContext securityContext) throws NotFoundException {
    	BookDAO bookDAO = new BookDAOImpl();
    	
    	List<ua.bookUnity.model.Book> bookList = new LinkedList<>();
    	List<Book> resultList = new LinkedList<>();
    	
    	if(category!=null) {
    		CategoryDAO categoryDAO = new CategoryDAOImpl();
        	Category categ = categoryDAO.getOneByName(category);
        	if(categ!=null) {
        		List<ua.bookUnity.model.Book> list = bookDAO.getAllByCategory(categ.getCategoryID());
        		bookList.addAll(list);
        	}   		    		
    	}
    	
    	
    	if(author!=null) {
        	List<ua.bookUnity.model.Book> list = bookDAO.getAllByAuthor(author);
        	bookList.addAll(list);	  		    		
    	}
    	
    	if(year!=null) {
        	List<ua.bookUnity.model.Book> list = bookDAO.getAllByYear(year);
        	bookList.addAll(list);	  		    		
    	}
    	
    	for(String gen: genre) {
    		List<ua.bookUnity.model.Book> list = bookDAO.getAllByGenre(gen);
        	bookList.addAll(list);
    	}
    	
    	for(ua.bookUnity.model.Book book : bookList) {
    		Book normalBook = normalizeBook(book);
    		if(!resultList.contains(normalBook)) {
    			resultList.add(normalBook);
    		}
    	}
    	
        return Response.ok(resultList).entity(new ApiResponseMessage(ApiResponseMessage.OK, "Filtered books!")).build();
    }
    @Override
    public Response getBookById(Long bookId, SecurityContext securityContext) throws NotFoundException {
    	BookDAO bookDAO = new BookDAOImpl();
    	ua.bookUnity.model.Book book = bookDAO.getOneByID(bookId.intValue());
    	if(book!=null) {
    		return Response.ok(normalizeBook(book)).entity(new ApiResponseMessage(ApiResponseMessage.OK, "Book returned!")).build();
    	}
    	
    	return Response.status(Status.NOT_FOUND).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "No book with this ID!!!")).build();
    }
    @Override
    public Response updateBook(Book body, SecurityContext securityContext) throws NotFoundException {
        
    	CategoryDAO categoryDAO = new CategoryDAOImpl();
    	Category category = categoryDAO.getOneByName(body.getCategory());
    	BookDAO bookDAO = new BookDAOImpl();
    	ua.bookUnity.model.Book book = bookDAO.update(body.getId().intValue(),body.getName(), body.getAuthor(), body.getLanguage(), body.getYearOfIssue(), body.getPublishingHouse(), body.getDescription(), body.getNumberOfPages(), body.getPrice(), body.getOwnImpression(),body.getLogin() , body.getCondition().getId(),  category.getCategoryID());
       
    	if(book!=null) {
       	 return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Book is updated!!!")).build();
       }
    	
    	 return Response.status(Status.NOT_FOUND).entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "Book can't be updated!!!")).build();
    }
    @Override
    public Response uploadFile(Long bookId, String additionalMetadata, InputStream fileInputStream, FormDataContentDisposition fileDetail, SecurityContext securityContext) throws NotFoundException {
        
    	//write upload
    	
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    
    private Book normalizeBook(ua.bookUnity.model.Book book) {
    	Book result = new Book();
    	result.setId(book.getBookID().longValue());
    	result.setAuthor(book.getAuthor());
    	result.setName(book.getBookName());
    	result.setLanguage(book.getLanguage());
    	result.setYearOfIssue(book.getYearIssue());
    	result.setPublishingHouse(book.getPublishingHouse());
    	result.setDescription(book.getDescription());
    	result.setNumberOfPages(book.getNumberOfPages());
    	result.setPrice(book.getPrice().toString());
    	result.setOwnImpression(book.getImpression());
    	result.setLogin(book.getAccount_fk());
    	
    	CategoryDAO categoryDAO = new CategoryDAOImpl();
    	Category category = categoryDAO.getOneByID(book.getCategory_fk());
    	
    	result.setCategory(category.getCategoryName());
    	
    	ConditionDAO conditionDAO = new ConditionDAOImpl();
    	ua.bookUnity.model.Condition condition = conditionDAO.getOneByID(book.getCondition_fk());
    	
    	Condition cond = new Condition();
    	cond.setId(condition.getConditionID());
    	cond.setName(condition.getConditionName());
    	
    	result.setCondition(cond);
    	
    	return result;
    }
}
