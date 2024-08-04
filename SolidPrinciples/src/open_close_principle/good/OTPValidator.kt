package open_close_principle.good

interface OTPValidator {
    fun isValidOTP(otp: String): Boolean
}