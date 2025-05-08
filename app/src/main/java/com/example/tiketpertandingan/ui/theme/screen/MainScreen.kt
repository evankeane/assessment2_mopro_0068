package com.example.tiketpertandingan.ui.theme.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tiketpertandingan.R
import androidx.compose.ui.tooling.preview.Preview
import com.example.tiketpertandingan.ui.theme.theme.TiketPertandinganTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(onMenuClick: (String) -> Unit) {
    var expanded by remember { mutableStateOf(false) }

    val namaAplikasi = stringResource(id = R.string.app_name)
    val tambahTiket = stringResource(id = R.string.tambah_tiket)
    val tambahPertandingan = stringResource(id = R.string.tambah_pertandingan)
    val pengaturan = stringResource(id = R.string.pengaturan)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(namaAplikasi) },
                actions = {
                    IconButton(onClick = { expanded = true }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = pengaturan,
                            tint = Color.White
                        )
                    }
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text(pengaturan) },
                            onClick = {
                                expanded = false
                                onMenuClick("pengaturan")
                            }
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF388E3C),
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Selamat datang di Tiket Bola!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1B5E20)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Pesan tiket pertandingan favoritmu\natau tambahkan laga terbaru sekarang juga!",
                fontSize = 16.sp,
                color = Color.Gray,
                lineHeight = 20.sp,
                modifier = Modifier.padding(horizontal = 16.dp),
            )
            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = { onMenuClick("tambah_tiket") },
                modifier = Modifier
                    .fillMaxWidth(0.9f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF388E3C)
                )
            ) {
                Text(tambahTiket, color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { onMenuClick("tambah_pertandingan") },
                modifier = Modifier
                    .fillMaxWidth(0.9f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2E7D32)
                )
            ) {
                Text(tambahPertandingan, color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    TiketPertandinganTheme {
        MainScreen(onMenuClick = {})
    }
}

