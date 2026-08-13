            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class OiI11O1i1 {
                public static final OiI111I I00000oIO = I00000oIO(50);

                public static final OiI111I I00000oIO(int i) {
/* 1 */             OO0l00oiO1i1 oO0l00oiO1i1I00000oIO = iioillO0.I00000oIO(i);
/* 7 */             return new OiI111I(oO0l00oiO1i1I00000oIO, oO0l00oiO1i1I00000oIO, oO0l00oiO1i1I00000oIO, oO0l00oiO1i1I00000oIO);
                }

                public static final OiI111I I00000oOI(float f) {
/* 1 */             Iil10li1IIo iil10li1IIoI00000oOI = iioillO0.I00000oOI(f);
/* 7 */             return new OiI111I(iil10li1IIoI00000oOI, iil10li1IIoI00000oOI, iil10li1IIoI00000oOI, iil10li1IIoI00000oOI);
                }

                public static final OiI111I I0000Il00O(float f, float f2, float f3, float f4) {
/* 19 */            return new OiI111I(iioillO0.I00000oOI(f), iioillO0.I00000oOI(f2), iioillO0.I00000oOI(f3), iioillO0.I00000oOI(f4));
                }

                public static final OiI11I0o10 I0000O(Ii0010ol0 ii0010ol0, Ii0010ol0 ii0010ol02, float f) {
/* 3 */             OiI11I0o10 oiI11I0o10 = new OiI11I0o10();
/* 6 */             oiI11I0o10.I00000oIO = ii0010ol0;
/* 8 */             oiI11I0o10.I00000oOI = ii0010ol02;
/* 10 */            oiI11I0o10.I0000Il00O = f;
/* 12 */            VarHandle.storeStoreFence();
/* 98 */            return oiI11I0o10;
                }
            }
