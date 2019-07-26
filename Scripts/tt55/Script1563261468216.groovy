import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import sun.util.logging.resources.logging as logging

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hr.aetest.bwae.org/kpi-salary-ui/#/kpiSetting')

WebUI.setText(findTestObject('Object Repository/HR/Page_/input__el-input__inner'), '42')

WebUI.click(findTestObject('Object Repository/HR/Page_/div_'))

WebUI.click(findTestObject('Object Repository/HR/Page_/div_ (1)'))

WebUI.delay(2)

/*
if (WebUI.getElementHeight(findTestObject('Object Repository/HR/Page_/a_'))) {
    
} else {
   
}*/
try {
    WebUI.click(findTestObject('Object Repository/HR/Page_/a_'))

    WebUI.delay(3)
}
catch (Exception e) {
    println(e)

    WebUI.closeBrowser()
} 

