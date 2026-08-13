            package p000;

            import java.lang.invoke.VarHandle;
            import java.net.ConnectException;
            import java.net.HttpURLConnection;
            import java.net.SocketTimeoutException;
            import java.util.Map;
            
            public abstract class iOIoo0OoII1O {
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(HttpURLConnection httpURLConnection, IOiOol0 iOiOol0, I0O1IO i0o1io, IOoilo iOoilo) {
                    I1011Iolo i1011Iolo;
                    Object obj;
/* 3 */             if (iOoilo instanceof I1011Iolo) {
/* 6 */                 i1011Iolo = (I1011Iolo) iOoilo;
/* 8 */                 int i = i1011Iolo.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i1011Iolo.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i1011Iolo = new I1011Iolo(iOoilo);
                        }
                    }
/* 25 */            Object obj2 = i1011Iolo.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i1011Iolo.I00iio;
/* 33 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(obj2);
                        try {
/* 54 */                    return i0o1io.invoke(httpURLConnection);
                        } catch (Throwable th) {
/* 59 */                    th = th;
/* 60 */                    i1011Iolo.I00iOIl = iOiOol0;
/* 62 */                    i1011Iolo.I00iiI = th;
/* 64 */                    i1011Iolo.I00iio = 1;
/* 70 */                    if (liIOo01oO.I00000oIO(i1011Iolo) == ii0111o) {
/* 72 */                        return ii0111o;
                            }
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 47 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                th = i1011Iolo.I00iiI;
/* 39 */                iOiOol0 = i1011Iolo.I00iOIl;
/* 41 */                lIoii1l01l0i.I00000oOI(obj2);
                    }
/* 75 */            if (!(th instanceof SocketTimeoutException)) {
/* 79 */                if (!(th instanceof ConnectException)) {
/* 483 */                   throw th;
                        }
/* 81 */                String message = th.getMessage();
/* 94 */                if (!(message != null ? OlOoOIi0o.I000oI1ioi(message, "timed out", false) : false)) {
/* 483 */                   throw th;
                        }
                    }
/* 96 */            O1I1OOiol o1I1OOiol = IoOOIiIl00.I00000oIO;
/* 104 */           StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
/* 111 */           sb.append((Ool0oO1OIi) iOiOol0.I00iiI);
/* 116 */           sb.append(", connect_timeout=");
/* 129 */           Map map = (Map) ((IOlOl10) iOiOol0.I00io1l).I0000O(IoIloO1OOO.I00000oIO);
/* 139 */           IoOOIO ioOOIO = (IoOOIO) (map != null ? map.get(IoOO1000I.I00000oIO) : null);
/* 141 */           if (ioOOIO == null || (obj = ioOOIO.I00000oOI) == null) {
/* 147 */               obj = "unknown";
                    }
/* 149 */           sb.append(obj);
/* 154 */           sb.append(" ms]");
/* 161 */           IOlo0l11illI iOlo0l11illI = new IOlo0l11illI(sb.toString());
/* 164 */           iOlo0l11illI.I00iOIl = th;
/* 166 */           VarHandle.storeStoreFence();
/* 483 */           throw iOlo0l11illI;
                }
            }
