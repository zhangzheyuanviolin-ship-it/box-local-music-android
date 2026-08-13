            package p000;

            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            
            public abstract class I01IlIoOI {
                protected int memoizedHashCode;

                public abstract int I00000oIO(OiOIl0 oiOIl0);

                public abstract void I00000oOI(IOOOiI0 iOOOiI0);

                public final void I0000Il00O(OutputStream outputStream) {
/* 5 */             int iI00000oIO = ((Io00Ol1o10O) this).I00000oIO(null);
/* 9 */             boolean z = IOOOiI0.I0001Ioi1lo;
/* 13 */            if (iI00000oIO > 4096) {
/* 15 */                iI00000oIO = 4096;
                    }
/* 18 */            IOOOiI0 iOOOiI0 = new IOOOiI0();
/* 21 */            if (outputStream == null) {
/* 61 */                IOOlIIilOl0.I000II("out");
/* 186 */               return;
                    }
/* 23 */            iOOOiI0.I0000oI00 = outputStream;
/* 25 */            if (iI00000oIO < 0) {
/* 55 */                I000II.I000iOII("bufferSize must be >= 0");
/* 58 */                return;
                    }
/* 29 */            int iMax = Math.max(iI00000oIO, 20);
/* 35 */            iOOOiI0.I00000oOI = new byte[iMax];
/* 37 */            iOOOiI0.I0000Il00O = iMax;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            I00000oOI(iOOOiI0);
/* 47 */            if (iOOOiI0.I0000O > 0) {
/* 49 */                iOOOiI0.I000OiO();
                    }
                }
            }
