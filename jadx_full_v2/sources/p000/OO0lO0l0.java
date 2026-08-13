            package p000;
            
            public final class OO0lO0l0 extends OO0lili implements IOlIlOi10lO, IOlIOlli0I {
                public static final OO0lO0l0 I00iio = new OO0lO0l0(OoIiIlIo.I0000oI00, 0);

                @Override
                public final OO0lo1Ooo I000II() {
/* 3 */             OO0lIolol110 oO0lIolol110 = new OO0lIolol110(this);
/* 6 */             oO0lIolol110.I00io1l = this;
/* 20 */            return oO0lIolol110;
                }

                @Override
                public final OO0lo1Ooo I000O01llI0() {
/* 3 */             OO0lIolol110 oO0lIolol110 = new OO0lIolol110(this);
/* 6 */             oO0lIolol110.I00io1l = this;
/* 20 */            return oO0lIolol110;
                }

                public final OO0lO0l0 I000OiO(OOiIOoiOO oOiIOoiOO, OoloiloOIo ooloiloOIo) {
/* 8 */             O1I1OO o1i1ooI001IIilI0O = this.I00iOIl.I001IIilI0O(oOiIOoiOO, oOiIOoiOO.hashCode(), 0, ooloiloOIo);
                    return o1i1ooI001IIilI0O == null ? this : new OO0lO0l0((OoIiIlIo) o1i1ooI001IIilI0O.I00iiO, this.I00iiI + o1i1ooI001IIilI0O.I00iiI);
                }

                @Override
                public final Object I00iIO(OOiIOoiOO oOiIOoiOO) {
/* 1 */             return iililIiIiO.I00000oIO(this, oOiIOoiOO);
                }

                @Override
                public final boolean containsKey(Object obj) {
/* 3 */             if (obj instanceof OOiIOoiOO) {
/* 9 */                 return super.containsKey((OOiIOoiOO) obj);
                    }
/* 5 */             return false;
                }

                @Override
                public final boolean containsValue(Object obj) {
/* 3 */             if (obj instanceof OoloiloOIo) {
/* 9 */                 return super.containsValue((OoloiloOIo) obj);
                    }
/* 5 */             return false;
                }

                @Override
                public final Object get(Object obj) {
/* 3 */             if (obj instanceof OOiIOoiOO) {
/* 13 */                return (OoloiloOIo) super.get((OOiIOoiOO) obj);
                    }
/* 5 */             return null;
                }

                @Override
                public final Object getOrDefault(Object obj, Object obj2) {
                    return !(obj instanceof OOiIOoiOO) ? obj2 : (OoloiloOIo) super.getOrDefault((OOiIOoiOO) obj, (OoloiloOIo) obj2);
                }
            }
