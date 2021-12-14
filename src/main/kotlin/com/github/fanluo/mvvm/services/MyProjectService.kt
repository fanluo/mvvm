package com.github.fanluo.mvvm.services

import com.intellij.openapi.project.Project
import com.github.fanluo.mvvm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
