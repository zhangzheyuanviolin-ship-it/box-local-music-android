            package p000;
            
            public final class Iol0l0Oo0i extends OoOiiO01illo {
                public final OoOOiO[] I00000oOI;
                public final OoOi1Ol[] I0000Il00O;
                public final boolean I0000O;

                public Iol0l0Oo0i(OoOOiO[] ooOOiOArr, OoOi1Ol[] ooOi1OlArr, boolean z) {
/* 4 */             this.I00000oOI = ooOOiOArr;
/* 6 */             this.I0000Il00O = ooOi1OlArr;
/* 8 */             this.I0000O = z;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final OoOi1Ol I0000O(O0iIl1 o0iIl1) {
/* 5 */             IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 17 */            OoOOiO ooOOiO = iOIiO1lIl0lI00100o1O0lo instanceof OoOOiO ? (OoOOiO) iOIiO1lIl0lI00100o1O0lo : null;
/* 18 */            if (ooOOiO != null) {
/* 21 */                int index = ooOOiO.getIndex();
/* 25 */                OoOOiO[] ooOOiOArr = this.I00000oOI;
/* 28 */                if (index < ooOOiOArr.length && O0000Ioio00.I0000O(ooOOiOArr[index].I000OOo1O(), ooOOiO.I000OOo1O())) {
/* 48 */                    return this.I0000Il00O[index];
                        }
                    }
/* 11 */            return null;
                }

                @Override
                public final boolean I0000oI00() {
                    return this.I0000Il00O.length == 0;
                }
            }
