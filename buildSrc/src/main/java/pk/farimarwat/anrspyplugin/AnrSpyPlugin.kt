package pk.farimarwat.anrspyplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class AnrSpyPlugin:Plugin<Project> {
    override fun apply(project: Project) {
        var mytask = project.tasks.register("mytask",AnrSpyTask::class.java)
    }
}