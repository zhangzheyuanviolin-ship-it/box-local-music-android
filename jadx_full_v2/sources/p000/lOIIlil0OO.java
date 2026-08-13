            package p000;
            
            public final class lOIIlil0OO extends iOo0iOlili1 {
                public final int I0000oI00;
                public final lOliOlO1Io I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public lOIIlil0OO(lOliOlO1Io loliolo1io, l1i11I1I0 l1i11i1i0, int i) {
/* 5 */             super(l1i11i1i0);
/* 1 */             this.I0000oI00 = i;
/* 3 */             this.I0001Ioi1lo = loliolo1io;
                }

                @Override
                public final void I00000oIO() {
/* 1 */             int i = this.I0000oI00;
/* 3 */             lOliOlO1Io loliolo1io = this.I0001Ioi1lo;
                    switch (i) {
                        case 0:
/* 25 */                    loliolo1io.I010II();
/* 32 */                    if (loliolo1io.I011IOil()) {
/* 39 */                        l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 41 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 48 */                        l01o0io1ooo0.I00lll10.I00000oOI("Inactivity, disconnecting from the service");
/* 51 */                        loliolo1io.I010lI0oi();
                                break;
                            }
                            break;
                        default:
/* 12 */                    l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) loliolo1io.I00iOIl).I00ilO0;
/* 14 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 21 */                    l01o0io1ooo02.I00l0I0l0lO1.I00000oOI("Tasks have been queued for a long time");
                            break;
                    }
                }
            }
