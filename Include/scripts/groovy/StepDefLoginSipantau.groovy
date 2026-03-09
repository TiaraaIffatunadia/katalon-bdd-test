import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class LoginSipantau {
@Given("user membuka halaman sipantau")
def navigateToLoginPage() {
	WebUI.openBrowser('https://disdik.jabarprov.go.id/app/sipantau')
}

@When("user memasukkan username {string} dan password {string}")
def user_memasukkan_username_dan_password(String username, String password) {
	WebUI.setText(findTestObject('Object Repository/Login/Page_SIPANTAU  Sistem Informasi Pelaporan P_770724/input_Username_username'),
		'00000000')

	WebUI.setText(findTestObject('Object Repository/Login/Page_SIPANTAU  Sistem Informasi Pelaporan P_770724/input_Password_password'),
		'jGTq+1D2TFwRGPY8Cg2F5g==')
}

@And("user menekan tombol login")
def user_menekan_tombol_login() {
	WebUI.click(findTestObject('Object Repository/Login/Page_SIPANTAU  Sistem Informasi Pelaporan P_770724/button_LOGIN'))
}

@Then("user berhasil masuk dashboard")
def user_berhasil_masuk_dashboard(String status) {
	WebUI.check(findTestObject('Object Repository/Login/Page_SIPANTAU  Sistem Informasi Pelaporan P_770724/a_Dashboard'), 5)
	WebUI.closeBrowser()
	println status
}

}