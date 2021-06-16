import { TestBed } from '@angular/core/testing';

import { SpringbootserviceService } from './springbootservice.service';

describe('SpringbootserviceService', () => {
  let service: SpringbootserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SpringbootserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
