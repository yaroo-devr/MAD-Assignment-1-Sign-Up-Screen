package com.example.signupassignment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email // It's good practice to import them individually
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
// Or you can use the wildcard import if you have many icons:
// import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme { SignUpScreen() }
}

@Composable
fun SignUpScreen() {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var rePassword by remember { mutableStateOf("") }

    Box(
            modifier =
                    Modifier.fillMaxSize()
                        .background(color = Color(0xFF7E57C2))
    ) {
        Column(
                modifier = Modifier.fillMaxSize().padding(horizontal = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
        ) {
            // Title
            Text(
                    text = "Sign Up",
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 48.dp)
            )

            // Username Field
            OutlinedTextField(
                    value = username,
                    onValueChange = { username = it },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                    placeholder = { Text("User Name", color = Color.White.copy(alpha = 0.7f)) },
                    leadingIcon = {
                        Icon(
                                Icons.Default.Person,
                                contentDescription = "Username",
                                tint = Color.White
                        )
                    },
                    colors =
                            OutlinedTextFieldDefaults.colors(
                                    focusedTextColor = Color.White,
                                    unfocusedTextColor = Color.White,
                                    focusedBorderColor = Color.White,
                                    unfocusedBorderColor = Color.White.copy(alpha = 0.5f),
                                    cursorColor = Color.White
                            ),
                    shape = RoundedCornerShape(12.dp),
                    singleLine = true
            )

            // Email Field
            OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                    placeholder = { Text("Email", color = Color.White.copy(alpha = 0.7f)) },
                    leadingIcon = {
                        Icon(Icons.Default.Email, contentDescription = "Email", tint = Color.White)
                    },
                    colors =
                            OutlinedTextFieldDefaults.colors(
                                    focusedTextColor = Color.White,
                                    unfocusedTextColor = Color.White,
                                    focusedBorderColor = Color.White,
                                    unfocusedBorderColor = Color.White.copy(alpha = 0.5f),
                                    cursorColor = Color.White
                            ),
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    singleLine = true
            )

            // Password Field
            OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                    placeholder = { Text("Password", color = Color.White.copy(alpha = 0.7f)) },
                    leadingIcon = {
                        Icon(
                                Icons.Default.Lock,
                                contentDescription = "Password",
                                tint = Color.White
                        )
                    },
                    visualTransformation = PasswordVisualTransformation(),
                    colors =
                            OutlinedTextFieldDefaults.colors(
                                    focusedTextColor = Color.White,
                                    unfocusedTextColor = Color.White,
                                    focusedBorderColor = Color.White,
                                    unfocusedBorderColor = Color.White.copy(alpha = 0.5f),
                                    cursorColor = Color.White
                            ),
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    singleLine = true
            )

            // Re-Password Field
            OutlinedTextField(
                    value = rePassword,
                    onValueChange = { rePassword = it },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 32.dp),
                    placeholder = { Text("Re-Password", color = Color.White.copy(alpha = 0.7f)) },
                    leadingIcon = {
                        Icon(
                                Icons.Default.Lock,
                                contentDescription = "Re-Password",
                                tint = Color.White
                        )
                    },
                    visualTransformation = PasswordVisualTransformation(),
                    colors =
                            OutlinedTextFieldDefaults.colors(
                                    focusedTextColor = Color.White,
                                    unfocusedTextColor = Color.White,
                                    focusedBorderColor = Color.White,
                                    unfocusedBorderColor = Color.White.copy(alpha = 0.5f),
                                    cursorColor = Color.White
                            ),
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    singleLine = true
            )

            // Register Button
            Button(
                    onClick = { /* Handle registration */},
                    modifier = Modifier.fillMaxWidth().height(56.dp),
                    colors =
                            ButtonDefaults.buttonColors(
                                    containerColor = Color.White,
                                    contentColor = Color(0xFF7E57C2)
                            ),
                    shape = RoundedCornerShape(28.dp)
            ) { Text(text = "REGISTER", fontSize = 18.sp, fontWeight = FontWeight.Bold) }

            // Or Sign-up with text
            Text(
                    text = "Or Sign-up with",
                    color = Color.White,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 32.dp, bottom = 16.dp)
            )

            // Social Media Icons Row
            Row(
                    horizontalArrangement = Arrangement.spacedBy(24.dp),
                    modifier = Modifier.padding(bottom = 16.dp)
            ) {
                // Google Icon
                Box(
                        modifier = Modifier.size(56.dp).clip(CircleShape).background(Color.White),
                        contentAlignment = Alignment.Center
                ) {
                    Text(
                            text = "G",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFDB4437)
                    )
                }

                // Facebook Icon
                Box(
                        modifier = Modifier.size(56.dp).clip(CircleShape).background(Color.White),
                        contentAlignment = Alignment.Center
                ) {
                    Text(
                            text = "f",
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1877F2)
                    )
                }

                // Twitter Icon
                Box(
                        modifier = Modifier.size(56.dp).clip(CircleShape).background(Color.White),
                        contentAlignment = Alignment.Center
                ) {
                    Text(
                            text = "𝕏",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1DA1F2)
                    )
                }
            }
        }
    }
}
