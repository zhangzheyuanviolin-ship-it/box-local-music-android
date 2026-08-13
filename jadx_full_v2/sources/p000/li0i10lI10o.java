            package p000;

            import java.lang.invoke.VarHandle;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.concurrent.TimeUnit;
            import java.util.logging.Level;
            
            public final class li0i10lI10o {
                public static final lOi1oo I00000oOI = new lOi1oo();
                public i1Io0lIii I00000oIO;

                public static void I00000oOI(String str, lIOl0o0 liol0o0) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 28 */            sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(liol0o0.I00000oOI / 1000000)));
/* 33 */            sb.append(": logging error [");
/* 36 */            o10lOOOlo o10looolo = liol0o0.I0000O;
/* 38 */            if (o10looolo == null) {
/* 65 */                I000II.I001IO000("cannot request log site information prior to postProcess()");
/* 106 */               return;
                    }
/* 41 */            lil1II.I00000oIO(1, o10looolo, sb);
/* 46 */            sb.append("]: ");
/* 49 */            sb.append(str);
/* 54 */            System.err.println(sb);
/* 59 */            System.err.flush();
                }

                public final l1olII I00000oIO(Level level) {
/* 1 */             i1Io0lIii i1io0liii = this.I00000oIO;
/* 3 */             boolean zI0001Ioi1lo = i1io0liii.I0001Ioi1lo(level);
/* 7 */             String str = i1io0liii.I00000oIO;
/* 9 */             iio00I10 iio00i10 = iilio10l1i.I00000oIO;
/* 14 */            ((iioiOOllOioi) iio00i10).getClass();
/* 19 */            il0Ii1.I00000oOI.I0000Il00O(str, level, zI0001Ioi1lo);
/* 22 */            if (!zI0001Ioi1lo) {
/* 24 */                return I00000oOI;
                    }
/* 29 */            lIOl0o0 liol0o0 = new lIOl0o0();
/* 32 */            liol0o0.I000O01llI0 = this;
/* 34 */            iio00i10.getClass();
/* 43 */            long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
/* 48 */            liol0o0.I0000Il00O = null;
/* 50 */            liol0o0.I0000O = null;
/* 52 */            liol0o0.I0000oI00 = null;
/* 54 */            liol0o0.I0001Ioi1lo = null;
/* 56 */            liol0o0.I000II = null;
/* 60 */            lio00OOillO.I00000oIO("level", level);
/* 63 */            liol0o0.I00000oIO = level;
/* 65 */            liol0o0.I00000oOI = nanos;
/* 67 */            VarHandle.storeStoreFence();
/* 77 */            return liol0o0;
                }
            }
