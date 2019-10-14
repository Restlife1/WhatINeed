import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class data{

  id: number;
  name: String;
  color: String;
  price: String;
  quantity: number;

}

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { 


  }

  getAllData(){

    return this.http.get("http://localhost:8080/api/whatineed");

  }

  getSingleData(id){

    return this.http.get("http://localhost:8080/api/whatineed/" + id);

  }

  addData(stuff){

    return this.http.post("http://localhost:8080/api/whatineed/", null, {params: stuff});

  }

  deleteData(id){

    return this.http.delete("http://localhost:8080/api/whatineed/" + id);

  }

  updateData(updateStuff){

    return this.http.put("http://localhost:8080/api/whatineed/" + updateStuff.id, null, {params: updateStuff});

  }

}