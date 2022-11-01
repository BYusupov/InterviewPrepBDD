package pages;

public interface CommonPage {
    String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";

    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";
    String XPATH_TEMPLATE_TEXT = "//*[text()='%s']";
    String XPATH_TEMPLATE_TEXT_CONTAINS = "//*[contains(text(), '%s')]";
    String XPATH_TEMPLATE_INPUT_FIELD = "//input[@placeholder='%s']";
    String XPATH_TEMPLATE_TEXTAREA_FIELD = "//textarea[@placeholder='%s']";

    String XPATH_TEMPLATE_TEXTAREA_TXT = "//textarea[text()='%s']";
    String XPATH_TEMPLATE_CLASS_CONTAINS = "//*[contains(@class, '%s')]";

    String XPATH_DELETE_BUTTON_WITH_QUESTIONS = "//p[contains(text(), '%s')]/following::button[1]";

    String XPATH_EDIT_BUTTON_WITH_QUESTIONS = "//p[contains(text(), '%s')]/following::button[2]";


}
