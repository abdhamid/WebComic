package Model;

public class ListComic {
    public enum ListType {
        ONE_ITEM, TWO_ITEM;
    }

    private String title;
    private int imageResourceId;
    private ListType type;

    public ListComic(String title, int imageResourceId, ListType type){
        this.title = title;
        this.imageResourceId = imageResourceId;
        this.type = type;

    }

    public String getTitle() {
        return title;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public ListType getType() {
        return type;
    }

    public void setType(ListType type) {
        this.type = type;
    }
}
