import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

// Ini akan menjalankan semua feature file di folder tersebut
CucumberKW.runFeatureFile('Include/features/LoginSipantau.feature')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://disdik.jabarprov.go.id/app/sipantau')

WebUI.setText(findTestObject('Object Repository/Login/Page_SIPANTAU  Sistem Informasi Pelaporan P_770724/input_Username_username'), 
    '00000000')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_SIPANTAU  Sistem Informasi Pelaporan P_770724/input_Password_password'), 
    'jGTq+1D2TFwRGPY8Cg2F5g==')

WebUI.click(findTestObject('Object Repository/Login/Page_SIPANTAU  Sistem Informasi Pelaporan P_770724/button_LOGIN'))

WebUI.check(findTestObject('Object Repository/Login/Page_SIPANTAU  Sistem Informasi Pelaporan P_770724/a_Dashboard'))

WebUI.closeBrowser()

