# gradle-demo
Learn Gradle and to understand difference between Maven and Gradle

### Manual Commands:
1. To compile all java files: javac src/main/java/com/sahil/*.java -d out
2. To generate jar: jar cfv calculator.jar -C out .
3. To run: java -cp calculator.jar src.main.java.com.sahil.Main add 2 3
4. To run executable jar use after adding in manifest file: java -jar build/libs/app.jar

## Gradle Commands in terminal E:\java_projects\gradle-demo>
1. gradle wrapper  -> to generate gradle folder, gradlew gradlew.bat
2. "./gradlew run" or "gradlew run" in windows - if we share project to another & don't have gradle installed. to build use "./gradlew build"
3. gradle task --all -> show all tasks
4. gradle taskName -> to run task
5. apply plugin:'java' -> to add java plugin
6. gradle build -> build folder & builds project
7. gradle run --args="add 4 6" or ./gradlew :cmd-line-args:run --args="add 5 7"

All gradle files will be there in users>.gradle>

### If IntelliJ not able to do code completion, or after you create a empty repo do 1st step
1. For me it was because I did not have a folder marked as Source Root (it appears in blue). To fix, right click your root source directory -> Mark As -> Source Root.
2. File/Power Save Mode does turn it off.
3. Go to File->Invalidate Caches and restart. - done and no change

