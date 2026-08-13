            package p000;
            
            public final class Ii0iIoIIl extends Oll0io implements IlliIl1l11O {
                public final IiIooOOOI I00iOIl;
                public final Ii0110 I00iiI;
                public final OI10i0Il I00iiO;
                public final OI10i0Il I00iio;
                public final float I00ilI0I1;
                public final III0Ii I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii0iIoIIl(IiIooOOOI iiIooOOOI, Ii0110 ii0110, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, float f, III0Ii iII0Ii, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = iiIooOOOI;
/* 3 */             this.I00iiI = ii0110;
/* 5 */             this.I00iiO = oI10i0Il;
/* 7 */             this.I00iio = oI10i0Il2;
/* 9 */             this.I00ilI0I1 = f;
/* 11 */            this.I00ilO0 = iII0Ii;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            return new Ii0iIoIIl(this.I00iOIl, this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 9 */             Ii0iIoIIl ii0iIoIIl = (Ii0iIoIIl) create((Ii0110) obj, (IOoil1iiIilo) obj2);
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            ii0iIoIIl.invokeSuspend(ooiIlOl1iI);
/* 37 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
/* 12 */            Oo0iil0o0oI oo0iil0o0oI = (Oo0iil0o0oI) this.I00iiO.getValue();
/* 14 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 16 */            if (oo0iil0o0oI != null) {
/* 27 */                long j = ((Oo0OI01Il) this.I00iio.getValue()).I00000oOI;
/* 29 */                int i = Oo0lI00l.I0000Il00O;
/* 34 */                int i2 = (int) (j >> 32);
/* 45 */                if (i2 <= oo0iil0o0oI.I00000oIO.I00000oIO.I00iiI.length()) {
/* 47 */                    OOo0IO oOo0IOI0000Il00O = oo0iil0o0oI.I0000Il00O(i2);
/* 81 */                    iOi1II01i0.I0000O(this.I00iiI, null, null, new I00oI0i(this.I00ilO0, OOo0IO.I00000oOI(oOo0IOI0000Il00O, 0.0f, 0.0f, oOo0IOI0000Il00O.I0000O + this.I00iOIl.I00i0ilIl0i(this.I00ilI0I1), 7), null, 28), 3);
                        }
                    }
/* 168 */           return ooiIlOl1iI;
                }
            }
