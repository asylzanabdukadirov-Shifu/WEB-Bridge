public class ContactPage extends Page {

    public ContactPage(Theme theme) {
        super(theme);
    }

    @Override
    public void display() {
        System.out.println("Displaying Contact Page");
        theme.applyTheme();
    }
}
