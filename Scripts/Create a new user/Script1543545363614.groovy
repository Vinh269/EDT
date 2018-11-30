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

WebUI.navigateToUrl('http://vinhdx.asuscomm.com/EDT/Account/Login.aspx?ReturnUrl=%2Fedt%2F')

WebUI.setText(findTestObject('Test Object/Page_NewUser/input_User Name_ctl00ctl00topB'), 'admin')

WebUI.setEncryptedText(findTestObject('Test Object/Page_NewUser/input_Password_ctl00ctl00topBo'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Test Object/Page_NewUser/input_Required._ctl00ctl00topB'))

WebUI.click(findTestObject('Test Object/Page_CaseList/button_Site Administration'))

WebUI.click(findTestObject('Test Object/Page_CaseList/a_Users'))

WebUI.click(findTestObject('Test Object/Page_CaseList/input_Users ()_ctl00ctl00topBo'))

WebUI.setText(findTestObject('Test Object/Page_NewUser/input__ctl00ctl00topBodyPlaceH'), 'test@test.com')

String time = new Date().getTime()

String fixed_user = String.format('%s %s', user, time)

WebUI.setText(findTestObject('Test Object/Page_NewUser/input_User Name_ctl00ctl00topB_1'), fixed_user)

WebUI.setText(findTestObject('Test Object/Page_NewUser/input_User Name_ctl00ctl00topB_2'), fixed_user)

WebUI.setText(findTestObject('Test Object/Page_NewUser/input__ctl00ctl00topBodyPlaceH_1'), fixed_user)

WebUI.setText(findTestObject('Test Object/Page_NewUser/input__ctl00ctl00topBodyPlaceH_2'), fixed_user)

WebUI.setEncryptedText(findTestObject('Test Object/Page_NewUser/input__ctl00ctl00topBodyPlaceH_3'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Test Object/Page_NewUser/input__ctl00ctl00topBodyPlaceH_4'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Test Object/Page_NewUser/input_The user must log in usi'))

