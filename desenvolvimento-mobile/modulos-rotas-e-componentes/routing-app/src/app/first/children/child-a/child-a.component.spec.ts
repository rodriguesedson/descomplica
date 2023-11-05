import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildAComponent } from './child-a.component';

describe('ChildAComponent', () => {
  let component: ChildAComponent;
  let fixture: ComponentFixture<ChildAComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildAComponent]
    });
    fixture = TestBed.createComponent(ChildAComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
