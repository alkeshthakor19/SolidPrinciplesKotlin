package single_responsiblity.good

class OTPValidator {
    fun isValidOTP(otp: String, validationType: String): Boolean {
        return when(validationType) {
            "email" -> otp.length == 6 && otp.all { it.isDigit() }
            "phone" -> otp.length == 8 && otp.all { it.isDigit() } && otp.startsWith("123")
            "bank" -> otp.length == 6 && otp.all { it.isDigit() } && otp.startsWith("989")
            else -> false
        }
    }
}