import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private apiUrl:string;
  constructor(private http:HttpClient) {

    this.apiUrl='http://localhost:8080/employee';
    
   }

   public getEmployees():Observable<Employee[]>{

     return this.http.get<Employee[]>(this.apiUrl);

   }
}
