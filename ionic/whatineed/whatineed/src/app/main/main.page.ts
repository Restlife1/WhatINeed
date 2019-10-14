import { Component, OnInit } from '@angular/core';
import {data, ApiService} from "src/app/services/api.service";
import { Router } from '@angular/router';

@Component({
  selector: 'app-main',
  templateUrl: './main.page.html',
  styleUrls: ['./main.page.scss'],
})
export class MainPage implements OnInit {

  
  stuffs: Array<data> = [];

  constructor(private route: Router, private api: ApiService) { 
    this.api.getAllData().subscribe((res: Array<data>) => {

      this.stuffs = res;
      console.log(res);

    })

  }

  ngOnInit() {

    

  }

  llamada(){

    this.api.getAllData().subscribe((res: Array<data>) => {

      this.stuffs = res;
      console.log(res);

    })

  }

  goToAlterDetails(id){

    // var stuff = (document.getElementById("id") as HTMLButtonElement).value;
    console.log(id);

    this.route.navigate(['/alter-details', id]);

  }

  showSingleData(){

    this.api.getSingleData(this.stuffs).subscribe((res: Array<data>) => {

      this.stuffs = res;

    })

  }

  addStuff(){

    this.route.navigate(['/form']);

  }

}
