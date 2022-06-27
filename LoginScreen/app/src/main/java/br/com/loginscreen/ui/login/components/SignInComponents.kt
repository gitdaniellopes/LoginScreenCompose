package br.com.loginscreen.ui.login.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SignInScreen(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        item {
            Spacer(modifier = Modifier.height(34.dp))
            Box(modifier = Modifier.fillMaxWidth()) {
                content()
            }
        }
    }
}

