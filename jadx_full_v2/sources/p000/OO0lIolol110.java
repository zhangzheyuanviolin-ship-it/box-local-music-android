            package p000;
            
            public final class OO0lIolol110 extends OO0lo1Ooo {
                public OO0lO0l0 I00io1l;

                @Override
                public final OO0lO0l0 I00000oOI() {
/* 1 */             OoIiIlIo ooIiIlIo = this.I00iiO;
/* 3 */             OO0lO0l0 oO0lO0l0 = this.I00io1l;
/* 7 */             if (ooIiIlIo != oO0lO0l0.I00iOIl) {
/* 17 */                this.I00iiI = new lOOlOoll(13);
/* 25 */                oO0lO0l0 = new OO0lO0l0(this.I00iiO, this.I00ilO0);
                    }
/* 28 */            this.I00io1l = oO0lO0l0;
/* 55 */            return oO0lO0l0;
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

                @Override
                public final Object remove(Object obj) {
/* 3 */             if (obj instanceof OOiIOoiOO) {
/* 13 */                return (OoloiloOIo) super.remove((OOiIOoiOO) obj);
                    }
/* 5 */             return null;
                }
            }
