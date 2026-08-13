            package p000;

            import java.util.List;
            
            public final class ii00IIO11 extends ii1O10ooOi {
                public List I00000oIO;
                public iII0O0OIo I00000oOI;
                public ioIl00 I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ii1O10ooOi) {
/* 14 */                ii00IIO11 ii00iio11 = (ii00IIO11) ((ii1O10ooOi) obj);
/* 22 */                if (this.I00000oIO.equals(ii00iio11.I00000oIO)) {
/* 24 */                    iII0O0OIo iii0o0oio = this.I00000oOI;
/* 26 */                    iII0O0OIo iii0o0oio2 = ii00iio11.I00000oOI;
/* 28 */                    if (iii0o0oio != null ? iii0o0oio == iii0o0oio2 : iii0o0oio2 == null) {
/* 44 */                        if (this.I0000Il00O.equals(ii00iio11.I0000Il00O)) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            iII0O0OIo iii0o0oio = this.I00000oOI;
/* 30 */            return this.I0000Il00O.hashCode() ^ (((iHashCode * 1000003) ^ (iii0o0oio == null ? 0 : iii0o0oio.hashCode())) * 1000003);
                }

                public final String toString() {
/* 1 */             ioIl00 ioil00 = this.I0000Il00O;
/* 3 */             iII0O0OIo iii0o0oio = this.I00000oOI;
/* 7 */             String string = this.I00000oIO.toString();
/* 11 */            String strValueOf = String.valueOf(iii0o0oio);
/* 31 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("ImageDescriptionResult{descriptions=", string, ", inferenceEventTraceResult=", strValueOf, ", scores="), ioil00.toString(), "}");
                }
            }
