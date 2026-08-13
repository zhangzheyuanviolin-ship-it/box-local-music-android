            package p000;
            
            public final class iol01I0001 {
                public static final Object I0001Ioi1lo = new Object();
                public String I00000oIO;
                public iiIi1oo0Io I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;
                public volatile Object I0000oI00;

                public final Object I00000oIO(Object obj) {
                    synchronized (this.I0000O) {
                    }
/* 5 */             if (obj != null) {
/* 7 */                 return obj;
                    }
/* 10 */            if (lioiiOOOIlIo.I00000oIO == null) {
/* 12 */                return this.I0000Il00O;
                    }
                    synchronized (I0001Ioi1lo) {
                        try {
/* 22 */                    if (lolOiIoiillI.I0001Ioi1lo()) {
/* 33 */                        return this.I0000oI00 == null ? this.I0000Il00O : this.I0000oI00;
                            }
                            try {
/* 48 */                        for (iol01I0001 iol01i0001 : iol1II1ii1i.I00000oIO) {
/* 60 */                            if (lolOiIoiillI.I0001Ioi1lo()) {
/* 88 */                                throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                                    }
/* 62 */                            Object objZza = null;
                                    try {
/* 63 */                                iiIi1oo0Io iiii1oo0io = iol01i0001.I00000oOI;
/* 65 */                                if (iiii1oo0io != null) {
/* 67 */                                    objZza = iiii1oo0io.zza();
                                        }
                                    } catch (IllegalStateException unused) {
                                    }
                                    synchronized (I0001Ioi1lo) {
/* 74 */                                iol01i0001.I0000oI00 = objZza;
                                    }
                                }
                            } catch (SecurityException unused2) {
                            }
/* 89 */                    iiIi1oo0Io iiii1oo0io2 = this.I00000oOI;
/* 91 */                    if (iiii1oo0io2 != null) {
                                try {
/* 96 */                            return iiii1oo0io2.zza();
                                } catch (IllegalStateException | SecurityException unused3) {
                                }
                            }
/* 93 */                    return this.I0000Il00O;
                        } finally {
                        }
                    }
                }
            }
