            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Io01IO implements OlO0oO1 {
                public OolliI1oliO I00000oIO;
                public OloIlI0ll I00000oOI;

                @Override
                public final boolean I00000oIO(Exception exc) {
/* 3 */             this.I00000oOI.I0000Il00O(exc);
/* 6 */             return true;
                }

                @Override
                public final boolean I00000oOI(I1lI11 i1lI11) {
/* 5 */             if (i1lI11.I00000oOI == 4 && !this.I00000oIO.I00000oOI(i1lI11)) {
/* 15 */                OloIlI0ll oloIlI0ll = this.I00000oOI;
/* 17 */                String str = i1lI11.I0000Il00O;
/* 19 */                if (str != null) {
/* 21 */                    long j = i1lI11.I0000oI00;
/* 23 */                    long j2 = i1lI11.I0001Ioi1lo;
/* 27 */                    I1l0o01O0 i1l0o01O0 = new I1l0o01O0();
/* 30 */                    i1l0o01O0.I00000oIO = str;
/* 32 */                    i1l0o01O0.I00000oOI = j;
/* 34 */                    i1l0o01O0.I0000Il00O = j2;
/* 36 */                    VarHandle.storeStoreFence();
/* 39 */                    oloIlI0ll.I00000oOI(i1l0o01O0);
/* 42 */                    return true;
                        }
/* 46 */                IOOlIIilOl0.I000II("Null token");
                    }
/* 4 */             return false;
                }
            }
