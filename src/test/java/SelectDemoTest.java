import org.testng.annotations.Test;

import java.util.List;

public class SelectDemoTest extends BaseTest {

   @Test
    void testSelectValue() {

        browserHelper.open("https://demoqa.com/select-menu");
        // Печать списка
        dropDownHelper.printoutSelectList(selectPage.selectValue, selectPage.selectValueOptions);
    }

    @Test
    void testSelectOne() {

        browserHelper.open("https://demoqa.com/select-menu");
        // Печать списка
        dropDownHelper.printoutSelectList(selectPage.selectOne, selectPage.selectValueOptions);
    }

    @Test
    void testMultiSelectionDropDown() {

        browserHelper.open("https://demoqa.com/select-menu");
        // Печать списка
        dropDownHelper.printoutSelectList(selectPage.selectMultiselectDropDown, selectPage.selectValueOptions);
    }

    @Test
    void testSelectPageMenu() {

        browserHelper.open("https://demoqa.com/select-menu");
        dropDownHelper.printoutSelectList(selectPage.oldSelectMenu);
    }

    @Test
    void testStandartMultiSelect() {

        browserHelper.open("https://demoqa.com/select-menu");
        dropDownHelper.printoutSelectList(selectPage.StandardMultiSelect);
    }
}

