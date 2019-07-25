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

for (def rowIdx = 0; rowIdx < findTestData('userId').getAllData().size(); rowIdx++) {
    WebUI.openBrowser('https://hr.aetest.bwae.org/kpi-salary-ui/#/kpiSetting')

    // 需要注意的是，这里的column和row的值，都是从1开始
    def userId = findTestData('userId').getValue(1, rowIdx + 1)

    login(userId)
	
	//WebUI.getAttribute()
	
	/*
    if (WebUI.getText()) {
		WebUI.closeBrowser()
    }
    */
    WebUI.click(findTestObject('Object Repository/v3/Page_/div_'))
	WebUI.getText(findTestObject('Object Repository/ob_define/Page_/span_'))
	if(WebUI.getText(findTestObject('Object Repository/ob_define/Page_/span_'))=="曹东"){
		WebUI.closeBrowser()
		}
	else{
    WebUI.delay(5)
    WebUI.closeBrowser()
	}
}

def login(def userId) {
    WebUI.setText(findTestObject('Object Repository/v3/Page_/input__el-input__inner'), userId)
}

