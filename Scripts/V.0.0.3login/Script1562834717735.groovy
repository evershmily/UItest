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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hr.aetest.bwae.org/kpi-salary-ui/#/kpiSetting')

WebUI.setText(findTestObject('Object Repository/v3/Page_/input__el-input__inner'), uid)

WebUI.click(findTestObject('Object Repository/v3/Page_/div_'))

not_run: WebUI.verifyElementPresent(findTestObject('v3/Page_/div_ (1)'), 6)

if (true) {
    WebUI.click(findTestObject('v3/Page_/div_ (1)'))
}

not_run: WebUI.verifyElementPresent(findTestObject('v3/Page_/a_'), 6)

WebUI.click(findTestObject('v3/Page_/a_'))

WebUI.click(findTestObject('Object Repository/v3/Page_/div__1'))

WebUI.closeBrowser()

@com.kms.katalon.core.annotation.SetUp
def clean() {
}

