package open_close_principle.good

fun main() {
    val otpSender = OTPSender()
    otpSender.send("112233", OTPEmailValidator())
}

class OTPSender() {
    fun send(otp: String, otpValidator: OTPValidator) {
        if(otpValidator.isValidOTP(otp)) {
            println("SENDING OTP --> $otp")
        }
    }

}

// Easy to visualize

/*interface OTPValidator {
    fun isValid(otp: String): Boolean
}

class OTPEmailValidator : open_close_principle.good.OTPValidator {
    override fun isValid(otp: String): Boolean {
        return otp.length == 6 && otp.all { it.isDigit() }
    }
}

class OTPPhoneValidator : open_close_principle.good.OTPValidator {
    override fun isValid(otp: String): Boolean {
        return otp.length == 8 && otp.all { it.isDigit() } && otp.startsWith("123")
    }
}

class OTPBankValidator : open_close_principle.good.OTPValidator {
    override fun isValid(otp: String): Boolean {
        return otp.length == 6 && otp.all { it.isDigit() } && otp.startsWith("989")
    }
}*/
