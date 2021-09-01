import jetbrains.buildServer.configs.kotlin.v2019_2.*

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
        feature {
            id = "PROJECT_EXT_45"
            type = "OAuthProvider"
            param("secure:clientSecret", "credentialsJSON:48892994-dd28-4b88-b905-3d2e3779a090")
            param("displayName", "Azure DevOps OAuth 2.0")
            param("applicationId", "79FC526A-931E-4896-806A-892F798047F8")
            param("azureDevOpsUrl", "https://app.vssps.visualstudio.com")
            param("providerType", "AzureDevOps")
        }
    }
}
