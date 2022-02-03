package step_definitions;

import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.KielAddIlanPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class US030 {

    KielAddIlanPage page = new KielAddIlanPage();

    @Then("kullanici add_ilan sayfasinda excel dosyasindaki ulkeler bilgilerinin ulkeler dropdownu icerisindeki varligini dogrular")
    public void kullaniciAdd_ilanSayfasindaExcelDosyasindakiUlkelerBilgilerininUlkelerDropdownuIcerisindekiVarliginiDogrular() throws IOException {

        WebElement dropdown = page.ulkelerDropdown;
        Select select = new Select(dropdown);
        List<WebElement> list = select.getOptions();

        String dosyaAdresi = "src/test/resources/excels/Ulkeler.xlsx";
        FileInputStream file = new FileInputStream(dosyaAdresi);
        Workbook excel = WorkbookFactory.create(file);
        Sheet sheet = excel.getSheetAt(0);
        int satirSayisi = sheet.getLastRowNum();

        for(int i = 1; i <= satirSayisi; i++){
            boolean varMi = false;
            Cell cell = sheet.getRow(i).getCell(1); // Almanya - Amerika

            for(WebElement w : list){
                if( w.getText().equalsIgnoreCase(cell.toString()) ){
                    varMi = true;
                    break;
                }
            }
            if(varMi == false){
                Assert.assertTrue(false);
                break;
            }
        }

        Assert.assertTrue(true);


    }

}