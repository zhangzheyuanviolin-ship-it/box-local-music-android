            package p000;

            import java.util.Set;
            import java.util.logging.Level;
            
            public final class i1OII0o1 extends i1Io0lIii {
                public Level I00000oOI;
                public Set I0000Il00O;
                public OillOo0 I0000O;

                @Override
                public final boolean I00000oOI(Level level) {
/* 1 */             return true;
                }

                @Override
                public final void I0000O(o0llO01llII1 o0llo01llii1) {
/* 11 */            String strI00000oIO = (String) o0llo01llii1.I0000Il00O().I0000O(o10iiOi0.I0000Il00O);
/* 13 */            if (strI00000oIO == null) {
/* 15 */                strI00000oIO = this.I00000oIO;
                    }
/* 17 */            if (strI00000oIO == null) {
/* 19 */                o0oOlOiI o0ooloii = o0llo01llii1.I0000O;
/* 21 */                if (o0ooloii == null) {
/* 49 */                    I000II.I001IO000("cannot request log site information prior to postProcess()");
/* 52 */                    return;
                        }
/* 23 */                strI00000oIO = o0ooloii.I00000oIO();
/* 35 */                int iIndexOf = strI00000oIO.indexOf(36, strI00000oIO.lastIndexOf(46));
/* 39 */                if (iIndexOf >= 0) {
/* 42 */                    strI00000oIO = strI00000oIO.substring(0, iIndexOf);
                        }
                    }
/* 63 */            i1OO0Iil001.I000II(o0llo01llii1, liOO0O01.I00000oIO(strI00000oIO), this.I00000oOI, this.I0000Il00O, this.I0000O);
                }
            }
