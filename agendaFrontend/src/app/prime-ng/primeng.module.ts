import { NgModule } from '@angular/core';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TableModule } from 'primeng/table';
import { DropdownModule } from 'primeng/dropdown';
import { DialogModule } from 'primeng/dialog';
import { InputTextModule } from 'primeng/inputtext';
import { ButtonModule } from 'primeng/button';
import { CalendarModule } from 'primeng/calendar';
import { KeyFilterModule } from 'primeng/keyfilter';
import { MessagesModule } from 'primeng/messages';
import { MessageModule } from 'primeng/message';
import { ToastModule } from 'primeng/toast';
import { MessageService } from 'primeng/components/common/messageservice';
import { TooltipModule } from 'primeng/tooltip';

@NgModule({
    imports: [
        BrowserAnimationsModule,
        DropdownModule,
        TableModule,
        DialogModule,
        InputTextModule,
        ButtonModule,
        CalendarModule,
        KeyFilterModule,
        MessagesModule,
        MessageModule,
        ToastModule,
        TooltipModule
    ],
    exports: [
        BrowserAnimationsModule,
        DropdownModule,
        TableModule,
        DialogModule,
        InputTextModule,
        ButtonModule,
        CalendarModule,
        KeyFilterModule,
        MessagesModule,
        MessageModule,
        ToastModule,
        TooltipModule
    ],
    providers: [MessageService]
})
export class PrimeNgModule { }
