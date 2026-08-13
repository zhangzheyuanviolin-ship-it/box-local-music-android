            package p000;
            
            public final class IlO1lII extends Oll0io implements IlliIl1l11O {
                public final long I00iOIl;
                public final IlOI0O11011l I00iiI;
                public final I0IOIlIOIII I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlO1lII(long j, IlOI0O11011l ilOI0O11011l, I0IOIlIOIII i0IOIlIOIII, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = j;
/* 3 */             this.I00iiI = ilOI0O11011l;
/* 5 */             this.I00iiO = i0IOIlIOIII;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            return new IlO1lII(this.I00iOIl, this.I00iiI, this.I00iiO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 9 */             IlO1lII ilO1lII = (IlO1lII) create((Ii0110) obj, (IOoil1iiIilo) obj2);
/* 11 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 13 */            ilO1lII.invokeSuspend(ooiIlOl1iI);
/* 37 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
/* 12 */            long jCurrentTimeMillis = System.currentTimeMillis() + this.I00iOIl;
/* 15 */            Ioi11lOIIO0O ioi11lOIIO0O = this.I00iiI.I000O01llI0;
/* 17 */            if (ioi11lOIIO0O != null) {
/* 21 */                ioi11lOIIO0O.I00000oIO(jCurrentTimeMillis, this.I00iiO);
                    }
/* 27 */            l11I11lO.I0000O(3, "CXCP");
/* 30 */            return OoiIlOl1iI.I00000oIO;
                }
            }
