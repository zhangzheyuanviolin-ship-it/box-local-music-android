            package p000;

            import java.util.Iterator;
            
            public final class IllIll extends I01loIooI implements OIl1Oll {
                public final IllO00OiO I0000Il00O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IllIll(IllO00OiO illO00OiO) {
/* 4 */             super(6);
/* 1 */             this.I0000Il00O = illO00OiO;
                }

                @Override
                public final void I00000oOI(Object obj) {
                    Object obj2;
                    IllIo0 illIo0;
/* 9 */             ((IOi10loi) this.I00000oOI).I00O10llo(OIl1lo10.I00000oIO(obj));
/* 12 */            IllO00OiO illO00OiO = this.I0000Il00O;
/* 14 */            I1OooIoiIO i1OooIoiIO = illO00OiO.I0001Ioi1lo;
/* 74 */            do {
/* 16 */                obj2 = i1OooIoiIO.I00000oIO;
/* 19 */                IllIo0 illIo02 = (IllIo0) obj2;
/* 21 */                int iOrdinal = illIo02.ordinal();
/* 25 */                if (iOrdinal == 0) {
/* 66 */                    illIo0 = IllIo0.I00iiI;
                        } else {
/* 28 */                    if (iOrdinal != 2) {
/* 65 */                        throw new IllegalStateException("Unexpected frame state for " + illO00OiO + "! State is " + illIo02 + ' ');
                            }
/* 30 */                    illIo0 = IllIo0.I00iio;
                        }
/* 74 */            } while (!I1OooIoiIO.I00000oOI.compareAndSet(i1OooIoiIO, obj2, illIo0));
/* 78 */            Iterator it = illO00OiO.I000O01llI0.iterator();
/* 86 */            if (it.hasNext()) {
/* 168 */               throw IIlIOloOOO.I000lI(it);
                    }
/* 90 */            if (illIo0 == IllIo0.I00iio) {
/* 94 */                Iterator it2 = illO00OiO.I000O01llI0.iterator();
/* 102 */               if (it2.hasNext()) {
/* 109 */                   throw IIlIOloOOO.I000lI(it2);
                        }
                    }
                }
            }
