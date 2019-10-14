import { Component, OnInit } from '@angular/core';
import { ApiService, data } from '../services/api.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-alter-details',
  templateUrl: './alter-details.page.html',
  styleUrls: ['./alter-details.page.scss'],
})
export class AlterDetailsPage implements OnInit {

  infoData: data = {

    id:0,
    name:'',
    color:'',
    price:'',
    quantity:0

  };
  stuffs: Array<data> = [];

  constructor(private api: ApiService, private router: Router, private route: ActivatedRoute) {

    // this.api.getSingleData(id).subscribe((res: Array<data>) => {
    // })
    let id = this.route.snapshot.paramMap.get('id');
    this.api.getSingleData(id).subscribe((res: data) => {

      this.infoData=res;

    });


  }

  ngOnInit() {
  }

  goToMain(){

    this.router.navigate(['/main']);

  }

  delete(){

    this.api.deleteData(this.infoData.id).subscribe((res) => {

      

    })

  }

}
