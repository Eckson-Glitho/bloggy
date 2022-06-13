package controllers;

import DAO.DBConnect;
import models.PostModel;
import models.UserModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostController {
    /**
     * method to post an article
     * @param post
     */
    public void create(PostModel post){
        DBConnect dbConnect = new DBConnect();
        dbConnect.connect();

        String req = "Insert into post(title, description, content)" +
                "values ('"+ post.getTitle() +"', '"+ post.getDescription() +"', '"+ post.getContent() +"')";

        try {
            dbConnect.state.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * show a post
     * @param id
     * @return
     */
    public PostModel show(int id){
        PostModel post = new PostModel();
        DBConnect dbConnect = new DBConnect();
        dbConnect.connect();

        String req = "Select * from post where id = '"+ id +"'";

        ResultSet resultSet;
        try {
            resultSet = dbConnect.state.executeQuery(req);
            if (resultSet.next()){
                post.setId(resultSet.getInt("id"));
                post.setTitle(resultSet.getString("title"));
                post.setContent(resultSet.getString("content"));
                post.setDescription(resultSet.getString("description"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return post;
    }

    /**
     * show all post
     */
    public void all(){
        DBConnect dbConnect = new DBConnect();
        dbConnect.connect();
    }

    /**
     * edit a post
     * @param post
     */
    public void edit(PostModel post){
        DBConnect dbConnect = new DBConnect();
        dbConnect.connect();

        String req = "update post set title='"+post.getTitle()+"', description='"+post.getDescription()+"', content='"+post.getContent()+"' where id='"+post.getId()+"';";

        try {
            dbConnect.state.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * delete post by id
     * @param id 
     */
    public void delete(int id){
        DBConnect dbConnect = new DBConnect();
        dbConnect.connect();

        String req = "Delete from post where id = '"+ id +"'";

        try {
            dbConnect.state.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(PostController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public PostModel searchId(int id){
        PostModel post = new PostModel();

        DBConnect dbconnect = new DBConnect();
        dbconnect.connect();

        String req = "select * from post where id='"+id+"';";

        try {
            ResultSet resultset = dbconnect.state.executeQuery(req);
            if(resultset.next()) {
                post.setId(resultset.getInt("id"));
                post.setTitle(resultset.getString("title"));
                post.setDescription(resultset.getString("description"));
                post.setContent(resultset.getString("content"));
            }else{
                post = null;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return post;
    }
}
