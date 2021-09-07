import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.azureDevOpsOAuthConnection
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.azureDevopsConnection
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.githubConnection

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
        azureDevOpsOAuthConnection {
            id = "PROJECT_EXT_38"
            displayName = "Azure DevOps OAuth 2.0"
            azureDevOpsUrl = "s"
            applicationId = "s"
            clientSecret = "credentialsJSON:dc172f6d-0299-4461-bc7b-cc3b8fe65d91"
        }
        azureDevopsConnection {
            id = "PROJECT_EXT_40"
            displayName = "Azure DevOps PAT"
            serverUrl = "https://dev.azure.com/sdkslpat"
            accessToken = "credentialsJSON:f1a5fabf-15ae-42a3-914a-97a0d118c9a5"
        }
        githubConnection {
            id = "PROJECT_EXT_48"
            displayName = "GitHub.com"
            clientId = "a"
            clientSecret = "credentialsJSON:9bc387b7-9a3d-4de2-8ec8-6c65bf98cd0d"
        }
        azureDevOpsOAuthConnection {
            id = "PROJECT_EXT_52"
            displayName = "Azure DevOps OAuth 2.0"
            azureDevOpsUrl = "https://app.vssps.visualstudio.com"
            applicationId = "79FC526A-931E-4896-806A-892F798047F8"
            clientSecret = "credentialsJSON:48892994-dd28-4b88-b905-3d2e3779a090"
        }
    }
}
