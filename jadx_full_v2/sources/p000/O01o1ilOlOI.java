            package p000;

            import java.util.LinkedHashMap;
            
            public final class O01o1ilOlOI extends O01lii {
                public String I000OOo1O;
                public boolean I000OiO;

                @Override
                public final O01O0o1iI I00IOO() {
/* 7 */             return new O01ioO1o0i11((LinkedHashMap) this.I000O01llI0);
                }

                @Override
                public final void I00Io1lO(O01O0o1iI o01O0o1iI, String str) {
/* 3 */             if (!this.I000OiO) {
/* 49 */                LinkedHashMap linkedHashMap = (LinkedHashMap) this.I000O01llI0;
/* 51 */                String str2 = this.I000OOo1O;
/* 53 */                if (str2 == null) {
/* 64 */                    O0000Ioio00.I000OOo1O("tag");
/* 89 */                    throw null;
                        }
/* 55 */                linkedHashMap.put(str2, o01O0o1iI);
/* 59 */                this.I000OiO = true;
/* 61 */                return;
                    }
/* 7 */             if (o01O0o1iI instanceof O01lO1iO) {
/* 15 */                this.I000OOo1O = ((O01lO1iO) o01O0o1iI).I00000oOI();
/* 18 */                this.I000OiO = false;
                    } else {
/* 23 */                if (o01O0o1iI instanceof O01ioO1o0i11) {
/* 46 */                    throw l0I0OO0.I00000oIO(O01l1I.I00000oOI);
                        }
/* 27 */                if (o01O0o1iI instanceof O011oi0l1O) {
/* 39 */                    throw l0I0OO0.I00000oIO(O01I1i.I00000oOI);
                        }
/* 29 */                I000II.I00000oIO();
                    }
                }
            }
