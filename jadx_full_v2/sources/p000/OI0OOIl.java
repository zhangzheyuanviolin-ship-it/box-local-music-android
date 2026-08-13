            package p000;
            
            public final class OI0OOIl implements IiIooOOOI {
                public Oo0iil0o0oI I00iOIl;
                public OI0Oi1llo1i I00iiI;

                @Override
                public final float I00000oIO() {
/* 5 */             return this.I00iiI.I000iOII.I00000oIO();
                }

                public final Oo0iil0o0oI I00000oOI(long j, long j2) {
/* 3 */             OI0Oi1llo1i oI0Oi1llo1i = this.I00iiI;
/* 5 */             Oo0lloOiiIOI oo0lloOiiIOI = oI0Oi1llo1i.I000l1;
/* 29 */            long jI00000oIO = Oo0o1OiIo.I0000oI00(j2) ? OI0OiIl.I00000oIO(oI0Oi1llo1i.I000l1.I00000oIO.I00000oOI, j2) : j2;
/* 40 */            if (!Oo0o1OiIo.I00000oOI(jI00000oIO, oI0Oi1llo1i.I000l1.I00000oIO.I00000oOI)) {
/* 61 */                oI0Oi1llo1i.I0001Ioi1lo(Oo0lloOiiIOI.I00000oOI(oI0Oi1llo1i.I000l1, 0L, jI00000oIO, null, null, 0L, 0L, null, 16777213));
                    }
/* 80 */            long jI000O01llI0 = oI0Oi1llo1i.I0001Ioi1lo > 1 ? oI0Oi1llo1i.I000O01llI0(j, oI0Oi1llo1i.I000o00OoI0I) : j;
/* 89 */            Oo0iil0o0oI oo0iil0o0oII000II = oI0Oi1llo1i.I000II(oI0Oi1llo1i.I000o00OoI0I, jI000O01llI0, oI0Oi1llo1i.I00000oOI(jI000O01llI0, oI0Oi1llo1i.I000o00OoI0I));
/* 93 */            this.I00iOIl = oo0iil0o0oII000II;
/* 95 */            oI0Oi1llo1i.I0001Ioi1lo(oo0lloOiiIOI);
/* 106 */           return oo0iil0o0oII000II;
                }

                @Override
                public final float I00Ol00() {
/* 5 */             return this.I00iiI.I000iOII.I00Ol00();
                }

                @Override
                public final float I00oO101o(long j) {
/* 1 */             OI0Oi1llo1i oI0Oi1llo1i = this.I00iiI;
/* 7 */             if (!Oo0o1OiIo.I0000oI00(j)) {
/* 72 */                return I00000oIO() * I001lIiIIo1O(j);
                    }
/* 20 */            if (Oo0o1OiIo.I0000oI00(oI0Oi1llo1i.I000l1.I00000oIO.I00000oOI)) {
/* 60 */                I000II.I001IO000("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
/* 19 */                return 0.0f;
                    }
/* 34 */            if (Oo0o1OiIo.I00000oOI(oI0Oi1llo1i.I000l1.I00000oIO.I00000oOI, Oo0o1OiIo.I0000Il00O)) {
/* 54 */                I000II.I001IO000("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
/* 19 */                return 0.0f;
                    }
/* 50 */            return Oo0o1OiIo.I0000O(j) * I00oO101o(oI0Oi1llo1i.I000l1.I00000oIO.I00000oOI);
                }
            }
