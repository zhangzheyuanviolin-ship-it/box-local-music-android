            package p000;
            
            public final class O1l1O1iloo00 extends Oll0io implements IlliIl1l11O {
                public final boolean I00iOIl;
                public final boolean I00iiI;
                public final OI10i0Il I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O1l1O1iloo00(boolean z, boolean z2, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = z;
/* 3 */             this.I00iiI = z2;
/* 5 */             this.I00iiO = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new O1l1O1iloo00(this.I00iOIl, this.I00iiI, this.I00iiO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 9 */             O1l1O1iloo00 o1l1O1iloo00 = (O1l1O1iloo00) create((Ii0110) obj, (IOoil1iiIilo) obj2);
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            o1l1O1iloo00.invokeSuspend(ooiIlOl1iI);
/* 37 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
/* 8 */             if (!this.I00iOIl && this.I00iiI) {
/* 18 */                this.I00iiO.setValue(Boolean.FALSE);
                    }
/* 21 */            return OoiIlOl1iI.I00000oIO;
                }
            }
