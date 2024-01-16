import {Component, OnInit} from '@angular/core';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {CommonModule} from "@angular/common";

@Component({
  selector: 'app-assosiation',
  standalone: true,
  imports: [HttpClientModule,CommonModule],
  templateUrl: './assosiation.component.html',
  styleUrl: './assosiation.component.css'
})
export class AssosiationComponent implements  OnInit{
  assosiation : any ;
  constructor(private http:HttpClient) {
  }
  ngOnInit() {
    this.http.get("http://localhost:8888/ASSOSIATION-SERVICE/asso")
      .subscribe({
        next : data => {
          this.assosiation = data ;
        },
        error : err => {
          console.log(err);
        }
      })
  }

}
