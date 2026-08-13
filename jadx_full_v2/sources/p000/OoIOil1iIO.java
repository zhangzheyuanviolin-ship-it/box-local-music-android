            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Set;
            
            public final class OoIOil1iIO implements OoIOiO {
                public Set I00000oIO;
                public I1lO11 I00000oOI;
                public OoIOlo1001I I0000Il00O;

                public final OoIOlll0O I00000oIO(String str, Il0IIil il0IIil, OoI0o0oiol0l ooI0o0oiol0l) {
/* 1 */             Set set = this.I00000oIO;
/* 7 */             if (!set.contains(il0IIil)) {
/* 38 */                OIiilo1Ool0o.I000l1("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{il0IIil, set});
/* 41 */                return null;
                    }
/* 11 */            I1lO11 i1lO11 = this.I00000oOI;
/* 13 */            OoIOlo1001I ooIOlo1001I = this.I0000Il00O;
/* 15 */            OoIOlll0O ooIOlll0O = new OoIOlll0O();
/* 18 */            ooIOlll0O.I00000oIO = i1lO11;
/* 20 */            ooIOlll0O.I00000oOI = str;
/* 22 */            ooIOlll0O.I0000Il00O = il0IIil;
/* 24 */            ooIOlll0O.I0000O = ooI0o0oiol0l;
/* 26 */            ooIOlll0O.I0000oI00 = ooIOlo1001I;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            return ooIOlll0O;
                }
            }
