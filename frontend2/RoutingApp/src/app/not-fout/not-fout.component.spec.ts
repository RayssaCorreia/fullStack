import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NotFoutComponent } from './not-fout.component';

describe('NotFoutComponent', () => {
  let component: NotFoutComponent;
  let fixture: ComponentFixture<NotFoutComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NotFoutComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NotFoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
