import { Component, OnInit } from '@angular/core';
import { SpringbootserviceService } from './springbootservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Employee Details';
  employee_data:any;
  constructor(private springservice:SpringbootserviceService){}
  ngOnInit()
  {
    this.springservice.getEmployees().subscribe(response=>{this.employee_data=response;});
  }
  
}
