            package p000;

            import android.app.Application;
            
            public final class ii1iOiO extends I10O1Ol00iIi {
                public final OlO0OIIl1 I0000Il00O;
                public final OOli1O I0000O;

                public ii1iOiO(Application application) {
/* 4 */             this.I00000oOI = application;
/* 8 */             OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(ii0IIlIlo1i.I00000oIO);
/* 12 */            this.I0000Il00O = olO0OIIl1I00000oIO;
/* 18 */            this.I0000O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(o00i1olooO o00i1olooo, IOoilo iOoilo) throws Throwable {
                    ii0o001oI ii0o001oi;
/* 3 */             if (iOoilo instanceof ii0o001oI) {
/* 6 */                 ii0o001oi = (ii0o001oI) iOoilo;
/* 8 */                 int i = ii0o001oi.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii0o001oi.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii0o001oi = new ii0o001oI(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000oI00 = ii0o001oi.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ii0o001oi.I00iiO;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 50 */                Application application = this.I00000oOI;
/* 52 */                Ii00l101O ii00l101O = iolO1iiOolOO.I00000oIO;
/* 58 */                Ol0Oli ol0Oli = new Ol0Oli(application, o00i1olooo, iOoil1iiIilo, 19);
/* 61 */                ii0o001oi.I00iiO = 1;
/* 63 */                objI0000oI00 = iOi1II01i0.I0000oI00(ii00l101O, ol0Oli, ii0o001oi);
/* 67 */                if (objI0000oI00 == ii0111o) {
/* 69 */                    return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
                    }
/* 106 */           return objI0000oI00;
                }
            }
