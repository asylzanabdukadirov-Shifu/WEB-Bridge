public class HomePage extends Page {

    public HomePage(Theme theme) {
        super(theme);
    }

    @Override
    public void display() {
        System.out.println("Displaying Home Page");
        theme.applyTheme();
    }
}
