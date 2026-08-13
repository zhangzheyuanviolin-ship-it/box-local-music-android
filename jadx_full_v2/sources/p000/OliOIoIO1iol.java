            package p000;

            import java.lang.reflect.Method;
            import java.util.concurrent.LinkedBlockingQueue;
            
            public final class OliOIoIO1iol implements O1I1OOiol {
                public String I00iOIl;
                public volatile O1I1OOiol I00iiI;
                public Boolean I00iiO;
                public Method I00iio;
                public Il10o1 I00ilI0I1;
                public LinkedBlockingQueue I00ilO0;
                public boolean I00io1l;

                @Override
                public final boolean I00000oIO() {
/* 5 */             return I00111O().I00000oIO();
                }

                @Override
                public final boolean I00000oOI() {
/* 5 */             return I00111O().I00000oOI();
                }

                @Override
                public final void I0000Il00O(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th) {
/* 5 */             I00111O().I0000Il00O(o1Ol1o1Io1o, str, th);
                }

                @Override
                public final boolean I0000O() {
/* 5 */             return I00111O().I0000O();
                }

                @Override
                public final boolean I0000oI00() {
/* 5 */             return I00111O().I0000oI00();
                }

                @Override
                public final boolean I0001Ioi1lo(O1Ol1o1Io1o o1Ol1o1Io1o) {
/* 5 */             return I00111O().I0001Ioi1lo(o1Ol1o1Io1o);
                }

                @Override
                public final boolean I000II() {
/* 5 */             return I00111O().I000II();
                }

                @Override
                public final void I000O01llI0(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th) {
/* 5 */             I00111O().I000O01llI0(o1Ol1o1Io1o, str, th);
                }

                @Override
                public final boolean I000OOo1O(O1Ol1o1Io1o o1Ol1o1Io1o) {
/* 5 */             return I00111O().I000OOo1O(o1Ol1o1Io1o);
                }

                @Override
                public final void I000OiO(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th) {
/* 5 */             I00111O().I000OiO(o1Ol1o1Io1o, str, th);
                }

                @Override
                public final void I000iOII(String str, Throwable th) {
/* 5 */             I00111O().I000iOII(str, th);
                }

                @Override
                public final void I000l1(String str) {
/* 5 */             I00111O().I000l1(str);
                }

                @Override
                public final boolean I000lI(O1Ol1o1Io1o o1Ol1o1Io1o) {
/* 5 */             return I00111O().I000lI(o1Ol1o1Io1o);
                }

                @Override
                public final void I000o00OoI0I(String str) {
/* 5 */             I00111O().I000o00OoI0I(str);
                }

                @Override
                public final void I000oI1ioi(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th) {
/* 5 */             I00111O().I000oI1ioi(o1Ol1o1Io1o, str, th);
                }

                @Override
                public final boolean I00100l0(int i) {
/* 5 */             return I00111O().I00100l0(i);
                }

                @Override
                public final boolean I00100o1O0lo(O1Ol1o1Io1o o1Ol1o1Io1o) {
/* 5 */             return I00111O().I00100o1O0lo(o1Ol1o1Io1o);
                }

                @Override
                public final void I0010I0i(O1Ol1o1Io1o o1Ol1o1Io1o, String str, Throwable th) {
/* 5 */             I00111O().I0010I0i(o1Ol1o1Io1o, str, th);
                }

                @Override
                public final boolean I0010o(O1Ol1o1Io1o o1Ol1o1Io1o) {
/* 5 */             return I00111O().I0010o(o1Ol1o1Io1o);
                }

                public final O1I1OOiol I00111O() {
/* 3 */             if (this.I00iiI != null) {
/* 5 */                 return this.I00iiI;
                    }
/* 10 */            if (this.I00io1l) {
/* 12 */                return OI1IIO.I00iOIl;
                    }
/* 15 */            Il10o1 il10o1 = this.I00ilI0I1;
/* 17 */            if (il10o1 != null) {
/* 113 */               return il10o1;
                    }
/* 21 */            LinkedBlockingQueue linkedBlockingQueue = this.I00ilO0;
/* 23 */            Il10o1 il10o12 = new Il10o1();
/* 26 */            il10o12.I00iOIl = this;
/* 28 */            il10o12.I00iiI = linkedBlockingQueue;
/* 30 */            this.I00ilI0I1 = il10o12;
/* 113 */           return il10o12;
                }

                public final boolean I001IIilI0O() {
                    Boolean bool;
/* 1 */             Boolean bool2 = this.I00iiO;
/* 3 */             if (bool2 != null) {
/* 5 */                 return bool2.booleanValue();
                    }
                    try {
/* 28 */                this.I00iio = this.I00iiI.getClass().getMethod("log", OliOO0Oo1.class);
/* 30 */                bool = Boolean.TRUE;
/* 32 */                this.I00iiO = bool;
                    } catch (NoSuchMethodException unused) {
/* 35 */                bool = Boolean.FALSE;
/* 37 */                this.I00iiO = bool;
                    }
/* 39 */            return bool.booleanValue();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return obj != null && OliOIoIO1iol.class == obj.getClass() && this.I00iOIl.equals(((OliOIoIO1iol) obj).I00iOIl);
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }
            }
