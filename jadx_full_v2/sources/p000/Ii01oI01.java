            package p000;
            
            public final class Ii01oI01 implements IIIoloiiI1 {
                public IIIoloiiI1 I00000oOI;
                public III1oo00i1li I0000Il00O;
                public long I0000O;
                public long I0000oI00;

                public final void I00000oIO() {
/* 1 */             I00000oOI();
                    this.I0000O += this.I0000Il00O.I000l1(this.I00000oOI.I000II());
                }

                public final void I00000oOI() {
/* 1 */             long j = this.I0000oI00;
/* 3 */             long j2 = this.I0000O;
/* 7 */             long j3 = this.I0000Il00O.I00iiO;
/* 11 */            this.I0000oI00 = (j2 - j3) + j;
/* 13 */            this.I0000O = j3;
                }

                @Override
                public final void I0000O(Throwable th) {
/* 3 */             this.I00000oOI.I0000O(th);
/* 8 */             this.I0000Il00O.getClass();
                }

                @Override
                public final Throwable I0000oI00() {
/* 3 */             return this.I00000oOI.I0000oI00();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(int i, IOoilo iOoilo) throws Throwable {
                    Ii01o00Ol1O ii01o00Ol1O;
/* 3 */             if (iOoilo instanceof Ii01o00Ol1O) {
/* 6 */                 ii01o00Ol1O = (Ii01o00Ol1O) iOoilo;
/* 8 */                 int i2 = ii01o00Ol1O.I00iiO;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii01o00Ol1O.I00iiO = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii01o00Ol1O = new Ii01o00Ol1O(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0001Ioi1lo = ii01o00Ol1O.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = ii01o00Ol1O.I00iiO;
/* 32 */            if (i3 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
/* 50 */                I00000oIO();
/* 60 */                if (this.I0000Il00O.I00iiO >= i) {
/* 62 */                    return Boolean.TRUE;
                        }
/* 65 */                IIIoloiiI1 iIIoloiiI1 = this.I00000oOI;
/* 67 */                ii01o00Ol1O.I00iiO = 1;
/* 69 */                objI0001Ioi1lo = iIIoloiiI1.I0001Ioi1lo(i, ii01o00Ol1O);
/* 73 */                if (objI0001Ioi1lo == ii0111o) {
/* 75 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i3 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objI0001Ioi1lo);
                    }
/* 82 */            if (!((Boolean) objI0001Ioi1lo).booleanValue()) {
/* 90 */                return Boolean.FALSE;
                    }
/* 84 */            I00000oIO();
/* 87 */            return Boolean.TRUE;
                }

                @Override
                public final III1oo00i1li I000II() {
/* 1 */             I00000oIO();
/* 4 */             return this.I0000Il00O;
                }

                @Override
                public final boolean I000O01llI0() {
                    return this.I0000Il00O.I00II0Ol1O0l() && this.I00000oOI.I000O01llI0();
                }
            }
