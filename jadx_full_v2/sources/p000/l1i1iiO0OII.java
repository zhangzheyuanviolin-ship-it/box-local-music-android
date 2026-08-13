            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class l1i1iiO0OII {
                public static final OI0l0000lOo I00000oIO(Ill0IO ill0IO, O0IOli0o0 o0IOli0o0) {
/* 5 */             String str = ill0IO.I00000oIO.I00000oIO;
/* 10 */            OI0l00II oI0l00II = new OI0l00II(0);
/* 13 */            oI0l00II.I00iiO = o0IOli0o0;
/* 15 */            oI0l00II.I00iiI = ill0IO;
/* 17 */            VarHandle.storeStoreFence();
/* 23 */            OI0l00II oI0l00II2 = new OI0l00II(1);
/* 26 */            oI0l00II2.I00iiI = ill0IO;
/* 28 */            oI0l00II2.I00iiO = o0IOli0o0;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            return new OI0l0000lOo(o0IOli0o0, str, oI0l00II, oI0l00II2);
                }
            }
