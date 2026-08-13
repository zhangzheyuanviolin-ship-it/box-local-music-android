            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I0ooIIliii10 implements IlliIl1l11O {
                public Oooii1o1 I00iOIl;
                public long I00iiI;
                public boolean I00iiO;
                public O1ooiI111i I00iio;
                public OIOlil0i I00ilI0I1;

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             Oooii1o1 oooii1o1 = this.I00iOIl;
/* 3 */             long j = this.I00iiI;
/* 5 */             boolean z = this.I00iiO;
/* 7 */             O1ooiI111i o1ooiI111i = this.I00iio;
/* 9 */             OIOlil0i oIOlil0i = this.I00ilI0I1;
/* 11 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 15 */            int iIntValue = ((Integer) obj2).intValue();
/* 33 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 37 */                OOiIo1lll oOiIo1lllI00000oIO = IOlO0o100i1i.I00111O.I00000oIO(oooii1o1);
/* 43 */                I0ooOlllOo i0ooOlllOo = new I0ooOlllOo();
/* 46 */                i0ooOlllOo.I00iOIl = j;
/* 48 */                i0ooOlllOo.I00iiI = z;
/* 50 */                i0ooOlllOo.I00iiO = o1ooiI111i;
/* 52 */                i0ooOlllOo.I00iio = oIOlil0i;
/* 54 */                VarHandle.storeStoreFence();
/* 66 */                iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(1260045569, i0ooOlllOo, iloI0lOlll1), iloI0lOlll1, 56);
                    } else {
/* 70 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 73 */            return OoiIlOl1iI.I00000oIO;
                }
            }
