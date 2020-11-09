import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ProfileComponent } from './componats/profile/profile.component';
import { CoursesComponent } from './componats/courses/courses.component';
import { MyCoursesComponent } from './componats/my-courses/my-courses.component';
import { ExamComponent } from './componats/exam/exam.component';
import { HeaderComponent } from './componats/header/header.component';
import { FooterComponent } from './componats/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    ProfileComponent,
    CoursesComponent,
    MyCoursesComponent,
    ExamComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
