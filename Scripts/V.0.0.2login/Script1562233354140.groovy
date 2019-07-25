import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import java.lang.String as String

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hr.aetest.bwae.org/kpi-salary-ui/#/kpiSetting')

WebUI.setText(findTestObject('Object Repository/Page_/input__el-input__inner'), findTestData('userId').getValue(1, 1))

if (WebUI.getText(findTestObject('Object Repository/Page_/input__el-input__inner')) == '526') {
    WebUI.closeBrowser('')
}

WebUI.click(findTestObject('Object Repository/Page_/div_'))

WebUI.click(findTestObject('Object Repository/Page_/div_ (1)'))

WebUI.click(findTestObject('Object Repository/Page_/a_'))

WebUI.click(findTestObject('Object Repository/Page_/span_'))

WebUI.closeBrowser()

assert true

WebUI.verifyElementPresent(findTestObject('Page_/span_'), 6)

