# tree_compose

![Version](https://img.shields.io/badge/version-1.0.0-blue?style=flat-square)
[![Language](https://img.shields.io/badge/Language-Kotlin-blue?style=flat-square)](https://kotlinlang.org/)
[![UI](https://img.shields.io/badge/UI-Jetpack_Compose-green?style=flat-square)](https://developer.android.com/jetpack/compose)
[![License](https://img.shields.io/badge/License-GPLv3-orange?style=flat-square)](LICENSE)

`tree_compose` 是一个高性能、现代化的 Android 文件树浏览组件，完全基于 **Jetpack Compose** 构建。

该组件专为需要展示复杂文件层级的应用（如 IDE、文件管理器）设计，实现了异步加载防止 UI 卡顿、智能展开逻辑以及完整的文件操作交互。

## 截图 Screenshots

<div align="center">
  <!-- 您可以在这里上传截图后替换链接 -->
  <img src="https://via.placeholder.com/350x600?text=File+Tree+Demo" width="32%" />
  <img src="https://via.placeholder.com/350x600?text=Action+Menu" width="32%" />
  <img src="https://via.placeholder.com/350x600?text=Loading+State" width="32%" />
</div>

## 项目结构 Project Structure

主要逻辑位于 `app/src/main/java/com/example/tree_compose/`。核心模块结构如下：

```text
com.example.tree_compose
├── FileTree.kt         # [核心] 文件树组件
│                       # 包含递归渲染、异步加载逻辑(IO Dispatcher)、
│                       # 智能展开算法以及 BottomSheet 操作菜单
├── App.kt              # 演示页面 UI，展示如何集成 FileTree
├── MainActivity.kt     # Android 程序入口点
└── ui/
    └── theme/          # Material3 主题定义 (Color, Type, Theme)
```

## 功能特性 Features

*   **异步加载 (Asynchronous Loading)**: 文件夹展开时使用 `Dispatchers.IO` 读取文件，并显示精致的圆形加载动画，彻底杜绝主线程卡顿。
*   **智能展开 (Smart Expand)**: 点击文件夹时，如果该文件夹下只有一个子文件夹，会自动递归展开，直到遇到包含多个文件的层级（类似 GitHub/IDE 的逻辑）。
*   **高性能渲染**: 利用 Compose 的 `LazyColumn` 和递归组件优化长列表性能。
*   **完整文件操作**: 长按节点呼出底部菜单，支持：
    *   📄 新建文件 / 📁 新建文件夹
    *   ✏️ 重命名
    *   🗑️ 删除 (带确认弹窗)
    *   📋 复制绝对路径
*   **动画交互**: 平滑的展开/收起动画，以及箭头旋转动画。
*   **Material Design 3**: 完全遵循 MD3 设计规范，支持动态主题。

## 集成方式 Usage

在您的 Compose UI 中直接调用 `FileTree` 组件：

```kotlin
FileTree(
    rootPath = "/storage/emulated/0/", // 指定根目录
    modifier = Modifier.fillMaxSize(),
    onFileClick = { file ->
        // 处理文件点击事件
        println("Clicked: ${file.name}")
    }
)
```

## 贡献 Contributors

<a href="https://github.com/h465855hgg/tree_compose/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=h465855hgg/tree_compose" />
</a>

## 许可证 License

```
TreeCompose - A tree-structured file viewer built with Jetpack Compose
Copyright (C) 2025  如日中天  <3382198490@qq.com>

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
```

[![Star History Chart](https://api.star-history.com/svg?repos=h465855hgg/tree_compose&type=Date)](https://star-history.com/#h465855hgg/tree_compose&Date)