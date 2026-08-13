            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Set;
            import java.util.logging.Level;
            
            public final class il0iloOO01 {
                public Level I00000oIO;
                public Set I00000oOI;
                public ii1llo1liOl0 I0000Il00O;

                public final i1Io0lIii I00000oIO(String str) {
/* 1 */             Level level = this.I00000oIO;
/* 3 */             Set set = this.I00000oOI;
/* 5 */             ii1llo1liOl0 ii1llo1liol0 = this.I0000Il00O;
/* 9 */             il0oiIoi1oO il0oiioi1oo = new il0oiIoi1oO(str);
/* 16 */            il0oiioi1oo.I00000oOI = lillI0.I00000oIO(str);
/* 18 */            il0oiioi1oo.I0000Il00O = level;
/* 20 */            il0oiioi1oo.I0000O = set;
/* 22 */            il0oiioi1oo.I0000oI00 = ii1llo1liol0;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            return il0oiioi1oo;
                }
            }
