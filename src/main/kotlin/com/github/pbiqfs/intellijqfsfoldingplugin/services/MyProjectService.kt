package com.github.pbiqfs.intellijqfsfoldingplugin.services

import com.intellij.openapi.project.Project
import com.github.pbiqfs.intellijqfsfoldingplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
