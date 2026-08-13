            package p000;
            
            public abstract class iOIoOiOo {
                public static final IOO0o0I1l I0000O = new IOO0o0I1l(19);
                public final iOIoOiOo I00000oIO;
                public final Ol0Ii10o1 I00000oOI;
                public boolean I0000Il00O = false;

                public iOIoOiOo(iOIoOiOo ioiooioo, Ol0Ii10o1 ol0Ii10o1) {
/* 7 */             if (ioiooioo != null && !ioiooioo.I0000Il00O) {
/* 14 */                OIiilo1Ool0o.I00100o1O0lo();
/* 18 */                throw null;
                    }
/* 19 */            this.I00000oIO = ioiooioo;
/* 21 */            this.I00000oOI = ol0Ii10o1;
                }

                public final boolean I00000oIO() {
/* 9 */             if (this.I00000oOI.containsKey(I0000O)) {
/* 24 */                return true;
                    }
/* 11 */            iOIoOiOo ioiooioo = this.I00000oIO;
                    return ioiooioo != null && ioiooioo.I00000oIO();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SpanExtras<");
/* 9 */             for (iOIoOiOo ioiooioo = this; ioiooioo != null; ioiooioo = ioiooioo.I00000oIO) {
/* 16 */                for (int i = 0; i < ioiooioo.I00000oOI.I00iiO; i++) {
/* 20 */                    sb.append("[");
/* 29 */                    sb.append(this.I00000oOI.I000OiO(i));
/* 34 */                    sb.append("], ");
                        }
                    }
/* 45 */            sb.append(">");
/* 48 */            return sb.toString();
                }
            }
