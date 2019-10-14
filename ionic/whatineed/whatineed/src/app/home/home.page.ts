import { Component } from '@angular/core';
import { Router } from '@angular/router';
import {data, ApiService } from '../services/api.service';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  stuffs: Array<data> = [];

  constructor(private route: Router, private api: ApiService) {

    setTimeout(() => {
      this.route.navigate(['/main']);
    }, 3000);
    
  }

}
