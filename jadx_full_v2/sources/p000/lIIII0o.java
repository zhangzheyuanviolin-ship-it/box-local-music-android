            package p000;

            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            
            public abstract class lIIII0o {
                public static OutputStream I00000oIO(OutputStream outputStream, IIOoi0ooOoO iIOoi0ooOoO) {
/* 5 */             int iI00oooO = iIOoi0ooOoO.I00oooO(IIi0I0I0o.I0I1lII000I, null, -1);
/* 10 */            if (iI00oooO <= 1) {
/* 89 */                return outputStream;
                    }
/* 20 */            int iMin = Math.min(iIOoi0ooOoO.I00oooO(IIi0I0I0o.I01101olii, null, 1), 32);
/* 28 */            int iI00oooO2 = iIOoi0ooOoO.I00oooO(IIi0I0I0o.I00oli, null, 8);
/* 34 */            int iI00oooO3 = iIOoi0ooOoO.I00oooO(IIi0I0I0o.I0110o, null, 1);
/* 40 */            OOI01O0oiooo oOI01O0oiooo = new OOI01O0oiooo(outputStream);
/* 44 */            oOI01O0oiooo.I00l0I0l0lO1 = 0;
/* 46 */            oOI01O0oiooo.I00l0OO0IO = false;
/* 48 */            oOI01O0oiooo.I00iOIl = iI00oooO;
/* 50 */            oOI01O0oiooo.I00iiI = iMin;
/* 52 */            oOI01O0oiooo.I00iiO = iI00oooO2;
/* 54 */            oOI01O0oiooo.I00iio = iI00oooO3;
/* 60 */            int i = (((iMin * iI00oooO2) * iI00oooO3) + 7) / 8;
/* 61 */            oOI01O0oiooo.I00ilI0I1 = i;
/* 69 */            oOI01O0oiooo.I00ilO0 = iI00oooO >= 10;
/* 73 */            oOI01O0oiooo.I00io1l = new byte[i];
/* 77 */            oOI01O0oiooo.I00ioIO = new byte[i];
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            return oOI01O0oiooo;
                }
            }
