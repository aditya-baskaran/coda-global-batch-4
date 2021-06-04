import { Component, OnInit } from '@angular/core';
import { BasketserviceService } from 'src/app/basketservice.service';

@Component({
  selector: 'app-basket',
  templateUrl: './basket.component.html',
  styleUrls: ['./basket.component.css']
})
export class BasketComponent implements OnInit {

  title = 'angular2';
  itemName = " "
  items:any = []

  veg = ["potato", "tomato", "lettuce"]
  fru = ["banana",  "apple", "mango"]

  constructor(private service:BasketserviceService) { }

  PutBucket(){
    if(this.itemName.length != 0)
    {
    if(this.veg.indexOf(this.itemName.trim()) > -1)
    {
      this.items.push([this.itemName,"Vegetable"]);
      this.service.changeTotal(this.items.length)
    }
    else if(this.fru.indexOf(this.itemName.trim()) > -1)
    {
      this.items.push([this.itemName,"Fruit"]);
      this.service.changeTotal(this.items.length)
    }
    else
    {
      alert("Invalid Entry!")
    }
    this.itemName = ""
    //console.log(this.items)
  }
}

KillBucket(index:number){
this.items.splice(index,1);
this.service.changeTotal(this.items.length)
}
  ngOnInit(): void {
  }

}
