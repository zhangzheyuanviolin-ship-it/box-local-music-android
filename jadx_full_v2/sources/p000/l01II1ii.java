            package p000;

            import java.util.Iterator;
            
            public abstract class l01II1ii {
                public static boolean I00000oIO(IIiIoIl11IO iIiIoIl11IO, IIiIoIl11IO iIiIoIl11IO2) {
/* 3 */             if (!(iIiIoIl11IO2 instanceof O00loo1i111O) || !(iIiIoIl11IO instanceof Illlil)) {
/* 96 */                return false;
                    }
/* 11 */            O00loo1i111O o00loo1i111O = (O00loo1i111O) iIiIoIl11IO2;
/* 17 */            o00loo1i111O.I00Iooi00oi().size();
/* 20 */            Illlil illlil = (Illlil) iIiIoIl11IO;
/* 26 */            illlil.I00Iooi00oi().size();
/* 53 */            Iterator it = IOOi0Ool1i.I00ilO0(o00loo1i111O.I00000oIO().I00Iooi00oi(), illlil.I010i10l().I00Iooi00oi()).iterator();
/* 61 */            while (it.hasNext()) {
/* 67 */                OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it.next();
/* 92 */                if ((I00000oOI((Illlil) iIiIoIl11IO2, (Ooo00oi0O) oIoi0IIoi.I00iOIl) instanceof O0IO10lo0oi) != (I00000oOI(illlil, (Ooo00oi0O) oIoi0IIoi.I00iiI) instanceof O0IO10lo0oi)) {
/* 94 */                    return true;
                        }
                    }
/* 96 */            return false;
                }

                /* JADX WARN: Code restructure failed: missing block: B:48:0x00e8, code lost:
                
                    if (p000.IiOiOOIo.I000II(r0).equals(p000.IiOiOOIo.I000II(r1)) == false) goto L51;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static O0IOO1lIiOl I00000oOI(Illlil illlil, Ooo00oi0O ooo00oi0O) {
                    Illlil illlilI00000oIO;
/* 20 */            if (!O0000Ioio00.I0000O(((Ii1Ooli) illlil).getName().I00000oOI(), "remove") || illlil.I00Iooi00oi().size() != 1 || (IiOiOOIo.I000OOo1O(illlil).I000lI() instanceof O0l1i0l) || O0i1lI0o1io.I001l0I00(illlil)) {
/* 165 */               if (illlil.I00Iooi00oi().size() == 1) {
/* 168 */                   Ii1Ool1 ii1Ool1I000lI = illlil.I000lI();
/* 179 */                   OI000ilOol oI000ilOol = ii1Ool1I000lI instanceof OI000ilOol ? (OI000ilOol) ii1Ool1I000lI : null;
/* 180 */                   if (oI000ilOol != null) {
/* 201 */                       IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ((Ooo00oi0O) IOOi0Ool1i.I00OilO00Il(illlil.I00Iooi00oi())).getType().I00iOIl().I00100o1O0lo();
/* 210 */                       OI000ilOol oI000ilOol2 = iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo : null;
/* 212 */                       if (oI000ilOol2 != null) {
/* 219 */                           if (O0i1lI0o1io.I00111O(oI000ilOol) != null) {
                                    }
                                }
                            }
                        }
/* 252 */               return l1OOo1o1l.I0000Il00O(ooo00oi0O.getType());
                    }
/* 70 */            O0IOO1lIiOl o0IOO1lIiOlI0000Il00O = l1OOo1o1l.I0000Il00O(((Ooo00oi0O) IOOi0Ool1i.I00OilO00Il(illlil.I010i10l().I00Iooi00oi())).getType());
/* 81 */            O0IO10lo0oi o0IO10lo0oi = o0IOO1lIiOlI0000Il00O instanceof O0IO10lo0oi ? (O0IO10lo0oi) o0IOO1lIiOlI0000Il00O : null;
/* 90 */            if ((o0IO10lo0oi != null ? o0IO10lo0oi.I000OOo1O : null) == O0I1lo0l.INT && (illlilI00000oIO = IIIOol.I00000oIO(illlil)) != null) {
/* 118 */               O0IOO1lIiOl o0IOO1lIiOlI0000Il00O2 = l1OOo1o1l.I0000Il00O(((Ooo00oi0O) IOOi0Ool1i.I00OilO00Il(illlilI00000oIO.I010i10l().I00Iooi00oi())).getType());
/* 138 */               if (!IiOiIO0i1Oil.I0001Ioi1lo(illlilI00000oIO.I000lI()).equals(OlIllOO11lOl.I00Io1lO.I00000oIO) || !(o0IOO1lIiOlI0000Il00O2 instanceof O0IO0lIIoio) || !((O0IO0lIIoio) o0IOO1lIiOlI0000Il00O2).I000OOo1O.equals("java/lang/Object")) {
                        }
                    }
/* 243 */           return l1OOo1o1l.I0000Il00O(OoOilo0Oliii.I000II(ooo00oi0O.getType()));
                }
            }
