public class Main {

    public static void main(String[] args) {

        Theme lightTheme = new LightTheme();
        Theme darkTheme = new DarkTheme();
        Theme blackTheme = new BlackTheme();

        Page homePage = new HomePage(lightTheme);
        Page aboutPage = new AboutPage(darkTheme);
        Page contactPage = new ContactPage(blackTheme);

        homePage.display();
        aboutPage.display();
        contactPage.display();

        System.out.println("\nChanging Home Page theme...");

        homePage.setTheme(darkTheme);
        homePage.display();
    }
}