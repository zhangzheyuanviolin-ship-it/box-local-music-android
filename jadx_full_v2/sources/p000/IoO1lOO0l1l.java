            package p000;

            import java.io.IOException;
            
            public final class IoO1lOO0l1l extends IOException implements IOollIi1OO0I {
                public final String I00iOIl;
                public final Long I00iiI;

                /* JADX WARN: Illegal instructions before constructor call */
                public IoO1lOO0l1l(String str, Long l, Throwable th) {
/* 5 */             StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Request timeout has expired [url=", str, ", request_timeout=");
/* 15 */            sbI001IIilI0O.append(l == null ? "unknown" : l);
/* 20 */            sbI001IIilI0O.append(" ms]");
/* 27 */            super(sbI001IIilI0O.toString(), th);
/* 30 */            this.I00iOIl = str;
/* 32 */            this.I00iiI = l;
                }

                @Override
                public final Throwable I00000oIO() {
/* 11 */            return new IoO1lOO0l1l(this.I00iOIl, this.I00iiI, getCause());
                }
            }
