package Domain;

public class Movie {
    
    private int code;
    private String title;
    private int genre;
    private int total;
    private boolean subtitled;
    private boolean premier;
    
    public Movie() {
        this.code = 0;
        this.title = "";
        this.genre = 0;
        this.total = 0;
        this.subtitled = false;
        this.premier = false;
    }//constructor default

    public Movie(int code, String title, int genre, int total, boolean subtitled, boolean premier) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        this.total = total;
        this.subtitled = subtitled;
        this.premier = premier;
    }//constructor sobrecargado

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGenre() {
        return this.genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isSubtitled() {
        return this.subtitled;
    }

    public void setSubtitled(boolean subtitled) {
        this.subtitled = subtitled;
    }

    public boolean isPremier() {
        return this.premier;
    }

    public void setPremier(boolean premier) {
        this.premier = premier;
    }
            
}//end class
