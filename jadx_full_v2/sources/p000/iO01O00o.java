            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iO01O00o {
                public static O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, OIoOo11 oIoOo11, I0iolI1I11l1 i0iolI1I11l1, IOoOOI1ii iOoOOI1ii, float f, IOOil0 iOOil0, int i) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 i0iolI1I11l1 = i1O01oOIoI0I.I00io1l;
                    }
/* 9 */             if ((i & 16) != 0) {
/* 11 */                f = 1.0f;
                    }
/* 15 */            OIoi000o0l01 oIoi000o0l01 = new OIoi000o0l01();
/* 18 */            oIoi000o0l01.I00000oIO = oIoOo11;
/* 21 */            oIoi000o0l01.I00000oOI = true;
/* 23 */            oIoi000o0l01.I0000Il00O = i0iolI1I11l1;
/* 25 */            oIoi000o0l01.I0000O = iOoOOI1ii;
/* 27 */            oIoi000o0l01.I0000oI00 = f;
/* 29 */            oIoi000o0l01.I0001Ioi1lo = iOOil0;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            return o1ooiI111i.I0000O(oIoi000o0l01);
                }
            }
