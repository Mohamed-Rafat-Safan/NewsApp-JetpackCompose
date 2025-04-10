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
- Clean Architecture {presentation - domain - data} </br>
- MVVM & MVI architecture </br>
- Pagination by Paging3  </br>
- Retrofit2 & Gson - construct the REST APIs. </br>
- Flow </br>
- Room Database 
- DataStore Preferences 
- Dependency injection by (Dagger Hilt) </br>
- Coroutines for asynchronous </br> </br>

## Architecture
The following diagram shows all the modules and how each module interact with one another after. This architecture using a layered software architecture.  <br>
<p align="center">
<img src="https://user-images.githubusercontent.com/72816466/202196876-39bb8b5d-aa81-4693-8a5e-b1b588133975.jpeg"/>
</p>  <br> 


## Images this application (light mode): <br>

### Splash Screen & Stepper Screen: <br>

<p align="left">
<img src="https://github.com/user-attachments/assets/0b51d5fc-5a4e-43c8-9d78-0584fdf1606d" width="185" height="400" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/14c96d8a-d16e-419b-990b-e2a9f1fdfe6f" width="185" height="400" />
 <span> &nbsp;  &nbsp;  </span>
<img src="https://github.com/user-attachments/assets/b419daa7-9396-40d7-be39-4f1c9890989f" width="185" height="400" />
 <span> &nbsp;  &nbsp;  </span>
<img src="https://github.com/user-attachments/assets/2ef55749-1c25-4bb8-a1f3-d93b86fab4c4" width="185" height="400" />
</p>


### Home Screen: <br>

<p align="center">
<img src="https://github.com/user-attachments/assets/96173dd6-bdf0-42a1-938c-b039434b0a19" width="230" height="500" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/7c312436-67ea-4b18-8622-38c9d5262030" width="230" height="500" />
</p>  <br>

### News Details Screen: <br>

<p align="center">
<img src="https://github.com/user-attachments/assets/2026aa74-bf0b-4fbd-aab2-02735b6066d5" width="230" height="500" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/e1485d9a-156d-4294-b739-91fa03e650a2" width="230" height="500" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/546a7d02-02b1-4b8b-9387-79f779e89881" width="230" height="500" />
</p>  <br>

### News Search Screen: <br>

<p align="center">
<img src="https://github.com/user-attachments/assets/3d303fd9-7d3a-48e4-887e-90b19a083313" width="230" height="500" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/bf2a82fa-83d0-4c3d-834b-f2e7098d5334" width="230" height="500" />
</p>  <br>


### Bookmark Screen: <br>

<p align="center">
<img src="https://github.com/user-attachments/assets/df2ce773-e431-4efc-86da-ed9941056252" width="230" height="500" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/d9a5a55c-eb1e-46c4-a9c0-fd0853798036" width="230" height="500" />
</p>  <br>


## Images this application (Dark mode): <br>

### Splash Screen & Stepper Screen: <br>

<p align="left">
<img src="https://github.com/user-attachments/assets/1151289c-e5e5-456e-ac2e-5b151c4b873d" width="185" height="400" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/8eb80af0-12d4-4200-b08d-9f49b255bd9b" width="185" height="400" />
 <span> &nbsp;  &nbsp;  </span>
<img src="https://github.com/user-attachments/assets/ab8971bf-697d-4753-b9ac-8d675d2c5ed7" width="185" height="400" />
 <span> &nbsp;  &nbsp;  </span>
<img src="https://github.com/user-attachments/assets/83bee33d-c27b-4d1f-ac77-b821069794de" width="185" height="400" />
</p>

### Home Screen: <br>

<p align="center">
<img src="https://github.com/user-attachments/assets/5b8aba0c-bef5-44fe-ab5c-6aa4bc2b1a2c" width="230" height="500" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/1057c1c1-e28d-4b7a-a075-bf3992fc6aa0" width="230" height="500" />
</p>  <br>


### News Details Screen: <br>

<p align="center">
<img src="https://github.com/user-attachments/assets/66d45c44-56f6-45bf-af5d-2c1b497d29dd" width="230" height="500" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/913aac9c-e01c-4009-937d-06d96abb04d9" width="230" height="500" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/70a15ce7-5c8e-4f53-8624-e7dd547410c6" width="230" height="500" />
</p>  <br>


### News Search Screen: <br>

<p align="center">
<img src="https://github.com/user-attachments/assets/d67de61d-984d-4070-b437-d001d38326a6" width="230" height="500" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/e2b1f70e-5919-44bf-a5cc-adbfe302e439" width="230" height="500" />
</p>  <br>


### Bookmark Screen: <br>

<p align="center">
<img src="https://github.com/user-attachments/assets/c2782e3a-feae-469f-97ce-defc98d5cd6f" width="230" height="500" />
 <span> &nbsp;  &nbsp; </span>
<img src="https://github.com/user-attachments/assets/bb2a70f4-7914-4caa-816c-d0f27c85cc57" width="230" height="500" />
</p>  <br>


### This application using the API from site: https://newsapi.org/docs/endpoints/everything

