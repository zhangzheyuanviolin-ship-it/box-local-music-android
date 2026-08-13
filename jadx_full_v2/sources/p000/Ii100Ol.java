            package p000;

            import java.io.Serializable;
            import kotlin.jvm.functions.Function1;
            
            public final class Ii100Ol extends il01lilooO {
                public final int I00000oIO;
                public Object I00000oOI;
                public Serializable I0000Il00O;

                @Override
                public void I00000oIO(Object obj) {
                    switch (this.I00000oIO) {
                        case 1:
/* 7 */                     IIiO00o1o iIiO00o1o = (IIiO00o1o) obj;
/* 11 */                    OOo0ooi oOo0ooi = (OOo0ooi) this.I0000Il00O;
/* 15 */                    if (oOo0ooi.I00iOIl == null && ((Boolean) ((Function1) this.I00000oOI).invoke(iIiO00o1o)).booleanValue()) {
/* 33 */                        oOo0ooi.I00iOIl = iIiO00o1o;
                                break;
                            }
                            break;
                    }
                }

                @Override
                public final boolean I00000oOI(Object obj) {
                    switch (this.I00000oIO) {
                        case 0:
/* 120 */                   boolean[] zArr = (boolean[]) this.I0000Il00O;
/* 136 */                   if (((Boolean) ((Function1) this.I00000oOI).invoke(obj)).booleanValue()) {
/* 138 */                       zArr[0] = true;
                            }
                            break;
                        case 1:
/* 114 */                   if (((OOo0ooi) this.I0000Il00O).I00iOIl == null) {
                                break;
                            }
                            break;
                        default:
/* 8 */                     OI000ilOol oI000ilOol = (OI000ilOol) obj;
/* 12 */                    OOo0ooi oOo0ooi = (OOo0ooi) this.I0000Il00O;
/* 16 */                    String str = (String) this.I00000oOI;
/* 18 */                    String str2 = O00oO0liO11.I00000oIO;
/* 26 */                    IOIOill iOIOillI000O01llI0 = O00oO0liO11.I000O01llI0(IiOiOOIo.I000II(oI000ilOol).I00000oIO);
/* 45 */                    String strI000oI1ioi = IIlIOloOOO.I000oI1ioi('.', iOIOillI000O01llI0 != null ? O0I0oiO1I.I0000oI00(iOIOillI000O01llI0) : il0oill0io.I00000oIO(oI000ilOol, lOOlOoll.I00ioIO), str);
/* 55 */                    if (O0I0lii0l0.I00000oOI.contains(strI000oI1ioi)) {
/* 59 */                        oOo0ooi.I00iOIl = O0I0i0ilo.I00iOIl;
                            } else if (O0I0lii0l0.I0000O.contains(strI000oI1ioi)) {
/* 72 */                        oOo0ooi.I00iOIl = O0I0i0ilo.I00iiI;
                            } else if (O0I0lii0l0.I0000Il00O.contains(strI000oI1ioi)) {
/* 85 */                        oOo0ooi.I00iOIl = O0I0i0ilo.I00iiO;
                            } else if (O0I0lii0l0.I00000oIO.contains(strI000oI1ioi)) {
/* 98 */                        oOo0ooi.I00iOIl = O0I0i0ilo.I00ilI0I1;
                            }
/* 102 */                   if (oOo0ooi.I00iOIl == null) {
                                break;
                            }
                            break;
                    }
/* 4 */             return true;
                }

                @Override
                public final Object I0000Il00O() {
                    switch (this.I00000oIO) {
                        case 0:
/* 35 */                    return Boolean.valueOf(((boolean[]) this.I0000Il00O)[0]);
                        case 1:
/* 25 */                    return (IIiO00o1o) ((OOo0ooi) this.I0000Il00O).I00iOIl;
                        default:
/* 12 */                    O0I0i0ilo o0I0i0ilo = (O0I0i0ilo) ((OOo0ooi) this.I0000Il00O).I00iOIl;
                            return o0I0i0ilo == null ? O0I0i0ilo.I00iio : o0I0i0ilo;
                    }
                }
            }
