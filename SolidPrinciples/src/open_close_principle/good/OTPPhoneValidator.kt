package open_close_principle.good

class OTPPhoneValidator : OTPValidator {
    override fun isValidOTP(otp: String): Boolean {
        return otp.length == 8 && otp.all { it.isDigit() } && otp.startsWith("123")
    }
}