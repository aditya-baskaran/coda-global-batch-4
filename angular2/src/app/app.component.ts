import { NgIf } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular2';
  itemName = " "
  items:any = []
  err=" "

  veg = ["potato", "tomato", "lettuce"]
  fru = ["banana",  "apple", "mango"]

  PutBucket(){
    if(this.itemName.length != 0)
    {
    if(this.veg.indexOf(this.itemName.trim()) > -1)
    {
      this.items.push([this.itemName,"Vegetable"]);
    }
    else
    {
      this.items.push([this.itemName,"Fruit"]);
    }
    this.itemName = ""
    //console.log(this.items)
  }
}

KillBucket(index:number){
this.items.splice(index,1);
}
}

