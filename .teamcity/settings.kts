import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.azureDevopsConnection
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.githubConnection
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.slackConnection

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2021.1"

project {

    features {
        githubConnection {
            id = "PROJECT_EXT_48"
            displayName = "GitHub.com"
            clientId = "a"
            clientSecret = "credentialsJSON:9bc387b7-9a3d-4de2-8ec8-6c65bf98cd0d"
        }
        azureDevopsConnection {
            id = "PROJECT_EXT_49"
            displayName = "Azure DevOps PAT"
            serverUrl = "https://dev.azure.com//chubatova"
            accessToken = "credentialsJSON:b60bf9c1-ae2d-4b28-b2e9-f703be16fec2"
        }
        slackConnection {
            id = "PROJECT_EXT_50"
            displayName = "Slack"
            botToken = "credentialsJSON:78e9cbf3-6abc-4875-8e38-42cdb63aa616"
            clientId = "sdf"
            clientSecret = "credentialsJSON:78e9cbf3-6abc-4875-8e38-42cdb63aa616"
        }
    }
}
