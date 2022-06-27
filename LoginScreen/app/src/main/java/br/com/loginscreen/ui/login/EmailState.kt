package br.com.loginscreen.ui.login

import java.util.regex.Pattern

private const val EMAIL_VALIDATOR_REGEX = "^(.+)@(.+)\$"

class EmailState : TextFieldState(
    validateTo = ::isEmailValid, errorFor = ::emailValidationError
)

private fun isEmailValid(email: String) = Pattern.matches(EMAIL_VALIDATOR_REGEX, email)

//para indicar que nao estamos usando o parametro e nao da erro.
@Suppress("UNUSED_PARAMETER")
private fun emailValidationError(email: String) = "Email invalido"