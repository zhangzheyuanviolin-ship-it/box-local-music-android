            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class OloOO10o extends OIIl1OIol {
                public String I000II;

                public OloOO10o(String str) {
/* 4 */             this.I000II = str;
                }

                @Override
                public final void I00000oIO(O1I1OO o1i1oo) {
/* 3 */             if (o1i1oo.I00iiI == 0) {
/* 7 */                 I1lOollOi1o i1lOollOi1o = (I1lOollOi1o) o1i1oo.I00iiO;
/* 9 */                 String str = this.I000II;
/* 11 */                List listI0000O = I0000O();
/* 31 */                OlIIOI0o olIIOI0o = listI0000O.size() == 1 ? (OlIIOI0o) listI0000O.get(0) : null;
/* 32 */                IOO000ilo iOO000ilo = i1lOollOi1o.I00000oIO;
/* 34 */                iOO000ilo.getClass();
/* 37 */                if (str == null) {
/* 179 */                   IOOlIIilOl0.I000II("input must not be null");
/* 186 */                   return;
                        }
/* 43 */                O0ooioii0o o0ooioii0o = new O0ooioii0o();
/* 46 */                o0ooioii0o.I00ilI0I1 = iOO000ilo;
/* 48 */                o0ooioii0o.I00iiI = null;
/* 50 */                o0ooioii0o.I00iiO = 0;
/* 52 */                o0ooioii0o.I00iio = 0;
/* 54 */                o0ooioii0o.I00iOIl = str;
/* 56 */                VarHandle.storeStoreFence();
/* 59 */                O0ool0ol11o1 o0ool0ol11o1 = new O0ool0ol11o1();
/* 62 */                o0ool0ol11o1.I00iiO = 0;
/* 64 */                o0ool0ol11o1.I00iio = null;
/* 66 */                o0ool0ol11o1.I00iOIl = str;
/* 68 */                o0ool0ol11o1.I00iiI = o0ooioii0o;
/* 70 */                VarHandle.storeStoreFence();
/* 73 */                OloOO10o oloOO10o = this;
/* 78 */                while (o0ool0ol11o1.hasNext()) {
/* 84 */                    OlIIi101 olIIi101 = (OlIIi101) o0ool0ol11o1.next();
/* 86 */                    if (oloOO10o == this && !o0ool0ol11o1.hasNext() && !(olIIi101 instanceof O1001lIo)) {
/* 186 */                       return;
                            }
/* 99 */                    int beginIndex = olIIi101.getBeginIndex();
/* 103 */                   int endIndex = olIIi101.getEndIndex();
/* 113 */                   OloOO10o oloOO10o2 = new OloOO10o(str.substring(beginIndex, endIndex));
/* 116 */                   if (olIIOI0o != null) {
/* 125 */                       oloOO10o2.I00000oOI(OlIIOI0o.I00000oIO(olIIOI0o.I00000oIO, beginIndex, endIndex - beginIndex));
                            }
/* 130 */                   if (olIIi101 instanceof O1001lIo) {
/* 134 */                       String strI000o00OoI0I = oloOO10o2.I000II;
/* 140 */                       if (((O1001lIo) olIIi101).I00000oIO == O1001oo.I00iiI) {
/* 144 */                           strI000o00OoI0I = IIl001iO0Io.I000o00OoI0I("mailto:", strI000o00OoI0I);
                                }
/* 150 */                       OIIl1OIol o0ooOoi1Oo1 = new O0ooOoi1Oo1(strI000o00OoI0I, null);
/* 153 */                       o0ooOoi1Oo1.I0000Il00O(oloOO10o2);
/* 160 */                       o0ooOoi1Oo1.I000II(oloOO10o2.I0000O());
/* 163 */                       oloOO10o.I0000oI00(o0ooOoi1Oo1);
/* 166 */                       oloOO10o = o0ooOoi1Oo1;
                            } else {
/* 168 */                       oloOO10o.I0000oI00(oloOO10o2);
/* 171 */                       oloOO10o = oloOO10o2;
                            }
                        }
/* 173 */               I000OOo1O();
                    }
                }

                @Override
                public final String I000O01llI0() {
/* 13 */            return "literal=" + this.I000II;
                }
            }
