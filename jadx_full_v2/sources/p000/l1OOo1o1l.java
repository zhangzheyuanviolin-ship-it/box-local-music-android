            package p000;

            import java.util.Iterator;
            
            public abstract class l1OOo1o1l {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static String I00000oIO(Illlil illlil, int i) {
/* 9 */             boolean z = (i & 1) != 0;
/* 12 */            boolean z2 = (i & 2) != 0;
/* 17 */            StringBuilder sb = new StringBuilder();
/* 20 */            if (z2) {
/* 40 */                sb.append(illlil instanceof IOo1IIOOiO1o ? "<init>" : ((Ii1Ooli) illlil).getName().I00000oOI());
                    }
/* 45 */            sb.append("(");
/* 48 */            O0ioOi0Oo1ii o0ioOi0Oo1iiI00OOll1 = illlil.I00OOll1();
/* 52 */            if (o0ioOi0Oo1iiI00OOll1 != null) {
/* 62 */                sb.append(I0000Il00O(o0ioOi0Oo1iiI00OOll1.getType()));
                    }
/* 69 */            Iterator it = illlil.I00Iooi00oi().iterator();
/* 77 */            while (it.hasNext()) {
/* 93 */                sb.append(I0000Il00O(((Ooo00oi0O) it.next()).getType()));
                    }
/* 99 */            sb.append(")");
/* 102 */           if (z) {
/* 106 */               if (illlil instanceof IOo1IIOOiO1o) {
/* 139 */                   sb.append("V");
                        } else {
/* 109 */                   O0iIl1 o0iIl1I0001Ioi1lo = illlil.I0001Ioi1lo();
/* 113 */                   OI1Iio0ii1 oI1Iio0ii1 = O0i1lI0o1io.I0000oI00;
/* 121 */                   if (!O0i1lI0o1io.I00II0Ol1O0l(o0iIl1I0001Ioi1lo, OlIllOO11lOl.I0000O) || OoOilo0Oliii.I0000oI00(illlil.I0001Ioi1lo()) || (illlil instanceof OOOOI1ioIo)) {
/* 151 */                       sb.append(I0000Il00O(illlil.I0001Ioi1lo()));
                            }
                        }
                    }
/* 154 */           return sb.toString();
                }

                public static final String I00000oOI(IIiIoIl11IO iIiIoIl11IO) {
/* 6 */             if (!IiOiIO0i1Oil.I000lI(iIiIoIl11IO)) {
/* 9 */                 Ii1Ool1 ii1Ool1I000lI = iIiIoIl11IO.I000lI();
/* 20 */                OI000ilOol oI000ilOol = ii1Ool1I000lI instanceof OI000ilOol ? (OI000ilOol) ii1Ool1I000lI : null;
/* 21 */                if (oI000ilOol != null && !oI000ilOol.getName().I00iiI) {
/* 33 */                    IIiIoIl11IO iIiIoIl11IOI010i10l = iIiIoIl11IO.I010i10l();
/* 44 */                    Ol0IioOo ol0IioOo = iIiIoIl11IOI010i10l instanceof Ol0IioOo ? (Ol0IioOo) iIiIoIl11IOI010i10l : null;
/* 45 */                    if (ol0IioOo != null) {
/* 49 */                        String strI00000oIO = I00000oIO(ol0IioOo, 3);
/* 53 */                        String str = O00oO0liO11.I00000oIO;
/* 61 */                        IOIOill iOIOillI000O01llI0 = O00oO0liO11.I000O01llI0(IiOiOOIo.I000II(oI000ilOol).I00000oIO);
/* 80 */                        return IIlIOloOOO.I000oI1ioi('.', iOIOillI000O01llI0 != null ? O0I0oiO1I.I0000oI00(iOIOillI000O01llI0) : il0oill0io.I00000oIO(oI000ilOol, lOOlOoll.I00ioIO), strI00000oIO);
                            }
                        }
                    }
/* 5 */             return null;
                }

                public static final O0IOO1lIiOl I0000Il00O(O0iIl1 o0iIl1) {
/* 9 */             return (O0IOO1lIiOl) il0oill0io.I00000oOI(o0iIl1, OoOOO1O.I000OOo1O, IOilI1lIII1.I00iiO);
                }
            }
