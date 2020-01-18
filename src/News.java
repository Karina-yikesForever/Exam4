public class News {
    private int id;
    private String headLine;
    private String text;
    private String timePublication;

    public News() {
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", headLine='" + headLine + '\'' +
                ", text='" + text + '\'' +
                ", timePublication='" + timePublication + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTimePublication() {
        return timePublication;
    }

    public void setTimePublication(String timePublication) {
        this.timePublication = timePublication;
    }
}
