package single_responsiblity.bad

// A class should have only one reason to change. Class should have only one job or task to perform.

fun main() {

    val otpSender = OTPSender()
    otpSender.send("112233","email")
}

class OTPSender() {
    fun send(otp: String, strategy: String) {
        if(isValidOTP(otp,strategy)) {
            println("SENDING OTP --> $otp")
        }
    }

    private fun isValidOTP(otp: String, validationType: String): Boolean {
        return when(validationType) {
            "email" -> otp.length == 6 && otp.all { it.isDigit() }
            "phone" -> otp.length == 8 && otp.all { it.isDigit() } && otp.startsWith("123")
            "bank" -> otp.length == 6 && otp.all { it.isDigit() } && otp.startsWith("989")
            else -> false
        }
    }
}