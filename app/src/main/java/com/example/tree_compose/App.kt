package com.example.tree_compose

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.web.webide.files.FileTree
import java.io.File

@Composable
fun App(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val onFileClick: (File) -> Unit = { file ->
        Toast.makeText(context, "点击: ${file.name}", Toast.LENGTH_SHORT).show()
    }

    Column(modifier = modifier.fillMaxSize()) {
        Text(
            text = "文件树",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(16.dp)
        )
        FileTree(
            rootPath = "/storage/emulated/0/",
            modifier = Modifier.fillMaxSize(),
            onFileClick = onFileClick
        )
    }
}





