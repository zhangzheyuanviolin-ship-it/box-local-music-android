            package p000;

            import java.util.Calendar;
            import java.util.GregorianCalendar;
            
            public final class loiI111o implements llOo0OilI {
                public final int I00iOIl;
                public llOl001olOi I00iiI;

                public loiI111o(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final llOl001olOi I00000oIO(I1ii1o0 i1ii1o0, o0IOi0io1iOo o0ioi0io1ioo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 27 */                    if (o0ioi0io1ioo.I00000oIO == Number.class) {
/* 32 */                        return (loiIi00o0I0) this.I00iiI;
                            }
/* 3 */                     return null;
                        default:
/* 7 */                     Class cls = o0ioi0io1ioo.I00000oIO;
/* 11 */                    if (cls == Calendar.class || cls == GregorianCalendar.class) {
/* 20 */                        return (o01o01o00I) this.I00iiI;
                            }
/* 3 */                     return null;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 1:
/* 13 */                    o01o01o00I o01o01o00i = (o01o01o00I) this.I00iiI;
/* 17 */                    String name = Calendar.class.getName();
/* 23 */                    String name2 = GregorianCalendar.class.getName();
/* 27 */                    String strValueOf = String.valueOf(o01o01o00i);
/* 31 */                    int length = name.length();
/* 53 */                    StringBuilder sb = new StringBuilder(length + 14 + name2.length() + 9 + strValueOf.length() + 1);
/* 60 */                    IIl001iO0Io.I001lIiIIo1O(sb, "Factory[type=", name, "+", name2);
/* 67 */                    return IIlIOloOOO.I0010I0i(sb, ",adapter=", strValueOf, "]");
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
