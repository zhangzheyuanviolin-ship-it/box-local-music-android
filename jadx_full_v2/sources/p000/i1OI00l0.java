            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Set;
            import java.util.logging.Level;
            
            public final class i1OI00l0 {
                public Level I00000oIO;
                public Set I00000oOI;
                public OillOo0 I0000Il00O;

                public final i1Io0lIii I00000oIO(String str) {
/* 1 */             Level level = this.I00000oIO;
/* 3 */             Set set = this.I00000oOI;
/* 5 */             OillOo0 oillOo0 = this.I0000Il00O;
/* 9 */             i1OO0Iil001 i1oo0iil001 = new i1OO0Iil001(str);
/* 16 */            i1oo0iil001.I00000oOI = liOO0O01.I00000oIO(str);
/* 18 */            i1oo0iil001.I0000Il00O = level;
/* 20 */            i1oo0iil001.I0000O = set;
/* 22 */            i1oo0iil001.I0000oI00 = oillOo0;
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            return i1oo0iil001;
                }
            }
