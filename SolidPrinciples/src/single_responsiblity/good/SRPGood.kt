package single_responsiblity.good

// A class should have only one reason to change. Class should have only one job or task to perform.

fun main() {
    val otpSender = OTPSender(OTPValidator())
    otpSender.send("112233","email")
}

class OTPSender(private val otpValidator: OTPValidator) {
    fun send(otp: String, strategy: String) {
        if(otpValidator.isValidOTP(otp,strategy)) {
            println("SENDING OTP --> $otp")
        }
    }

}