package open_close_principle.good

class OTPBankValidator : OTPValidator {
    override fun isValidOTP(otp: String): Boolean {
        return otp.length == 6 && otp.all { it.isDigit() } && otp.startsWith("989")
    }
}