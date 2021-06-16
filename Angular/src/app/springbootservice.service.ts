import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SpringbootserviceService {

  constructor(private http:HttpClient){}
  getEmployees()
  {
    return this.http.get('http://localhost:8080/emp');
  }
}
