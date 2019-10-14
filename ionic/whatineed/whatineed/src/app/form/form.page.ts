import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { data, ApiService } from '../services/api.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.page.html',
  styleUrls: ['./form.page.scss'],
})
export class FormPage implements OnInit {

  add: data;

  constructor(private router: Router, private api: ApiService) { }

  ngOnInit() {
  }

  confirm(){

    var name = (document.getElementById("name") as HTMLInputElement).value;
    var color = (document.getElementById("color") as HTMLInputElement).value;
    var price = (document.getElementById("price") as HTMLInputElement).value;
    var quantity = (document.getElementById("quantity") as HTMLInputElement).value;
    this.add = {

      id:0,
      name: name,
      color: color,
      price: price,
      quantity: parseInt(quantity)

    }
    console.log(this.add);
    this.api.addData(this.add).subscribe((res) => {

      

    })

  }

}
