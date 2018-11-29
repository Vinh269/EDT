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
import org.apache.commons.lang.RandomStringUtils

WebUI.callTestCase(findTestCase('Start eDT WebUI'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.callTestCase(findTestCase('WebUI Page/LogIn Page/LogIn with Admin user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Export/Page_EDT/a_222 222 222'))

WebUI.click(findTestObject('Page_EDT - 222 222 222/a_Admin'))

WebUI.click(findTestObject('Page_EDT - 222 222 222/a_Exports'))

WebUI.selectOptionByValue(findTestObject('Page_EDT - 222 222 222/select_(None)1ASDFGGGGPlacehol'), '1006', true)

WebUI.click(findTestObject('Page_EDT - 222 222 222/input_Template_ctl00ctl00topBo'))

WebUI.setText(findTestObject('Object Repository/Export/Page_EDT/input__ctl00ctl00topBodyPlaceH'), 'Export' + RandomStringUtils.randomNumeric(3))

WebUI.click(findTestObject('Object Repository/Export/Page_EDT/input_WIN-KSK1BDG0TB3_ctl00ctl'))

