package open_close_principle.good

class OTPEmailValidator : OTPValidator {
    override fun isValidOTP(otp: String): Boolean {
       return otp.length == 6 && otp.all { it.isDigit() }
    }
}