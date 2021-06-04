import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BasketserviceService {

  private sub = new Subject<number>()
  subjectMessage = this.sub.asObservable()

  changeTotal (total:number) {
    this.sub.next(total)
  }
  constructor() { }
}
