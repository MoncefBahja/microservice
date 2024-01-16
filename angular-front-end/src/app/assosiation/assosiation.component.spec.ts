import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssosiationComponent } from './assosiation.component';

describe('AssosiationComponent', () => {
  let component: AssosiationComponent;
  let fixture: ComponentFixture<AssosiationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AssosiationComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AssosiationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
