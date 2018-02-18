//import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";
import "rxjs/add/operator/map";
import {Http} from "@angular/http";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import {Task} from "./task.model"; // deprecated todo
// import {Http} from "@angular/http";



@Injectable()
export class TaskService {
   //  constructor(private http: HttpClient) {
    constructor(private http: Http) { // deprecated

    }

    getTask() {
        // return this.http.get('/api/tasks').map(response => response.json());
        return this.http.get('/api/tasks').map(response =>response.json());
    }
}
