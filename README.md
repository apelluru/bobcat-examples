# bobcat-examples
Learning bobcat framework

# How to create initial template:
1. clone https://github.com/wttech/bobcat-gradle-template
2. change gradle version from 4.7 to 4.9 in https://github.com/wttech/bobcat-gradle-template/blob/master/gradle/wrapper/gradle-wrapper.properties

`distributionUrl=https\://services.gradle.org/distributions/gradle-4.9-all.zip`

Optional:
`brew upgrade gradle`
3. execute below command to generate the project

`./gradlew generate -i -Ptarget=<directory_for_project> -Ptemplate=bobcat-junit5`



# How setup chromedriver in MacBook:

1. Download    https://sites.google.com/a/chromium.org/chromedriver/downloads
2. Move the driver to the /usr/local/bin folder using `mv chromedriver /usr/local/bin`

