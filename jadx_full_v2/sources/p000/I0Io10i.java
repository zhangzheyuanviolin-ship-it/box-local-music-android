            package p000;

            import java.util.List;
            
            public final class I0Io10i extends Oll0io implements IlliIl1l11O {
                public final boolean I00iOIl;
                public final String I00iiI;
                public final O1i1O1I I00iiO;
                public final IllOOo00lI I00iio;
                public final IllOOo00lI I00ilI0I1;
                public final OI10i0Il I00ilO0;
                public final OI10i0Il I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0Io10i(boolean z, String str, O1i1O1I o1i1O1I, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = z;
/* 3 */             this.I00iiI = str;
/* 5 */             this.I00iiO = o1i1O1I;
/* 7 */             this.I00iio = illOOo00lI;
/* 9 */             this.I00ilI0I1 = illOOo00lI2;
/* 11 */            this.I00ilO0 = oI10i0Il;
/* 13 */            this.I00io1l = oI10i0Il2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            return new I0Io10i(this.I00iOIl, this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 9 */             I0Io10i i0Io10i = (I0Io10i) create((Ii0110) obj, (IOoil1iiIilo) obj2);
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            i0Io10i.invokeSuspend(ooiIlOl1iI);
/* 37 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
/* 6 */             List list = I0Io10iIl.I00000oIO;
/* 8 */             OI10i0Il oI10i0Il = this.I00ilO0;
/* 20 */            if (((Boolean) oI10i0Il.getValue()).booleanValue() && !this.I00iOIl) {
/* 28 */                if (this.I00iiI == null) {
/* 32 */                    this.I00iiO.I0001Ioi1lo();
/* 37 */                    this.I00iio.invoke();
/* 42 */                    this.I00ilI0I1.invoke();
                        } else {
/* 48 */                    oI10i0Il.setValue(Boolean.FALSE);
/* 51 */                    OI10i0Il oI10i0Il2 = this.I00io1l;
/* 84 */                    oI10i0Il2.setValue(Oo0OI01Il.I00000oIO((Oo0OI01Il) oI10i0Il2.getValue(), null, lOliOi0Oi.I00000oIO(0, ((Oo0OI01Il) oI10i0Il2.getValue()).I00000oIO.I00iiI.length()), 5));
                        }
                    }
/* 87 */            return OoiIlOl1iI.I00000oIO;
                }
            }
