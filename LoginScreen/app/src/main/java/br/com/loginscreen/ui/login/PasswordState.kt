package br.com.loginscreen.ui.login

class PasswordState : TextFieldState(
    validateTo = ::isPasswordValid, errorFor = ::passwordValidationError
) {
}

private fun isPasswordValid(password: String) = password.length > 4

//para indicar que nao estamos usando o parametro e nao da erro.
@Suppress("UNUSED_PARAMETER")
private fun passwordValidationError(password: String) = "Senha invalida."