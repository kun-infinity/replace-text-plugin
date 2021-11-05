package com.github.kuninfinity.replacetextplugin.services

import com.intellij.openapi.project.Project
import com.github.kuninfinity.replacetextplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
