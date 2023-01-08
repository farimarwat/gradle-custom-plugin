package pk.farimarwat.anrspyplugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class AnrSpyTask:DefaultTask() {

    @TaskAction
    fun mytask(){
        println("Hello I am working")
    }
}