package open_close_principle.bad


/* Open for extension but closed for Modification
   A class, function or module should be open for extension but close for modification.
   You shou be able to extend a class behaviour without modifying it.
 */

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
