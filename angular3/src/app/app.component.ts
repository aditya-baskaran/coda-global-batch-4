import { Component } from '@angular/core';
import { FormBuilder, FormControl, Validators, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular3';
  contactBookForm:any;
  contactBook:any=[];
  constructor(private fb:FormBuilder){
    this.contactBookForm=this.fb.array([this.fb.group({
      name:new FormControl("",Validators.required),
      number:new FormControl("",Validators.required)
    })])
  }

  addMore(){
    this.contactBookForm.push(this.fb.group({
      name:new FormControl("",Validators.required),
      number:new FormControl("",Validators.required)
    }));
  }

  save(){
    console.log(this.contactBookForm.value);
    this.contactBook=[...this.contactBook,...this.contactBookForm.value];
    this.contactBookForm=this.fb.array([this.fb.group({
      name:new FormControl("",Validators.required),
      number:new FormControl("",Validators.required)
    })])
  }

  remove(contact:any){
    this.contactBook.splice(this.contactBook.indexOf(contact),1)
  }
}
