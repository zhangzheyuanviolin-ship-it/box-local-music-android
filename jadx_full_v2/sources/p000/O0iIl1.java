            package p000;

            import java.util.List;
            
            public abstract class O0iIl1 implements I1110ii00, O0iIo0i1 {
                public int I00iOIl;

                public abstract O1iil1I01o I00IoiI();

                public abstract List I00OIl();

                public abstract OoOI1i1i I00OloOo();

                public abstract OoOIOoO1I I00iOIl();

                public abstract boolean I00iiI();

                public abstract O0iIl1 I00l0I0l0lO1(O0iIoIOO0O0 o0iIoIOO0O0);

                public abstract Ooioo0o1l0 I00l0OO0IO();

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 37 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0iIl1)) {
/* 39 */                return false;
                    }
/* 13 */            O0iIl1 o0iIl1 = (O0iIl1) obj;
/* 19 */            if (I00iiI() == o0iIl1.I00iiI()) {
                        return iOI0lOI1.I00000oOI(o0llIi.I00io1l, I00l0OO0IO(), o0iIl1.I00l0OO0IO());
                    }
/* 39 */            return false;
                }

                @Override
                public final I11IlOOO getAnnotations() {
                    I11IlOOO i11IlOOO;
/* 1 */             OoOI1i1i ooOI1i1iI00OloOo = I00OloOo();
/* 5 */             IIi0oIl iIi0oIl = I11O0o0loi.I00000oOI;
/* 10 */            O0O00I1Ili o0O00I1Ili = I11O0o0loi.I00000oIO[0];
/* 16 */            I11O0Ol i11O0Ol = (I11O0Ol) iIi0oIl.I000O01llI0(ooOI1i1iI00OloOo);
                    return (i11O0Ol == null || (i11IlOOO = i11O0Ol.I00000oIO) == null) ? i1i0olI.I00iiO : i11IlOOO;
                }

                public final int hashCode() {
                    int iHashCode;
/* 1 */             int i = this.I00iOIl;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 10 */            if (l0loOi1ol11o.I00000oIO(this)) {
/* 12 */                iHashCode = super.hashCode();
                    } else {
/* 42 */                iHashCode = (I00iiI() ? 1 : 0) + ((I00OIl().hashCode() + (I00iOIl().hashCode() * 31)) * 31);
                    }
/* 43 */            this.I00iOIl = iHashCode;
/* 113 */           return iHashCode;
                }
            }
