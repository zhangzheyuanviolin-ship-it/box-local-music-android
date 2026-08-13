            package p000;

            import java.util.Set;
            import java.util.logging.Level;
            
            public final class il0lIIi11 extends i1Io0lIii {
                public Level I00000oOI;
                public Set I0000Il00O;
                public ii1llo1liOl0 I0000O;

                @Override
                public final void I0000Il00O(lIOl0o0 liol0o0) {
/* 11 */            String strI00000oOI = (String) liol0o0.I0000O().I0000Il00O(iOiIli0IO00i.I00000oIO);
/* 13 */            if (strI00000oOI == null) {
/* 15 */                strI00000oOI = this.I00000oIO;
                    }
/* 17 */            if (strI00000oOI == null) {
/* 19 */                o10lOOOlo o10looolo = liol0o0.I0000O;
/* 21 */                if (o10looolo == null) {
/* 49 */                    I000II.I001IO000("cannot request log site information prior to postProcess()");
/* 52 */                    return;
                        }
/* 23 */                strI00000oOI = o10looolo.I00000oOI();
/* 35 */                int iIndexOf = strI00000oOI.indexOf(36, strI00000oOI.lastIndexOf(46));
/* 39 */                if (iIndexOf >= 0) {
/* 42 */                    strI00000oOI = strI00000oOI.substring(0, iIndexOf);
                        }
                    }
/* 63 */            il0oiIoi1oO.I000II(liol0o0, lillI0.I00000oIO(strI00000oOI), this.I00000oOI, this.I0000Il00O, this.I0000O);
                }

                @Override
                public final boolean I0001Ioi1lo(Level level) {
/* 1 */             return true;
                }
            }
