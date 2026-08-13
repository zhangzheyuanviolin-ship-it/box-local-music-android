            package p000;
            
            public final class i0I111I extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final boolean I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0I111I(boolean z, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = z;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 5 */             return new i0I111I(this.I00iiI, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((i0I111I) create((OiOiliiO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i != 0) {
/* 9 */                 if (i != 1) {
/* 13 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                     return null;
                        }
/* 17 */                lIoii1l01l0i.I00000oOI(obj);
/* 20 */                IOOlIIilOl0.I0000Il00O();
/* 8 */                 return null;
                    }
/* 24 */            lIoii1l01l0i.I00000oOI(obj);
/* 29 */            if (this.I00iiI) {
/* 37 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 31 */            this.I00iOIl = 1;
/* 33 */            il0l1o1l.I00000oIO(this);
/* 36 */            return ii0111o;
                }
            }
