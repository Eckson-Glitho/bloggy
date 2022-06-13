package models;

public class PostModel {
    private int id;
    private String title, description, content;
    
    public PostModel(){}

    /**
     * constructor
     * @param id
     * @param title
     * @param content
     * @param description
     */
    public PostModel(int id, String title, String description, String content) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
    }

    /**
     * constructor
     * @param title
     * @param content
     * @param description
     */
    public PostModel(String title, String description, String content) {
        this.title = title;
        this.description = description;
        this.content = content;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
