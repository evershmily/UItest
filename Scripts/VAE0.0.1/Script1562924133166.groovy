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

WebUI.openBrowser('bwae.test.bwae.org')

WebUI.delay(1)

WebUI.clickOffset(findTestObject('AE4.0/Page_/div__IronCurtain'), 20, 20)

WebUI.setText(findTestObject('AE4.0/Page_/input__loginName'), 'admin-gogs')

WebUI.setText(findTestObject('AE4.0/Page_/input__password'), 'bbq653')

WebUI.click(findTestObject('AE4.0/Page_/a__localLoginBtn'))

WebUI.click(findTestObject('AE4.0/Page_/loginBtn'))

WebUI.setText(findTestObject('AE4.0/Page_BWAE - Container Cloud/prj_input__search'), 'abc')

WebUI.click(findTestObject('AE4.0/Page_BWAE - Container Cloud/prj_search'))

WebUI.click(findTestObject('AE4.0/Page_BWAE - Container Cloud/prj_name'))

//鼠标移动至某左侧元素上，出现左侧菜单栏
WebUI.mouseOver(findTestObject('Object Repository/AE4.0/Page_BWAE - Container Cloud/div_'))

WebUI.click(findTestObject('AE4.0/Page_BWAE - Container Cloud/my_prj'))

WebUI.click(findTestObject('AE4.0/Page_BWAE - Container Cloud/prj_info'))

//3s后关闭浏览器
WebUI.delay(3)

WebUI.closeBrowser()

