public abstract class Page {

    protected Theme theme;

    public Page(Theme theme) {
        this.theme = theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public abstract void display();
}
