            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Il1Ol0I0l implements IlliIl1l11O {
                public Il1ii01 I00iOIl;
                public O1ooiI111i I00iiI;
                public boolean I00iiO;
                public OI10ooOi I00iio;
                public Il1iiO I00ilI0I1;
                public OiOl01il10lO I00ilO0;
                public OioOIi1o0I I00io1l;
                public long I00ioIO;
                public float I00l0I0l0lO1;
                public IOii1l I00l0OO0IO;

                /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             Il1ii01 il1ii01 = this.I00iOIl;
/* 5 */             O1ooiI111i o1ooiI111i = this.I00iiI;
/* 7 */             boolean z = this.I00iiO;
/* 9 */             OI10ooOi oI10ooOi = this.I00iio;
/* 11 */            Il1iiO il1iiO = this.I00ilI0I1;
/* 13 */            OiOl01il10lO oiOl01il10lO = this.I00ilO0;
/* 15 */            OioOIi1o0I oioOIi1o0I = this.I00io1l;
/* 17 */            long j = this.I00ioIO;
/* 19 */            float f = this.I00l0I0l0lO1;
/* 21 */            IOii1l iOii1l = this.I00l0OO0IO;
/* 25 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 31 */            int iIntValue = ((Integer) obj2).intValue();
/* 38 */            int i = 1;
/* 49 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 3) != 2)) {
/* 51 */                OIooi1iOiOol oIooi1iOiOol = il1ii01.I000OiO;
/* 53 */                OIooi1iOiOol oIooi1iOiOol2 = il1ii01.I000iOII;
/* 57 */                Io1olo0 io1olo0 = new Io1olo0(i);
/* 60 */                io1olo0.I00iiI = z;
/* 62 */                io1olo0.I00iiO = oIooi1iOiOol;
/* 64 */                io1olo0.I00iio = oIooi1iOiOol2;
/* 66 */                VarHandle.storeStoreFence();
/* 69 */                O1ooiI111i o1ooiI111iI00000oIO = iIoIo1lll0lI.I00000oIO(o1ooiI111i, io1olo0);
/* 73 */                boolean zI000II = iloI0lOlll1.I000II(il1iiO);
/* 77 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 81 */                if (!zI000II) {
                            Object obj3 = objI00O0i0ii;
/* 85 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 91 */                        I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(28);
/* 94 */                        i0OIOO00l0O.I00iiI = il1iiO;
/* 96 */                        VarHandle.storeStoreFence();
/* 99 */                        iloI0lOlll1.I00iio(i0OIOO00l0O);
                                obj3 = i0OIOO00l0O;
                            }
/* 107 */                   O1ioliIli0o.I00000oIO(o1ooiI111iI00000oIO, oI10ooOi, (IllOOo00lI) obj3, oiOl01il10lO, oioOIi1o0I, j, f, iOii1l, iloI0lOlll1, 0);
                        }
                    } else {
/* 111 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 114 */           return OoiIlOl1iI.I00000oIO;
                }
            }
