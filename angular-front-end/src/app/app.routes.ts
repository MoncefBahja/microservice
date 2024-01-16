import { Routes } from '@angular/router';
import {CustomersComponent} from "./customers/customers.component";
import {AccountsComponent} from "./accounts/accounts.component";
import {AssosiationComponent} from "./assosiation/assosiation.component";

export const routes: Routes = [
  {path : "customers",component:CustomersComponent},
  {path : "accounts",component:AccountsComponent},
  {path : "assosiation",component:AssosiationComponent}
];
