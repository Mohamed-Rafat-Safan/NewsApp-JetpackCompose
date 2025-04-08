# NewsApp-JetpackCompose

- This application uses Jetpack Compose and displays news from the Api by Retrofit2 and stores this news in RoomDb.
- The app supports light mode and dark mode.


## Features:
  - Splash Screen
  - Stepper Screen
  - Home Screen to display News
  - Details Screen to display new details
  - Search Screen to search news
  - Bookmark Screen to display all news that is saved in RoomDb
  - light mode and dark mode
 
## The skills are used in this application:
- language: Kotlin </br>
- UI layouts using Jetpack Compose </br>
- Multi-screen navigation with Jetpack Compose Navigation. </br>
- SavedStateHandle  </br>
- Coil Compose  </br>
- Lottie animation with Compose  </br>
- UI state efficiently using State, ViewModel </br>
- Splash Screen with Compose </br>
- Stepper Screen  </br>
- Clean Architecture {presentation - domain - data} </br>
- presentation pattern by [ MVVM & MVI ] </br>
- Pagination by Paging3  </br>
- Retrofit2 & Gson - construct the REST APIs. </br>
- Flow </br>
- Caching news by Room Database 
- DataStore Preferences 
- Dependency injection by (Dagger Hilt) </br>
- Coroutines for asynchronous </br> </br>

## Architecture
The following diagram shows all the modules and how each module interact with one another after. This architecture using a layered software architecture.  <br>
<p align="center">
<img src="https://user-images.githubusercontent.com/72816466/202196876-39bb8b5d-aa81-4693-8a5e-b1b588133975.jpeg"/>
</p>  <br> 








































this application using the API from : https://newsapi.org/v2/everything?q=bitcoin&apiKey=02c85722cbaf44b9a9369168c3ff2951

