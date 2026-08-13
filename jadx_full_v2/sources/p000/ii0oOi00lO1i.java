            package p000;
            
            public final class ii0oOi00lO1i extends OoiOOoOlo {
                public final OIIloI0Iil I00iiI;
                public OoiOOoOlo I00iiO;

                public ii0oOi00lO1i(ii0oOlo ii0oolo) {
/* 2 */             super(6);
/* 10 */            this.I00iiI = new OIIloI0Iil(ii0oolo);
/* 16 */            this.I00iiO = I00000oIO();
                }

                public final ii011lioo I00000oIO() {
/* 1 */             OIIloI0Iil oIIloI0Iil = this.I00iiI;
/* 7 */             if (oIIloI0Iil.hasNext()) {
/* 17 */                return (ii011lioo) oIIloI0Iil.I00000oOI().iterator();
                    }
/* 20 */            return null;
                }

                @Override
                public final boolean hasNext() {
                    return this.I00iiO != null;
                }

                @Override
                public final byte zza() {
/* 1 */             OoiOOoOlo ooiOOoOlo = this.I00iiO;
/* 3 */             if (ooiOOoOlo == null) {
/* 24 */                IoOOl0iOl1io.I00000oOI();
/* 27 */                return (byte) 0;
                    }
/* 5 */             byte bZza = ooiOOoOlo.zza();
/* 15 */            if (!this.I00iiO.hasNext()) {
/* 21 */                this.I00iiO = I00000oIO();
                    }
/* 23 */            return bZza;
                }
            }
