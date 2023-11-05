import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildBComponent } from './child-b.component';

describe('ChildBComponent', () => {
  let component: ChildBComponent;
  let fixture: ComponentFixture<ChildBComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildBComponent]
    });
    fixture = TestBed.createComponent(ChildBComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
