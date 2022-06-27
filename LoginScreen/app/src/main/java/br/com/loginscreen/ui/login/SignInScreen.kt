package br.com.loginscreen.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.loginscreen.R
import br.com.loginscreen.ui.login.components.Email
import br.com.loginscreen.ui.login.components.Password
import br.com.loginscreen.ui.login.components.SignInScreen

@Composable
fun SignIn() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = stringResource(id = R.string.sign_in),
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.Bold
        )
        SignInScreen(modifier = Modifier.fillMaxWidth()) {
            SignInContent()
        }
    }
}

@Composable
fun SignInContent() {
    Column(modifier = Modifier.fillMaxWidth()) {
        val focusRequest = remember { FocusRequester() }
        val emailState = remember { EmailState() }
        Email(
            emailState = emailState,
            onImeAction = { focusRequest.requestFocus() }
        )
        Spacer(modifier = Modifier.height(16.dp))

        val passwordState = remember {
            PasswordState()
        }
        Password(
            label = stringResource(id = R.string.password),
            passwordState = passwordState,
            modifier = Modifier.focusRequester(focusRequest),
            onImeAction = {}
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            shape = MaterialTheme.shapes.small,
            enabled = emailState.isValid && passwordState.isValid
        ) {
            Text(text = stringResource(id = R.string.sign_in))
        }
    }
}

@Composable
@Preview()
fun SignInPreview() {
    SignIn()
}