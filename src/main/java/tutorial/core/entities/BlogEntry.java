package tutorial.core.entities;

/**
 * Created by PDeb on 11/26/2016.
 */
public class BlogEntry {

    private Long id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
