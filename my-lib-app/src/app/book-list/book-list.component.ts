import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../library.service';


@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Array<any>;
  book: any = null;

  constructor(private libraryService: LibraryService) { }

  ngOnInit() {
    this.getBooks();
  }

  getBooks(): void {
    this.libraryService.getAll()
    .subscribe(heroes => this.books = heroes);
  }

}
