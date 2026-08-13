            package p000;
            
            public final class O0lo1OiliO implements O0lo0l {
                public IiO0o1I I00000oIO;
                public O0o0I1i0O I00000oOI;
                public boolean I0000Il00O;

                @Override
                public final int I00000oIO() {
/* 1 */             O0o0I1i0O o0o0I1i0O = this.I00000oOI;
/* 27 */            return (int) (o0o0I1i0O.I000OiO().I00100l0 == OIilII.I00iOIl ? o0o0I1i0O.I000OiO().I000OOo1O() & 4294967295L : o0o0I1i0O.I000OiO().I000OOo1O() >> 32);
                }

                @Override
                public final float I00000oOI() {
/* 1 */             O0o0I1i0O o0o0I1i0O = this.I00000oOI;
/* 14 */            return (o0o0I1i0O.I000O01llI0() * 500) + o0o0I1i0O.I000OOo1O();
                }

                @Override
                public final Object I0000Il00O(int i, I1oO0ooi001 i1oO0ooi001) throws Throwable {
/* 1 */             O0o0I1i0O o0o0I1i0O = this.I00000oOI;
/* 3 */             IoloOio0I ioloOio0I = O0o0I1i0O.I001iOo1i0O;
/* 5 */             o0o0I1i0O.getClass();
/* 17 */            Object objI0000Il00O = o0o0I1i0O.I0000Il00O(OI110lo.I00iOIl, new IoI0i1110(o0o0I1i0O, i, 0, null), i1oO0ooi001);
/* 21 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 23 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 25 */            if (objI0000Il00O != ii0111o) {
/* 28 */                objI0000Il00O = ooiIlOl1iI;
                    }
                    return objI0000Il00O == ii0111o ? objI0000Il00O : ooiIlOl1iI;
                }

                @Override
                public final int I0000O() {
/* 1 */             O0o0I1i0O o0o0I1i0O = this.I00000oOI;
/* 16 */            return (-o0o0I1i0O.I000OiO().I000lI) + o0o0I1i0O.I000OiO().I00100o1O0lo;
                }

                @Override
                public final float I0000oI00() {
/* 1 */             O0o0I1i0O o0o0I1i0O = this.I00000oOI;
/* 3 */             int iI000O01llI0 = o0o0I1i0O.I000O01llI0();
/* 7 */             int iI000OOo1O = o0o0I1i0O.I000OOo1O();
                    return o0o0I1i0O.I0000O() ? (iI000O01llI0 * 500) + iI000OOo1O + 100.0f : (iI000O01llI0 * 500) + iI000OOo1O;
                }

                @Override
                public final IOOOoII1O I0001Ioi1lo() {
/* 1 */             boolean z = this.I0000Il00O;
/* 3 */             IiO0o1I iiO0o1I = this.I00000oIO;
                    return z ? new IOOOoII1O(((Number) iiO0o1I.getValue()).intValue(), 1) : new IOOOoII1O(1, ((Number) iiO0o1I.getValue()).intValue());
                }
            }
