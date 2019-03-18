import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { MessageService } from './message.service';



@Injectable({
  providedIn: 'root'
})
export class LibraryService {

  private host = '/api/library';

  constructor(private http: HttpClient,
    private messageService: MessageService) {
  }

  getAll(): Observable<any> {
    return this.http.get(this.host +'/book-class/all').pipe(
      tap(_ => this.log('fetched books')),
      catchError(this.handleError('getBooks', []))
    );;
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

  private log(message: string) {
    this.messageService.add(`HeroService: ${message}`);
  }

}
