            package p000;
            
            public final class IoOOIO {
                public Long I00000oIO;
                public Long I00000oOI;
                public Long I0000Il00O;

                static {
/* 5 */             OOoOl0i.I00000oIO.I00000oOI(IoOOIO.class);
                    try {
/* 8 */                 OOoOl0i.I00000oIO(IoOOIO.class);
                    } catch (Throwable unused) {
                    }
/* 17 */            if (OlOoOIi0o.I001l0I00("TimeoutConfiguration")) {
/* 22 */                I000II.I000iOII("Name can't be blank");
                    }
                }

                public IoOOIO() {
/* 10 */            this.I00000oIO = 0L;
/* 12 */            this.I00000oOI = 0L;
/* 14 */            this.I0000Il00O = 0L;
/* 17 */            this.I00000oIO = null;
/* 19 */            this.I00000oOI = null;
/* 21 */            this.I0000Il00O = null;
                }

                public static void I00000oIO(Long l) {
/* 1 */             if (l == null || l.longValue() > 0) {
/* 49 */                return;
                    }
/* 16 */            I000II.I000iOII("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS");
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || IoOOIO.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 17 */            IoOOIO ioOOIO = (IoOOIO) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ioOOIO.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ioOOIO.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, ioOOIO.I0000Il00O);
                }

                public final int hashCode() {
/* 1 */             Long l = this.I00000oIO;
/* 16 */            int iHashCode = (l != null ? Long.hashCode(l.longValue()) : 0) * 31;
/* 18 */            Long l2 = this.I00000oOI;
/* 33 */            int iHashCode2 = (iHashCode + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31;
/* 35 */            Long l3 = this.I0000Il00O;
/* 47 */            return iHashCode2 + (l3 != null ? Long.hashCode(l3.longValue()) : 0);
                }
            }
