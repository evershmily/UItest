import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://bwae.test.bwae.org')

WebUI.delay(1)

WebUI.clickOffset(findTestObject('AE4.0/Page_/div__IronCurtain'), 20, 20)

WebUI.setText(findTestObject('AE4.0/Page_/input__loginName'), 'admin-gogs')

WebUI.setText(findTestObject('AE4.0/Page_/input__password'), 'bbq653')

WebUI.click(findTestObject('AE4.0/Page_/a__localLoginBtn'))

WebUI.click(findTestObject('AE4.0/Page_/loginBtn'))

WebUI.setText(findTestObject('AE4.0/Page_BWAE - Container Cloud/prj_input__search'), 'ww')

WebUI.click(findTestObject('AE4.0/Page_BWAE - Container Cloud/prj_search'))

assert search_result()
assert search_proj_name(findTestObject('Object Repository/AE4.0/Page_BWAE - Container Cloud/prj_name'))

WebUI.click(findTestObject('AE4.0/Page_BWAE - Container Cloud/prj_name'))


WebUI.closeBrowser()

//对 搜索结果数量进行判断
def search_result() {
	//WebUI.executeJavaScript('alert(\'hello\')', null)
	
	int num = WebUI.executeJavaScript('return document.querySelectorAll(\'.project_item\').length', null)

    println(num)

    if (num == 1) {
        return true
    } else {
        return false
    }
}
//判断搜索的第一个结果是否正确
def search_proj_name(TestObject ob){
	def pro_name = WebUI.getText(ob)
	println(pro_name)
	if( pro_name.indexOf("ww")){
		return true
	}else
	{
		return false
	}
}


