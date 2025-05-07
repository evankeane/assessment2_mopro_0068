package com.example.tiketpertandingan.ui.theme.screen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.tiketpertandingan.R
import androidx.compose.foundation.layout.padding
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
                        Icon(Icons.Default.MoreVert, contentDescription = pengaturan)
                    }
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text(pengaturan) },
                            onClick = {
                                expanded = false
                                onMenuClick("settings")
                            }
                        )
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = { onMenuClick("tambah_tiket") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(tambahTiket)
            }

            Button(
                onClick = { onMenuClick("tambah_pertandingan") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(tambahPertandingan)
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




