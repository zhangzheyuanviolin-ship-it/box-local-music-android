            package p000;
            
            public final class O11iIo1 extends Oll0io implements IlliIl1l11O {
                public long I00iOIl;
                public int I00iiI;
                public final O1oIOiI11o0 I00iiO;
                public final O11Iil1 I00iio;
                public final O11iO00I1o I00ilI0I1;
                public final IO1iI1i I00ilO0;
                public final boolean I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O11iIo1(O1oIOiI11o0 o1oIOiI11o0, O11Iil1 o11Iil1, O11iO00I1o o11iO00I1o, IO1iI1i iO1iI1i, boolean z, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = o1oIOiI11o0;
/* 3 */             this.I00iio = o11Iil1;
/* 5 */             this.I00ilI0I1 = o11iO00I1o;
/* 7 */             this.I00ilO0 = iO1iI1i;
/* 9 */             this.I00io1l = z;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 14 */            return new O11iIo1(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((O11iIo1) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    long jCurrentTimeMillis;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i = this.I00iiI;
/* 8 */             if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 34 */                jCurrentTimeMillis = System.currentTimeMillis() + 30000;
                    } else {
/* 10 */                if (i != 1) {
/* 20 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 23 */                    return null;
                        }
/* 12 */                jCurrentTimeMillis = this.I00iOIl;
/* 14 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 69 */            do {
/* 35 */                O1oIOiI11o0 o1oIOiI11o0 = this.I00iiO;
/* 37 */                Object obj2 = o1oIOiI11o0.I00IlilI0i0i;
/* 39 */                O11Iil1 o11Iil1 = this.I00iio;
/* 41 */                OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 43 */                if (obj2 != null) {
/* 72 */                    IO1iI1i iO1iI1i = this.I00ilO0;
/* 111 */                   this.I00ilI0I1.I0000oI00(o1oIOiI11o0, new IO1iI1i(iO1iI1i.I000II, iO1iI1i.I000O01llI0, iO1iI1i.I000OOo1O, iO1iI1i.I000OiO, iO1iI1i.I000iOII, iO1iI1i.I000l1, iO1iI1i.I000lI));
/* 126 */                   O11iO00I1o.I000oI1ioi(this.I00ilI0I1, o1oIOiI11o0, iO1iI1i.I000II, null, null, null, null, o11Iil1, this.I00io1l, 124);
/* 168 */                   return ooiIlOl1iI;
                        }
/* 51 */                if (System.currentTimeMillis() > jCurrentTimeMillis) {
/* 55 */                    o11Iil1.invoke("Model initialization timed out");
/* 58 */                    return ooiIlOl1iI;
                        }
/* 59 */                this.I00iOIl = jCurrentTimeMillis;
/* 61 */                this.I00iiI = 1;
/* 69 */            } while (il0l1o1l.I00000oOI(100L, this) != ii0111o);
/* 71 */            return ii0111o;
                }
            }
