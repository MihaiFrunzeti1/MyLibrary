import { TestBed, inject } from '@angular/core/testing';

import { LibraryService } from './library.ro.privatelibrary.library.service';

describe('LibraryService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LibraryService]
    });
  });

  it('should be created', inject([LibraryService], (ro.privatelibrary.library.service: LibraryService) => {
    expect(ro.privatelibrary.library.service).toBeTruthy();
  }));
});
