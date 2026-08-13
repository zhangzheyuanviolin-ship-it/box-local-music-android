            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class liIIoi1I0i01 {
                public static final OololIOo I00000oIO(Ioo0l0I ioo0l0I, String str) {
/* 3 */             Ioo1Io ioo1IoI00000oOI = I00000oOI(ioo0l0I);
/* 7 */             OololIOo oololIOo = new OololIOo();
/* 10 */            oololIOo.I00000oIO = str;
/* 16 */            oololIOo.I00000oOI = lOO00IiI0li.I00000oIO(ioo1IoI00000oOI);
/* 18 */            VarHandle.storeStoreFence();
/* 37 */            return oololIOo;
                }

                public static final Ioo1Io I00000oOI(Ioo0l0I ioo0l0I) {
/* 3 */             int i = ioo0l0I.I00000oIO;
/* 5 */             int i2 = ioo0l0I.I00000oOI;
/* 7 */             int i3 = ioo0l0I.I0000Il00O;
/* 9 */             int i4 = ioo0l0I.I0000O;
/* 11 */            Ioo1Io ioo1Io = new Ioo1Io();
/* 14 */            ioo1Io.I00000oIO = i;
/* 16 */            ioo1Io.I00000oOI = i2;
/* 18 */            ioo1Io.I0000Il00O = i3;
/* 20 */            ioo1Io.I0000O = i4;
/* 22 */            VarHandle.storeStoreFence();
/* 29 */            return ioo1Io;
                }
            }
