            package p000;

            import java.io.InputStream;
            
/* 8 */     public final class I1ll1oI implements I00O10llo {
                public final int I00iOIl = 1;
                public Object I00iiI;

                public I1ll1oI(I00Ol00 i00Ol00) {
/* 7 */             this.I00iiI = i00Ol00;
                }

                public static I1ll1ioil I00000oIO(I00Ol00 i00Ol00) {
/* 13 */            return new I1ll1ioil(lOOllo00lO.I00000oIO(new IOo10oliiI(i00Ol00)), null);
                }

                @Override
                public final InputStream I00000oOI() {
                    switch (this.I00iOIl) {
                        case 0:
/* 17 */                    return new IOo10oliiI((I00Ol00) this.I00iiI);
                        default:
/* 8 */                     return (IiIiIOo) this.I00iiI;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
                
                    r3 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
                
                    p000.I000II.I000lI("IOException converting stream to byte array: ", r3.getMessage(), r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
                
                    r3 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
                
                    p000.I000II.I000lI("IOException converting stream to byte array: ", r3.getMessage(), r3);
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final I00OIO1 I0000O() {
                    switch (this.I00iOIl) {
                    }
/* 3 */             return null;
                }

                @Override
                public final I00OIO1 I000OiO() {
                    switch (this.I00iOIl) {
                        case 0:
/* 24 */                    return I00000oIO((I00Ol00) this.I00iiI);
                        default:
/* 16 */                    return new Ii0oii1lIil(((IiIiIOo) this.I00iiI).I0000Il00O());
                    }
                }

/* 9 */         public I1ll1oI() {
                }
            }
