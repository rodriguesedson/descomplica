import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent {
  hero$: any;
  service: any;
  @Input()
  set id(heroId: string){
    this.hero$ = this.service.getHero(heroId);
  }
}
