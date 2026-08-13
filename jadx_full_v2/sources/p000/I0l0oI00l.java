            package p000;
            
            public final class I0l0oI00l implements OiOiliiO {
                public final int I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;

                public I0l0oI00l(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final float I00000oIO(float f) {
                    switch (this.I00000oIO) {
                        case 0:
/* 139 */                   I0l10OiIOil i0l10OiIOil = (I0l10OiIOil) this.I00000oOI;
/* 143 */                   float fI0000oI00 = i0l10OiIOil.I010OIo1l.I0000oI00(f);
/* 157 */                   float fI000II = fI0000oI00 - ((OIooO1iiliI) i0l10OiIOil.I010OIo1l.I000l1).I000II();
/* 2 */                     ((I0l1I0I0i10I) this.I0000Il00O).I00000oIO(fI0000oI00, 0.0f);
/* 166 */                   return fI000II;
                        case 1:
/* 77 */                    Oii00o1ll oii00o1ll = (Oii00o1ll) this.I00000oOI;
/* 85 */                    if (Math.abs(f) == 0.0f || ((Boolean) oii00o1ll.I000O01llI0.invoke()).booleanValue()) {
/* 123 */                       return oii00o1ll.I0000oI00(oii00o1ll.I000O01llI0(((OiOol0il0il) this.I0000Il00O).I00000oIO(2, oii00o1ll.I0001Ioi1lo(oii00o1ll.I000OOo1O(f)))));
                            }
/* 136 */                   throw new IlOO00ooliO("The fling animation was cancelled", 0);
                        default:
/* 11 */                    I0l1OOl1l10 i0l1OOl1l10 = ((Ol010000lo00) this.I00000oOI).I0000oI00;
/* 53 */                    float fI00000oOI = lIiioliIlo.I00000oOI((Float.isNaN(((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II()) ? 0.0f : ((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II()) + f, i0l1OOl1l10.I0000Il00O().I0000oI00(), i0l1OOl1l10.I0000Il00O().I0000O());
/* 65 */                    float fI000II2 = fI00000oOI - ((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II();
/* 2 */                     ((I0l1I0I0i10I) this.I0000Il00O).I00000oIO(fI00000oOI, 0.0f);
/* 74 */                    return fI000II2;
                    }
                }
            }
