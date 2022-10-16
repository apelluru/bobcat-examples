# bobcat-examples
Learning bobcat framework


clone https://github.com/wttech/bobcat-gradle-template

change gradle version from 4.7 to 4.9 in https://github.com/wttech/bobcat-gradle-template/blob/master/gradle/wrapper/gradle-wrapper.properties

`distributionUrl=https\://services.gradle.org/distributions/gradle-4.9-all.zip`

Optional:
`brew upgrade gradle`


`./gradlew generate -i -Ptarget=<directory_for_project> -Ptemplate=bobcat-junit5`
