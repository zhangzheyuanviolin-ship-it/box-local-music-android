            package p000;

            import java.util.Calendar;
            import java.util.GregorianCalendar;
            
            public final class OIOi011lO implements OoO00iO0OOl0 {
                public final int I00iOIl;
                public OoO00O1IiOl I00iiI;

                public OIOi011lO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
                    switch (this.I00iOIl) {
                        case 0:
/* 27 */                    if (ooOilO.I00000oIO == Number.class) {
/* 32 */                        return (OIOi01I) this.I00iiI;
                            }
/* 3 */                     return null;
                        default:
/* 7 */                     Class cls = ooOilO.I00000oIO;
/* 11 */                    if (cls == Calendar.class || cls == GregorianCalendar.class) {
/* 20 */                        return (O00o1O0I01II) this.I00iiI;
                            }
/* 3 */                     return null;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 1:
/* 58 */                    return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((O00o1O0I01II) this.I00iiI) + "]";
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
