public class AboutPage extends Page {

    public AboutPage(Theme theme) {
        super(theme);
    }

    @Override
    public void display() {
        System.out.println("Displaying About Page");
        theme.applyTheme();
    }
}
